package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response object that may be returned from a callback method for compose action in a Gmail add-on.
  *
  * Note: This object isn't related to compose actions that are
  * used to extend the compose UI. Rather,
  * this object is a response to an Action that composes draft messages when a specific UI element is
  * selected.
  *
  *     var composeActionResponse = CardService.newComposeActionResponseBuilder()
  *         .setGmailDraft(GmailApp.createDraft("recipient", "subject", "body"))
  *         .build();
  */
trait ComposeActionResponse extends StObject {
  
  def printJson(): String
}
object ComposeActionResponse {
  
  inline def apply(printJson: () => String): ComposeActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[ComposeActionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComposeActionResponse] (val x: Self) extends AnyVal {
    
    inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
  }
}
