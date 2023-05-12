package typings.fpTs.mod

import typings.fpTs.anon.FnCallAMa
import typings.fpTs.fpTsStrings.Either
import typings.fpTs.libAltMod.Alt2
import typings.fpTs.libAltMod.Alt2C
import typings.fpTs.libApplicativeMod.Applicative2
import typings.fpTs.libApplicativeMod.Applicative2C
import typings.fpTs.libApplyMod.Apply2
import typings.fpTs.libBifunctorMod.Bifunctor2
import typings.fpTs.libChainMod.Chain2
import typings.fpTs.libChainRecMod.ChainRec2
import typings.fpTs.libChainRecMod.ChainRec2C
import typings.fpTs.libCompactableMod.Compactable2C
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libEitherMod.Json
import typings.fpTs.libEqMod.Eq
import typings.fpTs.libExtendMod.Extend2
import typings.fpTs.libFilterableMod.Filterable2C
import typings.fpTs.libFoldableMod.Foldable2
import typings.fpTs.libFromEitherMod.FromEither2
import typings.fpTs.libFunctionMod.LazyArg
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libMonadMod.Monad2
import typings.fpTs.libMonadMod.Monad2C
import typings.fpTs.libMonadThrowMod.MonadThrow2
import typings.fpTs.libMonadThrowMod.MonadThrow2C
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPointedMod.Pointed2
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libShowMod.Show
import typings.fpTs.libTraversableMod.PipeableTraverse2
import typings.fpTs.libTraversableMod.Sequence2
import typings.fpTs.libTraversableMod.Traversable2
import typings.fpTs.libWitherableMod.Witherable2C
import typings.std.Exclude
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object either {
  
  @JSImport("fp-ts", "either")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "either.Alt")
  @js.native
  val Alt_ : Alt2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.ApT")
  @js.native
  val ApT: Either_[scala.Nothing, js.Array[Any]] = js.native
  
  @JSImport("fp-ts", "either.Applicative")
  @js.native
  val Applicative: Applicative2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.Apply")
  @js.native
  val Apply: Apply2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.ChainRec")
  @js.native
  val ChainRec: ChainRec2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.Chain")
  @js.native
  val Chain_ : Chain2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.Do")
  @js.native
  val Do: Either_[scala.Nothing, js.Object] = js.native
  
  @JSImport("fp-ts", "either.Extend")
  @js.native
  val Extend_ : Extend2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.Foldable")
  @js.native
  val Foldable: Foldable2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.FromEither")
  @js.native
  val FromEither: FromEither2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.Monad")
  @js.native
  val Monad: Monad2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.MonadThrow")
  @js.native
  val MonadThrow: MonadThrow2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.Pointed")
  @js.native
  val Pointed: Pointed2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.Traversable")
  @js.native
  val Traversable: Traversable2[typings.fpTs.libEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "either.URI")
  @js.native
  val URI: /* "Either" */ String = js.native
  
  inline def alt[E, A](that: LazyArg[Either_[E, A]]): js.Function1[/* fa */ Either_[E, A], Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Either_[E, A], Either_[E, A]]]
  
  inline def altW[E2, B](that: LazyArg[Either_[E2, B]]): js.Function1[/* fa */ Either_[Any, Any], Either_[E2, Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Either_[Any, Any], Either_[E2, Any | B]]]
  
  inline def ap[E, A](fa: Either_[E, A]): js.Function1[/* fab */ Either_[E, js.Function1[/* a */ A, Any]], Either_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Either_[E, js.Function1[/* a */ A, Any]], Either_[E, Any]]]
  
  inline def apFirst[E, B](second: Either_[E, B]): js.Function1[/* first */ Either_[E, Any], Either_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Either_[E, Any], Either_[E, Any]]]
  
  inline def apFirstW[E2, B](second: Either_[E2, B]): js.Function1[/* first */ Either_[Any, Any], Either_[Any | E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirstW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Either_[Any, Any], Either_[Any | E2, Any]]]
  
  inline def apS[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], fb: Either_[E, B]): js.Function1[
    /* fa */ Either_[E, A], 
    Either_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Either_[E, A], 
    Either_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, E2, B](name: Exclude[N, /* keyof A */ String], fb: Either_[E2, B]): js.Function1[
    /* fa */ Either_[Any, A], 
    Either_[
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Either_[Any, A], 
    Either_[
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[E, B](second: Either_[E, B]): js.Function1[/* first */ Either_[E, Any], Either_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Either_[E, Any], Either_[E, B]]]
  
  inline def apSecondW[E2, B](second: Either_[E2, B]): js.Function1[/* first */ Either_[Any, Any], Either_[Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecondW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Either_[Any, Any], Either_[Any | E2, B]]]
  
  inline def apW[E2, A](fa: Either_[E2, A]): js.Function1[/* fab */ Either_[Any, js.Function1[/* a */ A, Any]], Either_[Any | E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Either_[Any, js.Function1[/* a */ A, Any]], Either_[Any | E2, Any]]]
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Either_[E, A], Either_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Either_[E, A], Either_[G, B]]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[
    /* ma */ Either_[E, A], 
    Either_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ Either_[E, A], 
    Either_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Either_[Any, Any], 
    Either_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Either_[Any, Any], 
    Either_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, E2, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[
    /* fa */ Either_[Any, A], 
    Either_[
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Either_[Any, A], 
    Either_[
      Any | E2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def chain[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ Either_[E, A], Either_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E, A], Either_[E, B]]]
  
  inline def chainFirst[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ Either_[E, A], Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E, A], Either_[E, A]]]
  
  inline def chainFirstW[E2, A, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[/* ma */ Either_[Any, A], Either_[Any | E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[Any, A], Either_[Any | E2, A]]]
  
  inline def chainNullableK[E](e: E): js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[/* ma */ Either_[E, Any], Either_[E, NonNullable[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[/* ma */ Either_[E, Any], Either_[E, NonNullable[Any]]]
  ]]
  
  inline def chainOptionK[E](onNone: LazyArg[E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ Either_[E, Any], Either_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ Either_[E, Any], Either_[E, Any]]
  ]]
  
  inline def chainOptionKW[E2](onNone: LazyArg[E2]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ Either_[Any, Any], Either_[Any | E2, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionKW")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ Either_[Any, Any], Either_[Any | E2, Any]]
  ]]
  
  inline def chainW[E2, A, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[/* ma */ Either_[Any, A], Either_[E2 | Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[Any, A], Either_[E2 | Any, B]]]
  
  inline def duplicate[E, A](ma: Either_[E, A]): Either_[E, Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(ma.asInstanceOf[js.Any]).asInstanceOf[Either_[E, Either_[E, A]]]
  
  @JSImport("fp-ts", "either.either")
  @js.native
  val either: Monad2[typings.fpTs.libEitherMod.URI] & Foldable2[typings.fpTs.libEitherMod.URI] & Traversable2[typings.fpTs.libEitherMod.URI] & Bifunctor2[typings.fpTs.libEitherMod.URI] & Alt2[typings.fpTs.libEitherMod.URI] & Extend2[typings.fpTs.libEitherMod.URI] & ChainRec2[typings.fpTs.libEitherMod.URI] & MonadThrow2[typings.fpTs.libEitherMod.URI] = js.native
  
  inline def elem[A](E: Eq[A]): FnCallAMa[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallAMa[A]]
  
  inline def exists[A](predicate: Predicate[A]): js.Function1[/* ma */ Either_[Any, A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[Any, A], Boolean]]
  
  inline def extend[E, A, B](f: js.Function1[/* wa */ Either_[E, A], B]): js.Function1[/* wa */ Either_[E, A], Either_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Either_[E, A], Either_[E, B]]]
  
  inline def filterOrElse[A, E](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* self */ Either_[E, A], Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* self */ Either_[E, A], Either_[E, A]]]
  
  inline def filterOrElseW[A, E2](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E2]): js.Function1[/* mb */ Either_[Any, A], Either_[Any | E2, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* mb */ Either_[Any, A], Either_[Any | E2, A]]]
  
  inline def filterOrElseW_ABE2[A, B /* <: A */, E2](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E2]): js.Function1[/* ma */ Either_[Any, A], Either_[Any | E2, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Either_[Any, A], Either_[Any | E2, B]]]
  
  inline def filterOrElse_ABE[A, B /* <: A */, E](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* self */ Either_[E, A], Either_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* self */ Either_[E, A], Either_[E, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Either_[Any, js.Function1[/* a */ A, Any]], Either_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Either_[Any, js.Function1[/* a */ A, Any]], Either_[Any, Any]]]
  
  inline def flatMap[A, E2, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[/* ma */ Either_[Any, A], Either_[Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[Any, A], Either_[Any | E2, B]]]
  inline def flatMap[E1, A, E2, B](ma: Either_[E1, A], f: js.Function1[/* a */ A, Either_[E2, B]]): Either_[E1 | E2, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Either_[E1 | E2, B]]
  
  inline def flatMapNullable[A, B, E2](f: js.Function1[/* a */ A, js.UndefOr[B | Null]], onNullable: js.Function1[/* a */ A, E2]): js.Function1[/* self */ Either_[Any, A], Either_[E2 | Any, NonNullable[B]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMapNullable")(f.asInstanceOf[js.Any], onNullable.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* self */ Either_[Any, A], Either_[E2 | Any, NonNullable[B]]]]
  inline def flatMapNullable[E1, A, B, E2](
    self: Either_[E1, A],
    f: js.Function1[/* a */ A, js.UndefOr[B | Null]],
    onNullable: js.Function1[/* a */ A, E2]
  ): Either_[E1 | E2, NonNullable[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMapNullable")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any], onNullable.asInstanceOf[js.Any])).asInstanceOf[Either_[E1 | E2, NonNullable[B]]]
  
  inline def flatMapOption[A, B, E2](f: js.Function1[/* a */ A, Option_[B]], onNone: js.Function1[/* a */ A, E2]): js.Function1[/* self */ Either_[Any, A], Either_[E2 | Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMapOption")(f.asInstanceOf[js.Any], onNone.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* self */ Either_[Any, A], Either_[E2 | Any, B]]]
  inline def flatMapOption[E1, A, B, E2](self: Either_[E1, A], f: js.Function1[/* a */ A, Option_[B]], onNone: js.Function1[/* a */ A, E2]): Either_[E1 | E2, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMapOption")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any], onNone.asInstanceOf[js.Any])).asInstanceOf[Either_[E1 | E2, B]]
  
  inline def flatten[E, A](mma: Either_[E, Either_[E, A]]): Either_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Either_[E, A]]
  
  inline def flattenW[E1, E2, A](mma: Either_[E1, Either_[E2, A]]): Either_[E1 | E2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[Either_[E1 | E2, A]]
  
  inline def fold[E, A, B](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, B]): js.Function1[/* ma */ Either_[E, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Either_[E, A], B]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ Either_[Any, Any], M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ Either_[Any, Any], M]]]
  
  inline def foldW[E, B, A, C](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, C]): js.Function1[/* ma */ Either_[E, A], B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Either_[E, A], B | C]]
  
  inline def fromNullable[E](e: E): js.Function1[/* a */ Any, Either_[E, NonNullable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, Either_[E, NonNullable[Any]]]]
  
  inline def fromNullableK[E](e: E): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[/* a */ js.Array[Any], Either_[E, NonNullable[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[/* a */ js.Array[Any], Either_[E, NonNullable[Any]]]
  ]]
  
  inline def fromOption[E](onNone: LazyArg[E]): js.Function1[/* fa */ Option_[Any], Either_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[Any], Either_[E, Any]]]
  
  inline def fromOptionK[E](onNone: LazyArg[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], Either_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], Either_[E, Any]]
  ]]
  
  inline def fromPredicate[A, E](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* b */ A, Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ A, Either_[E, A]]]
  
  inline def fromPredicate_ABE[A, B /* <: A */, E](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, Either_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, Either_[E, B]]]
  
  inline def getAltValidation[E](SE: Semigroup[E]): Alt2C[Either, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Alt2C[Either, E]]
  
  inline def getApplicativeValidation[E](SE: Semigroup[E]): Applicative2C[Either, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[Either, E]]
  
  inline def getApplyMonoid[E, A](M: Monoid[A]): Monoid[Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Either_[E, A]]]
  
  inline def getApplySemigroup[E, A](S: Semigroup[A]): Semigroup[Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Either_[E, A]]]
  
  inline def getCompactable[E](M: Monoid[E]): Compactable2C[Either, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompactable")(M.asInstanceOf[js.Any]).asInstanceOf[Compactable2C[Either, E]]
  
  inline def getEq[E, A](EL: Eq[E], EA: Eq[A]): Eq[Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(EL.asInstanceOf[js.Any], EA.asInstanceOf[js.Any])).asInstanceOf[Eq[Either_[E, A]]]
  
  inline def getFilterable[E](M: Monoid[E]): Filterable2C[Either, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterable")(M.asInstanceOf[js.Any]).asInstanceOf[Filterable2C[Either, E]]
  
  inline def getOrElse[E, A](onLeft: js.Function1[/* e */ E, A]): js.Function1[/* ma */ Either_[E, A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E, A], A]]
  
  inline def getOrElseW[E, B](onLeft: js.Function1[/* e */ E, B]): js.Function1[/* ma */ Either_[E, Any], B | Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E, Any], B | Any]]
  
  inline def getSemigroup[E, A](S: Semigroup[A]): Semigroup[Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Either_[E, A]]]
  
  inline def getShow[E, A](SE: Show[E], SA: Show[A]): Show[Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Show[Either_[E, A]]]
  
  inline def getValidation[E](SE: Semigroup[E]): (Monad2C[typings.fpTs.libEitherMod.URI, E]) & Foldable2[typings.fpTs.libEitherMod.URI] & Traversable2[typings.fpTs.libEitherMod.URI] & Bifunctor2[typings.fpTs.libEitherMod.URI] & (Alt2C[typings.fpTs.libEitherMod.URI, E]) & Extend2[typings.fpTs.libEitherMod.URI] & (ChainRec2C[typings.fpTs.libEitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.libEitherMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typings.fpTs.libEitherMod.URI, E]) & Foldable2[typings.fpTs.libEitherMod.URI] & Traversable2[typings.fpTs.libEitherMod.URI] & Bifunctor2[typings.fpTs.libEitherMod.URI] & (Alt2C[typings.fpTs.libEitherMod.URI, E]) & Extend2[typings.fpTs.libEitherMod.URI] & (ChainRec2C[typings.fpTs.libEitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.libEitherMod.URI, E])]
  
  inline def getValidationMonoid[E, A](SE: Semigroup[E], MA: Monoid[A]): Monoid[Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationMonoid")(SE.asInstanceOf[js.Any], MA.asInstanceOf[js.Any])).asInstanceOf[Monoid[Either_[E, A]]]
  
  inline def getValidationSemigroup[E, A](SE: Semigroup[E], SA: Semigroup[A]): Semigroup[Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationSemigroup")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Semigroup[Either_[E, A]]]
  
  inline def getWitherable[E](M: Monoid[E]): Witherable2C[Either, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWitherable")(M.asInstanceOf[js.Any]).asInstanceOf[Witherable2C[Either, E]]
  
  inline def isLeft[E](ma: Either_[E, Any]): /* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeft")(ma.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean]
  
  inline def isRight[A](ma: Either_[Any, A]): /* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRight")(ma.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean]
  
  inline def left[E, A](e: E): Either_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[Either_[E, A]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ Either_[Any, A], 
    Either_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Either_[Any, A], 
    Either_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def liftNullable[A /* <: js.Array[Any] */, B, E](f: js.Function1[/* a */ A, js.UndefOr[B | Null]], onNullable: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, Either_[E, NonNullable[B]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftNullable")(f.asInstanceOf[js.Any], onNullable.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, Either_[E, NonNullable[B]]]]
  
  inline def liftOption[A /* <: js.Array[Any] */, B, E](f: js.Function1[/* a */ A, Option_[B]], onNone: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, Either_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("liftOption")(f.asInstanceOf[js.Any], onNone.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, Either_[E, B]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Either_[Any, A], Either_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Either_[Any, A], Either_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ Either_[E, Any], Either_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Either_[E, Any], Either_[G, Any]]]
  
  inline def `match`[E, A, B](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, B]): js.Function1[/* ma */ Either_[E, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Either_[E, A], B]]
  
  inline def matchW[E, B, A, C](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, C]): js.Function1[/* ma */ Either_[E, A], B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Either_[E, A], B | C]]
  
  inline def of[E, A](a: A): Either_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[Either_[E, A]]
  
  inline def orElse[E1, A, E2](onLeft: js.Function1[/* e */ E1, Either_[E2, A]]): js.Function1[/* ma */ Either_[E1, A], Either_[E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E1, A], Either_[E2, A]]]
  
  inline def orElseW[E1, E2, B](onLeft: js.Function1[/* e */ E1, Either_[E2, B]]): js.Function1[/* ma */ Either_[E1, Any], Either_[E2, B | Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E1, Any], Either_[E2, B | Any]]]
  
  inline def parseJSON[E](s: String, onError: js.Function1[/* reason */ Any, E]): Either_[E, Json] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(s.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Either_[E, Json]]
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Either_[Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Either_[Any, A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Either_[Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Either_[Any, A], B]]
  
  inline def right[E, A](a: A): Either_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[Either_[E, A]]
  
  @JSImport("fp-ts", "either.sequence")
  @js.native
  val sequence: Sequence2[typings.fpTs.libEitherMod.URI] = js.native
  
  inline def sequenceArray[E, A](as: js.Array[Either_[E, A]]): Either_[E, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(as.asInstanceOf[js.Any]).asInstanceOf[Either_[E, js.Array[A]]]
  
  inline def stringifyJSON[E](u: Any, onError: js.Function1[/* reason */ Any, E]): Either_[E, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJSON")(u.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Either_[E, String]]
  
  inline def swap[E, A](ma: Either_[E, A]): Either_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ma.asInstanceOf[js.Any]).asInstanceOf[Either_[A, E]]
  
  inline def tap[A, E2, _underscore](f: js.Function1[/* a */ A, Either_[E2, _underscore]]): js.Function1[/* self */ Either_[Any, A], Either_[E2 | Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* self */ Either_[Any, A], Either_[E2 | Any, A]]]
  inline def tap[E1, A, E2, _underscore](self: Either_[E1, A], f: js.Function1[/* a */ A, Either_[E2, _underscore]]): Either_[E1 | E2, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Either_[E1 | E2, A]]
  
  @JSImport("fp-ts", "either.throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
  ] = js.native
  
  inline def toError(e: Any): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("toError")(e.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def toUnion[E, A](fa: Either_[E, A]): E | A = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(fa.asInstanceOf[js.Any]).asInstanceOf[E | A]
  
  @JSImport("fp-ts", "either.traverse")
  @js.native
  val traverse: PipeableTraverse2[typings.fpTs.libEitherMod.URI] = js.native
  
  inline def traverseArray[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* as */ js.Array[A], Either_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Either_[E, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[E, A, B](f: js.Function2[/* index */ Double, /* a */ A, Either_[E, B]]): js.Function1[/* as */ js.Array[A], Either_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Either_[E, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, Either_[E, B]]): js.Function1[/* as */ js.Array[A], Either_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Either_[E, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, Either_[E, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Either_[E, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Either_[E, ReadonlyNonEmptyArray_[B]]]]
  
  inline def tryCatch[E, A](f: LazyArg[A], onThrow: js.Function1[/* e */ Any, E]): Either_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any], onThrow.asInstanceOf[js.Any])).asInstanceOf[Either_[E, A]]
  
  inline def tryCatchK[A /* <: js.Array[Any] */, B, E](f: js.Function1[/* a */ A, B], onThrow: js.Function1[/* error */ Any, E]): js.Function1[/* a */ A, Either_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatchK")(f.asInstanceOf[js.Any], onThrow.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, Either_[E, B]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
