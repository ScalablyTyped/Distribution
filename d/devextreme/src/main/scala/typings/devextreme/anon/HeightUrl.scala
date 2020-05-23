package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightUrl extends js.Object {
  var height: js.UndefOr[Double | RangeMaxPoint] = js.undefined
  var url: js.UndefOr[String | RangeMinPoint] = js.undefined
  var width: js.UndefOr[Double | RangeMaxPoint] = js.undefined
}

object HeightUrl {
  @scala.inline
  def apply(
    height: Double | RangeMaxPoint = null,
    url: String | RangeMinPoint = null,
    width: Double | RangeMaxPoint = null
  ): HeightUrl = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightUrl]
  }
}

