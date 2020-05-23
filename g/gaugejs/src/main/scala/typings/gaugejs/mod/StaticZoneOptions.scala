package typings.gaugejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticZoneOptions extends js.Object {
  var max: Double
  var min: Double
  var strokeStyle: String
}

object StaticZoneOptions {
  @scala.inline
  def apply(max: Double, min: Double, strokeStyle: String): StaticZoneOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticZoneOptions]
  }
}

