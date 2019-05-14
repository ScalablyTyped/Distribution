package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "nonEmptyArray2v")
@js.native
object nonEmptyArray2vNs extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v = js.native
  val nonEmptyArray: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.es6NonEmptyArray2vMod.URI] with fpDashTsLib.es6ComonadMod.Comonad1[fpDashTsLib.es6NonEmptyArray2vMod.URI] with (fpDashTsLib.es6TraversableWithIndexMod.TraversableWithIndex1[fpDashTsLib.es6NonEmptyArray2vMod.URI, scala.Double]) with (fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex1[fpDashTsLib.es6NonEmptyArray2vMod.URI, scala.Double]) with (fpDashTsLib.es6FoldableWithIndexMod.FoldableWithIndex1[fpDashTsLib.es6NonEmptyArray2vMod.URI, scala.Double]) = js.native
  def cons[A](a: A, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def copy[A](nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def filter[A](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def filterWithIndex[A](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    predicate: js.Function2[/* i */ scala.Double, /* a */ A, scala.Boolean]
  ): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]
  ): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def findFirst[A](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6OptionMod.Option[A] = js.native
  @JSName("findFirst")
  def findFirst_ABA[A, B /* <: A */](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]
  ): fpDashTsLib.es6OptionMod.Option[B] = js.native
  def findIndex[A](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6OptionMod.Option[scala.Double] = js.native
  def findLast[A](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def findLastIndex[A](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.es6FunctionMod.Predicate[A]
  ): fpDashTsLib.es6OptionMod.Option[scala.Double] = js.native
  @JSName("findLast")
  def findLast_ABA[A, B /* <: A */](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]
  ): fpDashTsLib.es6OptionMod.Option[B] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def fromNonEmptyArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A] with fpDashTsLib.Anon_0A[A]): fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def getSemigroup[A](): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def group[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def groupBy[A](as: fpDashTsLib.libArrayMod.Global.Array[A], f: js.Function1[/* a */ A, java.lang.String]): org.scalablytyped.runtime.StringDictionary[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def groupSort[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def head[A](nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]): A = js.native
  def insertAt[A](i: scala.Double, a: A, nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def last[A](nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]): A = js.native
  def make[A](head: A, tail: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def max[A](ord: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[/* nea */ fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A], A] = js.native
  def min[A](ord: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[/* nea */ fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A], A] = js.native
  def modifyAt[A](
    nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A],
    i: scala.Double,
    f: js.Function1[/* a */ A, A]
  ): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def reverse[A](nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def snoc[A](as: fpDashTsLib.libArrayMod.Global.Array[A], a: A): fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def sort[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[
    /* nea */ fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A], 
    fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]
  ] = js.native
  def tail[A](nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def updateAt[A](i: scala.Double, a: A, nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]] = js.native
}

