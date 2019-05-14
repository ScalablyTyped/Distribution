package typings
package framesyncLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameData extends js.Object {
  var delta: scala.Double
  var timestamp: scala.Double
}

object FrameData {
  @scala.inline
  def apply(delta: scala.Double, timestamp: scala.Double): FrameData = {
    val __obj = js.Dynamic.literal(delta = delta, timestamp = timestamp)
  
    __obj.asInstanceOf[FrameData]
  }
}

