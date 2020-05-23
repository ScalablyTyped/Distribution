package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

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
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    snippet: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): HtmlContent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlContent]
  }
}

