package typings.famous.componentsMod

import typings.famous.coreMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "GestureHandler")
@js.native
class GestureHandler protected () extends js.Object {
  def this(node: Node) = this()
  def this(node: Node, events: js.Array[IGestureEvent]) = this()
  def on(ev: String, cb: js.Function1[/* payload */ js.UndefOr[IGesturePayload], Unit]): Unit = js.native
  def on(ev: IGestureEvent, cb: js.Function1[/* payload */ js.UndefOr[IGesturePayload], Unit]): Unit = js.native
  def onReceive(ev: String, payload: IGesturePayload): Unit = js.native
  def trigger(ev: String): Unit = js.native
  def trigger(ev: String, payload: IGesturePayload): Unit = js.native
  def triggerGestures(): Unit = js.native
}

