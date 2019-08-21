package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIAPI extends js.Object {
  var onmessage: js.UndefOr[js.Function2[/* pluginMessage */ js.Any, /* props */ OnMessageProperties, Unit]] = js.native
  def close(): Unit = js.native
  def hide(): Unit = js.native
  def postMessage(pluginMessage: js.Any): Unit = js.native
  def postMessage(pluginMessage: js.Any, options: UIPostMessageOptions): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def show(): Unit = js.native
}

