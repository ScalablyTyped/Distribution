package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageProperties extends js.Object {
  /**
    * The color scheme of the page. If unset, the color scheme is inherited from
    * a parent page. If the page has no parent, the color scheme uses a default
    * Slides color scheme. This field is read-only.
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  /**
    * The background fill of the page. If unset, the background fill is inherited
    * from a parent page if it exists. If the page has no parent, then the
    * background fill defaults to the corresponding fill in the Slides editor.
    */
  var pageBackgroundFill: js.UndefOr[PageBackgroundFill] = js.undefined
}

object PageProperties {
  @scala.inline
  def apply(colorScheme: ColorScheme = null, pageBackgroundFill: PageBackgroundFill = null): PageProperties = {
    val __obj = js.Dynamic.literal()
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    if (pageBackgroundFill != null) __obj.updateDynamic("pageBackgroundFill")(pageBackgroundFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageProperties]
  }
}

