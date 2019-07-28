package typings.framesync.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameData extends js.Object {
  var delta: Double
  var timestamp: Double
}

object FrameData {
  @scala.inline
  def apply(delta: Double, timestamp: Double): FrameData = {
    val __obj = js.Dynamic.literal(delta = delta, timestamp = timestamp)
  
    __obj.asInstanceOf[FrameData]
  }
}

