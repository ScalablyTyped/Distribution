package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedInlineObjectProperties extends js.Object {
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.native
  var inlineObjectPropertiesSuggestionState: js.UndefOr[InlineObjectPropertiesSuggestionState] = js.native
}

object SuggestedInlineObjectProperties {
  @scala.inline
  def apply(): SuggestedInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedInlineObjectProperties]
  }
  @scala.inline
  implicit class SuggestedInlineObjectPropertiesOps[Self <: SuggestedInlineObjectProperties] (val x: Self) extends AnyVal {
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
    def setInlineObjectProperties(value: InlineObjectProperties): Self = this.set("inlineObjectProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineObjectProperties: Self = this.set("inlineObjectProperties", js.undefined)
    @scala.inline
    def setInlineObjectPropertiesSuggestionState(value: InlineObjectPropertiesSuggestionState): Self = this.set("inlineObjectPropertiesSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineObjectPropertiesSuggestionState: Self = this.set("inlineObjectPropertiesSuggestionState", js.undefined)
  }
  
}

