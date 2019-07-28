package typings.eventDashStream.eventDashStreamMod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStream extends Stream {
  var end: js.Any = js.native
  var readable: Boolean = js.native
  var writable: Boolean = js.native
  var write: js.Any = js.native
  def destroy(): Unit = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
}

