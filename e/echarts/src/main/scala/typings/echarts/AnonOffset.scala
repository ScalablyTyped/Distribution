package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var color: String
  var offset: Double
}

object AnonOffset {
  @scala.inline
  def apply(color: String, offset: Double): AnonOffset = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOffset]
  }
}

