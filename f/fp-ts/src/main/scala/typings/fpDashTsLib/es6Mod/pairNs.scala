package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "pair")
@js.native
object pairNs extends js.Object {
  @js.native
  class Pair[A] protected ()
    extends fpDashTsLib.es6PairMod.Pair[A] {
    def this(fst: A, snd: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Pair = js.native
  val pair: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.es6PairMod.URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.es6PairMod.URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[fpDashTsLib.es6PairMod.URI] with fpDashTsLib.es6ComonadMod.Comonad1[fpDashTsLib.es6PairMod.URI] = js.native
  def getMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6PairMod.Pair[A]] = js.native
  def getOrd[A](O: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6OrdMod.Ord[fpDashTsLib.es6PairMod.Pair[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6PairMod.Pair[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[fpDashTsLib.es6PairMod.Pair[A]] = js.native
  def getShow[L, A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6PairMod.Pair[A]] = js.native
}

