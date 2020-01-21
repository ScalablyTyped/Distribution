package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Double
  var rangeData: js.UndefOr[js.Array[AnonEndOffset]] = js.undefined
  var rectData: js.UndefOr[js.Array[AnonRectsAndTexts]] = js.undefined
}

object AnonCount {
  @scala.inline
  def apply(
    count: Double,
    rangeData: js.Array[AnonEndOffset] = null,
    rectData: js.Array[AnonRectsAndTexts] = null
  ): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (rangeData != null) __obj.updateDynamic("rangeData")(rangeData.asInstanceOf[js.Any])
    if (rectData != null) __obj.updateDynamic("rectData")(rectData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

