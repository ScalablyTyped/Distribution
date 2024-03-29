package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for SuggestionsResponse objects.
  */
trait SuggestionsResponseBuilder extends StObject {
  
  def build(): SuggestionsResponse
  
  def setSuggestions(suggestions: Suggestions): SuggestionsResponseBuilder
}
object SuggestionsResponseBuilder {
  
  inline def apply(build: () => SuggestionsResponse, setSuggestions: Suggestions => SuggestionsResponseBuilder): SuggestionsResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setSuggestions = js.Any.fromFunction1(setSuggestions))
    __obj.asInstanceOf[SuggestionsResponseBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestionsResponseBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => SuggestionsResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setSetSuggestions(value: Suggestions => SuggestionsResponseBuilder): Self = StObject.set(x, "setSuggestions", js.Any.fromFunction1(value))
  }
}
