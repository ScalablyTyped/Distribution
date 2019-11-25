package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Collection.AccountsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Collection.ContactsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Collection.LocationsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Collection.SettingsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Collection.SubscriptionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Collection.TimelineCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.Account
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.Attachment
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.AuthToken
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.Command
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.Contact
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.Location
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.MenuItem
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.MenuValue
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.Notification
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.NotificationConfig
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.Subscription
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.TimelineItem
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.UserAction
import typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema.UserData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Mirror")
trait Mirror_ extends js.Object {
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

object Mirror_ {
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
  ): Mirror_ = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAttachment = js.Any.fromFunction0(newAttachment), newAuthToken = js.Any.fromFunction0(newAuthToken), newCommand = js.Any.fromFunction0(newCommand), newContact = js.Any.fromFunction0(newContact), newLocation = js.Any.fromFunction0(newLocation), newMenuItem = js.Any.fromFunction0(newMenuItem), newMenuValue = js.Any.fromFunction0(newMenuValue), newNotification = js.Any.fromFunction0(newNotification), newNotificationConfig = js.Any.fromFunction0(newNotificationConfig), newSubscription = js.Any.fromFunction0(newSubscription), newTimelineItem = js.Any.fromFunction0(newTimelineItem), newUserAction = js.Any.fromFunction0(newUserAction), newUserData = js.Any.fromFunction0(newUserData))
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    if (Contacts != null) __obj.updateDynamic("Contacts")(Contacts.asInstanceOf[js.Any])
    if (Locations != null) __obj.updateDynamic("Locations")(Locations.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions.asInstanceOf[js.Any])
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mirror_]
  }
}

