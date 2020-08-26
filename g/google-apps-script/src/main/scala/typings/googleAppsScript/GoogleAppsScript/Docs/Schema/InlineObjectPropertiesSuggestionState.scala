package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineObjectPropertiesSuggestionState extends js.Object {
  var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.native
}

object InlineObjectPropertiesSuggestionState {
  @scala.inline
  def apply(): InlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObjectPropertiesSuggestionState]
  }
  @scala.inline
  implicit class InlineObjectPropertiesSuggestionStateOps[Self <: InlineObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
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
    def setEmbeddedObjectSuggestionState(value: EmbeddedObjectSuggestionState): Self = this.set("embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddedObjectSuggestionState: Self = this.set("embeddedObjectSuggestionState", js.undefined)
  }
  
}

