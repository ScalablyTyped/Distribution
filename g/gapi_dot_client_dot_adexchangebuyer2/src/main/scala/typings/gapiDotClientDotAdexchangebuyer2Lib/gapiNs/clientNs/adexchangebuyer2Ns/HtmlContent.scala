package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlContent extends js.Object {
  /** The height of the HTML snippet in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The HTML snippet that displays the ad when inserted in the web page. */
  var snippet: js.UndefOr[java.lang.String] = js.undefined
  /** The width of the HTML snippet in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object HtmlContent {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    snippet: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): HtmlContent = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlContent]
  }
}

