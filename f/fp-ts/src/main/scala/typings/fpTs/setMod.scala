package typings.fpTs

import typings.fpTs.anon.Fn32
import typings.fpTs.anon.Fn33
import typings.fpTs.anon.Fn34
import typings.fpTs.eitherMod.Either_
import typings.fpTs.eqMod.Eq
import typings.fpTs.magmaMod.Magma
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.ordMod.Ord_
import typings.fpTs.predicateMod.Predicate
import typings.fpTs.refinementMod.Refinement
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.separatedMod.Separated_
import typings.fpTs.showMod.Show
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMod {
  
  @JSImport("fp-ts/lib/Set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chain[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* x */ Any, Set[B]], 
    js.Function1[/* set */ Set[Any], Set[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ Any, Set[B]], 
    js.Function1[/* set */ Set[Any], Set[B]]
  ]]
  
  inline def compact[A](E: Eq[A]): js.Function1[/* fa */ Set[Option_[A]], Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Set[Option_[A]], Set[A]]]
  
  inline def difference[A](E: Eq[A]): Fn32[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(E.asInstanceOf[js.Any]).asInstanceOf[Fn32[A]]
  
  inline def elem[A](E: Eq[A]): Fn33[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[Fn33[A]]
  
  @JSImport("fp-ts/lib/Set", "empty")
  @js.native
  val empty: Set[scala.Nothing] = js.native
  
  inline def every[A](predicate: Predicate[A]): Predicate[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Predicate[Set[A]]]
  
  inline def every_AB_Refinement[A, B /* <: A */](refinement: Refinement[A, B]): Refinement[Set[A], Set[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(refinement.asInstanceOf[js.Any]).asInstanceOf[Refinement[Set[A], Set[B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* set */ Set[A], Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Set[A]]]
  
  inline def filterMap[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[B]], 
    js.Function1[/* fa */ Set[Any], Set[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[B]], 
    js.Function1[/* fa */ Set[Any], Set[B]]
  ]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* set */ Set[A], Set[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Set[B]]]
  
  inline def foldMap[A, M](O: Ord_[A], M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* fa */ Set[A], M]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(O.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* fa */ Set[A], M]]]
  
  inline def fromArray[A](E: Eq[A]): js.Function1[/* as */ js.Array[A], Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Set[A]]]
  
  inline def getDifferenceMagma[A](E: Eq[A]): Magma[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifferenceMagma")(E.asInstanceOf[js.Any]).asInstanceOf[Magma[Set[A]]]
  
  inline def getEq[A](E: Eq[A]): Eq[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Set[A]]]
  
  inline def getIntersectionSemigroup[A](E: Eq[A]): Semigroup[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionSemigroup")(E.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Set[A]]]
  
  inline def getShow[A](S: Show[A]): Show[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Set[A]]]
  
  inline def getUnionMonoid[A](E: Eq[A]): Monoid[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionMonoid")(E.asInstanceOf[js.Any]).asInstanceOf[Monoid[Set[A]]]
  
  inline def getUnionSemigroup[A](E: Eq[A]): Semigroup[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionSemigroup")(E.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Set[A]]]
  
  inline def insert[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]]]
  
  inline def intersection[A](E: Eq[A]): Fn32[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(E.asInstanceOf[js.Any]).asInstanceOf[Fn32[A]]
  
  inline def isEmpty[A](set: Set[A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(set.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSubset[A](E: Eq[A]): js.Function1[/* that */ Set[A], js.Function1[/* me */ Set[A], Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubset")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* that */ Set[A], js.Function1[/* me */ Set[A], Boolean]]]
  
  inline def map[B](E: Eq[B]): js.Function1[/* f */ js.Function1[/* x */ Any, B], js.Function1[/* set */ Set[Any], Set[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ Any, B], js.Function1[/* set */ Set[Any], Set[B]]]]
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* set */ Set[A], Separated_[Set[A], Set[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Separated_[Set[A], Set[A]]]]
  
  inline def partitionMap[B, C](EB: Eq[B], EC: Eq[C]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[B, C]], 
    js.Function1[/* set */ Set[Any], Separated_[Set[B], Set[C]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(EB.asInstanceOf[js.Any], EC.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[B, C]], 
    js.Function1[/* set */ Set[Any], Separated_[Set[B], Set[C]]]
  ]]
  
  inline def partition_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* set */ Set[A], Separated_[Set[A], Set[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Separated_[Set[A], Set[B]]]]
  
  inline def reduce[A](O: Ord_[A]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* b */ Any, /* a */ A, Any], 
    js.Function1[/* fa */ Set[A], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* b */ Any, /* a */ A, Any], 
    js.Function1[/* fa */ Set[A], Any]
  ]]
  
  inline def reduceRight[A](O: Ord_[A]): js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* a */ A, /* b */ Any, Any], 
    js.Function1[/* fa */ Set[A], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ Any, 
    /* f */ js.Function2[/* a */ A, /* b */ Any, Any], 
    js.Function1[/* fa */ Set[A], Any]
  ]]
  
  inline def remove[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]]]
  
  inline def separate[E, A](EE: Eq[E], EA: Eq[A]): js.Function1[/* fa */ Set[Either_[E, A]], Separated_[Set[E], Set[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("separate")(EE.asInstanceOf[js.Any], EA.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Set[Either_[E, A]], Separated_[Set[E], Set[A]]]]
  
  inline def singleton[A](a: A): Set[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(a.asInstanceOf[js.Any]).asInstanceOf[Set[A]]
  
  inline def size[A](set: Set[A]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(set.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def some[A](predicate: Predicate[A]): js.Function1[/* set */ Set[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Boolean]]
  
  inline def subset[A](E: Eq[A]): Fn34[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("subset")(E.asInstanceOf[js.Any]).asInstanceOf[Fn34[A]]
  
  inline def toArray[A](O: Ord_[A]): js.Function1[/* set */ Set[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], js.Array[A]]]
  
  inline def toggle[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]]]
  
  inline def union[A](E: Eq[A]): Fn32[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(E.asInstanceOf[js.Any]).asInstanceOf[Fn32[A]]
}
