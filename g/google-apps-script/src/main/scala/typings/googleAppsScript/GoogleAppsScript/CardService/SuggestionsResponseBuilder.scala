package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for SuggestionsResponse objects.
  */
@js.native
trait SuggestionsResponseBuilder extends StObject {
  
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
  implicit class SuggestionsResponseBuilderMutableBuilder[Self <: SuggestionsResponseBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => SuggestionsResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSuggestions(value: Suggestions => SuggestionsResponseBuilder): Self = StObject.set(x, "setSuggestions", js.Any.fromFunction1(value))
  }
}
