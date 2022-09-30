package typings.electron.Electron

import typings.electron.electronStrings.action
import typings.electron.electronStrings.click
import typings.electron.electronStrings.close
import typings.electron.electronStrings.critical
import typings.electron.electronStrings.default
import typings.electron.electronStrings.failed
import typings.electron.electronStrings.low
import typings.electron.electronStrings.never
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.reply
import typings.electron.electronStrings.show
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
  def addListener_action(event: action, listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_click(event: click, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_failed(event: failed, listener: js.Function2[/* event */ Event, /* error */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_reply(event: reply, listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_show(event: show, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
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
  
  // Docs: https://electronjs.org/docs/api/notification
  @JSName("on")
  def on_action(event: action, listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  /**
    * Emitted when the notification is clicked by the user.
    */
  @JSName("on")
  def on_click(event: click, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when the notification is closed by manual intervention from the user.
    *
    * This event is not guaranteed to be emitted in all cases where the notification
    * is closed.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * Emitted when an error is encountered while creating and showing the native
    * notification.
    *
    * @platform win32
    */
  @JSName("on")
  def on_failed(event: failed, listener: js.Function2[/* event */ Event, /* error */ String, Unit]): this.type = js.native
  /**
    * Emitted when the user clicks the "Reply" button on a notification with
    * `hasReply: true`.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_reply(event: reply, listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  /**
    * Emitted when the notification is shown to the user, note this could be fired
    * multiple times as a notification can be shown multiple times through the
    * `show()` method.
    */
  @JSName("on")
  def on_show(event: show, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  @JSName("once")
  def once_action(event: action, listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_click(event: click, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_failed(event: failed, listener: js.Function2[/* event */ Event, /* error */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_reply(event: reply, listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_show(event: show, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_action(event: action, listener: js.Function2[/* event */ Event, /* index */ Double, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_click(event: click, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_failed(event: failed, listener: js.Function2[/* event */ Event, /* error */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_reply(event: reply, listener: js.Function2[/* event */ Event, /* reply */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_show(event: show, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
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
  var timeoutType: default | never = js.native
  
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
  var urgency: normal | critical | low = js.native
}
