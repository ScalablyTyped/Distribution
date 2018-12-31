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
  var descriptionStyles: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.Anon_Type]] = js.undefined
  /**
    * An array of style ranges for the description, as provided by ToValue().
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStylesRaw: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.Anon_TypeOffset]] = js.undefined
}

