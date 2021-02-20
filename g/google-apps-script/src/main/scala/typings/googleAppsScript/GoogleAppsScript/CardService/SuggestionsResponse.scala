package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response object that can be returned from a suggestions callback function. This is used with
  * TextInput widgets that implement autocomplete.
  *
  *     var suggestionsResponse = CardService.newSuggestionsResponseBuilder()
  *         .setSuggestions(CardService.newSuggestions()
  *             .addSuggestion("First suggestion")
  *             .addSuggestion("Second suggestion"))
  *             .build();
  */
@js.native
trait SuggestionsResponse extends StObject {
  
  def printJson(): String = js.native
}
object SuggestionsResponse {
  
  @scala.inline
  def apply(printJson: () => String): SuggestionsResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[SuggestionsResponse]
  }
  
  @scala.inline
  implicit class SuggestionsResponseMutableBuilder[Self <: SuggestionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
  }
}
