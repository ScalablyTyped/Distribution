package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.CollectionNs.AccountsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.CollectionNs.ContactsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.CollectionNs.LocationsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.CollectionNs.SettingsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.CollectionNs.SubscriptionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.CollectionNs.TimelineCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.Account
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.Attachment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.AuthToken
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.Command
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.Location
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.MenuItem
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.MenuValue
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.Notification
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.NotificationConfig
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.Subscription
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.TimelineItem
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.UserAction
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.UserData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mirror extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  var Contacts: js.UndefOr[ContactsCollection] = js.undefined
  var Locations: js.UndefOr[LocationsCollection] = js.undefined
  var Settings: js.UndefOr[SettingsCollection] = js.undefined
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.undefined
  var Timeline: js.UndefOr[TimelineCollection] = js.undefined
  // Create a new instance of Account
  def newAccount(): Account
  // Create a new instance of Attachment
  def newAttachment(): Attachment
  // Create a new instance of AuthToken
  def newAuthToken(): AuthToken
  // Create a new instance of Command
  def newCommand(): Command
  // Create a new instance of Contact
  def newContact(): Contact
  // Create a new instance of Location
  def newLocation(): Location
  // Create a new instance of MenuItem
  def newMenuItem(): MenuItem
  // Create a new instance of MenuValue
  def newMenuValue(): MenuValue
  // Create a new instance of Notification
  def newNotification(): Notification
  // Create a new instance of NotificationConfig
  def newNotificationConfig(): NotificationConfig
  // Create a new instance of Subscription
  def newSubscription(): Subscription
  // Create a new instance of TimelineItem
  def newTimelineItem(): TimelineItem
  // Create a new instance of UserAction
  def newUserAction(): UserAction
  // Create a new instance of UserData
  def newUserData(): UserData
}

object Mirror {
  @scala.inline
  def apply(
    newAccount: () => Account,
    newAttachment: () => Attachment,
    newAuthToken: () => AuthToken,
    newCommand: () => Command,
    newContact: () => Contact,
    newLocation: () => Location,
    newMenuItem: () => MenuItem,
    newMenuValue: () => MenuValue,
    newNotification: () => Notification,
    newNotificationConfig: () => NotificationConfig,
    newSubscription: () => Subscription,
    newTimelineItem: () => TimelineItem,
    newUserAction: () => UserAction,
    newUserData: () => UserData,
    Accounts: AccountsCollection = null,
    Contacts: ContactsCollection = null,
    Locations: LocationsCollection = null,
    Settings: SettingsCollection = null,
    Subscriptions: SubscriptionsCollection = null,
    Timeline: TimelineCollection = null
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

