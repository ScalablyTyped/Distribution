package typings.firefoxDashWebextDashBrowser.browser.omnibox

import typings.firefoxDashWebextDashBrowser.Anon_Length
import typings.firefoxDashWebextDashBrowser.Anon_Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A suggest result. */
trait DefaultSuggestResult extends js.Object {
  /** The text that is displayed in the URL dropdown. */
  var description: String
  /**
    * An array of style ranges for the description, as provided by the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStyles: js.UndefOr[js.Array[Anon_Length]] = js.undefined
  /**
    * An array of style ranges for the description, as provided by ToValue().
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStylesRaw: js.UndefOr[js.Array[Anon_Offset]] = js.undefined
}

object DefaultSuggestResult {
  @scala.inline
  def apply(
    description: String,
    descriptionStyles: js.Array[Anon_Length] = null,
    descriptionStylesRaw: js.Array[Anon_Offset] = null
  ): DefaultSuggestResult = {
    val __obj = js.Dynamic.literal(description = description)
    if (descriptionStyles != null) __obj.updateDynamic("descriptionStyles")(descriptionStyles)
    if (descriptionStylesRaw != null) __obj.updateDynamic("descriptionStylesRaw")(descriptionStylesRaw)
    __obj.asInstanceOf[DefaultSuggestResult]
  }
}

