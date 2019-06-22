package typings
package fpDashTsLib.libNonEmptyArray2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/NonEmptyArray2v", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v = js.native
  val nonEmptyArray: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libComonadMod.Comonad1[URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[URI, scala.Double]) with (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[URI, scala.Double]) with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[URI, scala.Double]) = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, duplicate, extend, flatten, foldMap, foldMapWithIndex, map, mapWithIndex, reduce, reduceRight, reduceRightWithIndex, reduceWithIndex) */ def ap[A](fa: NonEmptyArray[A]): js.Function1[/* fab */ NonEmptyArray[js.Function1[/* a */ A, _]], NonEmptyArray[_]] = js.native
  def cons[A](a: A, as: fpDashTsLib.libArrayMod.Global.Array[A]): NonEmptyArray[A] = js.native
  def copy[A](nea: NonEmptyArray[A]): NonEmptyArray[A] = js.native
  def filter[A](nea: NonEmptyArray[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  def filter[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[/* nea */ NonEmptyArray[A], fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]]] = js.native
  def filterWithIndex[A](nea: NonEmptyArray[A], predicate: js.Function2[/* i */ scala.Double, /* a */ A, scala.Boolean]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  def filterWithIndex[A](predicate: js.Function2[/* i */ scala.Double, /* a */ A, scala.Boolean]): js.Function1[/* nea */ NonEmptyArray[A], fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]]] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](nea: NonEmptyArray[A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* nea */ NonEmptyArray[A], fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]]] = js.native
  def findFirst[A](nea: NonEmptyArray[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  @JSName("findFirst")
  def findFirst_ABA[A, B /* <: A */](nea: NonEmptyArray[A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libOptionMod.Option[B] = js.native
  def findIndex[A](nea: NonEmptyArray[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[scala.Double] = js.native
  def findLast[A](nea: NonEmptyArray[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def findLastIndex[A](nea: NonEmptyArray[A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[scala.Double] = js.native
  @JSName("findLast")
  def findLast_ABA[A, B /* <: A */](nea: NonEmptyArray[A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libOptionMod.Option[B] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  def fromNonEmptyArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A] with fpDashTsLib.Anon_0A[A]): NonEmptyArray[A] = js.native
  def getEq[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[NonEmptyArray[A]] = js.native
  def getSemigroup[A](): fpDashTsLib.libSemigroupMod.Semigroup[NonEmptyArray[A]] = js.native
  def getSetoid[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[NonEmptyArray[A]] = js.native
  def getShow[A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[NonEmptyArray[A]] = js.native
  def group[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[NonEmptyArray[A]]
  ] = js.native
  def groupBy[A](as: fpDashTsLib.libArrayMod.Global.Array[A], f: js.Function1[/* a */ A, java.lang.String]): org.scalablytyped.runtime.StringDictionary[NonEmptyArray[A]] = js.native
  def groupBy[A](f: js.Function1[/* a */ A, java.lang.String]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    org.scalablytyped.runtime.StringDictionary[NonEmptyArray[A]]
  ] = js.native
  def groupSort[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[NonEmptyArray[A]]
  ] = js.native
  def head[A](nea: NonEmptyArray[A]): A = js.native
  def insertAt[A](i: scala.Double, a: A): js.Function1[/* nea */ NonEmptyArray[A], fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]]] = js.native
  def insertAt[A](i: scala.Double, a: A, nea: NonEmptyArray[A]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  def last[A](nea: NonEmptyArray[A]): A = js.native
  def make[A](head: A, tail: fpDashTsLib.libArrayMod.Global.Array[A]): NonEmptyArray[A] = js.native
  def max[A](ord: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* nea */ NonEmptyArray[A], A] = js.native
  def min[A](ord: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* nea */ NonEmptyArray[A], A] = js.native
  def modifyAt[A](i: scala.Double, f: js.Function1[/* a */ A, A]): js.Function1[/* nea */ NonEmptyArray[A], fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]]] = js.native
  def modifyAt[A](nea: NonEmptyArray[A], i: scala.Double, f: js.Function1[/* a */ A, A]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  def of[A](a: A): NonEmptyArray[A] = js.native
  def reverse[A](nea: NonEmptyArray[A]): NonEmptyArray[A] = js.native
  def snoc[A](as: fpDashTsLib.libArrayMod.Global.Array[A], a: A): NonEmptyArray[A] = js.native
  def sort[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* nea */ NonEmptyArray[A], NonEmptyArray[A]] = js.native
  def tail[A](nea: NonEmptyArray[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def updateAt[A](i: scala.Double, a: A): js.Function1[/* nea */ NonEmptyArray[A], fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]]] = js.native
  def updateAt[A](i: scala.Double, a: A, nea: NonEmptyArray[A]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
}

