package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSuggestionState extends js.Object {
  var heightSuggested: js.UndefOr[Boolean] = js.native
  var widthSuggested: js.UndefOr[Boolean] = js.native
}

object SizeSuggestionState {
  @scala.inline
  def apply(): SizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeSuggestionState]
  }
  @scala.inline
  implicit class SizeSuggestionStateOps[Self <: SizeSuggestionState] (val x: Self) extends AnyVal {
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
    def setHeightSuggested(value: Boolean): Self = this.set("heightSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightSuggested: Self = this.set("heightSuggested", js.undefined)
    @scala.inline
    def setWidthSuggested(value: Boolean): Self = this.set("widthSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthSuggested: Self = this.set("widthSuggested", js.undefined)
  }
  
}

