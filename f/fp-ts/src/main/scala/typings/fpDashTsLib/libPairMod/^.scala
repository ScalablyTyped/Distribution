package typings
package fpDashTsLib.libPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Pair", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* Pair */ java.lang.String = js.native
  val pair: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.libPairMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libPairMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libPairMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libPairMod.URI] = js.native
  def getMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libPairMod.Pair[A]] = js.native
  def getOrd[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libPairMod.Pair[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libPairMod.Pair[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libPairMod.Pair[A]] = js.native
}

