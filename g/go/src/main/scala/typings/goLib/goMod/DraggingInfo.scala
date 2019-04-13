package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This helper structure for DraggingTool holds the original location Point.
  */
trait DraggingInfo extends js.Object {
  // undocumented
  var point: Point
}

object DraggingInfo {
  @scala.inline
  def apply(point: Point): DraggingInfo = {
    val __obj = js.Dynamic.literal(point = point)
  
    __obj.asInstanceOf[DraggingInfo]
  }
}

