package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for SuggestionsResponse objects.
  */
@js.native
trait SuggestionsResponseBuilder extends js.Object {
  def build(): SuggestionsResponse = js.native
  def setSuggestions(suggestions: Suggestions): SuggestionsResponseBuilder = js.native
}

object SuggestionsResponseBuilder {
  @scala.inline
  def apply(build: () => SuggestionsResponse, setSuggestions: Suggestions => SuggestionsResponseBuilder): SuggestionsResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setSuggestions = js.Any.fromFunction1(setSuggestions))
    __obj.asInstanceOf[SuggestionsResponseBuilder]
  }
  @scala.inline
  implicit class SuggestionsResponseBuilderOps[Self <: SuggestionsResponseBuilder] (val x: Self) extends AnyVal {
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
    def setBuild(value: () => SuggestionsResponse): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSuggestions(value: Suggestions => SuggestionsResponseBuilder): Self = this.set("setSuggestions", js.Any.fromFunction1(value))
  }
  
}

