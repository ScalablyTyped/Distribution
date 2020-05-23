package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Width extends js.Object {
  /** The height of the image. */
  var height: js.UndefOr[Double] = js.undefined
  /** The URL of the image. */
  var url: js.UndefOr[String] = js.undefined
  /** The width of the image. */
  var width: js.UndefOr[Double] = js.undefined
}

object Width {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Width = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
}

