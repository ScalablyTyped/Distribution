package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.AccountsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.ContactsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.LocationsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.SettingsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.SubscriptionsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.TimelineCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Account
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Attachment
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.AuthToken
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Command
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Location
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.MenuItem
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.MenuValue
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Notification
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.NotificationConfig
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.TimelineItem
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.UserAction
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.UserData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mirror_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.native
  var Contacts: js.UndefOr[ContactsCollection] = js.native
  var Locations: js.UndefOr[LocationsCollection] = js.native
  var Settings: js.UndefOr[SettingsCollection] = js.native
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.native
  var Timeline: js.UndefOr[TimelineCollection] = js.native
  // Create a new instance of Account
  def newAccount(): Account = js.native
  // Create a new instance of Attachment
  def newAttachment(): Attachment = js.native
  // Create a new instance of AuthToken
  def newAuthToken(): AuthToken = js.native
  // Create a new instance of Command
  def newCommand(): Command = js.native
  // Create a new instance of Contact
  def newContact(): Contact = js.native
  // Create a new instance of Location
  def newLocation(): Location = js.native
  // Create a new instance of MenuItem
  def newMenuItem(): MenuItem = js.native
  // Create a new instance of MenuValue
  def newMenuValue(): MenuValue = js.native
  // Create a new instance of Notification
  def newNotification(): Notification = js.native
  // Create a new instance of NotificationConfig
  def newNotificationConfig(): NotificationConfig = js.native
  // Create a new instance of Subscription
  def newSubscription(): Subscription = js.native
  // Create a new instance of TimelineItem
  def newTimelineItem(): TimelineItem = js.native
  // Create a new instance of UserAction
  def newUserAction(): UserAction = js.native
  // Create a new instance of UserData
  def newUserData(): UserData = js.native
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
    newUserData: () => UserData
  ): Mirror_ = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAttachment = js.Any.fromFunction0(newAttachment), newAuthToken = js.Any.fromFunction0(newAuthToken), newCommand = js.Any.fromFunction0(newCommand), newContact = js.Any.fromFunction0(newContact), newLocation = js.Any.fromFunction0(newLocation), newMenuItem = js.Any.fromFunction0(newMenuItem), newMenuValue = js.Any.fromFunction0(newMenuValue), newNotification = js.Any.fromFunction0(newNotification), newNotificationConfig = js.Any.fromFunction0(newNotificationConfig), newSubscription = js.Any.fromFunction0(newSubscription), newTimelineItem = js.Any.fromFunction0(newTimelineItem), newUserAction = js.Any.fromFunction0(newUserAction), newUserData = js.Any.fromFunction0(newUserData))
    __obj.asInstanceOf[Mirror_]
  }
  @scala.inline
  implicit class Mirror_Ops[Self <: Mirror_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewAccount(value: () => Account): Self = this.set("newAccount", js.Any.fromFunction0(value))
    @scala.inline
    def setNewAttachment(value: () => Attachment): Self = this.set("newAttachment", js.Any.fromFunction0(value))
    @scala.inline
    def setNewAuthToken(value: () => AuthToken): Self = this.set("newAuthToken", js.Any.fromFunction0(value))
    @scala.inline
    def setNewCommand(value: () => Command): Self = this.set("newCommand", js.Any.fromFunction0(value))
    @scala.inline
    def setNewContact(value: () => Contact): Self = this.set("newContact", js.Any.fromFunction0(value))
    @scala.inline
    def setNewLocation(value: () => Location): Self = this.set("newLocation", js.Any.fromFunction0(value))
    @scala.inline
    def setNewMenuItem(value: () => MenuItem): Self = this.set("newMenuItem", js.Any.fromFunction0(value))
    @scala.inline
    def setNewMenuValue(value: () => MenuValue): Self = this.set("newMenuValue", js.Any.fromFunction0(value))
    @scala.inline
    def setNewNotification(value: () => Notification): Self = this.set("newNotification", js.Any.fromFunction0(value))
    @scala.inline
    def setNewNotificationConfig(value: () => NotificationConfig): Self = this.set("newNotificationConfig", js.Any.fromFunction0(value))
    @scala.inline
    def setNewSubscription(value: () => Subscription): Self = this.set("newSubscription", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTimelineItem(value: () => TimelineItem): Self = this.set("newTimelineItem", js.Any.fromFunction0(value))
    @scala.inline
    def setNewUserAction(value: () => UserAction): Self = this.set("newUserAction", js.Any.fromFunction0(value))
    @scala.inline
    def setNewUserData(value: () => UserData): Self = this.set("newUserData", js.Any.fromFunction0(value))
    @scala.inline
    def setAccounts(value: AccountsCollection): Self = this.set("Accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccounts: Self = this.set("Accounts", js.undefined)
    @scala.inline
    def setContacts(value: ContactsCollection): Self = this.set("Contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContacts: Self = this.set("Contacts", js.undefined)
    @scala.inline
    def setLocations(value: LocationsCollection): Self = this.set("Locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("Locations", js.undefined)
    @scala.inline
    def setSettings(value: SettingsCollection): Self = this.set("Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
    @scala.inline
    def setSubscriptions(value: SubscriptionsCollection): Self = this.set("Subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptions: Self = this.set("Subscriptions", js.undefined)
    @scala.inline
    def setTimeline(value: TimelineCollection): Self = this.set("Timeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeline: Self = this.set("Timeline", js.undefined)
  }
  
}

