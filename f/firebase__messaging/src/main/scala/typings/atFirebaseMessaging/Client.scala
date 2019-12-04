package typings.atFirebaseMessaging

import typings.std.ClientTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  val id: String = js.native
  val reserved: Boolean = js.native
  val `type`: ClientTypes = js.native
  val url: String = js.native
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[_]): Unit = js.native
}

