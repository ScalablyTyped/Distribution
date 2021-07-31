package typings.electron.Electron

import typings.electron.electronStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationAction extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/notification-action
  /**
    * The label for the given action.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The type of action, can be `button`.
    */
  var `type`: button
}
object NotificationAction {
  
  @scala.inline
  def apply(): NotificationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("button")
    __obj.asInstanceOf[NotificationAction]
  }
  
  @scala.inline
  implicit class NotificationActionMutableBuilder[Self <: NotificationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
