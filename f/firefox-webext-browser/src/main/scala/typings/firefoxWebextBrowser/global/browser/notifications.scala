package typings.firefoxWebextBrowser.global.browser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.notifications.CreateNotificationOptions
import typings.firefoxWebextBrowser.browser.notifications.PermissionLevel
import typings.firefoxWebextBrowser.browser.notifications.UpdateNotificationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `notifications`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object notifications {
  
  /**
    * Clears an existing notification.
    * @param notificationId The id of the notification to be updated.
    */
  @JSGlobal("browser.notifications.clear")
  @js.native
  def clear(notificationId: String): js.Promise[Boolean] = js.native
  
  /**
    * Creates and displays a notification.
    * @param notificationId Identifier of the notification. If it is empty, this method generates an id. If it matches an existing notification, this method first clears that notification before proceeding with the create operation.
    * @param options Contents of the notification.
    */
  @JSGlobal("browser.notifications.create")
  @js.native
  def create(notificationId: String, options: CreateNotificationOptions): js.Promise[String] = js.native
  /* notifications functions */
  /**
    * Creates and displays a notification.
    * @param options Contents of the notification.
    */
  @JSGlobal("browser.notifications.create")
  @js.native
  def create(options: CreateNotificationOptions): js.Promise[String] = js.native
  
  /** Retrieves all the notifications. */
  @JSGlobal("browser.notifications.getAll")
  @js.native
  def getAll(): js.Promise[StringDictionary[CreateNotificationOptions]] = js.native
  
  /**
    * Retrieves whether the user has enabled notifications from this app or extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.notifications.getPermissionLevel")
  @js.native
  def getPermissionLevel(): js.Promise[PermissionLevel] = js.native
  
  /**
    * Fired when the user pressed a button in the notification.
    * @param notificationId The notificationId of the clicked notification.
    * @param buttonIndex The index of the button clicked by the user.
    */
  @JSGlobal("browser.notifications.onButtonClicked")
  @js.native
  val onButtonClicked: WebExtEvent[js.Function2[/* notificationId */ String, /* buttonIndex */ Double, Unit]] = js.native
  
  /**
    * Fired when the user clicked in a non-button area of the notification.
    * @param notificationId The notificationId of the clicked notification.
    */
  @JSGlobal("browser.notifications.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function1[/* notificationId */ String, Unit]] = js.native
  
  /* notifications events */
  /**
    * Fired when the notification closed, either by the system or by user action.
    * @param notificationId The notificationId of the closed notification.
    * @param byUser True if the notification was closed by the user.
    */
  @JSGlobal("browser.notifications.onClosed")
  @js.native
  val onClosed: WebExtEvent[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]] = js.native
  
  /**
    * Fired when the user changes the permission level.
    * @param level The new permission level.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.notifications.onPermissionLevelChanged")
  @js.native
  val onPermissionLevelChanged: js.UndefOr[WebExtEvent[js.Function1[/* level */ PermissionLevel, Unit]]] = js.native
  
  /**
    * Fired when the user clicked on a link for the app's notification settings.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.notifications.onShowSettings")
  @js.native
  val onShowSettings: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  
  /**
    * Fired when the notification is shown.
    * @param notificationId The notificationId of the shown notification.
    */
  @JSGlobal("browser.notifications.onShown")
  @js.native
  val onShown: WebExtEvent[js.Function1[/* notificationId */ String, Unit]] = js.native
  
  /**
    * Updates an existing notification.
    * @param notificationId The id of the notification to be updated.
    * @param options Contents of the notification to update to.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.notifications.update")
  @js.native
  def update(notificationId: String, options: UpdateNotificationOptions): js.Promise[Boolean] = js.native
}
