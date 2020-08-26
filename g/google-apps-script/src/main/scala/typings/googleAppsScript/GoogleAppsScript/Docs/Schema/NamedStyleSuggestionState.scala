package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedStyleSuggestionState extends js.Object {
  var namedStyleType: js.UndefOr[String] = js.native
  var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.native
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.native
}

object NamedStyleSuggestionState {
  @scala.inline
  def apply(): NamedStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStyleSuggestionState]
  }
  @scala.inline
  implicit class NamedStyleSuggestionStateOps[Self <: NamedStyleSuggestionState] (val x: Self) extends AnyVal {
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
    def setNamedStyleType(value: String): Self = this.set("namedStyleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedStyleType: Self = this.set("namedStyleType", js.undefined)
    @scala.inline
    def setParagraphStyleSuggestionState(value: ParagraphStyleSuggestionState): Self = this.set("paragraphStyleSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphStyleSuggestionState: Self = this.set("paragraphStyleSuggestionState", js.undefined)
    @scala.inline
    def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = this.set("textStyleSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyleSuggestionState: Self = this.set("textStyleSuggestionState", js.undefined)
  }
  
}

