package typings
package fpDashTsLib.es6IdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Identity", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Identity = js.native
  val identity: fpDashTsLib.es6MonadMod.Monad1[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[URI] with fpDashTsLib.es6AltMod.Alt1[URI] with fpDashTsLib.es6ComonadMod.Comonad1[URI] with fpDashTsLib.es6ChainRecMod.ChainRec1[URI] = js.native
  def getSetoid[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[Identity[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Identity[A]] = js.native
}

