package typings.firefoxWebextBrowser.browser.omnibox

import typings.firefoxWebextBrowser.anon.Length
import typings.firefoxWebextBrowser.anon.Offset
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
  var descriptionStyles: js.UndefOr[js.Array[Length]] = js.undefined
  /**
    * An array of style ranges for the description, as provided by ToValue().
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStylesRaw: js.UndefOr[js.Array[Offset]] = js.undefined
}

object DefaultSuggestResult {
  @scala.inline
  def apply(
    description: String,
    descriptionStyles: js.Array[Length] = null,
    descriptionStylesRaw: js.Array[Offset] = null
  ): DefaultSuggestResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (descriptionStyles != null) __obj.updateDynamic("descriptionStyles")(descriptionStyles.asInstanceOf[js.Any])
    if (descriptionStylesRaw != null) __obj.updateDynamic("descriptionStylesRaw")(descriptionStylesRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSuggestResult]
  }
}

