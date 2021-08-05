package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A notification shown to the user as a response to interacting with a UI element.
  *
  *     var action = CardService.newAction().setFunctionName("notificationCallback");
  *     CardService.newTextButton().setText('Save').setOnClickAction(action);
  *
  *     // ...
  *
  *     function notificationCallback() {
  *       return CardService.newActionResponseBuilder()
  *           .setNotification(CardService.newNotification()
  *               .setText("Some info to display to user"))
  *           .build();
  *     }
  */
trait Notification extends StObject {
  
  def setText(text: String): Notification
}
object Notification {
  
  inline def apply(setText: String => Notification): Notification = {
    val __obj = js.Dynamic.literal(setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[Notification]
  }
  
  extension [Self <: Notification](x: Self) {
    
    inline def setSetText(value: String => Notification): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
