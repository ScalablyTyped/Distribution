package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightUrl extends js.Object {
  /** The height of the image. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The URL of the image. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The width of the image. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HeightUrl {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Anon_HeightUrl = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightUrl]
  }
}

