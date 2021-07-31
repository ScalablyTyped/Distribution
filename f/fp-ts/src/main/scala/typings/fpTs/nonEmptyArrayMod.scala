package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt1
import typings.fpTs.anon.FnCallAs
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.comonadMod.Comonad1
import typings.fpTs.eqMod.Eq
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.foldableWithIndexMod.FoldableWithIndex1
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorWithIndexMod.FunctorWithIndex1
import typings.fpTs.monadMod.Monad1
import typings.fpTs.optionMod.Option_
import typings.fpTs.ordMod.Ord_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.showMod.Show
import typings.fpTs.traversableMod.PipeableTraverse1
import typings.fpTs.traversableMod.Sequence1
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableWithIndexMod.PipeableTraverseWithIndex1
import typings.fpTs.traversableWithIndexMod.TraversableWithIndex1
import typings.std.Array
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonEmptyArrayMod {
  
  @JSImport("fp-ts/lib/NonEmptyArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Alt")
  @js.native
  val Alt_ : Alt1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Comonad")
  @js.native
  val Comonad: Comonad1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "FoldableWithIndex")
  @js.native
  val FoldableWithIndex: FoldableWithIndex1[typings.fpTs.nonEmptyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "FunctorWithIndex")
  @js.native
  val FunctorWithIndex: FunctorWithIndex1[typings.fpTs.nonEmptyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "TraversableWithIndex")
  @js.native
  val TraversableWithIndex: TraversableWithIndex1[typings.fpTs.nonEmptyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "URI")
  @js.native
  val URI: /* "NonEmptyArray" */ String = js.native
  type URI = /* "NonEmptyArray" */ String
  
  @scala.inline
  def alt[A](that: Lazy[NonEmptyArray_[A]]): js.Function1[/* fa */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  @scala.inline
  def ap[A](fa: NonEmptyArray_[A]): js.Function1[/* fab */ NonEmptyArray_[js.Function1[/* a */ A, js.Any]], NonEmptyArray_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ NonEmptyArray_[js.Function1[/* a */ A, js.Any]], NonEmptyArray_[js.Any]]]
  
  @scala.inline
  def apFirst[B](fb: NonEmptyArray_[B]): js.Function1[/* fa */ NonEmptyArray_[js.Any], NonEmptyArray_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[js.Any], NonEmptyArray_[js.Any]]]
  
  @scala.inline
  def apS[A, N /* <: String */, B](name: Exclude[N, /* keyof A */ String], fb: NonEmptyArray_[B]): js.Function1[
    /* fa */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSecond[B](fb: NonEmptyArray_[B]): js.Function1[/* fa */ NonEmptyArray_[js.Any], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[js.Any], NonEmptyArray_[B]]]
  
  @scala.inline
  def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, NonEmptyArray_[B]]): js.Function1[
    /* fa */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ NonEmptyArray_[A], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ NonEmptyArray_[js.Any], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ NonEmptyArray_[js.Any], 
    NonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  @scala.inline
  def chain[A, B](f: js.Function1[/* a */ A, NonEmptyArray_[B]]): js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  @scala.inline
  def chainFirst[A, B](f: js.Function1[/* a */ A, NonEmptyArray_[B]]): js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[A]]]
  
  @scala.inline
  def concat[A](fx: js.Array[A], fy: NonEmptyArray_[A]): NonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[A]]
  @scala.inline
  def concat[A](fx: NonEmptyArray_[A], fy: js.Array[A]): NonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[A]]
  
  @scala.inline
  def cons[A](head: A, tail: js.Array[A]): NonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("cons")(head.asInstanceOf[js.Any], tail.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[A]]
  
  @scala.inline
  def copy[A](nea: NonEmptyArray_[A]): NonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(nea.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[A]]
  
  @scala.inline
  def duplicate[A](ma: NonEmptyArray_[A]): NonEmptyArray_[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(ma.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[NonEmptyArray_[A]]]
  
  @scala.inline
  def extend[A, B](f: js.Function1[/* fa */ NonEmptyArray_[A], B]): js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  @JSImport("fp-ts/lib/NonEmptyArray", "extract")
  @js.native
  val extract: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
    js.Any
  ] = js.native
  
  @scala.inline
  def filter[A](predicate: Predicate[A]): js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  @scala.inline
  def filterWithIndex[A](predicate: js.Function2[/* i */ Double, /* a */ A, Boolean]): js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  @scala.inline
  def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  @scala.inline
  def flatten[A](mma: NonEmptyArray_[NonEmptyArray_[A]]): NonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[A]]
  
  @scala.inline
  def fold[A](S: Semigroup[A]): js.Function1[/* fa */ NonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], A]]
  
  @scala.inline
  def foldMap[S](S: Semigroup[S]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, S], 
    js.Function1[/* fa */ NonEmptyArray_[js.Any], S]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, S], 
    js.Function1[/* fa */ NonEmptyArray_[js.Any], S]
  ]]
  
  @scala.inline
  def foldMapWithIndex[S](S: Semigroup[S]): js.Function1[
    /* f */ js.Function2[/* i */ Double, /* a */ js.Any, S], 
    js.Function1[/* fa */ NonEmptyArray_[js.Any], S]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMapWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* i */ Double, /* a */ js.Any, S], 
    js.Function1[/* fa */ NonEmptyArray_[js.Any], S]
  ]]
  
  @scala.inline
  def fromArray[A](as: js.Array[A]): Option_[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(as.asInstanceOf[js.Any]).asInstanceOf[Option_[NonEmptyArray_[A]]]
  
  @scala.inline
  def getEq[A](E: Eq[A]): Eq[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[NonEmptyArray_[A]]]
  
  @scala.inline
  def getSemigroup[A](): Semigroup[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[NonEmptyArray_[A]]]
  
  @scala.inline
  def getShow[A](S: Show[A]): Show[NonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[NonEmptyArray_[A]]]
  
  @scala.inline
  def group[B](E: Eq[B]): FnCallAs[B] = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallAs[B]]
  
  @scala.inline
  def groupBy[A](f: js.Function1[/* a */ A, String]): js.Function1[/* as */ js.Array[A], Record[String, NonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Record[String, NonEmptyArray_[A]]]]
  
  @scala.inline
  def groupSort[B](O: Ord_[B]): FnCallAs[B] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupSort")(O.asInstanceOf[js.Any]).asInstanceOf[FnCallAs[B]]
  
  @scala.inline
  def head[A](nea: NonEmptyArray_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(nea.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def init[A](nea: NonEmptyArray_[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(nea.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def insertAt[A](i: Double, a: A): js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  @scala.inline
  def last[A](nea: NonEmptyArray_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(nea.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  @scala.inline
  def mapWithIndex[A, B](f: js.Function2[/* i */ Double, /* a */ A, B]): js.Function1[/* fa */ NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  @scala.inline
  def max[A](ord: Ord_[A]): js.Function1[/* nea */ NonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(ord.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], A]]
  
  @scala.inline
  def min[A](ord: Ord_[A]): js.Function1[/* nea */ NonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(ord.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], A]]
  
  @scala.inline
  def modifyAt[A](i: Double, f: js.Function1[/* a */ A, A]): js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyAt")(i.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  @JSImport("fp-ts/lib/NonEmptyArray", "nonEmptyArray")
  @js.native
  val nonEmptyArray: Monad1[typings.fpTs.nonEmptyArrayMod.URI] & Comonad1[typings.fpTs.nonEmptyArrayMod.URI] & (TraversableWithIndex1[typings.fpTs.nonEmptyArrayMod.URI, Double]) & (FunctorWithIndex1[typings.fpTs.nonEmptyArrayMod.URI, Double]) & (FoldableWithIndex1[typings.fpTs.nonEmptyArrayMod.URI, Double]) & Alt1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ NonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], B]]
  
  @scala.inline
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ NonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], B]]
  
  @scala.inline
  def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ Double, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ NonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRightWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], B]]
  
  @scala.inline
  def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ Double, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ NonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ NonEmptyArray_[A], B]]
  
  @scala.inline
  def reverse[A](nea: NonEmptyArray_[A]): NonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(nea.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArray_[A]]
  
  @JSImport("fp-ts/lib/NonEmptyArray", "sequence")
  @js.native
  val sequence: Sequence1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @scala.inline
  def snoc[A](init: js.Array[A], end: A): NonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("snoc")(init.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[A]]
  
  @scala.inline
  def sort[B](O: Ord_[B]): js.Function1[/* nea */ NonEmptyArray_[B], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[B], NonEmptyArray_[B]]]
  
  @scala.inline
  def tail[A](nea: NonEmptyArray_[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(nea.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @JSImport("fp-ts/lib/NonEmptyArray", "traverse")
  @js.native
  val traverse: PipeableTraverse1[typings.fpTs.nonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts/lib/NonEmptyArray", "traverseWithIndex")
  @js.native
  val traverseWithIndex: PipeableTraverseWithIndex1[typings.fpTs.nonEmptyArrayMod.URI, Double] = js.native
  
  @scala.inline
  def unzip[A, B](as: NonEmptyArray_[js.Tuple2[A, B]]): js.Tuple2[NonEmptyArray_[A], NonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(as.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NonEmptyArray_[A], NonEmptyArray_[B]]]
  
  @scala.inline
  def updateAt[A](i: Double, a: A): js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* nea */ NonEmptyArray_[A], Option_[NonEmptyArray_[A]]]]
  
  @scala.inline
  def zip[B](bs: NonEmptyArray_[B]): js.Function1[/* as */ NonEmptyArray_[js.Any], NonEmptyArray_[js.Tuple2[js.Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(bs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ NonEmptyArray_[js.Any], NonEmptyArray_[js.Tuple2[js.Any, B]]]]
  @scala.inline
  def zip[A, B](as: NonEmptyArray_[A], bs: NonEmptyArray_[B]): NonEmptyArray_[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(as.asInstanceOf[js.Any], bs.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[js.Tuple2[A, B]]]
  
  @scala.inline
  def zipWith[A, B, C](fa: NonEmptyArray_[A], fb: NonEmptyArray_[B], f: js.Function2[/* a */ A, /* b */ B, C]): NonEmptyArray_[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(fa.asInstanceOf[js.Any], fb.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArray_[C]]
  
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
