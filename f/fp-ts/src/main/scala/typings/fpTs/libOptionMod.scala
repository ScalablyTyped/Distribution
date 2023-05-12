package typings.fpTs

import typings.fpTs.anon.Fn14
import typings.fpTs.fpTsStrings.None
import typings.fpTs.fpTsStrings.Some
import typings.fpTs.libAltMod.Alt1
import typings.fpTs.libAlternativeMod.Alternative1
import typings.fpTs.libApplicativeMod.Applicative1
import typings.fpTs.libApplyMod.Apply1
import typings.fpTs.libChainMod.Chain1
import typings.fpTs.libCompactableMod.Compactable1
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libEqMod.Eq
import typings.fpTs.libExtendMod.Extend1
import typings.fpTs.libFilterableMod.Filterable1
import typings.fpTs.libFoldableMod.Foldable1
import typings.fpTs.libFromEitherMod.FromEither1
import typings.fpTs.libFunctionMod.LazyArg
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonadThrowMod.MonadThrow1
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libOrdMod.Ord_
import typings.fpTs.libPointedMod.Pointed1
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libSeparatedMod.Separated_
import typings.fpTs.libShowMod.Show
import typings.fpTs.libTraversableMod.PipeableTraverse1
import typings.fpTs.libTraversableMod.Sequence1
import typings.fpTs.libTraversableMod.Traversable1
import typings.fpTs.libWitherableMod.PipeableWilt1
import typings.fpTs.libWitherableMod.PipeableWither1
import typings.fpTs.libWitherableMod.Witherable1
import typings.fpTs.libZeroMod.Zero1
import typings.std.Exclude
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionMod {
  
  @JSImport("fp-ts/lib/Option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Option", "Alt")
  @js.native
  val Alt_ : Alt1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Alternative")
  @js.native
  val Alternative: Alternative1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "ApT")
  @js.native
  val ApT: Option_[js.Array[Any]] = js.native
  
  @JSImport("fp-ts/lib/Option", "Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Apply")
  @js.native
  val Apply: Apply1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Chain")
  @js.native
  val Chain_ : Chain1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Compactable")
  @js.native
  val Compactable: Compactable1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Do")
  @js.native
  val Do: Option_[js.Object] = js.native
  
  @JSImport("fp-ts/lib/Option", "Extend")
  @js.native
  val Extend_ : Extend1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Filterable")
  @js.native
  val Filterable: Filterable1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "FromEither")
  @js.native
  val FromEither_ : FromEither1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "MonadThrow")
  @js.native
  val MonadThrow: MonadThrow1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Pointed")
  @js.native
  val Pointed: Pointed1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "URI")
  @js.native
  val URI: /* "Option" */ String = js.native
  type URI = /* "Option" */ String
  
  @JSImport("fp-ts/lib/Option", "Witherable")
  @js.native
  val Witherable: Witherable1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "Zero")
  @js.native
  val Zero_ : Zero1[typings.fpTs.libOptionMod.URI] = js.native
  
  inline def alt[A](that: LazyArg[Option_[A]]): js.Function1[/* fa */ Option_[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Option_[A]]]
  
  inline def altW[B](that: LazyArg[Option_[B]]): js.Function1[/* fa */ Option_[Any], Option_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[Any], Option_[Any | B]]]
  
  inline def ap[A](fa: Option_[A]): js.Function1[/* fab */ Option_[js.Function1[/* a */ A, Any]], Option_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Option_[js.Function1[/* a */ A, Any]], Option_[Any]]]
  
  inline def apFirst[B](second: Option_[B]): js.Function1[/* first */ Option_[Any], Option_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Option_[Any], Option_[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: Option_[B]): js.Function1[
    /* fa */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[B](second: Option_[B]): js.Function1[/* first */ Option_[Any], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Option_[Any], Option_[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Option_[B]]): js.Function1[
    /* ma */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Option_[Any], 
    Option_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Option_[Any], 
    Option_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* ma */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Option_[B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Option_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* first */ Option_[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Option_[A], Option_[A]]]
  
  inline def chainFirstEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ Option_[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Option_[A]]]
  
  inline def chainNullableK[A, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* ma */ Option_[A], Option_[NonNullable[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Option_[NonNullable[B]]]]
  
  inline def compact[A](fa: Option_[Option_[A]]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def duplicate[A](ma: Option_[A]): Option_[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(ma.asInstanceOf[js.Any]).asInstanceOf[Option_[Option_[A]]]
  
  inline def elem[A](E: Eq[A]): Fn14[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[Fn14[A]]
  
  inline def exists[A](predicate: Predicate[A]): js.Function1[/* ma */ Option_[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Boolean]]
  
  inline def extend[A, B](f: js.Function1[/* wa */ Option_[A], B]): js.Function1[/* wa */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Option_[A], Option_[B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fb */ Option_[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ Option_[A], Option_[A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fa */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Option_[B]]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Option_[B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Option_[js.Function1[/* a */ A, Any]], Option_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Option_[js.Function1[/* a */ A, Any]], Option_[Any]]]
  
  inline def flatMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* ma */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Option_[B]]]
  inline def flatMap[A, B](ma: Option_[A], f: js.Function1[/* a */ A, Option_[B]]): Option_[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Option_[B]]
  
  inline def flatten[A](mma: Option_[Option_[A]]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def fold[A, B](onNone: LazyArg[B], onSome: js.Function1[/* a */ A, B]): js.Function1[/* ma */ Option_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Option_[A], B]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ Option_[Any], M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ Option_[Any], M]]]
  
  inline def foldW[B, A, C](onNone: LazyArg[B], onSome: js.Function1[/* a */ A, C]): js.Function1[/* ma */ Option_[A], B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Option_[A], B | C]]
  
  inline def fromEither[A](fa: Either_[Any, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def fromEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, Option_[B]]]
  
  inline def fromNullable[A](a: A): Option_[NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(a.asInstanceOf[js.Any]).asInstanceOf[Option_[NonNullable[A]]]
  
  inline def fromNullableK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* a */ A, Option_[NonNullable[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, Option_[NonNullable[B]]]]
  
  inline def fromPredicate[A](predicate: Predicate[A]): js.Function1[/* b */ A, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ A, Option_[A]]]
  
  inline def fromPredicate_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* a */ A, Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, Option_[B]]]
  
  inline def getApplyMonoid[A](M: Monoid[A]): Monoid[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Option_[A]]]
  
  inline def getApplySemigroup[A](S: Semigroup[A]): Semigroup[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Option_[A]]]
  
  inline def getEq[A](E: Eq[A]): Eq[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Option_[A]]]
  
  inline def getFirstMonoid[A](): Monoid[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstMonoid")().asInstanceOf[Monoid[Option_[A]]]
  
  inline def getLastMonoid[A](): Monoid[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastMonoid")().asInstanceOf[Monoid[Option_[A]]]
  
  inline def getLeft[E, A](ma: Either_[E, A]): Option_[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeft")(ma.asInstanceOf[js.Any]).asInstanceOf[Option_[E]]
  
  inline def getMonoid[A](S: Semigroup[A]): Monoid[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(S.asInstanceOf[js.Any]).asInstanceOf[Monoid[Option_[A]]]
  
  inline def getOrElse[A](onNone: LazyArg[A]): js.Function1[/* ma */ Option_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], A]]
  
  inline def getOrElseW[B](onNone: LazyArg[B]): js.Function1[/* ma */ Option_[Any], B | Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[Any], B | Any]]
  
  inline def getOrd[A](O: Ord_[A]): Ord_[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrd")(O.asInstanceOf[js.Any]).asInstanceOf[Ord_[Option_[A]]]
  
  inline def getRefinement[A, B /* <: A */](getOption: js.Function1[/* a */ A, Option_[B]]): Refinement[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefinement")(getOption.asInstanceOf[js.Any]).asInstanceOf[Refinement[A, B]]
  
  inline def getRight[E, A](ma: Either_[E, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRight")(ma.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def getShow[A](S: Show[A]): Show[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Option_[A]]]
  
  inline def guard(b: Boolean): Option_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("guard")(b.asInstanceOf[js.Any]).asInstanceOf[Option_[Unit]]
  
  inline def isNone(fa: Option_[Any]): /* is fp-ts.fp-ts/lib/Option.None */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNone")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Option.None */ Boolean]
  
  inline def isSome[A](fa: Option_[A]): /* is fp-ts.fp-ts/lib/Option.Some<A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSome")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Option.Some<A> */ Boolean]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Option_[B]]]
  
  inline def mapNullable[A, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* ma */ Option_[A], Option_[NonNullable[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapNullable")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Option_[NonNullable[B]]]]
  
  inline def `match`[A, B](onNone: LazyArg[B], onSome: js.Function1[/* a */ A, B]): js.Function1[/* ma */ Option_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Option_[A], B]]
  
  inline def matchW[B, A, C](onNone: LazyArg[B], onSome: js.Function1[/* a */ A, C]): js.Function1[/* ma */ Option_[A], B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Option_[A], B | C]]
  
  @JSImport("fp-ts/lib/Option", "none")
  @js.native
  val none: Option_[scala.Nothing] = js.native
  
  inline def of[A](a: A): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  @JSImport("fp-ts/lib/Option", "option")
  @js.native
  val option: Monad1[typings.fpTs.libOptionMod.URI] & Foldable1[typings.fpTs.libOptionMod.URI] & Alternative1[typings.fpTs.libOptionMod.URI] & Extend1[typings.fpTs.libOptionMod.URI] & Witherable1[typings.fpTs.libOptionMod.URI] & MonadThrow1[typings.fpTs.libOptionMod.URI] = js.native
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fb */ Option_[A], Separated_[Option_[A], Option_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ Option_[A], Separated_[Option_[A], Option_[A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ Option_[A], Separated_[Option_[B], Option_[C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Separated_[Option_[B], Option_[C]]]]
  
  inline def partition_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Option_[A], Separated_[Option_[A], Option_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Separated_[Option_[A], Option_[B]]]]
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Option_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Option_[A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Option_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Option_[A], B]]
  
  inline def separate[A, B](ma: Option_[Either_[A, B]]): Separated_[Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separate")(ma.asInstanceOf[js.Any]).asInstanceOf[Separated_[Option_[A], Option_[B]]]
  
  @JSImport("fp-ts/lib/Option", "sequence")
  @js.native
  val sequence: Sequence1[typings.fpTs.libOptionMod.URI] = js.native
  
  inline def sequenceArray[A](arr: js.Array[Option_[A]]): Option_[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Option_[js.Array[A]]]
  
  inline def some[A](a: A): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(a.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def tap[A, _underscore](f: js.Function1[/* a */ A, Option_[_underscore]]): js.Function1[/* self */ Option_[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* self */ Option_[A], Option_[A]]]
  inline def tap[A, _underscore](self: Option_[A], f: js.Function1[/* a */ A, Option_[_underscore]]): Option_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Option_[A]]
  
  @JSImport("fp-ts/lib/Option", "throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
  ] = js.native
  
  inline def toNullable[A](ma: Option_[A]): A | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toNullable")(ma.asInstanceOf[js.Any]).asInstanceOf[A | Null]
  
  inline def toUndefined[A](ma: Option_[A]): js.UndefOr[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUndefined")(ma.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[A]]
  
  @JSImport("fp-ts/lib/Option", "traverse")
  @js.native
  val traverse: PipeableTraverse1[typings.fpTs.libOptionMod.URI] = js.native
  
  inline def traverseArray[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* as */ js.Array[A], Option_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, Option_[B]]): js.Function1[/* as */ js.Array[A], Option_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, Option_[B]]): js.Function1[/* as */ js.Array[A], Option_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, Option_[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[B]]]]
  
  inline def tryCatch[A](f: LazyArg[A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def tryCatchK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatchK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, Option_[B]]]
  
  @JSImport("fp-ts/lib/Option", "wilt")
  @js.native
  val wilt: PipeableWilt1[typings.fpTs.libOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Option", "wither")
  @js.native
  val wither: PipeableWither1[typings.fpTs.libOptionMod.URI] = js.native
  
  inline def zero[A](): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[Option_[A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  trait None_
    extends StObject
       with Option_[Any] {
    
    val _tag: None
  }
  object None_ {
    
    inline def apply(): None_ = {
      val __obj = js.Dynamic.literal(_tag = "None")
      __obj.asInstanceOf[None_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: None_] (val x: Self) extends AnyVal {
      
      inline def set_tag(value: None): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fpTs.libOptionMod.None_
    - typings.fpTs.libOptionMod.Some_[A]
  */
  trait Option_[A] extends StObject
  object Option_ {
    
    inline def None_(): typings.fpTs.libOptionMod.None_ = {
      val __obj = js.Dynamic.literal(_tag = "None")
      __obj.asInstanceOf[typings.fpTs.libOptionMod.None_]
    }
    
    inline def Some_[A](value: A): typings.fpTs.libOptionMod.Some_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Some", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fpTs.libOptionMod.Some_[A]]
    }
  }
  
  trait Some_[A]
    extends StObject
       with Option_[A] {
    
    val _tag: Some
    
    val value: A
  }
  object Some_ {
    
    inline def apply[A](value: A): Some_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Some", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Some_[A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Some_[?], A] (val x: Self & Some_[A]) extends AnyVal {
      
      inline def setValue(value: A): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: Some): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
}
