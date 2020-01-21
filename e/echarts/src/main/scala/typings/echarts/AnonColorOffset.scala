package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorOffset extends js.Object {
  var color: String
  var offset: Double
}

object AnonColorOffset {
  @scala.inline
  def apply(color: String, offset: Double): AnonColorOffset = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColorOffset]
  }
}

