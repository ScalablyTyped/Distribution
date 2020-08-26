package typings.firefoxWebextBrowser.browser.omnibox

import typings.firefoxWebextBrowser.anon.Length
import typings.firefoxWebextBrowser.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A suggest result. */
@js.native
trait SuggestResult extends js.Object {
  /**
    * The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry.
    */
  var content: String = js.native
  /**
    * The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags
    * are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim'
    * (for dim helper text). The styles can be nested, eg. <dim><match>dimmed match</match></dim>. You must escape
    * the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484
    */
  var description: String = js.native
  /**
    * An array of style ranges for the description, as provided by the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStyles: js.UndefOr[js.Array[Length]] = js.native
  /**
    * An array of style ranges for the description, as provided by ToValue().
    * @deprecated Unsupported on Firefox at this time.
    */
  var descriptionStylesRaw: js.UndefOr[js.Array[Offset]] = js.native
}

object SuggestResult {
  @scala.inline
  def apply(content: String, description: String): SuggestResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestResult]
  }
  @scala.inline
  implicit class SuggestResultOps[Self <: SuggestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptionStylesVarargs(value: Length*): Self = this.set("descriptionStyles", js.Array(value :_*))
    @scala.inline
    def setDescriptionStyles(value: js.Array[Length]): Self = this.set("descriptionStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionStyles: Self = this.set("descriptionStyles", js.undefined)
    @scala.inline
    def setDescriptionStylesRawVarargs(value: Offset*): Self = this.set("descriptionStylesRaw", js.Array(value :_*))
    @scala.inline
    def setDescriptionStylesRaw(value: js.Array[Offset]): Self = this.set("descriptionStylesRaw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionStylesRaw: Self = this.set("descriptionStylesRaw", js.undefined)
  }
  
}

