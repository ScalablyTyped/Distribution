package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mirror extends js.Object {
  var Accounts: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.AccountsCollection
  ] = js.undefined
  var Contacts: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.ContactsCollection
  ] = js.undefined
  var Locations: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.LocationsCollection
  ] = js.undefined
  var Settings: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.SettingsCollection
  ] = js.undefined
  var Subscriptions: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.SubscriptionsCollection
  ] = js.undefined
  var Timeline: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.TimelineCollection
  ] = js.undefined
  // Create a new instance of Account
  def newAccount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Account
  // Create a new instance of Attachment
  def newAttachment(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Attachment
  // Create a new instance of AuthToken
  def newAuthToken(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.AuthToken
  // Create a new instance of Command
  def newCommand(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Command
  // Create a new instance of Contact
  def newContact(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact
  // Create a new instance of Location
  def newLocation(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Location
  // Create a new instance of MenuItem
  def newMenuItem(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.MenuItem
  // Create a new instance of MenuValue
  def newMenuValue(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.MenuValue
  // Create a new instance of Notification
  def newNotification(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Notification
  // Create a new instance of NotificationConfig
  def newNotificationConfig(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.NotificationConfig
  // Create a new instance of Subscription
  def newSubscription(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Subscription
  // Create a new instance of TimelineItem
  def newTimelineItem(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem
  // Create a new instance of UserAction
  def newUserAction(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.UserAction
  // Create a new instance of UserData
  def newUserData(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.UserData
}

object Mirror {
  @scala.inline
  def apply(
    newAccount: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Account,
    newAttachment: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Attachment,
    newAuthToken: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.AuthToken,
    newCommand: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Command,
    newContact: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact,
    newLocation: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Location,
    newMenuItem: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.MenuItem,
    newMenuValue: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.MenuValue,
    newNotification: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Notification,
    newNotificationConfig: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.NotificationConfig,
    newSubscription: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Subscription,
    newTimelineItem: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem,
    newUserAction: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.UserAction,
    newUserData: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.UserData,
    Accounts: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.AccountsCollection = null,
    Contacts: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.ContactsCollection = null,
    Locations: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.LocationsCollection = null,
    Settings: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.SettingsCollection = null,
    Subscriptions: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.SubscriptionsCollection = null,
    Timeline: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs.TimelineCollection = null
  ): Mirror = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAttachment = js.Any.fromFunction0(newAttachment), newAuthToken = js.Any.fromFunction0(newAuthToken), newCommand = js.Any.fromFunction0(newCommand), newContact = js.Any.fromFunction0(newContact), newLocation = js.Any.fromFunction0(newLocation), newMenuItem = js.Any.fromFunction0(newMenuItem), newMenuValue = js.Any.fromFunction0(newMenuValue), newNotification = js.Any.fromFunction0(newNotification), newNotificationConfig = js.Any.fromFunction0(newNotificationConfig), newSubscription = js.Any.fromFunction0(newSubscription), newTimelineItem = js.Any.fromFunction0(newTimelineItem), newUserAction = js.Any.fromFunction0(newUserAction), newUserData = js.Any.fromFunction0(newUserData))
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts)
    if (Contacts != null) __obj.updateDynamic("Contacts")(Contacts)
    if (Locations != null) __obj.updateDynamic("Locations")(Locations)
    if (Settings != null) __obj.updateDynamic("Settings")(Settings)
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions)
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline)
    __obj.asInstanceOf[Mirror]
  }
}

