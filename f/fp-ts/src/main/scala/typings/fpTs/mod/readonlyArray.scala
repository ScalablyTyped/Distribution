package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt1
import typings.fpTs.alternativeMod.Alternative1
import typings.fpTs.anon.Fn2
import typings.fpTs.anon.FnCallAAs
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.compactableMod.Compactable1
import typings.fpTs.compactableMod.Separated
import typings.fpTs.eitherMod.Either_
import typings.fpTs.eqMod.Eq
import typings.fpTs.extendMod.Extend1
import typings.fpTs.filterableMod.Filterable1
import typings.fpTs.filterableWithIndexMod.FilterableWithIndex1
import typings.fpTs.filterableWithIndexMod.PredicateWithIndex
import typings.fpTs.filterableWithIndexMod.RefinementWithIndex
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.foldableWithIndexMod.FoldableWithIndex1
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorWithIndexMod.FunctorWithIndex1
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.ordMod.Ord_
import typings.fpTs.readonlyArrayMod.Spanned
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.showMod.Show
import typings.fpTs.traversableMod.PipeableTraverse1
import typings.fpTs.traversableMod.Sequence1
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableWithIndexMod.PipeableTraverseWithIndex1
import typings.fpTs.traversableWithIndexMod.TraversableWithIndex1
import typings.fpTs.unfoldableMod.Unfoldable1
import typings.fpTs.witherableMod.PipeableWilt1
import typings.fpTs.witherableMod.PipeableWither1
import typings.fpTs.witherableMod.Witherable1
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyArray {
  
  @JSImport("fp-ts", "readonlyArray")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "readonlyArray.Alt")
  @js.native
  val Alt_ : Alt1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Alternative")
  @js.native
  val Alternative: Alternative1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Compactable")
  @js.native
  val Compactable: Compactable1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Extend")
  @js.native
  val Extend_ : Extend1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Filterable")
  @js.native
  val Filterable: Filterable1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.FilterableWithIndex")
  @js.native
  val FilterableWithIndex: FilterableWithIndex1[typings.fpTs.readonlyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.FoldableWithIndex")
  @js.native
  val FoldableWithIndex: FoldableWithIndex1[typings.fpTs.readonlyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.FunctorWithIndex")
  @js.native
  val FunctorWithIndex: FunctorWithIndex1[typings.fpTs.readonlyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.TraversableWithIndex")
  @js.native
  val TraversableWithIndex: TraversableWithIndex1[typings.fpTs.readonlyArrayMod.URI, Double] = js.native
  
  @JSImport("fp-ts", "readonlyArray.URI")
  @js.native
  val URI: /* "ReadonlyArray" */ String = js.native
  
  @JSImport("fp-ts", "readonlyArray.Unfoldable")
  @js.native
  val Unfoldable: Unfoldable1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.Witherable")
  @js.native
  val Witherable: Witherable1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @scala.inline
  def alt[A](that: Lazy[js.Array[A]]): js.Function1[/* fa */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def ap[A](fa: js.Array[A]): js.Function1[/* fab */ js.Array[js.Function1[/* a */ A, js.Any]], js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ js.Array[js.Function1[/* a */ A, js.Any]], js.Array[js.Any]]]
  
  @scala.inline
  def apFirst[B](fb: js.Array[B]): js.Function1[/* fa */ js.Array[js.Any], js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[js.Any], js.Array[js.Any]]]
  
  @scala.inline
  def apS[A, N /* <: String */, B](name: Exclude[N, /* keyof A */ String], fb: js.Array[B]): js.Function1[
    /* fa */ js.Array[A], 
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ js.Array[A], 
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSecond[B](fb: js.Array[B]): js.Function1[/* fa */ js.Array[js.Any], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[js.Any], js.Array[B]]]
  
  @scala.inline
  def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, js.Array[B]]): js.Function1[
    /* fa */ js.Array[A], 
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ js.Array[A], 
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ js.Array[js.Any], 
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ js.Array[js.Any], 
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  @scala.inline
  def chain[A, B](f: js.Function1[/* a */ A, js.Array[B]]): js.Function1[/* ma */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def chainFirst[A, B](f: js.Function1[/* a */ A, js.Array[B]]): js.Function1[/* ma */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def chainWithIndex[A, B](f: js.Function2[/* i */ Double, /* a */ A, js.Array[B]]): js.Function1[/* ma */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def chop[A, B](f: js.Function1[/* as */ ReadonlyNonEmptyArray_[A], js.Tuple2[B, js.Array[A]]]): js.Function1[/* as */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chop")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def chunksOf(n: Double): js.Function1[/* as */ js.Array[js.Any], js.Array[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chunksOf")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], js.Array[js.Array[js.Any]]]]
  
  @scala.inline
  def compact[A](fa: js.Array[Option_[A]]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def comprehension[A, R](input: js.Array[js.Array[A]], f: js.Function1[/* a */ A, Boolean | R]): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("comprehension")(input.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  @scala.inline
  def comprehension[A, R](
    input: js.Array[js.Array[A]],
    f: js.Function1[/* a */ A, Boolean | R],
    g: js.Function1[/* a */ A, Boolean | R]
  ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("comprehension")(input.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  @scala.inline
  def comprehension[A, B, R](input: js.Tuple2[js.Array[A], js.Array[B]], f: js.Function2[/* a */ A, /* b */ B, R]): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("comprehension")(input.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  @scala.inline
  def comprehension[A, B, R](
    input: js.Tuple2[js.Array[A], js.Array[B]],
    f: js.Function2[/* a */ A, /* b */ B, R],
    g: js.Function2[/* a */ A, /* b */ B, Boolean]
  ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("comprehension")(input.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  @scala.inline
  def comprehension[A, B, C, R](
    input: js.Tuple3[js.Array[A], js.Array[B], js.Array[C]],
    f: js.Function3[/* a */ A, /* b */ B, /* c */ C, R]
  ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("comprehension")(input.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  @scala.inline
  def comprehension[A, B, C, R](
    input: js.Tuple3[js.Array[A], js.Array[B], js.Array[C]],
    f: js.Function3[/* a */ A, /* b */ B, /* c */ C, R],
    g: js.Function3[/* a */ A, /* b */ B, /* c */ C, Boolean]
  ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("comprehension")(input.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  @scala.inline
  def comprehension[A, B, C, D, R](
    input: js.Tuple4[js.Array[A], js.Array[B], js.Array[C], js.Array[D]],
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, R]
  ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("comprehension")(input.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  @scala.inline
  def comprehension[A, B, C, D, R](
    input: js.Tuple4[js.Array[A], js.Array[B], js.Array[C], js.Array[D]],
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, R],
    g: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, Boolean]
  ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("comprehension")(input.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  
  @scala.inline
  def cons[A](head: A): js.Function1[/* tail */ js.Array[A], ReadonlyNonEmptyArray_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cons")(head.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* tail */ js.Array[A], ReadonlyNonEmptyArray_[A]]]
  @scala.inline
  def cons[A](head: A, tail: js.Array[A]): ReadonlyNonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("cons")(head.asInstanceOf[js.Any], tail.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArray_[A]]
  
  @scala.inline
  def deleteAt(i: Double): js.Function1[/* as */ js.Array[js.Any], Option_[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAt")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], Option_[js.Array[js.Any]]]]
  
  @scala.inline
  def difference[A](E: Eq[A]): Fn2[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(E.asInstanceOf[js.Any]).asInstanceOf[Fn2[A]]
  
  @scala.inline
  def dropLeft(n: Double): js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropLeft")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]]]
  
  @scala.inline
  def dropLeftWhile[A](predicate: Predicate[A]): js.Function1[/* as */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropLeftWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def dropRight(n: Double): js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropRight")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]]]
  
  @scala.inline
  def duplicate[A](wa: js.Array[A]): js.Array[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(wa.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[A]]]
  
  @scala.inline
  def elem[A](E: Eq[A]): FnCallAAs[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallAAs[A]]
  
  @JSImport("fp-ts", "readonlyArray.empty")
  @js.native
  val empty: js.Array[scala.Nothing] = js.native
  
  @scala.inline
  def extend[A, B](f: js.Function1[/* fa */ js.Array[A], B]): js.Function1[/* wa */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def filter[A](predicate: Predicate[A]): js.Function1[/* fa */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fa */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def filterMapWithIndex[A, B](f: js.Function2[/* i */ Double, /* a */ A, Option_[B]]): js.Function1[/* fa */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def filterWithIndex[A](predicateWithIndex: PredicateWithIndex[Double, A]): js.Function1[/* fa */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(predicateWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def filterWithIndex_AB_A[A, B /* <: A */](refinementWithIndex: RefinementWithIndex[Double, A, B]): js.Function1[/* fa */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWithIndex")(refinementWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def findFirst[A](predicate: Predicate[A]): js.Function1[/* as */ js.Array[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[A]]]
  
  @scala.inline
  def findFirstMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* as */ js.Array[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[B]]]
  
  @scala.inline
  def findFirst_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* as */ js.Array[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[B]]]
  
  @scala.inline
  def findIndex[A](predicate: Predicate[A]): js.Function1[/* as */ js.Array[A], Option_[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[Double]]]
  
  @scala.inline
  def findLast[A](predicate: Predicate[A]): js.Function1[/* as */ js.Array[A], Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findLast")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[A]]]
  
  @scala.inline
  def findLastIndex[A](predicate: Predicate[A]): js.Function1[/* as */ js.Array[A], Option_[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findLastIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[Double]]]
  
  @scala.inline
  def findLastMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* as */ js.Array[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findLastMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[B]]]
  
  @scala.inline
  def findLast_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* as */ js.Array[A], Option_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findLast")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[B]]]
  
  @scala.inline
  def flatten[A](mma: js.Array[js.Array[A]]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def foldLeft[A, B](onEmpty: Lazy[B], onCons: js.Function2[/* head */ A, /* tail */ js.Array[A], B]): js.Function1[/* as */ js.Array[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLeft")(onEmpty.asInstanceOf[js.Any], onCons.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ js.Array[A], B]]
  
  @scala.inline
  def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ js.Array[js.Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ js.Array[js.Any], M]
  ]]
  
  @scala.inline
  def foldMapWithIndex[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function2[/* i */ Double, /* a */ js.Any, M], 
    js.Function1[/* fa */ js.Array[js.Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMapWithIndex")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* i */ Double, /* a */ js.Any, M], 
    js.Function1[/* fa */ js.Array[js.Any], M]
  ]]
  
  @scala.inline
  def foldRight[A, B](onEmpty: Lazy[B], onCons: js.Function2[/* init */ js.Array[A], /* last */ A, B]): js.Function1[/* as */ js.Array[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldRight")(onEmpty.asInstanceOf[js.Any], onCons.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ js.Array[A], B]]
  
  @scala.inline
  def fromArray[A](as: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(as.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def getEq[A](E: Eq[A]): Eq[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[js.Array[A]]]
  
  @scala.inline
  def getMonoid[A](): Monoid[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")().asInstanceOf[Monoid[js.Array[A]]]
  
  @scala.inline
  def getOrd[A](O: Ord_[A]): Ord_[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrd")(O.asInstanceOf[js.Any]).asInstanceOf[Ord_[js.Array[A]]]
  
  @scala.inline
  def getShow[A](S: Show[A]): Show[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[js.Array[A]]]
  
  @scala.inline
  def head[A](as: js.Array[A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(as.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  @scala.inline
  def init[A](as: js.Array[A]): Option_[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(as.asInstanceOf[js.Any]).asInstanceOf[Option_[js.Array[A]]]
  
  @scala.inline
  def insertAt[A](i: Double, a: A): js.Function1[/* as */ js.Array[A], Option_[js.Array[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[js.Array[A]]]]
  
  @scala.inline
  def intersection[A](E: Eq[A]): Fn2[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(E.asInstanceOf[js.Any]).asInstanceOf[Fn2[A]]
  
  @scala.inline
  def isEmpty[A](as: js.Array[A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(as.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNonEmpty[A](as: js.Array[A]): /* is fp-ts.fp-ts/lib/ReadonlyNonEmptyArray.ReadonlyNonEmptyArray<A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonEmpty")(as.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/ReadonlyNonEmptyArray.ReadonlyNonEmptyArray<A> */ Boolean]
  
  @scala.inline
  def isOutOfBound[A](i: Double, as: js.Array[A]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOutOfBound")(i.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def last[A](as: js.Array[A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(as.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  @scala.inline
  def lefts[E, A](as: js.Array[Either_[E, A]]): js.Array[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("lefts")(as.asInstanceOf[js.Any]).asInstanceOf[js.Array[E]]
  
  @scala.inline
  def lookup(i: Double): js.Function1[/* as */ js.Array[js.Any], Option_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], Option_[js.Any]]]
  @scala.inline
  def lookup[A](i: Double, as: js.Array[A]): Option_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(i.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[Option_[A]]
  
  @scala.inline
  def makeBy[A](n: Double, f: js.Function1[/* i */ Double, A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBy")(n.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def mapWithIndex[A, B](f: js.Function2[/* i */ Double, /* a */ A, B]): js.Function1[/* fa */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def modifyAt[A](i: Double, f: js.Function1[/* a */ A, A]): js.Function1[/* as */ js.Array[A], Option_[js.Array[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyAt")(i.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[js.Array[A]]]]
  
  @JSImport("fp-ts", "readonlyArray.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def partition[A](predicate: Predicate[A]): js.Function1[/* fa */ js.Array[A], Separated[js.Array[A], js.Array[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], Separated[js.Array[A], js.Array[A]]]]
  
  @scala.inline
  def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ js.Array[A], Separated[js.Array[B], js.Array[C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], Separated[js.Array[B], js.Array[C]]]]
  
  @scala.inline
  def partitionMapWithIndex[A, B, C](f: js.Function2[/* i */ Double, /* a */ A, Either_[B, C]]): js.Function1[/* fa */ js.Array[A], Separated[js.Array[B], js.Array[C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMapWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], Separated[js.Array[B], js.Array[C]]]]
  
  @scala.inline
  def partitionWithIndex[A](predicateWithIndex: PredicateWithIndex[Double, A]): js.Function1[/* fa */ js.Array[A], Separated[js.Array[A], js.Array[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionWithIndex")(predicateWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], Separated[js.Array[A], js.Array[A]]]]
  
  @scala.inline
  def partitionWithIndex_AB_A[A, B /* <: A */](refinementWithIndex: RefinementWithIndex[Double, A, B]): js.Function1[/* fa */ js.Array[A], Separated[js.Array[A], js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionWithIndex")(refinementWithIndex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], Separated[js.Array[A], js.Array[B]]]]
  
  @scala.inline
  def partition_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fa */ js.Array[A], Separated[js.Array[A], js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Array[A], Separated[js.Array[A], js.Array[B]]]]
  
  @scala.inline
  def range(start: Double, end: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("fp-ts", "readonlyArray.readonlyArray")
  @js.native
  val readonlyArray: (FunctorWithIndex1[typings.fpTs.readonlyArrayMod.URI, Double]) & Monad1[typings.fpTs.readonlyArrayMod.URI] & Unfoldable1[typings.fpTs.readonlyArrayMod.URI] & Alternative1[typings.fpTs.readonlyArrayMod.URI] & Extend1[typings.fpTs.readonlyArrayMod.URI] & (FilterableWithIndex1[typings.fpTs.readonlyArrayMod.URI, Double]) & (FoldableWithIndex1[typings.fpTs.readonlyArrayMod.URI, Double]) & (TraversableWithIndex1[typings.fpTs.readonlyArrayMod.URI, Double]) & Witherable1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @scala.inline
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ js.Array[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Array[A], B]]
  
  @scala.inline
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ js.Array[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Array[A], B]]
  
  @scala.inline
  def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ Double, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ js.Array[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRightWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Array[A], B]]
  
  @scala.inline
  def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ Double, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ js.Array[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceWithIndex")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ js.Array[A], B]]
  
  @scala.inline
  def replicate[A](n: Double, a: A): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(n.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def reverse[A](as: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(as.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def rights[E, A](as: js.Array[Either_[E, A]]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rights")(as.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def rotate(n: Double): js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]]]
  
  @scala.inline
  def scanLeft[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* as */ js.Array[A], js.Array[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanLeft")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def scanRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* as */ js.Array[A], js.Array[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def separate[A, B](fa: js.Array[Either_[A, B]]): Separated[js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separate")(fa.asInstanceOf[js.Any]).asInstanceOf[Separated[js.Array[A], js.Array[B]]]
  
  @JSImport("fp-ts", "readonlyArray.sequence")
  @js.native
  val sequence: Sequence1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @scala.inline
  def snoc[A](init: js.Array[A], end: A): ReadonlyNonEmptyArray_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("snoc")(init.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArray_[A]]
  
  @scala.inline
  def sort[B](O: Ord_[B]): js.Function1[/* as */ js.Array[B], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[B], js.Array[B]]]
  
  @scala.inline
  def sortBy[B](ords: js.Array[Ord_[B]]): js.Function1[/* as */ js.Array[B], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(ords.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[B], js.Array[B]]]
  
  @scala.inline
  def spanLeft[A](predicate: Predicate[A]): js.Function1[/* as */ js.Array[A], Spanned[A, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("spanLeft")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Spanned[A, A]]]
  
  @scala.inline
  def spanLeft_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* as */ js.Array[A], Spanned[B, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("spanLeft")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Spanned[B, A]]]
  
  @scala.inline
  def splitAt(n: Double): js.Function1[/* as */ js.Array[js.Any], js.Tuple2[js.Array[js.Any], js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAt")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], js.Tuple2[js.Array[js.Any], js.Array[js.Any]]]]
  
  @scala.inline
  def tail[A](as: js.Array[A]): Option_[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(as.asInstanceOf[js.Any]).asInstanceOf[Option_[js.Array[A]]]
  
  @scala.inline
  def takeLeft(n: Double): js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLeft")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]]]
  
  @scala.inline
  def takeLeftWhile[A](predicate: Predicate[A]): js.Function1[/* as */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLeftWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def takeLeftWhile_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* as */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLeftWhile")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], js.Array[B]]]
  
  @scala.inline
  def takeRight(n: Double): js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeRight")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], js.Array[js.Any]]]
  
  @scala.inline
  def toArray[A](ras: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(ras.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @JSImport("fp-ts", "readonlyArray.traverse")
  @js.native
  val traverse: PipeableTraverse1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.traverseWithIndex")
  @js.native
  val traverseWithIndex: PipeableTraverseWithIndex1[typings.fpTs.readonlyArrayMod.URI, Double] = js.native
  
  @scala.inline
  def unfold[A, B](b: B, f: js.Function1[/* b */ B, Option_[js.Tuple2[A, B]]]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("unfold")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def union[A](E: Eq[A]): Fn2[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(E.asInstanceOf[js.Any]).asInstanceOf[Fn2[A]]
  
  @scala.inline
  def uniq[A](E: Eq[A]): js.Function1[/* as */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def unsafeDeleteAt[A](i: Double, as: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeDeleteAt")(i.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def unsafeInsertAt[A](i: Double, a: A, as: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeInsertAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def unsafeUpdateAt[A](i: Double, a: A, as: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUpdateAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def unzip[A, B](as: js.Array[js.Tuple2[A, B]]): js.Tuple2[js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(as.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[A], js.Array[B]]]
  
  @scala.inline
  def updateAt[A](i: Double, a: A): js.Function1[/* as */ js.Array[A], Option_[js.Array[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAt")(i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* as */ js.Array[A], Option_[js.Array[A]]]]
  
  @JSImport("fp-ts", "readonlyArray.wilt")
  @js.native
  val wilt: PipeableWilt1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.wither")
  @js.native
  val wither: PipeableWither1[typings.fpTs.readonlyArrayMod.URI] = js.native
  
  @JSImport("fp-ts", "readonlyArray.zero")
  @js.native
  val zero: js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def zip[B](bs: js.Array[B]): js.Function1[/* as */ js.Array[js.Any], js.Array[js.Tuple2[js.Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(bs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[js.Any], js.Array[js.Tuple2[js.Any, B]]]]
  @scala.inline
  def zip[A, B](as: js.Array[A], bs: js.Array[B]): js.Array[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(as.asInstanceOf[js.Any], bs.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[A, B]]]
  
  @scala.inline
  def zipWith[A, B, C](fa: js.Array[A], fb: js.Array[B], f: js.Function2[/* a */ A, /* b */ B, C]): js.Array[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(fa.asInstanceOf[js.Any], fb.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[C]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
