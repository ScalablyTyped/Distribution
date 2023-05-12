package typings.fpTs

import typings.fpTs.anon.FnCallAs
import typings.fpTs.libAltMod.Alt1
import typings.fpTs.libApplicativeMod.Applicative1
import typings.fpTs.libApplyMod.Apply1
import typings.fpTs.libChainMod.Chain1
import typings.fpTs.libComonadMod.Comonad1
import typings.fpTs.libEndomorphismMod.Endomorphism
import typings.fpTs.libEqMod.Eq
import typings.fpTs.libFoldableMod.Foldable1
import typings.fpTs.libFoldableWithIndexMod.FoldableWithIndex1
import typings.fpTs.libFunctionMod.LazyArg
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libFunctorWithIndexMod.FunctorWithIndex1
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libOrdMod.Ord_
import typings.fpTs.libPointedMod.Pointed1
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libShowMod.Show
import typings.fpTs.libTraversableMod.PipeableTraverse1
import typings.fpTs.libTraversableMod.Sequence1
import typings.fpTs.libTraversableMod.Traversable1
import typings.fpTs.libTraversableWithIndexMod.PipeableTraverseWithIndex1
import typings.fpTs.libTraversableWithIndexMod.TraversableWithIndex1
import typings.std.Array
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNonEmptyArrayMod {
  
  @JSImport("fp-ts/lib/NonEmptyArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Alt")
  @js.native
  val Alt_ : Alt1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Apply")
  @js.native
  val Apply: Apply1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Chain")
  @js.native
  val Chain_ : Chain1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Comonad")
  @js.native
  val Comonad: Comonad1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Do")
  @js.native
  val Do: NonEmptyArray_[js.Object] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "FoldableWithIndex")
  @js.native
  val FoldableWithIndex: FoldableWithIndex1[typings.fpTs.libNonEmptyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "FunctorWithIndex")
  @js.native
  val FunctorWithIndex: FunctorWithIndex1[typings.fpTs.libNonEmptyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Pointed")
  @js.native
  val Pointed: Pointed1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "TraversableWithIndex")
  @js.native
  val TraversableWithIndex: TraversableWithIndex1[typings.fpTs.libNonEmptyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "URI")
  @js.native
  val URI: /* "NonEmptyArray" */ String = js.native
  type URI = /* "NonEmptyArray" */ String
  
  inline def alt[A](that: LazyArg[NonEmptyArray_[A]]): js.Function1[/* fa */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  inline def altW[B](that: LazyArg[NonEmptyArray_[B]]): js.Function1[/* as */ NonEmptyArray_[Any], NonEmptyArray_[B | Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[Any], NonEmptyArray_[B | Any]]]
  
  inline def ap[A](as: NonEmptyArray_[A]): js.Function1[/* fab */ NonEmptyArray_[js.Function1[/* a */ A, Any]], NonEmptyArray_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(as.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ NonEmptyArray_[js.Function1[/* a */ A, Any]], NonEmptyArray_[Any]]]
  
  inline def apFirst[B](second: NonEmptyArray_[B]): js.Function1[/* first */ NonEmptyArray_[Any], NonEmptyArray_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ NonEmptyArray_[Any], NonEmptyArray_[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: NonEmptyArray_[B]): js.Function1[
    /* fa */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[B](second: NonEmptyArray_[B]): js.Function1[/* first */ NonEmptyArray_[Any], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ NonEmptyArray_[Any], NonEmptyArray_[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, NonEmptyArray_[B]]): js.Function1[
    /* ma */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ NonEmptyArray_[Any], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ NonEmptyArray_[Any], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, NonEmptyArray_[B]]): js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, NonEmptyArray_[B]]): js.Function1[/* first */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  inline def chainWithIndex[A, B](f: js.Function2[/* i */ Double, /* a */ A, NonEmptyArray_[B]]): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  inline def chop[A, B](f: js.Function1[/* as */ NonEmptyArray_[A], js.Tuple2[B, js.Array[A]]]): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chop")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  inline def chunksOf(n: Double): js.Function1[/* as */ NonEmptyArray_[Any], NonEmptyArray_[NonEmptyArray_[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chunksOf")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[Any], NonEmptyArray_[NonEmptyArray_[Any]]]]
  
  inline def concat[A](first: js.Array[A], second: NonEmptyArray_[A]): NonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[A]]
  inline def concat[A](first: NonEmptyArray_[A], second: js.Array[A]): NonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[A]]
  inline def concat[A](second: js.Array[A]): js.Function1[/* first */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  inline def concat[A](second: NonEmptyArray_[A]): js.Function1[/* first */ js.Array[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ js.Array[A], NonEmptyArray_[A]]]
  
  inline def concatAll[A](S: Semigroup[A]): js.Function1[/* as */ NonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], A]]
  
  inline def concatW[B](second: js.Array[B]): js.Function1[/* first */ NonEmptyArray_[Any], NonEmptyArray_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ NonEmptyArray_[Any], NonEmptyArray_[Any | B]]]
  inline def concatW[B](second: NonEmptyArray_[B]): js.Function1[/* first */ js.Array[Any], NonEmptyArray_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ js.Array[Any], NonEmptyArray_[Any | B]]]
  
  inline def cons[A](head: A): js.Function1[/* tail */ js.Array[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cons")(head.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* tail */ js.Array[A], NonEmptyArray_[A]]]
  inline def cons[A](head: A, tail: js.Array[A]): NonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("cons")(head.asInstanceOf[js.Any], tail.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[A]]
  
  inline def copy[A](as: NonEmptyArray_[A]): NonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(as.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[A]]
  
  inline def duplicate[A](ma: NonEmptyArray_[A]): NonEmptyArray_[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(ma.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[NonEmptyArray_[A]]]
  
  inline def extend[A, B](f: js.Function1[/* as */ NonEmptyArray_[A], B]): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  @JSImport("fp-ts/lib/NonEmptyArray", "extract")
  @js.native
  val extract: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ Any, 
    Any
  ] = js.native
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* bs */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* bs */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  inline def filterWithIndex[A](predicate: js.Function2[/* i */ Double, /* a */ A, Boolean]): js.Function1[/* as */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* as */ NonEmptyArray_[A], Option_[NonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], Option_[NonEmptyArray_[B]]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ NonEmptyArray_[js.Function1[/* a */ A, Any]], NonEmptyArray_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ NonEmptyArray_[js.Function1[/* a */ A, Any]], NonEmptyArray_[Any]]]
  
  inline def flatMap[A, B](f: js.Function2[/* a */ A, /* i */ Double, NonEmptyArray_[B]]): js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  inline def flatMap[A, B](ma: NonEmptyArray_[A], f: js.Function2[/* a */ A, /* i */ Double, NonEmptyArray_[B]]): NonEmptyArray_[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[B]]
  
  inline def flatten[A](mma: NonEmptyArray_[NonEmptyArray_[A]]): NonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[A]]
  
  inline def fold[A](S: Semigroup[A]): js.Function1[/* fa */ NonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], A]]
  
  inline def foldMap[S](S: Semigroup[S]): js.Function1[
    /* f */ js.Function1[/* a */ Any, S], 
    js.Function1[/* fa */ NonEmptyArray_[Any], S]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, S], 
    js.Function1[/* fa */ NonEmptyArray_[Any], S]
  ]]
  
  inline def foldMapWithIndex[S](S: Semigroup[S]): js.Function1[
    /* f */ js.Function2[/* i */ Double, /* a */ Any, S], 
    js.Function1[/* fa */ NonEmptyArray_[Any], S]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMapWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* i */ Double, /* a */ Any, S], 
    js.Function1[/* fa */ NonEmptyArray_[Any], S]
  ]]
  
  inline def fromArray[A](as: js.Array[A]): Option_[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(as.asInstanceOf[js.Any]).asInstanceOf[Option_[NonEmptyArray_[A]]]
  
  inline def fromReadonlyNonEmptyArray[A](as: ReadonlyNonEmptyArray_[A]): NonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReadonlyNonEmptyArray")(as.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[A]]
  
  inline def getEq[A](E: Eq[A]): Eq[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[NonEmptyArray_[A]]]
  
  inline def getSemigroup[A](): Semigroup[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[NonEmptyArray_[A]]]
  
  inline def getShow[A](S: Show[A]): Show[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[NonEmptyArray_[A]]]
  
  inline def getUnionSemigroup[A](E: Eq[A]): Semigroup[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionSemigroup")(E.asInstanceOf[js.Any]).asInstanceOf[Semigroup[NonEmptyArray_[A]]]
  
  inline def group[B](E: Eq[B]): FnCallAs[B] = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallAs[B]]
  
  inline def groupBy[A](f: js.Function1[/* a */ A, String]): js.Function1[/* as */ js.Array[A], Record[String, NonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Record[String, NonEmptyArray_[A]]]]
  
  inline def groupSort[B](O: Ord_[B]): FnCallAs[B] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupSort")(O.asInstanceOf[js.Any]).asInstanceOf[FnCallAs[B]]
  
  inline def head[A](nea: NonEmptyArray_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(nea.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def init[A](as: NonEmptyArray_[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(as.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  inline def insertAt[A](i: Double, a: A): js.Function1[/* as */ js.Array[A], Option_[NonEmptyArray_[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[NonEmptyArray_[A]]]]
  
  inline def intercalate[A](S: Semigroup[A]): js.Function1[/* middle */ A, js.Function1[/* as */ NonEmptyArray_[A], A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intercalate")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* middle */ A, js.Function1[/* as */ NonEmptyArray_[A], A]]]
  
  inline def intersperse[A](middle: A): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersperse")(middle.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  inline def last[A](nea: NonEmptyArray_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(nea.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def makeBy[A](f: js.Function1[/* i */ Double, A]): js.Function1[/* n */ Double, NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* n */ Double, NonEmptyArray_[A]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  inline def mapWithIndex[A, B](f: js.Function2[/* i */ Double, /* a */ A, B]): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  inline def matchLeft[A, B](f: js.Function2[/* head */ A, /* tail */ js.Array[A], B]): js.Function1[/* as */ NonEmptyArray_[A], B] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], B]]
  
  inline def matchRight[A, B](f: js.Function2[/* init */ js.Array[A], /* last */ A, B]): js.Function1[/* as */ NonEmptyArray_[A], B] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchRight")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], B]]
  
  inline def max[A](ord: Ord_[A]): js.Function1[/* nea */ NonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(ord.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], A]]
  
  inline def min[A](ord: Ord_[A]): js.Function1[/* nea */ NonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(ord.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], A]]
  
  inline def modifyAt[A](i: Double, f: js.Function1[/* a */ A, A]): js.Function1[/* as */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyAt")(i.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  inline def modifyHead[A](f: Endomorphism[A]): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyHead")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  inline def modifyLast[A](f: Endomorphism[A]): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyLast")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  @JSImport("fp-ts/lib/NonEmptyArray", "nonEmptyArray")
  @js.native
  val nonEmptyArray: Monad1[typings.fpTs.libNonEmptyArrayMod.URI] & Comonad1[typings.fpTs.libNonEmptyArrayMod.URI] & (TraversableWithIndex1[typings.fpTs.libNonEmptyArrayMod.URI, Double]) & (FunctorWithIndex1[typings.fpTs.libNonEmptyArrayMod.URI, Double]) & (FoldableWithIndex1[typings.fpTs.libNonEmptyArrayMod.URI, Double]) & Alt1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  inline def of[A](a: A): NonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[A]]
  
  inline def prependAll[A](middle: A): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prependAll")(middle.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  inline def prependToAll[A](middle: A): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prependToAll")(middle.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  inline def range(start: Double, end: Double): NonEmptyArray_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[Double]]
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ NonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ NonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], B]]
  
  inline def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ Double, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ NonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRightWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], B]]
  
  inline def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ Double, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ NonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], B]]
  
  inline def replicate[A](a: A): js.Function1[/* n */ Double, ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* n */ Double, ReadonlyNonEmptyArray_[A]]]
  
  inline def reverse[A](as: NonEmptyArray_[A]): NonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(as.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[A]]
  
  inline def rotate(n: Double): js.Function1[/* as */ NonEmptyArray_[Any], NonEmptyArray_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[Any], NonEmptyArray_[Any]]]
  
  @JSImport("fp-ts/lib/NonEmptyArray", "sequence")
  @js.native
  val sequence: Sequence1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  inline def snoc[A](init: js.Array[A], end: A): NonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("snoc")(init.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[A]]
  
  inline def sort[B](O: Ord_[B]): js.Function1[/* as */ NonEmptyArray_[B], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[B], NonEmptyArray_[B]]]
  
  inline def sortBy[B](ords: js.Array[Ord_[B]]): js.Function1[/* as */ NonEmptyArray_[B], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(ords.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[B], NonEmptyArray_[B]]]
  
  inline def splitAt(n: Double): js.Function1[/* as */ NonEmptyArray_[Any], js.Tuple2[NonEmptyArray_[Any], js.Array[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAt")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[Any], js.Tuple2[NonEmptyArray_[Any], js.Array[Any]]]]
  
  inline def tail[A](as: NonEmptyArray_[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(as.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @JSImport("fp-ts/lib/NonEmptyArray", "traverse")
  @js.native
  val traverse: PipeableTraverse1[typings.fpTs.libNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "traverseWithIndex")
  @js.native
  val traverseWithIndex: PipeableTraverseWithIndex1[typings.fpTs.libNonEmptyArrayMod.URI, Double] = js.native
  
  inline def unappend[A](as: NonEmptyArray_[A]): js.Tuple2[js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("unappend")(as.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[A], A]]
  
  inline def uncons[A](as: NonEmptyArray_[A]): js.Tuple2[A, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("uncons")(as.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[A, js.Array[A]]]
  
  inline def union[A](E: Eq[A]): js.Function1[
    /* second */ NonEmptyArray_[A], 
    js.Function1[/* first */ NonEmptyArray_[A], NonEmptyArray_[A]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* second */ NonEmptyArray_[A], 
    js.Function1[/* first */ NonEmptyArray_[A], NonEmptyArray_[A]]
  ]]
  
  inline def uniq[A](E: Eq[A]): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  inline def unprepend[A](as: NonEmptyArray_[A]): js.Tuple2[A, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unprepend")(as.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[A, js.Array[A]]]
  
  inline def unsnoc[A](as: NonEmptyArray_[A]): js.Tuple2[js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsnoc")(as.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[A], A]]
  
  inline def unzip[A, B](abs: NonEmptyArray_[js.Tuple2[A, B]]): js.Tuple2[NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(abs.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  inline def updateAt[A](i: Double, a: A): js.Function1[/* as */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  inline def updateHead[A](a: A): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateHead")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  inline def updateLast[A](a: A): js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateLast")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  inline def zip[B](bs: NonEmptyArray_[B]): js.Function1[/* as */ NonEmptyArray_[Any], NonEmptyArray_[js.Tuple2[Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(bs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[Any], NonEmptyArray_[js.Tuple2[Any, B]]]]
  inline def zip[A, B](as: NonEmptyArray_[A], bs: NonEmptyArray_[B]): NonEmptyArray_[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(as.asInstanceOf[js.Any], bs.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[js.Tuple2[A, B]]]
  
  inline def zipWith[A, B, C](as: NonEmptyArray_[A], bs: NonEmptyArray_[B], f: js.Function2[/* a */ A, /* b */ B, C]): NonEmptyArray_[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(as.asInstanceOf[js.Any], bs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[C]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  @js.native
  trait NonEmptyArray_[A]
    extends StObject
       with Array[A] {
    
    var `0`: A = js.native
  }
}
