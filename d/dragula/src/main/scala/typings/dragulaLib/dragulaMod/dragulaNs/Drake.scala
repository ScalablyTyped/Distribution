package typings
package dragulaLib.dragulaMod.dragulaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drake extends js.Object {
  var containers: js.Array[stdLib.Element] = js.native
  var dragging: scala.Boolean = js.native
  def cancel(): scala.Unit = js.native
  def cancel(revert: scala.Boolean): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def on(events: java.lang.String, callback: js.Function): Drake = js.native
  def remove(): scala.Unit = js.native
  def start(item: stdLib.Element): scala.Unit = js.native
}

