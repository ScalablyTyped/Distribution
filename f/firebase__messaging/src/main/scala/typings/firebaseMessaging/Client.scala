package typings.firebaseMessaging

import typings.std.ClientTypes
import typings.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  val id: String = js.native
  val `type`: ClientTypes = js.native
  val url: String = js.native
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[Transferable]): Unit = js.native
}

