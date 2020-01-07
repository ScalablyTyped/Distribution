package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTML content for a creative.
  */
@js.native
trait Schema$HtmlContent extends js.Object {
  /**
    * The height of the HTML snippet in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The HTML snippet that displays the ad when inserted in the web page.
    */
  var snippet: js.UndefOr[String] = js.native
  /**
    * The width of the HTML snippet in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$HtmlContent {
  @scala.inline
  def apply(height: Int | Double = null, snippet: String = null, width: Int | Double = null): Schema$HtmlContent = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HtmlContent]
  }
}

