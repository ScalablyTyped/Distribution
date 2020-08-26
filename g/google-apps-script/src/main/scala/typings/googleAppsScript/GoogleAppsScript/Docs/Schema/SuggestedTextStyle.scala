package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedTextStyle extends js.Object {
  var textStyle: js.UndefOr[TextStyle] = js.native
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.native
}

object SuggestedTextStyle {
  @scala.inline
  def apply(): SuggestedTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTextStyle]
  }
  @scala.inline
  implicit class SuggestedTextStyleOps[Self <: SuggestedTextStyle] (val x: Self) extends AnyVal {
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
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = this.set("textStyleSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyleSuggestionState: Self = this.set("textStyleSuggestionState", js.undefined)
  }
  
}

