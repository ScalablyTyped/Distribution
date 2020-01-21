package typings.firefoxWebextBrowser.browser.omnibox

import typings.firefoxWebextBrowser.AnonLength
import typings.firefoxWebextBrowser.AnonOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A suggest result. */
trait SuggestResult extends js.Object {
  /**
    * The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry.
    */
  var content: String
  /**
    * The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags
    * are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim'
    * (for dim helper text). The styles can be nested, eg. <dim><match>dimmed match</match></dim>. You must escape
    * the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484
    */
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

object SuggestResult {
  @scala.inline
  def apply(
    content: String,
    description: String,
    descriptionStyles: js.Array[AnonLength] = null,
    descriptionStylesRaw: js.Array[AnonOffset] = null
  ): SuggestResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    if (descriptionStyles != null) __obj.updateDynamic("descriptionStyles")(descriptionStyles.asInstanceOf[js.Any])
    if (descriptionStylesRaw != null) __obj.updateDynamic("descriptionStylesRaw")(descriptionStylesRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestResult]
  }
}

