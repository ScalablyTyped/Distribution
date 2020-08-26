package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedDocumentStyle extends js.Object {
  var documentStyle: js.UndefOr[DocumentStyle] = js.native
  var documentStyleSuggestionState: js.UndefOr[DocumentStyleSuggestionState] = js.native
}

object SuggestedDocumentStyle {
  @scala.inline
  def apply(): SuggestedDocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedDocumentStyle]
  }
  @scala.inline
  implicit class SuggestedDocumentStyleOps[Self <: SuggestedDocumentStyle] (val x: Self) extends AnyVal {
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
    def setDocumentStyle(value: DocumentStyle): Self = this.set("documentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentStyle: Self = this.set("documentStyle", js.undefined)
    @scala.inline
    def setDocumentStyleSuggestionState(value: DocumentStyleSuggestionState): Self = this.set("documentStyleSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentStyleSuggestionState: Self = this.set("documentStyleSuggestionState", js.undefined)
  }
  
}

