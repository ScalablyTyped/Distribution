package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt1
import typings.fpTs.alternativeMod.Alternative1
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.compactableMod.Compactable1
import typings.fpTs.compactableMod.Separated
import typings.fpTs.eitherMod.Either_
import typings.fpTs.eqMod.Eq
import typings.fpTs.extendMod.Extend1
import typings.fpTs.filterableMod.Filterable1
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor1
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadThrowMod.MonadThrow1
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.ordMod.Ord_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.showMod.Show
import typings.fpTs.traversableMod.PipeableTraverse1
import typings.fpTs.traversableMod.Sequence1
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.witherableMod.PipeableWilt1
import typings.fpTs.witherableMod.PipeableWither1
import typings.fpTs.witherableMod.Witherable1
import typings.std.Exclude
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object option {
  
  @JSImport("fp-ts", "option")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "option.Alt")
  @js.native
  val Alt_ : Alt1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.Alternative")
  @js.native
  val Alternative: Alternative1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.Compactable")
  @js.native
  val Compactable: Compactable1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.Extend")
  @js.native
  val Extend_ : Extend1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.Filterable")
  @js.native
  val Filterable: Filterable1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.MonadThrow")
  @js.native
  val MonadThrow: MonadThrow1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.URI")
  @js.native
  val URI: /* "Option" */ String = js.native
  
  @JSImport("fp-ts", "option.Witherable")
  @js.native
  val Witherable: Witherable1[typings.fpTs.optionMod.URI] = js.native
  
  inline def alt[A](that: Lazy[Option_[A]]): js.Function1[/* fa */ Option_[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Option_[A]]]
  
  inline def ap[A](fa: Option_[A]): js.Function1[/* fab */ Option_[js.Function1[/* a */ A, js.Any]], Option_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Option_[js.Function1[/* a */ A, js.Any]], Option_[js.Any]]]
  
  inline def apFirst[B](fb: Option_[B]): js.Function1[/* fa */ Option_[js.Any], Option_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[js.Any], Option_[js.Any]]]
  
  inline def apS[A, N /* <: String */, B](name: Exclude[N, /* keyof A */ String], fb: Option_[B]): js.Function1[
    /* fa */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[B](fb: Option_[B]): js.Function1[/* fa */ Option_[js.Any], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[js.Any], Option_[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Option_[B]]): js.Function1[
    /* fa */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Option_[A], 
    Option_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Option_[js.Any], 
    Option_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Option_[js.Any], 
    Option_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* ma */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Option_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* ma */ Option_[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Option_[A]]]
  
  inline def compact[A](fa: Option_[Option_[A]]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def duplicate[A](ma: Option_[A]): Option_[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(ma.asInstanceOf[js.Any]).asInstanceOf[Option_[Option_[A]]]
  
  inline def elem[A](E: Eq[A]): js.Function2[/* a */ A, /* ma */ Option_[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ A, /* ma */ Option_[A], Boolean]]
  
  inline def exists[A](predicate: Predicate[A]): js.Function1[/* ma */ Option_[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Boolean]]
  
  inline def extend[A, B](f: js.Function1[/* wa */ Option_[A], B]): js.Function1[/* wa */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Option_[A], Option_[B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fa */ Option_[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Option_[A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fa */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Option_[B]]]
  
  inline def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Option_[B]]]
  
  inline def flatten[A](mma: Option_[Option_[A]]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def fold[A, B](onNone: Lazy[B], onSome: js.Function1[/* a */ A, B]): js.Function1[/* ma */ Option_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ Option_[A], B]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ js.Any, M], js.Function1[/* fa */ Option_[js.Any], M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ js.Any, M], js.Function1[/* fa */ Option_[js.Any], M]]]
  
  inline def fromEither[E, A](ma: Either_[E, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(ma.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def fromNullable[A](a: A): Option_[NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(a.asInstanceOf[js.Any]).asInstanceOf[Option_[NonNullable[A]]]
  
  inline def fromPredicate[A](predicate: Predicate[A]): js.Function1[/* a */ A, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, Option_[A]]]
  
  inline def fromPredicate_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* a */ A, Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, Option_[B]]]
  
  inline def getApplyMonoid[A](M: Monoid[A]): Monoid[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Option_[A]]]
  
  inline def getApplySemigroup[A](S: Semigroup[A]): Semigroup[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Option_[A]]]
  
  inline def getEq[A](E: Eq[A]): Eq[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Option_[A]]]
  
  inline def getFirstMonoid[A](): Monoid[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstMonoid")().asInstanceOf[Monoid[Option_[A]]]
  
  inline def getLastMonoid[A](): Monoid[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastMonoid")().asInstanceOf[Monoid[Option_[A]]]
  
  inline def getLeft[E, A](ma: Either_[E, A]): Option_[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeft")(ma.asInstanceOf[js.Any]).asInstanceOf[Option_[E]]
  
  inline def getMonoid[A](S: Semigroup[A]): Monoid[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(S.asInstanceOf[js.Any]).asInstanceOf[Monoid[Option_[A]]]
  
  inline def getOrElse[A](onNone: Lazy[A]): js.Function1[/* ma */ Option_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], A]]
  
  inline def getOrElseW[B](onNone: Lazy[B]): js.Function1[/* ma */ Option_[js.Any], B | js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[js.Any], B | js.Any]]
  
  inline def getOrd[A](O: Ord_[A]): Ord_[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrd")(O.asInstanceOf[js.Any]).asInstanceOf[Ord_[Option_[A]]]
  
  inline def getRefinement[A, B /* <: A */](getOption: js.Function1[/* a */ A, Option_[B]]): Refinement[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefinement")(getOption.asInstanceOf[js.Any]).asInstanceOf[Refinement[A, B]]
  
  inline def getRight[E, A](ma: Either_[E, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRight")(ma.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def getShow[A](S: Show[A]): Show[Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Option_[A]]]
  
  inline def isNone[A](fa: Option_[A]): /* is fp-ts.fp-ts/lib/Option.None */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNone")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Option.None */ Boolean]
  
  inline def isSome[A](fa: Option_[A]): /* is fp-ts.fp-ts/lib/Option.Some<A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSome")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Option.Some<A> */ Boolean]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Option_[B]]]
  
  inline def mapNullable[A, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* ma */ Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapNullable")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[A], Option_[B]]]
  
  @JSImport("fp-ts", "option.none")
  @js.native
  val none: Option_[scala.Nothing] = js.native
  
  @JSImport("fp-ts", "option.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  @JSImport("fp-ts", "option.option")
  @js.native
  val option: Monad1[typings.fpTs.optionMod.URI] & Foldable1[typings.fpTs.optionMod.URI] & Alternative1[typings.fpTs.optionMod.URI] & Extend1[typings.fpTs.optionMod.URI] & Witherable1[typings.fpTs.optionMod.URI] & MonadThrow1[typings.fpTs.optionMod.URI] = js.native
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fa */ Option_[A], Separated[Option_[A], Option_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Separated[Option_[A], Option_[A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ Option_[A], Separated[Option_[B], Option_[C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Separated[Option_[B], Option_[C]]]]
  
  inline def partition_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ Option_[A], Separated[Option_[A], Option_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[A], Separated[Option_[A], Option_[B]]]]
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Option_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Option_[A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Option_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Option_[A], B]]
  
  inline def separate[A, B](ma: Option_[Either_[A, B]]): Separated[Option_[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separate")(ma.asInstanceOf[js.Any]).asInstanceOf[Separated[Option_[A], Option_[B]]]
  
  @JSImport("fp-ts", "option.sequence")
  @js.native
  val sequence: Sequence1[typings.fpTs.optionMod.URI] = js.native
  
  inline def some[A](a: A): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(a.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  @JSImport("fp-ts", "option.throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
  ] = js.native
  
  inline def toNullable[A](ma: Option_[A]): A | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toNullable")(ma.asInstanceOf[js.Any]).asInstanceOf[A | Null]
  
  inline def toUndefined[A](ma: Option_[A]): js.UndefOr[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUndefined")(ma.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[A]]
  
  @JSImport("fp-ts", "option.traverse")
  @js.native
  val traverse: PipeableTraverse1[typings.fpTs.optionMod.URI] = js.native
  
  inline def tryCatch[A](f: Lazy[A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  @JSImport("fp-ts", "option.wilt")
  @js.native
  val wilt: PipeableWilt1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.wither")
  @js.native
  val wither: PipeableWither1[typings.fpTs.optionMod.URI] = js.native
  
  @JSImport("fp-ts", "option.zero")
  @js.native
  val zero: js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
