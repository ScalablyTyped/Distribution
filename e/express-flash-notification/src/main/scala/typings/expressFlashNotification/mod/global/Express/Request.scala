package typings.expressFlashNotification.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  def flash(`object`: FlashOptions): Unit = js.native
  def flash(`type`: String): Unit = js.native
  def flash(`type`: String, message: js.UndefOr[scala.Nothing], redirect: String): Unit = js.native
  def flash(`type`: String, message: js.UndefOr[scala.Nothing], redirect: Boolean): Unit = js.native
  def flash(`type`: String, message: String): Unit = js.native
  def flash(`type`: String, message: String, redirect: String): Unit = js.native
  def flash(`type`: String, message: String, redirect: Boolean): Unit = js.native
}

