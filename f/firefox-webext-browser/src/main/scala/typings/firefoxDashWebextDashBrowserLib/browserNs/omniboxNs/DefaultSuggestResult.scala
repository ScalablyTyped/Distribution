package typings
package firefoxDashWebextDashBrowserLib.browserNs.omniboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A suggest result. */
trait DefaultSuggestResult extends js.Object {
  /** The text that is displayed in the URL dropdown. */
  var description: java.lang.String
  /**
    * An array of style ranges for the description, as provided by the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStyles: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.Anon_Length]] = js.undefined
  /**
    * An array of style ranges for the description, as provided by ToValue().
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStylesRaw: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.Anon_Offset]] = js.undefined
}

object DefaultSuggestResult {
  @scala.inline
  def apply(
    description: java.lang.String,
    descriptionStyles: js.Array[firefoxDashWebextDashBrowserLib.Anon_Length] = null,
    descriptionStylesRaw: js.Array[firefoxDashWebextDashBrowserLib.Anon_Offset] = null
  ): DefaultSuggestResult = {
    val __obj = js.Dynamic.literal(description = description)
    if (descriptionStyles != null) __obj.updateDynamic("descriptionStyles")(descriptionStyles)
    if (descriptionStylesRaw != null) __obj.updateDynamic("descriptionStylesRaw")(descriptionStylesRaw)
    __obj.asInstanceOf[DefaultSuggestResult]
  }
}

