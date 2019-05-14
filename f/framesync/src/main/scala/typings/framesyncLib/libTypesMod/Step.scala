package typings
package framesyncLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
  def cancel(process: Process): scala.Unit = js.native
  def process(frame: FrameData): scala.Unit = js.native
  def schedule(process: Process): scala.Unit = js.native
  def schedule(process: Process, keepAlive: scala.Boolean): scala.Unit = js.native
  def schedule(process: Process, keepAlive: scala.Boolean, immediate: scala.Boolean): scala.Unit = js.native
}

