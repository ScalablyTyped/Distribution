package typings
package eventDashStreamLib.eventDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStream
  extends nodeLib.streamMod.Stream {
  var end: js.Any = js.native
  var readable: scala.Boolean = js.native
  var writable: scala.Boolean = js.native
  var write: js.Any = js.native
  def destroy(): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
}

