package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationResponse extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/notification-response
  /**
    * The identifier string of the action that the user selected.
    */
  var actionIdentifier: String
  
  /**
    * The delivery date of the notification.
    */
  var date: Double
  
  /**
    * The unique identifier for this notification request.
    */
  var identifier: String
  
  /**
    * A dictionary of custom information associated with the notification.
    */
  var userInfo: Record[String, Any]
  
  /**
    * The text entered or chosen by the user.
    */
  var userText: js.UndefOr[String] = js.undefined
}
object NotificationResponse {
  
  inline def apply(actionIdentifier: String, date: Double, identifier: String, userInfo: Record[String, Any]): NotificationResponse = {
    val __obj = js.Dynamic.literal(actionIdentifier = actionIdentifier.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationResponse] (val x: Self) extends AnyVal {
    
    inline def setActionIdentifier(value: String): Self = StObject.set(x, "actionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: Record[String, Any]): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserText(value: String): Self = StObject.set(x, "userText", value.asInstanceOf[js.Any])
    
    inline def setUserTextUndefined: Self = StObject.set(x, "userText", js.undefined)
  }
}
