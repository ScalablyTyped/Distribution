package typings.dragula.dragulaMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drake extends js.Object {
  var containers: js.Array[Element] = js.native
  var dragging: Boolean = js.native
  def cancel(): Unit = js.native
  def cancel(revert: Boolean): Unit = js.native
  def destroy(): Unit = js.native
  def end(): Unit = js.native
  def on(events: String, callback: js.Function): Drake = js.native
  def remove(): Unit = js.native
  def start(item: Element): Unit = js.native
}

