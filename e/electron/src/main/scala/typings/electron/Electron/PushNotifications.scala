package typings.electron.Electron

import typings.electron.electronStrings.`received-apns-notification`
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNotifications
  extends StObject
     with EventEmitter {
  
  @JSName("addListener")
  def addListener_receivedapnsnotification(
    event: `received-apns-notification`,
    listener: js.Function2[/* event */ Event, /* userInfo */ Record[String, Any], Unit]
  ): this.type = js.native
  
  // Docs: https://electronjs.org/docs/api/push-notifications
  /**
    * Emitted when the app receives a remote notification while running. See:
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * com/documentation/appkit/nsapplicationdelegate/1428430-application?language=objc
    *
    * @platform darwin
    */
  @JSName("on")
  def on_receivedapnsnotification(
    event: `received-apns-notification`,
    listener: js.Function2[/* event */ Event, /* userInfo */ Record[String, Any], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_receivedapnsnotification(
    event: `received-apns-notification`,
    listener: js.Function2[/* event */ Event, /* userInfo */ Record[String, Any], Unit]
  ): this.type = js.native
  
  /**
    * Registers the app with Apple Push Notification service (APNS) to receive Badge,
    * Sound, and Alert notifications. If registration is successful, the promise will
    * be resolved with the APNS device token. Otherwise, the promise will be rejected
    * with an error message. See:
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * tion/appkit/nsapplication/1428476-registerforremotenotificationtyp?language=objc
    *
    * @platform darwin
    */
  def registerForAPNSNotifications(): js.Promise[String] = js.native
  
  @JSName("removeListener")
  def removeListener_receivedapnsnotification(
    event: `received-apns-notification`,
    listener: js.Function2[/* event */ Event, /* userInfo */ Record[String, Any], Unit]
  ): this.type = js.native
  
  /**
    * Unregisters the app from notifications received from APNS. See:
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * tion/appkit/nsapplication/1428747-unregisterforremotenotifications?language=objc
    *
    * @platform darwin
    */
  def unregisterForAPNSNotifications(): Unit = js.native
}
