package typings
package fpDashTsLib.libZipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Zipper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Zipper = js.native
  val zipper: fpDashTsLib.libApplicativeMod.Applicative1[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[URI] with fpDashTsLib.libComonadMod.Comonad1[URI] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[Zipper[A]] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A], focusIndex: scala.Double): fpDashTsLib.libOptionMod.Option[Zipper[A]] = js.native
  def fromNonEmptyArray[A](nea: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]): Zipper[A] = js.native
  def fromNonEmptyArray2v[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): Zipper[A] = js.native
  def getMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Zipper[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Zipper[A]] = js.native
  def getShow[A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[Zipper[A]] = js.native
}

