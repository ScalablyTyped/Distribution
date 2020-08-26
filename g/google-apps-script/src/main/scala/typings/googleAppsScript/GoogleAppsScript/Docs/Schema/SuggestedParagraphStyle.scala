package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedParagraphStyle extends js.Object {
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.native
  var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.native
}

object SuggestedParagraphStyle {
  @scala.inline
  def apply(): SuggestedParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedParagraphStyle]
  }
  @scala.inline
  implicit class SuggestedParagraphStyleOps[Self <: SuggestedParagraphStyle] (val x: Self) extends AnyVal {
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
    def setParagraphStyle(value: ParagraphStyle): Self = this.set("paragraphStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphStyle: Self = this.set("paragraphStyle", js.undefined)
    @scala.inline
    def setParagraphStyleSuggestionState(value: ParagraphStyleSuggestionState): Self = this.set("paragraphStyleSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphStyleSuggestionState: Self = this.set("paragraphStyleSuggestionState", js.undefined)
  }
  
}

