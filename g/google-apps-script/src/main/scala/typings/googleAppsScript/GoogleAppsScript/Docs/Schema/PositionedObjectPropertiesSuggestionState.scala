package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionedObjectPropertiesSuggestionState extends js.Object {
  var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.native
  var positioningSuggestionState: js.UndefOr[PositionedObjectPositioningSuggestionState] = js.native
}

object PositionedObjectPropertiesSuggestionState {
  @scala.inline
  def apply(): PositionedObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectPropertiesSuggestionState]
  }
  @scala.inline
  implicit class PositionedObjectPropertiesSuggestionStateOps[Self <: PositionedObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setPositioningSuggestionState(value: PositionedObjectPositioningSuggestionState): Self = this.set("positioningSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositioningSuggestionState: Self = this.set("positioningSuggestionState", js.undefined)
  }
  
}

