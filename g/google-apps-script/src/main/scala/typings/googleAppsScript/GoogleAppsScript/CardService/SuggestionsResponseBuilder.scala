package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for SuggestionsResponse objects.
  */
trait SuggestionsResponseBuilder extends js.Object {
  def build(): SuggestionsResponse
  def setSuggestions(suggestions: Suggestions): SuggestionsResponseBuilder
}

object SuggestionsResponseBuilder {
  @scala.inline
  def apply(build: () => SuggestionsResponse, setSuggestions: Suggestions => SuggestionsResponseBuilder): SuggestionsResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setSuggestions = js.Any.fromFunction1(setSuggestions))
    __obj.asInstanceOf[SuggestionsResponseBuilder]
  }
}

