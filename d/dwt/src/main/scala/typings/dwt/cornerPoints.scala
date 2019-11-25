package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cornerPoints extends js.Object {
  var leftBottom: point
  var leftTop: point
  var rightBottom: point
  var rightTop: point
}

object cornerPoints {
  @scala.inline
  def apply(leftBottom: point, leftTop: point, rightBottom: point, rightTop: point): cornerPoints = {
    val __obj = js.Dynamic.literal(leftBottom = leftBottom.asInstanceOf[js.Any], leftTop = leftTop.asInstanceOf[js.Any], rightBottom = rightBottom.asInstanceOf[js.Any], rightTop = rightTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[cornerPoints]
  }
}

