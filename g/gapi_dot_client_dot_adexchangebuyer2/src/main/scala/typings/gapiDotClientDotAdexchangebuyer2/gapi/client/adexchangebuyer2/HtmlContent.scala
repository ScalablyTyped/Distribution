package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlContent extends js.Object {
  /** The height of the HTML snippet in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** The HTML snippet that displays the ad when inserted in the web page. */
  var snippet: js.UndefOr[String] = js.undefined
  /** The width of the HTML snippet in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object HtmlContent {
  @scala.inline
  def apply(height: Int | Double = null, snippet: String = null, width: Int | Double = null): HtmlContent = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlContent]
  }
}

