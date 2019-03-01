package typings
package ejDotWebDotAllLib.ejNs.TagCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Defines the frequency column number to categorize the font size.
    */
  var frequency: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the HTML attributes column for the anchor elements inside the each tag items.
    */
  var htmlAttributes: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the tag value or display text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the URL link to navigate while click the tag.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    frequency: java.lang.String = null,
    htmlAttributes: java.lang.String = null,
    text: java.lang.String = null,
    url: java.lang.String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (frequency != null) __obj.updateDynamic("frequency")(frequency)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (text != null) __obj.updateDynamic("text")(text)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Fields]
  }
}

