package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt1
import typings.fpTs.anon.Fn8
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
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.showMod.Show
import typings.fpTs.traversableMod.PipeableTraverse1
import typings.fpTs.traversableMod.Sequence1
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableWithIndexMod.PipeableTraverseWithIndex1
import typings.fpTs.traversableWithIndexMod.TraversableWithIndex1
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyNonEmptyArray {
  
  @JSImport("fp-ts", "readonlyNonEmptyArray")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.Alt")
  @js.native
  val Alt_ : Alt1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.Comonad")
  @js.native
  val Comonad: Comonad1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.FoldableWithIndex")
  @js.native
  val FoldableWithIndex: FoldableWithIndex1[typings.fpTs.readonlyNonEmptyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.FunctorWithIndex")
  @js.native
  val FunctorWithIndex: FunctorWithIndex1[typings.fpTs.readonlyNonEmptyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.TraversableWithIndex")
  @js.native
  val TraversableWithIndex: TraversableWithIndex1[typings.fpTs.readonlyNonEmptyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.URI")
  @js.native
  val URI: /* "ReadonlyNonEmptyArray" */ String = js.native
  
  @scala.inline
  def alt[A](that: Lazy[ReadonlyNonEmptyArray_[A]]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[A]]]
  
  @scala.inline
  def ap[A](fa: ReadonlyNonEmptyArray_[A]): js.Function1[
    /* fab */ ReadonlyNonEmptyArray_[js.Function1[/* a */ A, js.Any]], 
    ReadonlyNonEmptyArray_[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReadonlyNonEmptyArray_[js.Function1[/* a */ A, js.Any]], 
    ReadonlyNonEmptyArray_[js.Any]
  ]]
  
  @scala.inline
  def apFirst[B](fb: ReadonlyNonEmptyArray_[B]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[js.Any], ReadonlyNonEmptyArray_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[js.Any], ReadonlyNonEmptyArray_[js.Any]]]
  
  @scala.inline
  def apS[A, N /* <: String */, B](name: Exclude[N, /* keyof A */ String], fb: ReadonlyNonEmptyArray_[B]): js.Function1[
    /* fa */ ReadonlyNonEmptyArray_[A], 
    ReadonlyNonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReadonlyNonEmptyArray_[A], 
    ReadonlyNonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSecond[B](fb: ReadonlyNonEmptyArray_[B]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[js.Any], ReadonlyNonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[js.Any], ReadonlyNonEmptyArray_[B]]]
  
  @scala.inline
  def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReadonlyNonEmptyArray_[B]]): js.Function1[
    /* fa */ ReadonlyNonEmptyArray_[A], 
    ReadonlyNonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReadonlyNonEmptyArray_[A], 
    ReadonlyNonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ ReadonlyNonEmptyArray_[js.Any], 
    ReadonlyNonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReadonlyNonEmptyArray_[js.Any], 
    ReadonlyNonEmptyArray_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  @scala.inline
  def chain[A, B](f: js.Function1[/* a */ A, ReadonlyNonEmptyArray_[B]]): js.Function1[/* ma */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]]]
  
  @scala.inline
  def chainFirst[A, B](f: js.Function1[/* a */ A, ReadonlyNonEmptyArray_[B]]): js.Function1[/* ma */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[A]]]
  
  @scala.inline
  def concat[A](fx: js.Array[A], fy: ReadonlyNonEmptyArray_[A]): ReadonlyNonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArray_[A]]
  @scala.inline
  def concat[A](fx: ReadonlyNonEmptyArray_[A], fy: js.Array[A]): ReadonlyNonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(fx.asInstanceOf[js.Any], fy.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArray_[A]]
  
  @scala.inline
  def cons[A](head: A, tail: js.Array[A]): ReadonlyNonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("cons")(head.asInstanceOf[js.Any], tail.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArray_[A]]
  
  @scala.inline
  def duplicate[A](ma: ReadonlyNonEmptyArray_[A]): ReadonlyNonEmptyArray_[ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(ma.asInstanceOf[js.Any]).asInstanceOf[ReadonlyNonEmptyArray_[ReadonlyNonEmptyArray_[A]]]
  
  @scala.inline
  def extend[A, B](f: js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], B]): js.Function1[/* ma */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]]]
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.extract")
  @js.native
  val extract: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<W, A> */ /* wa */ js.Any, 
    js.Any
  ] = js.native
  
  @scala.inline
  def filter[A](predicate: Predicate[A]): js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]]]
  
  @scala.inline
  def filterWithIndex[A](predicate: js.Function2[/* i */ Double, /* a */ A, Boolean]): js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]]]
  
  @scala.inline
  def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]]]
  
  @scala.inline
  def flatten[A](mma: ReadonlyNonEmptyArray_[ReadonlyNonEmptyArray_[A]]): ReadonlyNonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[ReadonlyNonEmptyArray_[A]]
  
  @scala.inline
  def fold[A](S: Semigroup[A]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], A]]
  
  @scala.inline
  def foldMap[S](S: Semigroup[S]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, S], 
    js.Function1[/* fa */ ReadonlyNonEmptyArray_[js.Any], S]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, S], 
    js.Function1[/* fa */ ReadonlyNonEmptyArray_[js.Any], S]
  ]]
  
  @scala.inline
  def foldMapWithIndex[S](S: Semigroup[S]): js.Function1[
    /* f */ js.Function2[/* i */ Double, /* a */ js.Any, S], 
    js.Function1[/* fa */ ReadonlyNonEmptyArray_[js.Any], S]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMapWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* i */ Double, /* a */ js.Any, S], 
    js.Function1[/* fa */ ReadonlyNonEmptyArray_[js.Any], S]
  ]]
  
  @scala.inline
  def fromArray[A](as: js.Array[A]): Option_[ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(as.asInstanceOf[js.Any]).asInstanceOf[Option_[ReadonlyNonEmptyArray_[A]]]
  
  @scala.inline
  def fromReadonlyArray[A](as: js.Array[A]): Option_[ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReadonlyArray")(as.asInstanceOf[js.Any]).asInstanceOf[Option_[ReadonlyNonEmptyArray_[A]]]
  
  @scala.inline
  def getEq[A](E: Eq[A]): Eq[ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[ReadonlyNonEmptyArray_[A]]]
  
  @scala.inline
  def getSemigroup[A](): Semigroup[ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[ReadonlyNonEmptyArray_[A]]]
  
  @scala.inline
  def getShow[A](S: Show[A]): Show[ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[ReadonlyNonEmptyArray_[A]]]
  
  @scala.inline
  def group[B](E: Eq[B]): Fn8[B] = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(E.asInstanceOf[js.Any]).asInstanceOf[Fn8[B]]
  
  @scala.inline
  def groupBy[A](f: js.Function1[/* a */ A, String]): js.Function1[/* as */ js.Array[A], ReadonlyRecord_[String, ReadonlyNonEmptyArray_[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReadonlyRecord_[String, ReadonlyNonEmptyArray_[A]]]]
  
  @scala.inline
  def groupSort[B](O: Ord_[B]): Fn8[B] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupSort")(O.asInstanceOf[js.Any]).asInstanceOf[Fn8[B]]
  
  @scala.inline
  def head[A](nea: ReadonlyNonEmptyArray_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(nea.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def init[A](nea: ReadonlyNonEmptyArray_[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(nea.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def insertAt[A](i: Double, a: A): js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]]]
  
  @scala.inline
  def last[A](nea: ReadonlyNonEmptyArray_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(nea.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]]]
  
  @scala.inline
  def mapWithIndex[A, B](f: js.Function2[/* i */ Double, /* a */ A, B]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]]]
  
  @scala.inline
  def max[A](ord: Ord_[A]): js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(ord.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], A]]
  
  @scala.inline
  def min[A](ord: Ord_[A]): js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(ord.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], A]]
  
  @scala.inline
  def modifyAt[A](i: Double, f: js.Function1[/* a */ A, A]): js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyAt")(i.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]]]
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.readonlyNonEmptyArray")
  @js.native
  val readonlyNonEmptyArray: Monad1[typings.fpTs.readonlyNonEmptyArrayMod.URI] & Comonad1[typings.fpTs.readonlyNonEmptyArrayMod.URI] & (TraversableWithIndex1[typings.fpTs.readonlyNonEmptyArrayMod.URI, Double]) & (FunctorWithIndex1[typings.fpTs.readonlyNonEmptyArrayMod.URI, Double]) & (FoldableWithIndex1[typings.fpTs.readonlyNonEmptyArrayMod.URI, Double]) & Alt1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @scala.inline
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], B]]
  
  @scala.inline
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], B]]
  
  @scala.inline
  def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ Double, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRightWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], B]]
  
  @scala.inline
  def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ Double, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ ReadonlyNonEmptyArray_[A], B]]
  
  @scala.inline
  def reverse[A](nea: ReadonlyNonEmptyArray_[A]): ReadonlyNonEmptyArray_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(nea.asInstanceOf[js.Any]).asInstanceOf[ReadonlyNonEmptyArray_[A]]
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.sequence")
  @js.native
  val sequence: Sequence1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @scala.inline
  def snoc[A](init: js.Array[A], end: A): ReadonlyNonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("snoc")(init.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArray_[A]]
  
  @scala.inline
  def sort[B](O: Ord_[B]): js.Function1[/* nea */ ReadonlyNonEmptyArray_[B], ReadonlyNonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* nea */ ReadonlyNonEmptyArray_[B], ReadonlyNonEmptyArray_[B]]]
  
  @scala.inline
  def tail[A](nea: ReadonlyNonEmptyArray_[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(nea.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.traverse")
  @js.native
  val traverse: PipeableTraverse1[typings.fpTs.readonlyNonEmptyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyNonEmptyArray.traverseWithIndex")
  @js.native
  val traverseWithIndex: PipeableTraverseWithIndex1[typings.fpTs.readonlyNonEmptyArrayMod.URI, Double] = js.native
  
  @scala.inline
  def unzip[A, B](as: ReadonlyNonEmptyArray_[js.Tuple2[A, B]]): js.Tuple2[ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(as.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ReadonlyNonEmptyArray_[A], ReadonlyNonEmptyArray_[B]]]
  
  @scala.inline
  def updateAt[A](i: Double, a: A): js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* nea */ ReadonlyNonEmptyArray_[A], Option_[ReadonlyNonEmptyArray_[A]]]]
  
  @scala.inline
  def zip[B](bs: ReadonlyNonEmptyArray_[B]): js.Function1[
    /* as */ ReadonlyNonEmptyArray_[js.Any], 
    ReadonlyNonEmptyArray_[js.Tuple2[js.Any, B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(bs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* as */ ReadonlyNonEmptyArray_[js.Any], 
    ReadonlyNonEmptyArray_[js.Tuple2[js.Any, B]]
  ]]
  @scala.inline
  def zip[A, B](as: ReadonlyNonEmptyArray_[A], bs: ReadonlyNonEmptyArray_[B]): ReadonlyNonEmptyArray_[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(as.asInstanceOf[js.Any], bs.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArray_[js.Tuple2[A, B]]]
  
  @scala.inline
  def zipWith[A, B, C](
    fa: ReadonlyNonEmptyArray_[A],
    fb: ReadonlyNonEmptyArray_[B],
    f: js.Function2[/* a */ A, /* b */ B, C]
  ): ReadonlyNonEmptyArray_[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(fa.asInstanceOf[js.Any], fb.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArray_[C]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
