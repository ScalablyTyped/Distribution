package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /** Image height in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The URL of the image. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Image width in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

