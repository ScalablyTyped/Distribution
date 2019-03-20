package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "nonEmptyArray2v")
@js.native
object nonEmptyArray2vNs extends js.Object {
  val URI: /* NonEmptyArray2v */ java.lang.String = js.native
  val nonEmptyArray: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libNonEmptyArray2vMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libNonEmptyArray2vMod.URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[fpDashTsLib.libNonEmptyArray2vMod.URI, scala.Double]) with (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[fpDashTsLib.libNonEmptyArray2vMod.URI, scala.Double]) with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[fpDashTsLib.libNonEmptyArray2vMod.URI, scala.Double]) = js.native
  def filter[A](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def filterWithIndex[A](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    predicate: js.Function2[/* i */ scala.Double, /* a */ A, scala.Boolean]
  ): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def findFirst[A](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libOptionMod.Option[A] = js.native
  @JSName("findFirst")
  def findFirst_ABA[A, B /* <: A */](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libOptionMod.Option[B] = js.native
  def findIndex[A](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libOptionMod.Option[scala.Double] = js.native
  def findLast[A](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libOptionMod.Option[A] = js.native
  def findLastIndex[A](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libOptionMod.Option[scala.Double] = js.native
  @JSName("findLast")
  def findLast_ABA[A, B /* <: A */](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libOptionMod.Option[B] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def fromNonEmptyArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A] with fpDashTsLib.Anon_0A[A]): fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def getSemigroup[A](): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def group[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def groupBy[A](as: fpDashTsLib.libArrayMod.Global.Array[A], f: js.Function1[/* a */ A, java.lang.String]): org.scalablytyped.runtime.StringDictionary[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def groupSort[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def head[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): A = js.native
  def insertAt[A](i: scala.Double, a: A, nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def last[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): A = js.native
  def make[A](head: A, tail: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def max[A](ord: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], A] = js.native
  def min[A](ord: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], A] = js.native
  def sort[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], 
    fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]
  ] = js.native
  def tail[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def updateAt[A](i: scala.Double, a: A, nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
}

