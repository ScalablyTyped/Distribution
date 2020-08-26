package typings.firefoxWebextBrowser.browser.omnibox

import typings.firefoxWebextBrowser.anon.Length
import typings.firefoxWebextBrowser.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A suggest result. */
@js.native
trait DefaultSuggestResult extends js.Object {
  /** The text that is displayed in the URL dropdown. */
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

object DefaultSuggestResult {
  @scala.inline
  def apply(description: String): DefaultSuggestResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSuggestResult]
  }
  @scala.inline
  implicit class DefaultSuggestResultOps[Self <: DefaultSuggestResult] (val x: Self) extends AnyVal {
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

