package typings
package fpDashTsLib.es6ZipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Zipper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Zipper = js.native
  val zipper: fpDashTsLib.es6ApplicativeMod.Applicative1[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[URI] with fpDashTsLib.es6ComonadMod.Comonad1[URI] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.es6OptionMod.Option[Zipper[A]] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A], focusIndex: scala.Double): fpDashTsLib.es6OptionMod.Option[Zipper[A]] = js.native
  def fromNonEmptyArray[A](nea: fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]): Zipper[A] = js.native
  def fromNonEmptyArray2v[A](nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]): Zipper[A] = js.native
  def getMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Zipper[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Zipper[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Zipper[A]] = js.native
}

