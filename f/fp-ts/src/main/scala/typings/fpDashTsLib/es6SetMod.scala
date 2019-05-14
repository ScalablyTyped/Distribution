package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Set", JSImport.Namespace)
@js.native
object es6SetMod extends js.Object {
  val empty: stdLib.Set[scala.Nothing] = js.native
  def chain[B](S: fpDashTsLib.es6SetoidMod.Setoid[B]): js.Function2[
    /* set */ stdLib.Set[_], 
    /* f */ js.Function1[/* x */ js.Any, stdLib.Set[B]], 
    stdLib.Set[B]
  ] = js.native
  def compact[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function1[/* fa */ stdLib.Set[fpDashTsLib.es6OptionMod.Option[A]], stdLib.Set[A]] = js.native
  def difference[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def difference2v[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def elem[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* a */ A, /* x */ stdLib.Set[A], scala.Boolean] = js.native
  def every[A](x: stdLib.Set[A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): scala.Boolean = js.native
  def filter[A](x: stdLib.Set[A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): stdLib.Set[A] = js.native
  def filterMap[B](S: fpDashTsLib.es6SetoidMod.Setoid[B]): js.Function2[
    /* fa */ stdLib.Set[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6OptionMod.Option[B]], 
    stdLib.Set[B]
  ] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](x: stdLib.Set[A], predicate: fpDashTsLib.es6FunctionMod.Refinement[A, B]): stdLib.Set[B] = js.native
  def foldMap[A, M](O: fpDashTsLib.es6OrdMod.Ord[A], M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function2[/* fa */ stdLib.Set[A], /* f */ js.Function1[/* a */ A, M], M] = js.native
  def fromArray[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[A], stdLib.Set[A]] = js.native
  def getIntersectionSemigroup[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SemigroupMod.Semigroup[stdLib.Set[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[stdLib.Set[A]] = js.native
  def getShow[A](SA: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[stdLib.Set[A]] = js.native
  def getUnionMonoid[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6MonoidMod.Monoid[stdLib.Set[A]] = js.native
  def insert[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* a */ A, /* x */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def intersection[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def map[B](S: fpDashTsLib.es6SetoidMod.Setoid[B]): js.Function2[/* set */ stdLib.Set[_], /* f */ js.Function1[/* x */ js.Any, B], stdLib.Set[B]] = js.native
  def member[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function1[/* set */ stdLib.Set[A], js.Function1[/* a */ A, scala.Boolean]] = js.native
  def partition[A](x: stdLib.Set[A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): fpDashTsLib.es6CompactableMod.Separated[stdLib.Set[A], stdLib.Set[A]] = js.native
  def partitionMap[L, R](SL: fpDashTsLib.es6SetoidMod.Setoid[L], SR: fpDashTsLib.es6SetoidMod.Setoid[R]): js.Function2[
    /* x */ stdLib.Set[_], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6EitherMod.Either[L, R]], 
    fpDashTsLib.es6CompactableMod.Separated[stdLib.Set[L], stdLib.Set[R]]
  ] = js.native
  @JSName("partition")
  def partition_ABA[A, B /* <: A */](x: stdLib.Set[A], predicate: fpDashTsLib.es6FunctionMod.Refinement[A, B]): fpDashTsLib.es6CompactableMod.Separated[stdLib.Set[A], stdLib.Set[B]] = js.native
  def reduce[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function3[
    /* fa */ stdLib.Set[A], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* b */ js.Any, /* a */ A, _], 
    _
  ] = js.native
  def remove[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* a */ A, /* x */ stdLib.Set[A], stdLib.Set[A]] = js.native
  def separate[L, R](SL: fpDashTsLib.es6SetoidMod.Setoid[L], SR: fpDashTsLib.es6SetoidMod.Setoid[R]): js.Function1[
    /* fa */ stdLib.Set[fpDashTsLib.es6EitherMod.Either[L, R]], 
    fpDashTsLib.es6CompactableMod.Separated[stdLib.Set[L], stdLib.Set[R]]
  ] = js.native
  def singleton[A](a: A): stdLib.Set[A] = js.native
  def some[A](x: stdLib.Set[A], predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): scala.Boolean = js.native
  def subset[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], scala.Boolean] = js.native
  def toArray[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[/* x */ stdLib.Set[A], fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def union[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function2[/* x */ stdLib.Set[A], /* y */ stdLib.Set[A], stdLib.Set[A]] = js.native
}

