package typings.electronNotifications

import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.mod.BrowserWindow
import typings.electronNotifications.electronNotificationsStrings.buttonClicked
import typings.electronNotifications.electronNotificationsStrings.clicked
import typings.electronNotifications.electronNotificationsStrings.swipedRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-notifications", "NotificationWindow")
  @js.native
  /**
    * BrowserWindow
    */
  class NotificationWindow () extends BrowserWindow {
    def this(options: BrowserWindowConstructorOptions) = this()
    
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
  
  @JSImport("electron-notifications", "notify")
  @js.native
  def notify_(title: String): NotificationWindow = js.native
  @JSImport("electron-notifications", "notify")
  @js.native
  def notify_(title: String, data: NotifierOptions): NotificationWindow = js.native
  
  @js.native
  trait NotifierOptions extends StObject {
    
    /** One or two buttons to display on the right of the notification. */
    var buttons: js.UndefOr[js.Array[String]] = js.native
    
    /** The absolute URL of a icon displayed to the left of the text. */
    var icon: js.UndefOr[String] = js.native
    
    /** A message to display under the title. */
    var message: js.UndefOr[String] = js.native
  }
  object NotifierOptions {
    
    @scala.inline
    def apply(): NotifierOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifierOptions]
    }
    
    @scala.inline
    implicit class NotifierOptionsMutableBuilder[Self <: NotifierOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
