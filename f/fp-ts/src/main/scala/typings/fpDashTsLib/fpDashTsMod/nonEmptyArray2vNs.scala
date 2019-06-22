package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "nonEmptyArray2v")
@js.native
object nonEmptyArray2vNs extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v = js.native
  val nonEmptyArray: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libNonEmptyArray2vMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libNonEmptyArray2vMod.URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[fpDashTsLib.libNonEmptyArray2vMod.URI, scala.Double]) with (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[fpDashTsLib.libNonEmptyArray2vMod.URI, scala.Double]) with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[fpDashTsLib.libNonEmptyArray2vMod.URI, scala.Double]) = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, duplicate, extend, flatten, foldMap, foldMapWithIndex, map, mapWithIndex, reduce, reduceRight, reduceRightWithIndex, reduceWithIndex) */ def ap[A](fa: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): js.Function1[
    /* fab */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[js.Function1[/* a */ A, _]], 
    fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[_]
  ] = js.native
  def cons[A](a: A, as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def copy[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def filter[A](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    predicate: fpDashTsLib.libFunctionMod.Predicate[A]
  ): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def filter[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def filterWithIndex[A](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    predicate: js.Function2[/* i */ scala.Double, /* a */ A, scala.Boolean]
  ): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def filterWithIndex[A](predicate: js.Function2[/* i */ scala.Double, /* a */ A, scala.Boolean]): js.Function1[
    /* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]
  ): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[
    /* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
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
  def getEq[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def getSemigroup[A](): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def getSetoid[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def getShow[A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def group[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def groupBy[A](as: fpDashTsLib.libArrayMod.Global.Array[A], f: js.Function1[/* a */ A, java.lang.String]): org.scalablytyped.runtime.StringDictionary[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def groupBy[A](f: js.Function1[/* a */ A, java.lang.String]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    org.scalablytyped.runtime.StringDictionary[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def groupSort[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def head[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): A = js.native
  def insertAt[A](i: scala.Double, a: A): js.Function1[
    /* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def insertAt[A](i: scala.Double, a: A, nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def last[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): A = js.native
  def make[A](head: A, tail: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def max[A](ord: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], A] = js.native
  def min[A](ord: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], A] = js.native
  def modifyAt[A](i: scala.Double, f: js.Function1[/* a */ A, A]): js.Function1[
    /* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def modifyAt[A](
    nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A],
    i: scala.Double,
    f: js.Function1[/* a */ A, A]
  ): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
  def of[A](a: A): fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def reverse[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def snoc[A](as: fpDashTsLib.libArrayMod.Global.Array[A], a: A): fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A] = js.native
  def sort[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], 
    fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]
  ] = js.native
  def tail[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  def updateAt[A](i: scala.Double, a: A): js.Function1[
    /* nea */ fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]]
  ] = js.native
  def updateAt[A](i: scala.Double, a: A, nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]] = js.native
}

