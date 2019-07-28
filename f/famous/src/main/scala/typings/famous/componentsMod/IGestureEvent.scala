package typings.famous.componentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGestureEvent extends js.Object {
  var event: String = js.native
  def callback(): Unit = js.native
  def callback(payload: IGesturePayload): Unit = js.native
}

