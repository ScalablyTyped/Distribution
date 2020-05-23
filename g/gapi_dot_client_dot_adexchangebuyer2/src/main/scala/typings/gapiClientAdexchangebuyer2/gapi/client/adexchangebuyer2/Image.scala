package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /** Image height in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** The URL of the image. */
  var url: js.UndefOr[String] = js.undefined
  /** Image width in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

