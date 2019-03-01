package typings
package firefoxDashWebextDashBrowserLib.browserNs.omniboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A suggest result. */
trait SuggestResult extends js.Object {
  /**
    * The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry.
    */
  var content: java.lang.String
  /**
    * The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags
    * are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim'
    * (for dim helper text). The styles can be nested, eg. <dim><match>dimmed match</match></dim>. You must escape
    * the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484
    */
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

object SuggestResult {
  @scala.inline
  def apply(
    content: java.lang.String,
    description: java.lang.String,
    descriptionStyles: js.Array[firefoxDashWebextDashBrowserLib.Anon_Length] = null,
    descriptionStylesRaw: js.Array[firefoxDashWebextDashBrowserLib.Anon_Offset] = null
  ): SuggestResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("description")(description)
    if (descriptionStyles != null) __obj.updateDynamic("descriptionStyles")(descriptionStyles)
    if (descriptionStylesRaw != null) __obj.updateDynamic("descriptionStylesRaw")(descriptionStylesRaw)
    __obj.asInstanceOf[SuggestResult]
  }
}

