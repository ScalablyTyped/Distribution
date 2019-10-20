package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var bottom: Double
  var left: Double
  var measuredByPercentage: Double
  var right: Double
  var top: Double
}

object Region {
  @scala.inline
  def apply(bottom: Double, left: Double, measuredByPercentage: Double, right: Double, top: Double): Region = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, measuredByPercentage = measuredByPercentage, right = right, top = top)
  
    __obj.asInstanceOf[Region]
  }
}

