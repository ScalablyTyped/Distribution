package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.AccountsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.ContactsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.LocationsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.SettingsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.SubscriptionsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.Timeline.AttachmentsCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Collection.TimelineCollection
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Account
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Attachment
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.AttachmentsListResponse
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.AuthToken
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Command
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.ContactsListResponse
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Location
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.LocationsListResponse
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.MenuItem
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.MenuValue
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Notification
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.NotificationConfig
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Setting
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.SubscriptionsListResponse
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.TimelineItem
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.TimelineListResponse
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.UserAction
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.UserData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mirror extends StObject {
  
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
    newUserData: () => UserData
  ): Mirror = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAttachment = js.Any.fromFunction0(newAttachment), newAuthToken = js.Any.fromFunction0(newAuthToken), newCommand = js.Any.fromFunction0(newCommand), newContact = js.Any.fromFunction0(newContact), newLocation = js.Any.fromFunction0(newLocation), newMenuItem = js.Any.fromFunction0(newMenuItem), newMenuValue = js.Any.fromFunction0(newMenuValue), newNotification = js.Any.fromFunction0(newNotification), newNotificationConfig = js.Any.fromFunction0(newNotificationConfig), newSubscription = js.Any.fromFunction0(newSubscription), newTimelineItem = js.Any.fromFunction0(newTimelineItem), newUserAction = js.Any.fromFunction0(newUserAction), newUserData = js.Any.fromFunction0(newUserData))
    __obj.asInstanceOf[Mirror]
  }
  
  object Collection {
    
    @js.native
    trait AccountsCollection extends StObject {
      
      // Inserts a new account for a user
      def insert(resource: Account, userToken: String, accountType: String, accountName: String): Account = js.native
    }
    object AccountsCollection {
      
      @scala.inline
      def apply(insert: (Account, String, String, String) => Account): AccountsCollection = {
        val __obj = js.Dynamic.literal(insert = js.Any.fromFunction4(insert))
        __obj.asInstanceOf[AccountsCollection]
      }
      
      @scala.inline
      implicit class AccountsCollectionMutableBuilder[Self <: AccountsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInsert(value: (Account, String, String, String) => Account): Self = StObject.set(x, "insert", js.Any.fromFunction4(value))
      }
    }
    
    @js.native
    trait ContactsCollection extends StObject {
      
      // Gets a single contact by ID.
      def get(id: String): Contact = js.native
      
      // Inserts a new contact.
      def insert(resource: Contact): Contact = js.native
      
      // Retrieves a list of contacts for the authenticated user.
      def list(): ContactsListResponse = js.native
      
      // Updates a contact in place. This method supports patch semantics.
      def patch(resource: Contact, id: String): Contact = js.native
      
      // Deletes a contact.
      def remove(id: String): Unit = js.native
      
      // Updates a contact in place.
      def update(resource: Contact, id: String): Contact = js.native
    }
    object ContactsCollection {
      
      @scala.inline
      def apply(
        get: String => Contact,
        insert: Contact => Contact,
        list: () => ContactsListResponse,
        patch: (Contact, String) => Contact,
        remove: String => Unit,
        update: (Contact, String) => Contact
      ): ContactsCollection = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), patch = js.Any.fromFunction2(patch), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
        __obj.asInstanceOf[ContactsCollection]
      }
      
      @scala.inline
      implicit class ContactsCollectionMutableBuilder[Self <: ContactsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: String => Contact): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        @scala.inline
        def setInsert(value: Contact => Contact): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
        
        @scala.inline
        def setList(value: () => ContactsListResponse): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPatch(value: (Contact, String) => Contact): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
        
        @scala.inline
        def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUpdate(value: (Contact, String) => Contact): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait LocationsCollection extends StObject {
      
      // Gets a single location by ID.
      def get(id: String): Location = js.native
      
      // Retrieves a list of locations for the user.
      def list(): LocationsListResponse = js.native
    }
    object LocationsCollection {
      
      @scala.inline
      def apply(get: String => Location, list: () => LocationsListResponse): LocationsCollection = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
        __obj.asInstanceOf[LocationsCollection]
      }
      
      @scala.inline
      implicit class LocationsCollectionMutableBuilder[Self <: LocationsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: String => Location): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        @scala.inline
        def setList(value: () => LocationsListResponse): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait SettingsCollection extends StObject {
      
      // Gets a single setting by ID.
      def get(id: String): Setting = js.native
    }
    object SettingsCollection {
      
      @scala.inline
      def apply(get: String => Setting): SettingsCollection = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
        __obj.asInstanceOf[SettingsCollection]
      }
      
      @scala.inline
      implicit class SettingsCollectionMutableBuilder[Self <: SettingsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: String => Setting): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait SubscriptionsCollection extends StObject {
      
      // Creates a new subscription.
      def insert(resource: Subscription): Subscription = js.native
      
      // Retrieves a list of subscriptions for the authenticated user and service.
      def list(): SubscriptionsListResponse = js.native
      
      // Deletes a subscription.
      def remove(id: String): Unit = js.native
      
      // Updates an existing subscription in place.
      def update(resource: Subscription, id: String): Subscription = js.native
    }
    object SubscriptionsCollection {
      
      @scala.inline
      def apply(
        insert: Subscription => Subscription,
        list: () => SubscriptionsListResponse,
        remove: String => Unit,
        update: (Subscription, String) => Subscription
      ): SubscriptionsCollection = {
        val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
        __obj.asInstanceOf[SubscriptionsCollection]
      }
      
      @scala.inline
      implicit class SubscriptionsCollectionMutableBuilder[Self <: SubscriptionsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInsert(value: Subscription => Subscription): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
        
        @scala.inline
        def setList(value: () => SubscriptionsListResponse): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUpdate(value: (Subscription, String) => Subscription): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      }
    }
    
    object Timeline {
      
      @js.native
      trait AttachmentsCollection extends StObject {
        
        // Retrieves an attachment on a timeline item by item ID and attachment ID.
        def get(itemId: String, attachmentId: String): Attachment = js.native
        
        // Adds a new attachment to a timeline item.
        def insert(itemId: String): Attachment = js.native
        // Adds a new attachment to a timeline item.
        def insert(itemId: String, mediaData: js.Any): Attachment = js.native
        
        // Returns a list of attachments for a timeline item.
        def list(itemId: String): AttachmentsListResponse = js.native
        
        // Deletes an attachment from a timeline item.
        def remove(itemId: String, attachmentId: String): Unit = js.native
      }
    }
    
    @js.native
    trait TimelineCollection extends StObject {
      
      var Attachments: js.UndefOr[AttachmentsCollection] = js.native
      
      // Gets a single timeline item by ID.
      def get(id: String): TimelineItem = js.native
      
      // Inserts a new item into the timeline.
      def insert(resource: TimelineItem): TimelineItem = js.native
      // Inserts a new item into the timeline.
      def insert(resource: TimelineItem, mediaData: js.Any): TimelineItem = js.native
      
      // Retrieves a list of timeline items for the authenticated user.
      def list(): TimelineListResponse = js.native
      // Retrieves a list of timeline items for the authenticated user.
      def list(optionalArgs: js.Object): TimelineListResponse = js.native
      
      // Updates a timeline item in place. This method supports patch semantics.
      def patch(resource: TimelineItem, id: String): TimelineItem = js.native
      
      // Deletes a timeline item.
      def remove(id: String): Unit = js.native
      
      // Updates a timeline item in place.
      def update(resource: TimelineItem, id: String): TimelineItem = js.native
      // Updates a timeline item in place.
      def update(resource: TimelineItem, id: String, mediaData: js.Any): TimelineItem = js.native
    }
  }
  
  @scala.inline
  implicit class MirrorMutableBuilder[Self <: Mirror] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: AccountsCollection): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    @scala.inline
    def setContacts(value: ContactsCollection): Self = StObject.set(x, "Contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactsUndefined: Self = StObject.set(x, "Contacts", js.undefined)
    
    @scala.inline
    def setLocations(value: LocationsCollection): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "Locations", js.undefined)
    
    @scala.inline
    def setNewAccount(value: () => Account): Self = StObject.set(x, "newAccount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAttachment(value: () => Attachment): Self = StObject.set(x, "newAttachment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAuthToken(value: () => AuthToken): Self = StObject.set(x, "newAuthToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCommand(value: () => Command): Self = StObject.set(x, "newCommand", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewContact(value: () => Contact): Self = StObject.set(x, "newContact", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLocation(value: () => Location): Self = StObject.set(x, "newLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMenuItem(value: () => MenuItem): Self = StObject.set(x, "newMenuItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMenuValue(value: () => MenuValue): Self = StObject.set(x, "newMenuValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNotification(value: () => Notification): Self = StObject.set(x, "newNotification", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNotificationConfig(value: () => NotificationConfig): Self = StObject.set(x, "newNotificationConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSubscription(value: () => Subscription): Self = StObject.set(x, "newSubscription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTimelineItem(value: () => TimelineItem): Self = StObject.set(x, "newTimelineItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserAction(value: () => UserAction): Self = StObject.set(x, "newUserAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserData(value: () => UserData): Self = StObject.set(x, "newUserData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettings(value: SettingsCollection): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: SubscriptionsCollection): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    @scala.inline
    def setTimeline(value: TimelineCollection): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
  
  object Schema {
    
    @js.native
    trait Account extends StObject {
      
      var authTokens: js.UndefOr[js.Array[AuthToken]] = js.native
      
      var features: js.UndefOr[js.Array[String]] = js.native
      
      var password: js.UndefOr[String] = js.native
      
      var userData: js.UndefOr[js.Array[UserData]] = js.native
    }
    object Account {
      
      @scala.inline
      def apply(): Account = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Account]
      }
      
      @scala.inline
      implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuthTokens(value: js.Array[AuthToken]): Self = StObject.set(x, "authTokens", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthTokensUndefined: Self = StObject.set(x, "authTokens", js.undefined)
        
        @scala.inline
        def setAuthTokensVarargs(value: AuthToken*): Self = StObject.set(x, "authTokens", js.Array(value :_*))
        
        @scala.inline
        def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
        
        @scala.inline
        def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        @scala.inline
        def setUserData(value: js.Array[UserData]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
        
        @scala.inline
        def setUserDataVarargs(value: UserData*): Self = StObject.set(x, "userData", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Attachment extends StObject {
      
      var contentType: js.UndefOr[String] = js.native
      
      var contentUrl: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var isProcessingContent: js.UndefOr[Boolean] = js.native
    }
    object Attachment {
      
      @scala.inline
      def apply(): Attachment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Attachment]
      }
      
      @scala.inline
      implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
        
        @scala.inline
        def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setIsProcessingContent(value: Boolean): Self = StObject.set(x, "isProcessingContent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsProcessingContentUndefined: Self = StObject.set(x, "isProcessingContent", js.undefined)
      }
    }
    
    @js.native
    trait AttachmentsListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[Attachment]] = js.native
      
      var kind: js.UndefOr[String] = js.native
    }
    object AttachmentsListResponse {
      
      @scala.inline
      def apply(): AttachmentsListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AttachmentsListResponse]
      }
      
      @scala.inline
      implicit class AttachmentsListResponseMutableBuilder[Self <: AttachmentsListResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[Attachment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Attachment*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait AuthToken extends StObject {
      
      var authToken: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object AuthToken {
      
      @scala.inline
      def apply(): AuthToken = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AuthToken]
      }
      
      @scala.inline
      implicit class AuthTokenMutableBuilder[Self <: AuthToken] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Command extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Command {
      
      @scala.inline
      def apply(): Command = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Command]
      }
      
      @scala.inline
      implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Contact extends StObject {
      
      var acceptCommands: js.UndefOr[js.Array[Command]] = js.native
      
      var acceptTypes: js.UndefOr[js.Array[String]] = js.native
      
      var displayName: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var imageUrls: js.UndefOr[js.Array[String]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var phoneNumber: js.UndefOr[String] = js.native
      
      var priority: js.UndefOr[Double] = js.native
      
      var sharingFeatures: js.UndefOr[js.Array[String]] = js.native
      
      var source: js.UndefOr[String] = js.native
      
      var speakableName: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Contact {
      
      @scala.inline
      def apply(): Contact = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Contact]
      }
      
      @scala.inline
      implicit class ContactMutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAcceptCommands(value: js.Array[Command]): Self = StObject.set(x, "acceptCommands", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAcceptCommandsUndefined: Self = StObject.set(x, "acceptCommands", js.undefined)
        
        @scala.inline
        def setAcceptCommandsVarargs(value: Command*): Self = StObject.set(x, "acceptCommands", js.Array(value :_*))
        
        @scala.inline
        def setAcceptTypes(value: js.Array[String]): Self = StObject.set(x, "acceptTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAcceptTypesUndefined: Self = StObject.set(x, "acceptTypes", js.undefined)
        
        @scala.inline
        def setAcceptTypesVarargs(value: String*): Self = StObject.set(x, "acceptTypes", js.Array(value :_*))
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setImageUrls(value: js.Array[String]): Self = StObject.set(x, "imageUrls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageUrlsUndefined: Self = StObject.set(x, "imageUrls", js.undefined)
        
        @scala.inline
        def setImageUrlsVarargs(value: String*): Self = StObject.set(x, "imageUrls", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
        
        @scala.inline
        def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
        
        @scala.inline
        def setSharingFeatures(value: js.Array[String]): Self = StObject.set(x, "sharingFeatures", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSharingFeaturesUndefined: Self = StObject.set(x, "sharingFeatures", js.undefined)
        
        @scala.inline
        def setSharingFeaturesVarargs(value: String*): Self = StObject.set(x, "sharingFeatures", js.Array(value :_*))
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        @scala.inline
        def setSpeakableName(value: String): Self = StObject.set(x, "speakableName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeakableNameUndefined: Self = StObject.set(x, "speakableName", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait ContactsListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[Contact]] = js.native
      
      var kind: js.UndefOr[String] = js.native
    }
    object ContactsListResponse {
      
      @scala.inline
      def apply(): ContactsListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactsListResponse]
      }
      
      @scala.inline
      implicit class ContactsListResponseMutableBuilder[Self <: ContactsListResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[Contact]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Contact*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait Location extends StObject {
      
      var accuracy: js.UndefOr[Double] = js.native
      
      var address: js.UndefOr[String] = js.native
      
      var displayName: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var latitude: js.UndefOr[Double] = js.native
      
      var longitude: js.UndefOr[Double] = js.native
      
      var timestamp: js.UndefOr[String] = js.native
    }
    object Location {
      
      @scala.inline
      def apply(): Location = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Location]
      }
      
      @scala.inline
      implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
        
        @scala.inline
        def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
        
        @scala.inline
        def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
        
        @scala.inline
        def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      }
    }
    
    @js.native
    trait LocationsListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[Location]] = js.native
      
      var kind: js.UndefOr[String] = js.native
    }
    object LocationsListResponse {
      
      @scala.inline
      def apply(): LocationsListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocationsListResponse]
      }
      
      @scala.inline
      implicit class LocationsListResponseMutableBuilder[Self <: LocationsListResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[Location]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Location*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait MenuItem extends StObject {
      
      var action: js.UndefOr[String] = js.native
      
      var contextual_command: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var payload: js.UndefOr[String] = js.native
      
      var removeWhenSelected: js.UndefOr[Boolean] = js.native
      
      var values: js.UndefOr[js.Array[MenuValue]] = js.native
    }
    object MenuItem {
      
      @scala.inline
      def apply(): MenuItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MenuItem]
      }
      
      @scala.inline
      implicit class MenuItemMutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        @scala.inline
        def setContextual_command(value: String): Self = StObject.set(x, "contextual_command", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextual_commandUndefined: Self = StObject.set(x, "contextual_command", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        @scala.inline
        def setRemoveWhenSelected(value: Boolean): Self = StObject.set(x, "removeWhenSelected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemoveWhenSelectedUndefined: Self = StObject.set(x, "removeWhenSelected", js.undefined)
        
        @scala.inline
        def setValues(value: js.Array[MenuValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: MenuValue*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    @js.native
    trait MenuValue extends StObject {
      
      var displayName: js.UndefOr[String] = js.native
      
      var iconUrl: js.UndefOr[String] = js.native
      
      var state: js.UndefOr[String] = js.native
    }
    object MenuValue {
      
      @scala.inline
      def apply(): MenuValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MenuValue]
      }
      
      @scala.inline
      implicit class MenuValueMutableBuilder[Self <: MenuValue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
    
    @js.native
    trait Notification extends StObject {
      
      var collection: js.UndefOr[String] = js.native
      
      var itemId: js.UndefOr[String] = js.native
      
      var operation: js.UndefOr[String] = js.native
      
      var userActions: js.UndefOr[js.Array[UserAction]] = js.native
      
      var userToken: js.UndefOr[String] = js.native
      
      var verifyToken: js.UndefOr[String] = js.native
    }
    object Notification {
      
      @scala.inline
      def apply(): Notification = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Notification]
      }
      
      @scala.inline
      implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
        
        @scala.inline
        def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
        
        @scala.inline
        def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
        
        @scala.inline
        def setUserActions(value: js.Array[UserAction]): Self = StObject.set(x, "userActions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserActionsUndefined: Self = StObject.set(x, "userActions", js.undefined)
        
        @scala.inline
        def setUserActionsVarargs(value: UserAction*): Self = StObject.set(x, "userActions", js.Array(value :_*))
        
        @scala.inline
        def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
        
        @scala.inline
        def setVerifyToken(value: String): Self = StObject.set(x, "verifyToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerifyTokenUndefined: Self = StObject.set(x, "verifyToken", js.undefined)
      }
    }
    
    @js.native
    trait NotificationConfig extends StObject {
      
      var deliveryTime: js.UndefOr[String] = js.native
      
      var level: js.UndefOr[String] = js.native
    }
    object NotificationConfig {
      
      @scala.inline
      def apply(): NotificationConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NotificationConfig]
      }
      
      @scala.inline
      implicit class NotificationConfigMutableBuilder[Self <: NotificationConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeliveryTime(value: String): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
        
        @scala.inline
        def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      }
    }
    
    @js.native
    trait Setting extends StObject {
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Setting {
      
      @scala.inline
      def apply(): Setting = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Setting]
      }
      
      @scala.inline
      implicit class SettingMutableBuilder[Self <: Setting] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Subscription extends StObject {
      
      var callbackUrl: js.UndefOr[String] = js.native
      
      var collection: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var notification: js.UndefOr[Notification] = js.native
      
      var operation: js.UndefOr[js.Array[String]] = js.native
      
      var updated: js.UndefOr[String] = js.native
      
      var userToken: js.UndefOr[String] = js.native
      
      var verifyToken: js.UndefOr[String] = js.native
    }
    object Subscription {
      
      @scala.inline
      def apply(): Subscription = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Subscription]
      }
      
      @scala.inline
      implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
        
        @scala.inline
        def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
        
        @scala.inline
        def setOperation(value: js.Array[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
        
        @scala.inline
        def setOperationVarargs(value: String*): Self = StObject.set(x, "operation", js.Array(value :_*))
        
        @scala.inline
        def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
        
        @scala.inline
        def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
        
        @scala.inline
        def setVerifyToken(value: String): Self = StObject.set(x, "verifyToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerifyTokenUndefined: Self = StObject.set(x, "verifyToken", js.undefined)
      }
    }
    
    @js.native
    trait SubscriptionsListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[Subscription]] = js.native
      
      var kind: js.UndefOr[String] = js.native
    }
    object SubscriptionsListResponse {
      
      @scala.inline
      def apply(): SubscriptionsListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionsListResponse]
      }
      
      @scala.inline
      implicit class SubscriptionsListResponseMutableBuilder[Self <: SubscriptionsListResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[Subscription]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Subscription*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait TimelineItem extends StObject {
      
      var attachments: js.UndefOr[js.Array[Attachment]] = js.native
      
      var bundleId: js.UndefOr[String] = js.native
      
      var canonicalUrl: js.UndefOr[String] = js.native
      
      var created: js.UndefOr[String] = js.native
      
      var creator: js.UndefOr[Contact] = js.native
      
      var displayTime: js.UndefOr[String] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var html: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var inReplyTo: js.UndefOr[String] = js.native
      
      var isBundleCover: js.UndefOr[Boolean] = js.native
      
      var isDeleted: js.UndefOr[Boolean] = js.native
      
      var isPinned: js.UndefOr[Boolean] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var location: js.UndefOr[Location] = js.native
      
      var menuItems: js.UndefOr[js.Array[MenuItem]] = js.native
      
      var notification: js.UndefOr[NotificationConfig] = js.native
      
      var pinScore: js.UndefOr[Double] = js.native
      
      var recipients: js.UndefOr[js.Array[Contact]] = js.native
      
      var selfLink: js.UndefOr[String] = js.native
      
      var sourceItemId: js.UndefOr[String] = js.native
      
      var speakableText: js.UndefOr[String] = js.native
      
      var speakableType: js.UndefOr[String] = js.native
      
      var text: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var updated: js.UndefOr[String] = js.native
    }
    object TimelineItem {
      
      @scala.inline
      def apply(): TimelineItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimelineItem]
      }
      
      @scala.inline
      implicit class TimelineItemMutableBuilder[Self <: TimelineItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
        
        @scala.inline
        def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
        
        @scala.inline
        def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
        
        @scala.inline
        def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
        
        @scala.inline
        def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
        
        @scala.inline
        def setCreator(value: Contact): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
        
        @scala.inline
        def setDisplayTime(value: String): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayTimeUndefined: Self = StObject.set(x, "displayTime", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
        
        @scala.inline
        def setIsBundleCover(value: Boolean): Self = StObject.set(x, "isBundleCover", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsBundleCoverUndefined: Self = StObject.set(x, "isBundleCover", js.undefined)
        
        @scala.inline
        def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
        
        @scala.inline
        def setIsPinned(value: Boolean): Self = StObject.set(x, "isPinned", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsPinnedUndefined: Self = StObject.set(x, "isPinned", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setMenuItems(value: js.Array[MenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
        
        @scala.inline
        def setMenuItemsVarargs(value: MenuItem*): Self = StObject.set(x, "menuItems", js.Array(value :_*))
        
        @scala.inline
        def setNotification(value: NotificationConfig): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
        
        @scala.inline
        def setPinScore(value: Double): Self = StObject.set(x, "pinScore", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPinScoreUndefined: Self = StObject.set(x, "pinScore", js.undefined)
        
        @scala.inline
        def setRecipients(value: js.Array[Contact]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
        
        @scala.inline
        def setRecipientsVarargs(value: Contact*): Self = StObject.set(x, "recipients", js.Array(value :_*))
        
        @scala.inline
        def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        @scala.inline
        def setSourceItemId(value: String): Self = StObject.set(x, "sourceItemId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceItemIdUndefined: Self = StObject.set(x, "sourceItemId", js.undefined)
        
        @scala.inline
        def setSpeakableText(value: String): Self = StObject.set(x, "speakableText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeakableTextUndefined: Self = StObject.set(x, "speakableText", js.undefined)
        
        @scala.inline
        def setSpeakableType(value: String): Self = StObject.set(x, "speakableType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeakableTypeUndefined: Self = StObject.set(x, "speakableType", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    @js.native
    trait TimelineListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[TimelineItem]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object TimelineListResponse {
      
      @scala.inline
      def apply(): TimelineListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimelineListResponse]
      }
      
      @scala.inline
      implicit class TimelineListResponseMutableBuilder[Self <: TimelineListResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[TimelineItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: TimelineItem*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait UserAction extends StObject {
      
      var payload: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object UserAction {
      
      @scala.inline
      def apply(): UserAction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserAction]
      }
      
      @scala.inline
      implicit class UserActionMutableBuilder[Self <: UserAction] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait UserData extends StObject {
      
      var key: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object UserData {
      
      @scala.inline
      def apply(): UserData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserData]
      }
      
      @scala.inline
      implicit class UserDataMutableBuilder[Self <: UserData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
