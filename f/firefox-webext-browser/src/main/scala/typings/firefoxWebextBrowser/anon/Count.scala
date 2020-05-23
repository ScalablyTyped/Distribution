package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var rangeData: js.UndefOr[js.Array[EndOffset]] = js.undefined
  var rectData: js.UndefOr[js.Array[RectsAndTexts]] = js.undefined
}

object Count {
  @scala.inline
  def apply(count: Double, rangeData: js.Array[EndOffset] = null, rectData: js.Array[RectsAndTexts] = null): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (rangeData != null) __obj.updateDynamic("rangeData")(rangeData.asInstanceOf[js.Any])
    if (rectData != null) __obj.updateDynamic("rectData")(rectData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

