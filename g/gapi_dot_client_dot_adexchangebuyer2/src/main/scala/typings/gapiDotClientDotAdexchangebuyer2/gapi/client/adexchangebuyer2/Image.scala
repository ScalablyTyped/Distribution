package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

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
  def apply(height: Int | Double = null, url: String = null, width: Int | Double = null): Image = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

