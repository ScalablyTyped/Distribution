package typings
package famousLib.componentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "GestureHandler")
@js.native
class GestureHandler protected () extends js.Object {
  def this(node: famousLib.coreMod.Node) = this()
  def this(node: famousLib.coreMod.Node, events: js.Array[IGestureEvent]) = this()
  def on(ev: IGestureEvent, cb: js.Function1[/* payload */ js.UndefOr[IGesturePayload], scala.Unit]): scala.Unit = js.native
  def on(ev: java.lang.String, cb: js.Function1[/* payload */ js.UndefOr[IGesturePayload], scala.Unit]): scala.Unit = js.native
  def onReceive(ev: java.lang.String, payload: IGesturePayload): scala.Unit = js.native
  def trigger(ev: java.lang.String): scala.Unit = js.native
  def trigger(ev: java.lang.String, payload: IGesturePayload): scala.Unit = js.native
  def triggerGestures(): scala.Unit = js.native
}

