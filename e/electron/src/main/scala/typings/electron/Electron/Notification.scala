package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends EventEmitter {
  
  /**
    * A `NotificationAction[]` property representing the actions of the notification.
    */
  var actions: js.Array[NotificationAction] = js.native
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_close")
  def addListener(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_show")
  def addListener(event: "show", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_click")
  def addListener(event: "click", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_failed")
  def addListener(event: "failed", listener: js.Function2[/* event */ Event, /* error */ String, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_action")
  def addListener(event: "action", listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_reply")
  def addListener(event: "reply", listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  
  /**
    * A `string` property representing the body of the notification.
    */
  var body: String = js.native
  
  /**
    * Dismisses the notification.
    */
  def close(): Unit = js.native
  
  /**
    * A `string` property representing the close button text of the notification.
    */
  var closeButtonText: String = js.native
  
  /**
    * A `boolean` property representing whether the notification has a reply action.
    */
  var hasReply: Boolean = js.native
  
  /**
    * Emitted when the notification is shown to the user, note this could be fired
    * multiple times as a notification can be shown multiple times through the
    * `show()` method.
    */
  @JSName("on")
  @scala.annotation.targetName("on_show")
  def on(event: "show", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the notification is clicked by the user.
    */
  @JSName("on")
  @scala.annotation.targetName("on_click")
  def on(event: "click", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the notification is closed by manual intervention from the user.
    *
    * This event is not guaranteed to be emitted in all cases where the notification
    * is closed.
    */
  @JSName("on")
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  // Docs: https://electronjs.org/docs/api/notification
  @JSName("on")
  @scala.annotation.targetName("on_action")
  def on(event: "action", listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  /**
    * Emitted when an error is encountered while creating and showing the native
    * notification.
    *
    * @platform win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_failed")
  def on(event: "failed", listener: js.Function2[/* event */ Event, /* error */ String, Unit]): this.type = js.native
  /**
    * Emitted when the user clicks the "Reply" button on a notification with
    * `hasReply: true`.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_reply")
  def on(event: "reply", listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_close")
  def once(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_show")
  def once(event: "show", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_click")
  def once(event: "click", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_action")
  def once(event: "action", listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_failed")
  def once(event: "failed", listener: js.Function2[/* event */ Event, /* error */ String, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_reply")
  def once(event: "reply", listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_click")
  def removeListener(event: "click", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_show")
  def removeListener(event: "show", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_close")
  def removeListener(event: "close", listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_failed")
  def removeListener(event: "failed", listener: js.Function2[/* event */ Event, /* error */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_reply")
  def removeListener(event: "reply", listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_action")
  def removeListener(event: "action", listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  
  /**
    * A `string` property representing the reply placeholder of the notification.
    */
  var replyPlaceholder: String = js.native
  
  /**
    * Immediately shows the notification to the user, please note this means unlike
    * the HTML5 Notification implementation, instantiating a `new Notification` does
    * not immediately show it to the user, you need to call this method before the OS
    * will display it.
    *
    * If the notification has been shown before, this method will dismiss the
    * previously shown notification and create a new one with identical properties.
    */
  def show(): Unit = js.native
  
  /**
    * A `boolean` property representing whether the notification is silent.
    */
  var silent: Boolean = js.native
  
  /**
    * A `string` property representing the sound of the notification.
    */
  var sound: String = js.native
  
  /**
    * A `string` property representing the subtitle of the notification.
    */
  var subtitle: String = js.native
  
  /**
    * A `string` property representing the type of timeout duration for the
    * notification. Can be 'default' or 'never'.
    *
    * If `timeoutType` is set to 'never', the notification never expires. It stays
    * open until closed by the calling API or the user.
    *
    * @platform linux,win32
    */
  var timeoutType: "default" | "never" = js.native
  
  /**
    * A `string` property representing the title of the notification.
    */
  var title: String = js.native
  
  /**
    * A `string` property representing the custom Toast XML of the notification.
    *
    * @platform win32
    */
  var toastXml: String = js.native
  
  /**
    * A `string` property representing the urgency level of the notification. Can be
    * 'normal', 'critical', or 'low'.
    *
    * Default is 'low' - see NotifyUrgency for more information.
    *
    * @platform linux
    */
  var urgency: "normal" | "critical" | "low" = js.native
}
