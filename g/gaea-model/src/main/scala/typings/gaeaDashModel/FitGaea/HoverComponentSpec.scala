package typings.gaeaDashModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverComponentSpec extends js.Object {
  var height: Double
  var hovering: Boolean
  var left: Double
  var top: Double
  var width: Double
}

object HoverComponentSpec {
  @scala.inline
  def apply(height: Double, hovering: Boolean, left: Double, top: Double, width: Double): HoverComponentSpec = {
    val __obj = js.Dynamic.literal(height = height, hovering = hovering, left = left, top = top, width = width)
  
    __obj.asInstanceOf[HoverComponentSpec]
  }
}

