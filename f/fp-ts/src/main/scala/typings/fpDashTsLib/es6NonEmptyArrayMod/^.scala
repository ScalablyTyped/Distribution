package typings
package fpDashTsLib.es6NonEmptyArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/NonEmptyArray", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.NonEmptyArray = js.native
  val nonEmptyArray: fpDashTsLib.es6MonadMod.Monad1[URI] with fpDashTsLib.es6ComonadMod.Comonad1[URI] with (fpDashTsLib.es6TraversableWithIndexMod.TraversableWithIndex1[URI, scala.Double]) with (fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex1[URI, scala.Double]) with (fpDashTsLib.es6FoldableWithIndexMod.FoldableWithIndex1[URI, scala.Double]) = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.es6OptionMod.Option[NonEmptyArray[A]] = js.native
  def getEq[A](S: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[NonEmptyArray[A]] = js.native
  def getSemigroup[A](): fpDashTsLib.es6SemigroupMod.Semigroup[NonEmptyArray[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[NonEmptyArray[A]] = js.native
  def group[A](S: fpDashTsLib.es6EqMod.Eq[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[NonEmptyArray[A]]
  ] = js.native
  def groupBy[A](as: fpDashTsLib.libArrayMod.Global.Array[A], f: js.Function1[/* a */ A, java.lang.String]): org.scalablytyped.runtime.StringDictionary[NonEmptyArray[A]] = js.native
  def groupSort[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[NonEmptyArray[A]]
  ] = js.native
}

