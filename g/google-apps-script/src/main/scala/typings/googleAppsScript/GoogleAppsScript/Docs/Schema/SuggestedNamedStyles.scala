package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedNamedStyles extends js.Object {
  var namedStyles: js.UndefOr[NamedStyles] = js.native
  var namedStylesSuggestionState: js.UndefOr[NamedStylesSuggestionState] = js.native
}

object SuggestedNamedStyles {
  @scala.inline
  def apply(): SuggestedNamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedNamedStyles]
  }
  @scala.inline
  implicit class SuggestedNamedStylesOps[Self <: SuggestedNamedStyles] (val x: Self) extends AnyVal {
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
    def setNamedStyles(value: NamedStyles): Self = this.set("namedStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedStyles: Self = this.set("namedStyles", js.undefined)
    @scala.inline
    def setNamedStylesSuggestionState(value: NamedStylesSuggestionState): Self = this.set("namedStylesSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedStylesSuggestionState: Self = this.set("namedStylesSuggestionState", js.undefined)
  }
  
}

