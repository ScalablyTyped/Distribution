package typings
package fpDashTsLib.libStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/State", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* State */ java.lang.String = js.native
  val state: fpDashTsLib.libMonadMod.Monad2[URI] = js.native
  def get[S](): State[S, S] = js.native
  def gets[S, A](f: js.Function1[/* s */ S, A]): State[S, A] = js.native
  def modify[S](f: js.Function1[/* s */ S, S]): State[S, js.UndefOr[scala.Nothing]] = js.native
  def put[S](s: S): State[S, scala.Unit] = js.native
}

