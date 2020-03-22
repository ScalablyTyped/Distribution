package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightUrl extends js.Object {
  var height: js.UndefOr[Double | AnonRangeMaxPoint] = js.undefined
  var url: js.UndefOr[String | AnonRangeMinPoint] = js.undefined
  var width: js.UndefOr[Double | AnonRangeMaxPoint] = js.undefined
}

object AnonHeightUrl {
  @scala.inline
  def apply(
    height: Double | AnonRangeMaxPoint = null,
    url: String | AnonRangeMinPoint = null,
    width: Double | AnonRangeMaxPoint = null
  ): AnonHeightUrl = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightUrl]
  }
}

