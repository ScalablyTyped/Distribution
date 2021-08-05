package typings.fpTs.mod

import typings.fpTs.anon.Fn14
import typings.fpTs.anon.Fn15
import typings.fpTs.anon.Fn16
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
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object set {
  
  @JSImport("fp-ts", "set")
  @js.native
  val ^ : js.Any = js.native
  
  inline def chain[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* x */ js.Any, Set[B]], 
    js.Function1[/* set */ Set[js.Any], Set[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ js.Any, Set[B]], 
    js.Function1[/* set */ Set[js.Any], Set[B]]
  ]]
  
  inline def compact[A](E: Eq[A]): js.Function1[/* fa */ Set[Option_[A]], Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Set[Option_[A]], Set[A]]]
  
  inline def difference[A](E: Eq[A]): Fn16[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(E.asInstanceOf[js.Any]).asInstanceOf[Fn16[A]]
  
  inline def elem[A](E: Eq[A]): Fn15[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[Fn15[A]]
  
  @JSImport("fp-ts", "set.empty")
  @js.native
  val empty: Set[scala.Nothing] = js.native
  
  inline def every[A](predicate: Predicate[A]): js.Function1[/* set */ Set[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Boolean]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* set */ Set[A], Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Set[A]]]
  
  inline def filterMap[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, Option_[B]], 
    js.Function1[/* fa */ Set[js.Any], Set[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, Option_[B]], 
    js.Function1[/* fa */ Set[js.Any], Set[B]]
  ]]
  
  inline def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* set */ Set[A], Set[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Set[B]]]
  
  inline def foldMap[A, M](O: Ord_[A], M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* fa */ Set[A], M]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(O.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* fa */ Set[A], M]]]
  
  inline def fromArray[A](E: Eq[A]): js.Function1[/* as */ js.Array[A], Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Set[A]]]
  
  inline def getEq[A](E: Eq[A]): Eq[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Set[A]]]
  
  inline def getIntersectionSemigroup[A](E: Eq[A]): Semigroup[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionSemigroup")(E.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Set[A]]]
  
  inline def getShow[A](S: Show[A]): Show[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Set[A]]]
  
  inline def getUnionMonoid[A](E: Eq[A]): Monoid[Set[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionMonoid")(E.asInstanceOf[js.Any]).asInstanceOf[Monoid[Set[A]]]
  
  inline def insert[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]]]
  
  inline def intersection[A](E: Eq[A]): Fn16[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(E.asInstanceOf[js.Any]).asInstanceOf[Fn16[A]]
  
  inline def map[B](E: Eq[B]): js.Function1[
    /* f */ js.Function1[/* x */ js.Any, B], 
    js.Function1[/* set */ Set[js.Any], Set[B]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ js.Any, B], 
    js.Function1[/* set */ Set[js.Any], Set[B]]
  ]]
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* set */ Set[A], Separated[Set[A], Set[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Separated[Set[A], Set[A]]]]
  
  inline def partitionMap[B, C](EB: Eq[B], EC: Eq[C]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, Either_[B, C]], 
    js.Function1[/* set */ Set[js.Any], Separated[Set[B], Set[C]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(EB.asInstanceOf[js.Any], EC.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, Either_[B, C]], 
    js.Function1[/* set */ Set[js.Any], Separated[Set[B], Set[C]]]
  ]]
  
  inline def partition_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* set */ Set[A], Separated[Set[A], Set[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Separated[Set[A], Set[B]]]]
  
  inline def reduce[A](O: Ord_[A]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ A, js.Any], 
    js.Function1[/* fa */ Set[A], js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ A, js.Any], 
    js.Function1[/* fa */ Set[A], js.Any]
  ]]
  
  inline def remove[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]]]
  
  inline def separate[E, A](EE: Eq[E], EA: Eq[A]): js.Function1[/* fa */ Set[Either_[E, A]], Separated[Set[E], Set[A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("separate")(EE.asInstanceOf[js.Any], EA.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Set[Either_[E, A]], Separated[Set[E], Set[A]]]]
  
  inline def singleton[A](a: A): Set[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(a.asInstanceOf[js.Any]).asInstanceOf[Set[A]]
  
  inline def some[A](predicate: Predicate[A]): js.Function1[/* set */ Set[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], Boolean]]
  
  inline def subset[A](E: Eq[A]): Fn14[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("subset")(E.asInstanceOf[js.Any]).asInstanceOf[Fn14[A]]
  
  inline def toArray[A](O: Ord_[A]): js.Function1[/* set */ Set[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* set */ Set[A], js.Array[A]]]
  
  inline def toggle[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* set */ Set[A], Set[A]]]]
  
  inline def union[A](E: Eq[A]): Fn16[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(E.asInstanceOf[js.Any]).asInstanceOf[Fn16[A]]
}
