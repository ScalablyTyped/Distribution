package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageProperties extends js.Object {
  // The color scheme of the page. If unset, the color scheme is inherited from
  // a parent page. If the page has no parent, the color scheme uses a default
  // Slides color scheme. This field is read-only.
  var color_scheme: ColorScheme
  // The background fill of the page. If unset, the background fill is inherited
  // from a parent page if it exists. If the page has no parent, then the
  // background fill defaults to the corresponding fill in the Slides editor.
  var page_background_fill: PagePropertiesPageBackgroundFill
}

object PageProperties {
  @scala.inline
  def apply(color_scheme: ColorScheme, page_background_fill: PagePropertiesPageBackgroundFill): PageProperties = {
    val __obj = js.Dynamic.literal(color_scheme = color_scheme, page_background_fill = page_background_fill)
  
    __obj.asInstanceOf[PageProperties]
  }
}

