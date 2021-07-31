package typings.fpTs

import typings.fpTs.anon.Fn10
import typings.fpTs.anon.Fn11
import typings.fpTs.anon.FnCallASet
import typings.fpTs.compactableMod.Separated
import typings.fpTs.eitherMod.Either_
import typings.fpTs.eqMod.Eq
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.ordMod.Ord_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.showMod.Show
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlySetMod {
  
  @JSImport("fp-ts/lib/ReadonlySet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def chain[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* x */ js.Any, ReadonlySet[B]], 
    js.Function1[/* set */ ReadonlySet[js.Any], ReadonlySet[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ js.Any, ReadonlySet[B]], 
    js.Function1[/* set */ ReadonlySet[js.Any], ReadonlySet[B]]
  ]]
  
  @scala.inline
  def compact[A](E: Eq[A]): js.Function1[/* fa */ ReadonlySet[Option_[A]], ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReadonlySet[Option_[A]], ReadonlySet[A]]]
  
  @scala.inline
  def difference[A](E: Eq[A]): Fn11[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(E.asInstanceOf[js.Any]).asInstanceOf[Fn11[A]]
  
  @scala.inline
  def elem[A](E: Eq[A]): FnCallASet[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[FnCallASet[A]]
  
  @JSImport("fp-ts/lib/ReadonlySet", "empty")
  @js.native
  val empty: ReadonlySet[scala.Nothing] = js.native
  
  @scala.inline
  def every[A](predicate: Predicate[A]): js.Function1[/* set */ ReadonlySet[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], Boolean]]
  
  @scala.inline
  def filter[A](predicate: Predicate[A]): js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]]
  
  @scala.inline
  def filterMap[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, Option_[B]], 
    js.Function1[/* fa */ ReadonlySet[js.Any], ReadonlySet[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, Option_[B]], 
    js.Function1[/* fa */ ReadonlySet[js.Any], ReadonlySet[B]]
  ]]
  
  @scala.inline
  def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* set */ ReadonlySet[A], ReadonlySet[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], ReadonlySet[B]]]
  
  @scala.inline
  def foldMap[A, M](O: Ord_[A], M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* fa */ ReadonlySet[A], M]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(O.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* fa */ ReadonlySet[A], M]]]
  
  @scala.inline
  def fromArray[A](E: Eq[A]): js.Function1[/* as */ js.Array[A], ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReadonlySet[A]]]
  
  @scala.inline
  def fromSet[A](s: Set[A]): ReadonlySet[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSet")(s.asInstanceOf[js.Any]).asInstanceOf[ReadonlySet[A]]
  
  @scala.inline
  def getEq[A](E: Eq[A]): Eq[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[ReadonlySet[A]]]
  
  @scala.inline
  def getIntersectionSemigroup[A](E: Eq[A]): Semigroup[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionSemigroup")(E.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReadonlySet[A]]]
  
  @scala.inline
  def getShow[A](S: Show[A]): Show[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[ReadonlySet[A]]]
  
  @scala.inline
  def getUnionMonoid[A](E: Eq[A]): Monoid[ReadonlySet[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionMonoid")(E.asInstanceOf[js.Any]).asInstanceOf[Monoid[ReadonlySet[A]]]
  
  @scala.inline
  def insert[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]]]
  
  @scala.inline
  def intersection[A](E: Eq[A]): Fn11[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(E.asInstanceOf[js.Any]).asInstanceOf[Fn11[A]]
  
  @scala.inline
  def isSubset[A](E: Eq[A]): Fn10[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubset")(E.asInstanceOf[js.Any]).asInstanceOf[Fn10[A]]
  
  @scala.inline
  def map[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* x */ js.Any, B], 
    js.Function1[/* set */ ReadonlySet[js.Any], ReadonlySet[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ js.Any, B], 
    js.Function1[/* set */ ReadonlySet[js.Any], ReadonlySet[B]]
  ]]
  
  @scala.inline
  def partition[A](predicate: Predicate[A]): js.Function1[/* set */ ReadonlySet[A], Separated[ReadonlySet[A], ReadonlySet[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], Separated[ReadonlySet[A], ReadonlySet[A]]]]
  
  @scala.inline
  def partitionMap[B, C](EB: Eq[B], EC: Eq[C]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, Either_[B, C]], 
    js.Function1[/* set */ ReadonlySet[js.Any], Separated[ReadonlySet[B], ReadonlySet[C]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(EB.asInstanceOf[js.Any], EC.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, Either_[B, C]], 
    js.Function1[/* set */ ReadonlySet[js.Any], Separated[ReadonlySet[B], ReadonlySet[C]]]
  ]]
  
  @scala.inline
  def partition_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* set */ ReadonlySet[A], Separated[ReadonlySet[A], ReadonlySet[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], Separated[ReadonlySet[A], ReadonlySet[B]]]]
  
  @scala.inline
  def reduce[A](O: Ord_[A]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ A, js.Any], 
    js.Function1[/* fa */ ReadonlySet[A], js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ A, js.Any], 
    js.Function1[/* fa */ ReadonlySet[A], js.Any]
  ]]
  
  @scala.inline
  def remove[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ ReadonlySet[A], ReadonlySet[A]]]]
  
  @scala.inline
  def separate[E, A](EE: Eq[E], EA: Eq[A]): js.Function1[/* fa */ ReadonlySet[Either_[E, A]], Separated[ReadonlySet[E], ReadonlySet[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("separate")(EE.asInstanceOf[js.Any], EA.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ ReadonlySet[Either_[E, A]], Separated[ReadonlySet[E], ReadonlySet[A]]]]
  
  @scala.inline
  def singleton[A](a: A): ReadonlySet[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(a.asInstanceOf[js.Any]).asInstanceOf[ReadonlySet[A]]
  
  @scala.inline
  def some[A](predicate: Predicate[A]): js.Function1[/* set */ ReadonlySet[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], Boolean]]
  
  @scala.inline
  def toReadonlyArray[A](O: Ord_[A]): js.Function1[/* set */ ReadonlySet[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toReadonlyArray")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ ReadonlySet[A], js.Array[A]]]
  
  @scala.inline
  def toSet[A](s: ReadonlySet[A]): Set[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSet")(s.asInstanceOf[js.Any]).asInstanceOf[Set[A]]
  
  @scala.inline
  def union[A](E: Eq[A]): Fn11[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(E.asInstanceOf[js.Any]).asInstanceOf[Fn11[A]]
}
