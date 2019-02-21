package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Set", JSImport.Namespace)
@js.native
object libSetMod extends js.Object {
  val empty: stdLib.Set[scala.Nothing] = js.native
  def chain[B](S: fpDashTsLib.libSetoidMod.Setoid[B]): js.Function2[
    /* set */ stdLib.Set[_], 
    /* f */ js.Function1[/* x */ js.Any, stdLib.Set[B]], 
    stdLib.Set[B]
  ] = js.native
  def compact[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[/* fa */ stdLib.Set[fpDashTsLib.libOptionMod.Option[A]], stdLib.Set[A]] = js.native
  def difference[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def difference2v[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def elem[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* x */ stdLib.Set[A], scala.Boolean] = js.native
  def every[A](x: stdLib.Set[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): scala.Boolean = js.native
  def filter[A](x: stdLib.Set[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): stdLib.Set[A] = js.native
  def filterMap[B](S: fpDashTsLib.libSetoidMod.Setoid[B]): js.Function2[
    /* fa */ stdLib.Set[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libOptionMod.Option[B]], 
    stdLib.Set[B]
  ] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](x: stdLib.Set[A], predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]): stdLib.Set[B] = js.native
  def foldMap[A, M](O: fpDashTsLib.libOrdMod.Ord[A], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[/* fa */ stdLib.Set[A], /* f */ js.Function1[/* a */ A, M], M] = js.native
  def fromArray[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], stdLib.Set[A]] = js.native
  def getIntersectionSemigroup[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSemigroupMod.Semigroup[stdLib.Set[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[stdLib.Set[A]] = js.native
  def getUnionMonoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libMonoidMod.Monoid[stdLib.Set[A]] = js.native
  def insert[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* x */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def intersection[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def map[B](S: fpDashTsLib.libSetoidMod.Setoid[B]): js.Function2[/* set */ stdLib.Set[_], /* f */ js.Function1[/* x */ js.Any, B], stdLib.Set[B]] = js.native
  def member[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[/* set */ stdLib.Set[A], js.Function1[/* a */ A, scala.Boolean]] = js.native
  def partition[A](x: stdLib.Set[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[stdLib.Set[A], stdLib.Set[A]] = js.native
  def partitionMap[L, R](SL: fpDashTsLib.libSetoidMod.Setoid[L], SR: fpDashTsLib.libSetoidMod.Setoid[R]): js.Function2[
    /* x */ stdLib.Set[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libEitherMod.Either[L, R]], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Set[L], stdLib.Set[R]]
  ] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](x: stdLib.Set[A], predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libCompactableMod.Separated[stdLib.Set[A], stdLib.Set[B]] = js.native
  def reduce[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function3[
    /* fa */ stdLib.Set[A], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ A, _], 
    _
  ] = js.native
  def remove[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* x */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def separate[L, R](SL: fpDashTsLib.libSetoidMod.Setoid[L], SR: fpDashTsLib.libSetoidMod.Setoid[R]): js.Function1[
    /* fa */ stdLib.Set[fpDashTsLib.libEitherMod.Either[L, R]], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Set[L], stdLib.Set[R]]
  ] = js.native
  def singleton[A](a: A): stdLib.Set[A] = js.native
  def some[A](x: stdLib.Set[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): scala.Boolean = js.native
  def subset[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], scala.Boolean] = js.native
  def toArray[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* x */ stdLib.Set[A], fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def union[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], stdLib.Set[A]] = js.native
}

