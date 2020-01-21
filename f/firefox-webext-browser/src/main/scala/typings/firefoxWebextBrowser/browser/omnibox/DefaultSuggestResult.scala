package typings.firefoxWebextBrowser.browser.omnibox

import typings.firefoxWebextBrowser.AnonLength
import typings.firefoxWebextBrowser.AnonOffset
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
  var descriptionStyles: js.UndefOr[js.Array[AnonLength]] = js.undefined
  /**
    * An array of style ranges for the description, as provided by ToValue().
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStylesRaw: js.UndefOr[js.Array[AnonOffset]] = js.undefined
}

object DefaultSuggestResult {
  @scala.inline
  def apply(
    description: String,
    descriptionStyles: js.Array[AnonLength] = null,
    descriptionStylesRaw: js.Array[AnonOffset] = null
  ): DefaultSuggestResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (descriptionStyles != null) __obj.updateDynamic("descriptionStyles")(descriptionStyles.asInstanceOf[js.Any])
    if (descriptionStylesRaw != null) __obj.updateDynamic("descriptionStylesRaw")(descriptionStylesRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSuggestResult]
  }
}

