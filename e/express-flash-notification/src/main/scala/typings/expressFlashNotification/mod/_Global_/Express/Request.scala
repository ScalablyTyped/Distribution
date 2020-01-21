package typings.expressFlashNotification.mod._Global_.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  def flash(`object`: FlashOptions): Unit = js.native
  def flash(`type`: String): Unit = js.native
  def flash(`type`: String, message: String): Unit = js.native
  def flash(`type`: String, message: String, redirect: String): Unit = js.native
  def flash(`type`: String, message: String, redirect: Boolean): Unit = js.native
}

