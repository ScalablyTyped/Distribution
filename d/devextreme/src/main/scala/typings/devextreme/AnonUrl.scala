package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonUrl {
  @scala.inline
  def apply(height: Int | Double = null, url: String = null, width: Int | Double = null): AnonUrl = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrl]
  }
}

