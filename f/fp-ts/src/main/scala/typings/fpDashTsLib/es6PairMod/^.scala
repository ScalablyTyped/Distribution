package typings
package fpDashTsLib.es6PairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Pair", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Pair = js.native
  val pair: fpDashTsLib.es6ApplicativeMod.Applicative1[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[URI] with fpDashTsLib.es6ComonadMod.Comonad1[URI] = js.native
  def getEq[A](S: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Pair[A]] = js.native
  def getMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Pair[A]] = js.native
  def getOrd[A](O: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6OrdMod.Ord[Pair[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Pair[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Pair[A]] = js.native
  def getShow[L, A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Pair[A]] = js.native
}

