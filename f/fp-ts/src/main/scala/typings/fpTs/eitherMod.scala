package typings.fpTs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt2
import typings.fpTs.altMod.Alt2C
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.chainRecMod.ChainRec2
import typings.fpTs.chainRecMod.ChainRec2C
import typings.fpTs.eqMod.Eq
import typings.fpTs.extendMod.Extend2
import typings.fpTs.filterableMod.Filterable2C
import typings.fpTs.foldableMod.Foldable2
import typings.fpTs.fpTsStrings.Left
import typings.fpTs.fpTsStrings.Right
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor2
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadThrowMod.MonadThrow2
import typings.fpTs.monadThrowMod.MonadThrow2C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.showMod.Show
import typings.fpTs.theseMod.These_
import typings.fpTs.traversableMod.PipeableTraverse2
import typings.fpTs.traversableMod.Sequence2
import typings.fpTs.traversableMod.Traversable2
import typings.fpTs.witherableMod.Witherable2C
import typings.std.Error
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherMod {
  
  @JSImport("fp-ts/lib/Either", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Either", "Alt")
  @js.native
  val Alt_ : Alt2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "Applicative")
  @js.native
  val Applicative: Applicative2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "ChainRec")
  @js.native
  val ChainRec: ChainRec2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "Extend")
  @js.native
  val Extend_ : Extend2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "Foldable")
  @js.native
  val Foldable: Foldable2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "Monad")
  @js.native
  val Monad: Monad2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "MonadThrow")
  @js.native
  val MonadThrow: MonadThrow2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "Traversable")
  @js.native
  val Traversable: Traversable2[typings.fpTs.eitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Either", "URI")
  @js.native
  val URI: /* "Either" */ String = js.native
  type URI = /* "Either" */ String
  
  @scala.inline
  def alt[E, A](that: Lazy[Either_[E, A]]): js.Function1[/* fa */ Either_[E, A], Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Either_[E, A], Either_[E, A]]]
  
  @scala.inline
  def ap[E, A](fa: Either_[E, A]): js.Function1[/* fab */ Either_[E, js.Function1[/* a */ A, js.Any]], Either_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Either_[E, js.Function1[/* a */ A, js.Any]], Either_[E, js.Any]]]
  
  @scala.inline
  def apFirst[E, B](fb: Either_[E, B]): js.Function1[/* fa */ Either_[E, js.Any], Either_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Either_[E, js.Any], Either_[E, js.Any]]]
  
  @scala.inline
  def apS[A, N /* <: String */, E, B](name: Exclude[N, /* keyof A */ String], fb: Either_[E, B]): js.Function1[
    /* fa */ Either_[E, A], 
    Either_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Either_[E, A], 
    Either_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSW[A, N /* <: String */, D, B](name: Exclude[N, /* keyof A */ String], fb: Either_[D, B]): js.Function1[
    /* fa */ Either_[js.Any, A], 
    Either_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Either_[js.Any, A], 
    Either_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSecond[E, B](fb: Either_[E, B]): js.Function1[/* fa */ Either_[E, js.Any], Either_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Either_[E, js.Any], Either_[E, B]]]
  
  @scala.inline
  def apW[D, A](fa: Either_[D, A]): js.Function1[
    /* fab */ Either_[js.Any, js.Function1[/* a */ A, js.Any]], 
    Either_[D | js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ Either_[js.Any, js.Function1[/* a */ A, js.Any]], 
    Either_[D | js.Any, js.Any]
  ]]
  
  @scala.inline
  def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Either_[E, A], Either_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Either_[E, A], Either_[G, B]]]
  
  @scala.inline
  def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[
    /* fa */ Either_[E, A], 
    Either_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Either_[E, A], 
    Either_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Either_[js.Any, js.Any], 
    Either_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Either_[js.Any, js.Any], 
    Either_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  @scala.inline
  def bindW[N /* <: String */, A, D, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Either_[D, B]]): js.Function1[
    /* fa */ Either_[js.Any, A], 
    Either_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Either_[js.Any, A], 
    Either_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def chain[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ Either_[E, A], Either_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E, A], Either_[E, B]]]
  
  @scala.inline
  def chainFirst[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ Either_[E, A], Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E, A], Either_[E, A]]]
  
  @scala.inline
  def chainFirstW[D, A, B](f: js.Function1[/* a */ A, Either_[D, B]]): js.Function1[/* ma */ Either_[js.Any, A], Either_[D | js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[js.Any, A], Either_[D | js.Any, A]]]
  
  @scala.inline
  def chainW[D, A, B](f: js.Function1[/* a */ A, Either_[D, B]]): js.Function1[/* ma */ Either_[js.Any, A], Either_[D | js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[js.Any, A], Either_[D | js.Any, B]]]
  
  @scala.inline
  def duplicate[E, A](ma: Either_[E, A]): Either_[E, Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(ma.asInstanceOf[js.Any]).asInstanceOf[Either_[E, Either_[E, A]]]
  
  @JSImport("fp-ts/lib/Either", "either")
  @js.native
  val either: Monad2[typings.fpTs.eitherMod.URI] & Foldable2[typings.fpTs.eitherMod.URI] & Traversable2[typings.fpTs.eitherMod.URI] & Bifunctor2[typings.fpTs.eitherMod.URI] & Alt2[typings.fpTs.eitherMod.URI] & Extend2[typings.fpTs.eitherMod.URI] & ChainRec2[typings.fpTs.eitherMod.URI] & MonadThrow2[typings.fpTs.eitherMod.URI] = js.native
  
  @scala.inline
  def elem[A](E: Eq[A]): js.Function2[/* a */ A, /* ma */ Either_[js.Any, A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ A, /* ma */ Either_[js.Any, A], Boolean]]
  
  @scala.inline
  def exists[A](predicate: Predicate[A]): js.Function1[/* ma */ Either_[js.Any, A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[js.Any, A], Boolean]]
  
  @scala.inline
  def extend[E, A, B](f: js.Function1[/* wa */ Either_[E, A], B]): js.Function1[/* wa */ Either_[E, A], Either_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Either_[E, A], Either_[E, B]]]
  
  @scala.inline
  def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ Either_[E, A], Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Either_[E, A], Either_[E, A]]]
  
  @scala.inline
  def filterOrElse_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ Either_[E, A], Either_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Either_[E, A], Either_[E, B]]]
  
  @scala.inline
  def flatten[E, A](mma: Either_[E, Either_[E, A]]): Either_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Either_[E, A]]
  
  @scala.inline
  def fold[E, A, B](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, B]): js.Function1[/* ma */ Either_[E, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Either_[E, A], B]]
  
  @scala.inline
  def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ Either_[js.Any, js.Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ Either_[js.Any, js.Any], M]
  ]]
  
  @scala.inline
  def fromNullable[E](e: E): js.Function1[/* a */ js.Any, Either_[E, NonNullable[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ js.Any, Either_[E, NonNullable[js.Any]]]]
  
  @scala.inline
  def fromOption[E](onNone: Lazy[E]): js.Function1[/* ma */ Option_[js.Any], Either_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[js.Any], Either_[E, js.Any]]]
  
  @scala.inline
  def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, Either_[E, A]]]
  
  @scala.inline
  def fromPredicate_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, Either_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, Either_[E, B]]]
  
  @scala.inline
  def getAltValidation[E](SE: Semigroup[E]): Alt2C[typings.fpTs.eitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Alt2C[typings.fpTs.eitherMod.URI, E]]
  
  @scala.inline
  def getApplicativeValidation[E](SE: Semigroup[E]): Applicative2C[typings.fpTs.eitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typings.fpTs.eitherMod.URI, E]]
  
  @scala.inline
  def getApplyMonoid[E, A](M: Monoid[A]): Monoid[Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Either_[E, A]]]
  
  @scala.inline
  def getApplySemigroup[E, A](S: Semigroup[A]): Semigroup[Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Either_[E, A]]]
  
  @scala.inline
  def getEq[E, A](EL: Eq[E], EA: Eq[A]): Eq[Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(EL.asInstanceOf[js.Any], EA.asInstanceOf[js.Any])).asInstanceOf[Eq[Either_[E, A]]]
  
  @scala.inline
  def getFilterable[E](M: Monoid[E]): Filterable2C[typings.fpTs.eitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterable")(M.asInstanceOf[js.Any]).asInstanceOf[Filterable2C[typings.fpTs.eitherMod.URI, E]]
  
  @scala.inline
  def getOrElse[E, A](onLeft: js.Function1[/* e */ E, A]): js.Function1[/* ma */ Either_[E, A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E, A], A]]
  
  @scala.inline
  def getOrElseW[E, B](onLeft: js.Function1[/* e */ E, B]): js.Function1[/* ma */ Either_[E, js.Any], B | js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E, js.Any], B | js.Any]]
  
  @scala.inline
  def getSemigroup[E, A](S: Semigroup[A]): Semigroup[Either_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Either_[E, A]]]
  
  @scala.inline
  def getShow[E, A](SE: Show[E], SA: Show[A]): Show[Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Show[Either_[E, A]]]
  
  @scala.inline
  def getValidation[E](SE: Semigroup[E]): (Monad2C[typings.fpTs.eitherMod.URI, E]) & Foldable2[typings.fpTs.eitherMod.URI] & Traversable2[typings.fpTs.eitherMod.URI] & Bifunctor2[typings.fpTs.eitherMod.URI] & (Alt2C[typings.fpTs.eitherMod.URI, E]) & Extend2[typings.fpTs.eitherMod.URI] & (ChainRec2C[typings.fpTs.eitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.eitherMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typings.fpTs.eitherMod.URI, E]) & Foldable2[typings.fpTs.eitherMod.URI] & Traversable2[typings.fpTs.eitherMod.URI] & Bifunctor2[typings.fpTs.eitherMod.URI] & (Alt2C[typings.fpTs.eitherMod.URI, E]) & Extend2[typings.fpTs.eitherMod.URI] & (ChainRec2C[typings.fpTs.eitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.eitherMod.URI, E])]
  
  @scala.inline
  def getValidationMonoid[E, A](SE: Semigroup[E], SA: Monoid[A]): Monoid[Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationMonoid")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Monoid[Either_[E, A]]]
  
  @scala.inline
  def getValidationSemigroup[E, A](SE: Semigroup[E], SA: Semigroup[A]): Semigroup[Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationSemigroup")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Semigroup[Either_[E, A]]]
  
  @scala.inline
  def getWitherable[E](M: Monoid[E]): Witherable2C[typings.fpTs.eitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWitherable")(M.asInstanceOf[js.Any]).asInstanceOf[Witherable2C[typings.fpTs.eitherMod.URI, E]]
  
  @scala.inline
  def isLeft[E, A](ma: Either_[E, A]): /* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeft")(ma.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean]
  
  @scala.inline
  def isRight[E, A](ma: Either_[E, A]): /* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRight")(ma.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean]
  
  @scala.inline
  def left[E, A](e: E): Either_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[Either_[E, A]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Either_[js.Any, A], Either_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Either_[js.Any, A], Either_[js.Any, B]]]
  
  @scala.inline
  def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ Either_[E, js.Any], Either_[G, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Either_[E, js.Any], Either_[G, js.Any]]]
  
  @JSImport("fp-ts/lib/Either", "of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def orElse[E, A, M](onLeft: js.Function1[/* e */ E, Either_[M, A]]): js.Function1[/* ma */ Either_[E, A], Either_[M, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Either_[E, A], Either_[M, A]]]
  
  @scala.inline
  def parseJSON[E](s: String, onError: js.Function1[/* reason */ js.Any, E]): Either_[E, Json] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(s.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Either_[E, Json]]
  
  @scala.inline
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Either_[js.Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Either_[js.Any, A], B]]
  
  @scala.inline
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Either_[js.Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Either_[js.Any, A], B]]
  
  @scala.inline
  def right[E, A](a: A): Either_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[Either_[E, A]]
  
  @JSImport("fp-ts/lib/Either", "sequence")
  @js.native
  val sequence: Sequence2[typings.fpTs.eitherMod.URI] = js.native
  
  @scala.inline
  def stringifyJSON[E](u: js.Any, onError: js.Function1[/* reason */ js.Any, E]): Either_[E, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJSON")(u.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Either_[E, String]]
  
  @scala.inline
  def swap[E, A](ma: Either_[E, A]): Either_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ma.asInstanceOf[js.Any]).asInstanceOf[Either_[A, E]]
  
  @JSImport("fp-ts/lib/Either", "throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def toError(e: js.Any): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("toError")(e.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  @JSImport("fp-ts/lib/Either", "traverse")
  @js.native
  val traverse: PipeableTraverse2[typings.fpTs.eitherMod.URI] = js.native
  
  @scala.inline
  def tryCatch[E, A](f: Lazy[A], onError: js.Function1[/* e */ js.Any, E]): Either_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Either_[E, A]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fpTs.eitherMod.Left_[E]
    - typings.fpTs.eitherMod.Right_[A]
  */
  trait Either_[E, A]
    extends StObject
       with These_[E, A]
  object Either_ {
    
    @scala.inline
    def Left_[E](left: E): typings.fpTs.eitherMod.Left_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Left", left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fpTs.eitherMod.Left_[E]]
    }
    
    @scala.inline
    def Right_[A](right: A): typings.fpTs.eitherMod.Right_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Right", right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fpTs.eitherMod.Right_[A]]
    }
  }
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typings.fpTs.eitherMod.JsonArray
    - typings.fpTs.eitherMod.JsonRecord
  */
  type Json = _Json | Boolean | Double | String | Null
  
  @js.native
  trait JsonArray
    extends StObject
       with ReadonlyArray[Json]
       with _Json
  
  trait JsonRecord
    extends StObject
       with /* key */ StringDictionary[Json]
       with _Json
  object JsonRecord {
    
    @scala.inline
    def apply(): JsonRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonRecord]
    }
  }
  
  trait Left_[E]
    extends StObject
       with Either_[E, js.Any] {
    
    val _tag: Left
    
    val left: E
  }
  object Left_ {
    
    @scala.inline
    def apply[E](left: E): Left_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Left", left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left_[E]]
    }
    
    @scala.inline
    implicit class Left_MutableBuilder[Self <: Left_[?], E] (val x: Self & Left_[E]) extends AnyVal {
      
      @scala.inline
      def setLeft(value: E): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Left): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Right_[A]
    extends StObject
       with Either_[js.Any, A] {
    
    val _tag: Right
    
    val right: A
  }
  object Right_ {
    
    @scala.inline
    def apply[A](right: A): Right_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Right", right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Right_[A]]
    }
    
    @scala.inline
    implicit class Right_MutableBuilder[Self <: Right_[?], A] (val x: Self & Right_[A]) extends AnyVal {
      
      @scala.inline
      def setRight(value: A): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Right): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Json extends StObject
}
