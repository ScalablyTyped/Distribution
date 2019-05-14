package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "zipper")
@js.native
object zipperNs extends js.Object {
  @js.native
  class Zipper[A] protected ()
    extends fpDashTsLib.es6ZipperMod.Zipper[A] {
    def this(lefts: fpDashTsLib.libArrayMod.Global.Array[A], focus: A, rights: fpDashTsLib.libArrayMod.Global.Array[A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Zipper = js.native
  val zipper: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.es6ZipperMod.URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.es6ZipperMod.URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[fpDashTsLib.es6ZipperMod.URI] with fpDashTsLib.es6ComonadMod.Comonad1[fpDashTsLib.es6ZipperMod.URI] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6ZipperMod.Zipper[A]] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A], focusIndex: scala.Double): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6ZipperMod.Zipper[A]] = js.native
  def fromNonEmptyArray[A](nea: fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]): fpDashTsLib.es6ZipperMod.Zipper[A] = js.native
  def fromNonEmptyArray2v[A](nea: fpDashTsLib.es6NonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.es6ZipperMod.Zipper[A] = js.native
  def getMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6ZipperMod.Zipper[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6ZipperMod.Zipper[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6ZipperMod.Zipper[A]] = js.native
}

