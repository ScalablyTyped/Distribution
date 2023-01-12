package typings.electronNotifications

import typings.electron.mod.BrowserWindow
import typings.electronNotifications.electronNotificationsStrings.buttonClicked
import typings.electronNotifications.electronNotificationsStrings.clicked
import typings.electronNotifications.electronNotificationsStrings.swipedRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-notifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("electron-notifications", "NotificationWindow")
  @js.native
  open class NotificationWindow () extends BrowserWindow {
    
    def on(event: String, listener: js.Function): this.type = js.native
    /** When any one of the buttons are clicked, it will trigger a buttonClicked event, and pass the text that was clicked to the handler. */
    @JSName("on")
    def on_buttonClicked(event: buttonClicked, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
    /** When the notification was clicked, but not dragged. This usually does the default action, or closes the notification. */
    @JSName("on")
    def on_clicked(event: clicked, listener: js.Function): this.type = js.native
    /** When the notification has been swiped to the right. This usually indiciated the user wants to dismiss the notification. */
    @JSName("on")
    def on_swipedRight(event: swipedRight, listener: js.Function): this.type = js.native
  }
  
  inline def notify_(title: String): NotificationWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(title.asInstanceOf[js.Any]).asInstanceOf[NotificationWindow]
  inline def notify_(title: String, data: NotifierOptions): NotificationWindow = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(title.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[NotificationWindow]
  
  trait NotifierOptions extends StObject {
    
    /** One or two buttons to display on the right of the notification. */
    var buttons: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The absolute URL of a icon displayed to the left of the text. */
    var icon: js.UndefOr[String] = js.undefined
    
    /** A message to display under the title. */
    var message: js.UndefOr[String] = js.undefined
  }
  object NotifierOptions {
    
    inline def apply(): NotifierOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifierOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotifierOptions] (val x: Self) extends AnyVal {
      
      inline def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
