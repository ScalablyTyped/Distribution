package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedStylesSuggestionState extends js.Object {
  var stylesSuggestionStates: js.UndefOr[js.Array[NamedStyleSuggestionState]] = js.native
}

object NamedStylesSuggestionState {
  @scala.inline
  def apply(): NamedStylesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStylesSuggestionState]
  }
  @scala.inline
  implicit class NamedStylesSuggestionStateOps[Self <: NamedStylesSuggestionState] (val x: Self) extends AnyVal {
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
    def setStylesSuggestionStatesVarargs(value: NamedStyleSuggestionState*): Self = this.set("stylesSuggestionStates", js.Array(value :_*))
    @scala.inline
    def setStylesSuggestionStates(value: js.Array[NamedStyleSuggestionState]): Self = this.set("stylesSuggestionStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylesSuggestionStates: Self = this.set("stylesSuggestionStates", js.undefined)
  }
  
}

