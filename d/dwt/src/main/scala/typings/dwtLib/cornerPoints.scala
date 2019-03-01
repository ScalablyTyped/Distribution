package typings
package dwtLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("leftBottom")(leftBottom)
    __obj.updateDynamic("leftTop")(leftTop)
    __obj.updateDynamic("rightBottom")(rightBottom)
    __obj.updateDynamic("rightTop")(rightTop)
    __obj.asInstanceOf[cornerPoints]
  }
}

