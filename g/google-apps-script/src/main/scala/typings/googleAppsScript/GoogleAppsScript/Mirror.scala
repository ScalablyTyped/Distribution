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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mirror extends StObject {
  
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
  
  inline def apply(
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
    
    trait AccountsCollection extends StObject {
      
      // Inserts a new account for a user
      def insert(resource: Account, userToken: String, accountType: String, accountName: String): Account
    }
    object AccountsCollection {
      
      inline def apply(insert: (Account, String, String, String) => Account): AccountsCollection = {
        val __obj = js.Dynamic.literal(insert = js.Any.fromFunction4(insert))
        __obj.asInstanceOf[AccountsCollection]
      }
      
      extension [Self <: AccountsCollection](x: Self) {
        
        inline def setInsert(value: (Account, String, String, String) => Account): Self = StObject.set(x, "insert", js.Any.fromFunction4(value))
      }
    }
    
    trait ContactsCollection extends StObject {
      
      // Gets a single contact by ID.
      def get(id: String): Contact
      
      // Inserts a new contact.
      def insert(resource: Contact): Contact
      
      // Retrieves a list of contacts for the authenticated user.
      def list(): ContactsListResponse
      
      // Updates a contact in place. This method supports patch semantics.
      def patch(resource: Contact, id: String): Contact
      
      // Deletes a contact.
      def remove(id: String): Unit
      
      // Updates a contact in place.
      def update(resource: Contact, id: String): Contact
    }
    object ContactsCollection {
      
      inline def apply(
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
      
      extension [Self <: ContactsCollection](x: Self) {
        
        inline def setGet(value: String => Contact): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setInsert(value: Contact => Contact): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
        
        inline def setList(value: () => ContactsListResponse): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
        
        inline def setPatch(value: (Contact, String) => Contact): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
        
        inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        inline def setUpdate(value: (Contact, String) => Contact): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      }
    }
    
    trait LocationsCollection extends StObject {
      
      // Gets a single location by ID.
      def get(id: String): Location
      
      // Retrieves a list of locations for the user.
      def list(): LocationsListResponse
    }
    object LocationsCollection {
      
      inline def apply(get: String => Location, list: () => LocationsListResponse): LocationsCollection = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
        __obj.asInstanceOf[LocationsCollection]
      }
      
      extension [Self <: LocationsCollection](x: Self) {
        
        inline def setGet(value: String => Location): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setList(value: () => LocationsListResponse): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
      }
    }
    
    trait SettingsCollection extends StObject {
      
      // Gets a single setting by ID.
      def get(id: String): Setting
    }
    object SettingsCollection {
      
      inline def apply(get: String => Setting): SettingsCollection = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
        __obj.asInstanceOf[SettingsCollection]
      }
      
      extension [Self <: SettingsCollection](x: Self) {
        
        inline def setGet(value: String => Setting): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      }
    }
    
    trait SubscriptionsCollection extends StObject {
      
      // Creates a new subscription.
      def insert(resource: Subscription): Subscription
      
      // Retrieves a list of subscriptions for the authenticated user and service.
      def list(): SubscriptionsListResponse
      
      // Deletes a subscription.
      def remove(id: String): Unit
      
      // Updates an existing subscription in place.
      def update(resource: Subscription, id: String): Subscription
    }
    object SubscriptionsCollection {
      
      inline def apply(
        insert: Subscription => Subscription,
        list: () => SubscriptionsListResponse,
        remove: String => Unit,
        update: (Subscription, String) => Subscription
      ): SubscriptionsCollection = {
        val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
        __obj.asInstanceOf[SubscriptionsCollection]
      }
      
      extension [Self <: SubscriptionsCollection](x: Self) {
        
        inline def setInsert(value: Subscription => Subscription): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
        
        inline def setList(value: () => SubscriptionsListResponse): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
        
        inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        inline def setUpdate(value: (Subscription, String) => Subscription): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
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
        def insert(itemId: String, mediaData: Any): Attachment = js.native
        
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
      def insert(resource: TimelineItem, mediaData: Any): TimelineItem = js.native
      
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
      def update(resource: TimelineItem, id: String, mediaData: Any): TimelineItem = js.native
    }
  }
  
  extension [Self <: Mirror](x: Self) {
    
    inline def setAccounts(value: AccountsCollection): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setContacts(value: ContactsCollection): Self = StObject.set(x, "Contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "Contacts", js.undefined)
    
    inline def setLocations(value: LocationsCollection): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "Locations", js.undefined)
    
    inline def setNewAccount(value: () => Account): Self = StObject.set(x, "newAccount", js.Any.fromFunction0(value))
    
    inline def setNewAttachment(value: () => Attachment): Self = StObject.set(x, "newAttachment", js.Any.fromFunction0(value))
    
    inline def setNewAuthToken(value: () => AuthToken): Self = StObject.set(x, "newAuthToken", js.Any.fromFunction0(value))
    
    inline def setNewCommand(value: () => Command): Self = StObject.set(x, "newCommand", js.Any.fromFunction0(value))
    
    inline def setNewContact(value: () => Contact): Self = StObject.set(x, "newContact", js.Any.fromFunction0(value))
    
    inline def setNewLocation(value: () => Location): Self = StObject.set(x, "newLocation", js.Any.fromFunction0(value))
    
    inline def setNewMenuItem(value: () => MenuItem): Self = StObject.set(x, "newMenuItem", js.Any.fromFunction0(value))
    
    inline def setNewMenuValue(value: () => MenuValue): Self = StObject.set(x, "newMenuValue", js.Any.fromFunction0(value))
    
    inline def setNewNotification(value: () => Notification): Self = StObject.set(x, "newNotification", js.Any.fromFunction0(value))
    
    inline def setNewNotificationConfig(value: () => NotificationConfig): Self = StObject.set(x, "newNotificationConfig", js.Any.fromFunction0(value))
    
    inline def setNewSubscription(value: () => Subscription): Self = StObject.set(x, "newSubscription", js.Any.fromFunction0(value))
    
    inline def setNewTimelineItem(value: () => TimelineItem): Self = StObject.set(x, "newTimelineItem", js.Any.fromFunction0(value))
    
    inline def setNewUserAction(value: () => UserAction): Self = StObject.set(x, "newUserAction", js.Any.fromFunction0(value))
    
    inline def setNewUserData(value: () => UserData): Self = StObject.set(x, "newUserData", js.Any.fromFunction0(value))
    
    inline def setSettings(value: SettingsCollection): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setSubscriptions(value: SubscriptionsCollection): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    inline def setTimeline(value: TimelineCollection): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
  
  object Schema {
    
    trait Account extends StObject {
      
      var authTokens: js.UndefOr[js.Array[AuthToken]] = js.undefined
      
      var features: js.UndefOr[js.Array[String]] = js.undefined
      
      var password: js.UndefOr[String] = js.undefined
      
      var userData: js.UndefOr[js.Array[UserData]] = js.undefined
    }
    object Account {
      
      inline def apply(): Account = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Account]
      }
      
      extension [Self <: Account](x: Self) {
        
        inline def setAuthTokens(value: js.Array[AuthToken]): Self = StObject.set(x, "authTokens", value.asInstanceOf[js.Any])
        
        inline def setAuthTokensUndefined: Self = StObject.set(x, "authTokens", js.undefined)
        
        inline def setAuthTokensVarargs(value: AuthToken*): Self = StObject.set(x, "authTokens", js.Array(value*))
        
        inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
        
        inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        inline def setUserData(value: js.Array[UserData]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
        
        inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
        
        inline def setUserDataVarargs(value: UserData*): Self = StObject.set(x, "userData", js.Array(value*))
      }
    }
    
    trait Attachment extends StObject {
      
      var contentType: js.UndefOr[String] = js.undefined
      
      var contentUrl: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var isProcessingContent: js.UndefOr[Boolean] = js.undefined
    }
    object Attachment {
      
      inline def apply(): Attachment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Attachment]
      }
      
      extension [Self <: Attachment](x: Self) {
        
        inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
        
        inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
        
        inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIsProcessingContent(value: Boolean): Self = StObject.set(x, "isProcessingContent", value.asInstanceOf[js.Any])
        
        inline def setIsProcessingContentUndefined: Self = StObject.set(x, "isProcessingContent", js.undefined)
      }
    }
    
    trait AttachmentsListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[Attachment]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object AttachmentsListResponse {
      
      inline def apply(): AttachmentsListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AttachmentsListResponse]
      }
      
      extension [Self <: AttachmentsListResponse](x: Self) {
        
        inline def setItems(value: js.Array[Attachment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Attachment*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait AuthToken extends StObject {
      
      var authToken: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object AuthToken {
      
      inline def apply(): AuthToken = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AuthToken]
      }
      
      extension [Self <: AuthToken](x: Self) {
        
        inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
        
        inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Command extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Command {
      
      inline def apply(): Command = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Command]
      }
      
      extension [Self <: Command](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Contact extends StObject {
      
      var acceptCommands: js.UndefOr[js.Array[Command]] = js.undefined
      
      var acceptTypes: js.UndefOr[js.Array[String]] = js.undefined
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var imageUrls: js.UndefOr[js.Array[String]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var phoneNumber: js.UndefOr[String] = js.undefined
      
      var priority: js.UndefOr[Double] = js.undefined
      
      var sharingFeatures: js.UndefOr[js.Array[String]] = js.undefined
      
      var source: js.UndefOr[String] = js.undefined
      
      var speakableName: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Contact {
      
      inline def apply(): Contact = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Contact]
      }
      
      extension [Self <: Contact](x: Self) {
        
        inline def setAcceptCommands(value: js.Array[Command]): Self = StObject.set(x, "acceptCommands", value.asInstanceOf[js.Any])
        
        inline def setAcceptCommandsUndefined: Self = StObject.set(x, "acceptCommands", js.undefined)
        
        inline def setAcceptCommandsVarargs(value: Command*): Self = StObject.set(x, "acceptCommands", js.Array(value*))
        
        inline def setAcceptTypes(value: js.Array[String]): Self = StObject.set(x, "acceptTypes", value.asInstanceOf[js.Any])
        
        inline def setAcceptTypesUndefined: Self = StObject.set(x, "acceptTypes", js.undefined)
        
        inline def setAcceptTypesVarargs(value: String*): Self = StObject.set(x, "acceptTypes", js.Array(value*))
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setImageUrls(value: js.Array[String]): Self = StObject.set(x, "imageUrls", value.asInstanceOf[js.Any])
        
        inline def setImageUrlsUndefined: Self = StObject.set(x, "imageUrls", js.undefined)
        
        inline def setImageUrlsVarargs(value: String*): Self = StObject.set(x, "imageUrls", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
        
        inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
        
        inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
        
        inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
        
        inline def setSharingFeatures(value: js.Array[String]): Self = StObject.set(x, "sharingFeatures", value.asInstanceOf[js.Any])
        
        inline def setSharingFeaturesUndefined: Self = StObject.set(x, "sharingFeatures", js.undefined)
        
        inline def setSharingFeaturesVarargs(value: String*): Self = StObject.set(x, "sharingFeatures", js.Array(value*))
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setSpeakableName(value: String): Self = StObject.set(x, "speakableName", value.asInstanceOf[js.Any])
        
        inline def setSpeakableNameUndefined: Self = StObject.set(x, "speakableName", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait ContactsListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[Contact]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object ContactsListResponse {
      
      inline def apply(): ContactsListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContactsListResponse]
      }
      
      extension [Self <: ContactsListResponse](x: Self) {
        
        inline def setItems(value: js.Array[Contact]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Contact*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait Location extends StObject {
      
      var accuracy: js.UndefOr[Double] = js.undefined
      
      var address: js.UndefOr[String] = js.undefined
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var latitude: js.UndefOr[Double] = js.undefined
      
      var longitude: js.UndefOr[Double] = js.undefined
      
      var timestamp: js.UndefOr[String] = js.undefined
    }
    object Location {
      
      inline def apply(): Location = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Location]
      }
      
      extension [Self <: Location](x: Self) {
        
        inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
        
        inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
        
        inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
        
        inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
        
        inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
        
        inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      }
    }
    
    trait LocationsListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[Location]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object LocationsListResponse {
      
      inline def apply(): LocationsListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocationsListResponse]
      }
      
      extension [Self <: LocationsListResponse](x: Self) {
        
        inline def setItems(value: js.Array[Location]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Location*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait MenuItem extends StObject {
      
      var action: js.UndefOr[String] = js.undefined
      
      var contextual_command: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var payload: js.UndefOr[String] = js.undefined
      
      var removeWhenSelected: js.UndefOr[Boolean] = js.undefined
      
      var values: js.UndefOr[js.Array[MenuValue]] = js.undefined
    }
    object MenuItem {
      
      inline def apply(): MenuItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MenuItem]
      }
      
      extension [Self <: MenuItem](x: Self) {
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setContextual_command(value: String): Self = StObject.set(x, "contextual_command", value.asInstanceOf[js.Any])
        
        inline def setContextual_commandUndefined: Self = StObject.set(x, "contextual_command", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        inline def setRemoveWhenSelected(value: Boolean): Self = StObject.set(x, "removeWhenSelected", value.asInstanceOf[js.Any])
        
        inline def setRemoveWhenSelectedUndefined: Self = StObject.set(x, "removeWhenSelected", js.undefined)
        
        inline def setValues(value: js.Array[MenuValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        inline def setValuesVarargs(value: MenuValue*): Self = StObject.set(x, "values", js.Array(value*))
      }
    }
    
    trait MenuValue extends StObject {
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var iconUrl: js.UndefOr[String] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
    }
    object MenuValue {
      
      inline def apply(): MenuValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MenuValue]
      }
      
      extension [Self <: MenuValue](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
        
        inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
    
    trait Notification extends StObject {
      
      var collection: js.UndefOr[String] = js.undefined
      
      var itemId: js.UndefOr[String] = js.undefined
      
      var operation: js.UndefOr[String] = js.undefined
      
      var userActions: js.UndefOr[js.Array[UserAction]] = js.undefined
      
      var userToken: js.UndefOr[String] = js.undefined
      
      var verifyToken: js.UndefOr[String] = js.undefined
    }
    object Notification {
      
      inline def apply(): Notification = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Notification]
      }
      
      extension [Self <: Notification](x: Self) {
        
        inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
        
        inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
        
        inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
        
        inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
        
        inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
        
        inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
        
        inline def setUserActions(value: js.Array[UserAction]): Self = StObject.set(x, "userActions", value.asInstanceOf[js.Any])
        
        inline def setUserActionsUndefined: Self = StObject.set(x, "userActions", js.undefined)
        
        inline def setUserActionsVarargs(value: UserAction*): Self = StObject.set(x, "userActions", js.Array(value*))
        
        inline def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
        
        inline def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
        
        inline def setVerifyToken(value: String): Self = StObject.set(x, "verifyToken", value.asInstanceOf[js.Any])
        
        inline def setVerifyTokenUndefined: Self = StObject.set(x, "verifyToken", js.undefined)
      }
    }
    
    trait NotificationConfig extends StObject {
      
      var deliveryTime: js.UndefOr[String] = js.undefined
      
      var level: js.UndefOr[String] = js.undefined
    }
    object NotificationConfig {
      
      inline def apply(): NotificationConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NotificationConfig]
      }
      
      extension [Self <: NotificationConfig](x: Self) {
        
        inline def setDeliveryTime(value: String): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
        
        inline def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
        
        inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      }
    }
    
    trait Setting extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Setting {
      
      inline def apply(): Setting = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Setting]
      }
      
      extension [Self <: Setting](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Subscription extends StObject {
      
      var callbackUrl: js.UndefOr[String] = js.undefined
      
      var collection: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var notification: js.UndefOr[Notification] = js.undefined
      
      var operation: js.UndefOr[js.Array[String]] = js.undefined
      
      var updated: js.UndefOr[String] = js.undefined
      
      var userToken: js.UndefOr[String] = js.undefined
      
      var verifyToken: js.UndefOr[String] = js.undefined
    }
    object Subscription {
      
      inline def apply(): Subscription = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Subscription]
      }
      
      extension [Self <: Subscription](x: Self) {
        
        inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
        
        inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
        
        inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
        
        inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
        
        inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
        
        inline def setOperation(value: js.Array[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
        
        inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
        
        inline def setOperationVarargs(value: String*): Self = StObject.set(x, "operation", js.Array(value*))
        
        inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
        
        inline def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
        
        inline def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
        
        inline def setVerifyToken(value: String): Self = StObject.set(x, "verifyToken", value.asInstanceOf[js.Any])
        
        inline def setVerifyTokenUndefined: Self = StObject.set(x, "verifyToken", js.undefined)
      }
    }
    
    trait SubscriptionsListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[Subscription]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object SubscriptionsListResponse {
      
      inline def apply(): SubscriptionsListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubscriptionsListResponse]
      }
      
      extension [Self <: SubscriptionsListResponse](x: Self) {
        
        inline def setItems(value: js.Array[Subscription]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Subscription*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait TimelineItem extends StObject {
      
      var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
      
      var bundleId: js.UndefOr[String] = js.undefined
      
      var canonicalUrl: js.UndefOr[String] = js.undefined
      
      var created: js.UndefOr[String] = js.undefined
      
      var creator: js.UndefOr[Contact] = js.undefined
      
      var displayTime: js.UndefOr[String] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var html: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var inReplyTo: js.UndefOr[String] = js.undefined
      
      var isBundleCover: js.UndefOr[Boolean] = js.undefined
      
      var isDeleted: js.UndefOr[Boolean] = js.undefined
      
      var isPinned: js.UndefOr[Boolean] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[Location] = js.undefined
      
      var menuItems: js.UndefOr[js.Array[MenuItem]] = js.undefined
      
      var notification: js.UndefOr[NotificationConfig] = js.undefined
      
      var pinScore: js.UndefOr[Double] = js.undefined
      
      var recipients: js.UndefOr[js.Array[Contact]] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var sourceItemId: js.UndefOr[String] = js.undefined
      
      var speakableText: js.UndefOr[String] = js.undefined
      
      var speakableType: js.UndefOr[String] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var updated: js.UndefOr[String] = js.undefined
    }
    object TimelineItem {
      
      inline def apply(): TimelineItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimelineItem]
      }
      
      extension [Self <: TimelineItem](x: Self) {
        
        inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
        
        inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
        
        inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
        
        inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
        
        inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
        
        inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
        
        inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
        
        inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
        
        inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
        
        inline def setCreator(value: Contact): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
        
        inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
        
        inline def setDisplayTime(value: String): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
        
        inline def setDisplayTimeUndefined: Self = StObject.set(x, "displayTime", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
        
        inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
        
        inline def setIsBundleCover(value: Boolean): Self = StObject.set(x, "isBundleCover", value.asInstanceOf[js.Any])
        
        inline def setIsBundleCoverUndefined: Self = StObject.set(x, "isBundleCover", js.undefined)
        
        inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
        
        inline def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
        
        inline def setIsPinned(value: Boolean): Self = StObject.set(x, "isPinned", value.asInstanceOf[js.Any])
        
        inline def setIsPinnedUndefined: Self = StObject.set(x, "isPinned", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setMenuItems(value: js.Array[MenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
        
        inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
        
        inline def setMenuItemsVarargs(value: MenuItem*): Self = StObject.set(x, "menuItems", js.Array(value*))
        
        inline def setNotification(value: NotificationConfig): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
        
        inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
        
        inline def setPinScore(value: Double): Self = StObject.set(x, "pinScore", value.asInstanceOf[js.Any])
        
        inline def setPinScoreUndefined: Self = StObject.set(x, "pinScore", js.undefined)
        
        inline def setRecipients(value: js.Array[Contact]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
        
        inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
        
        inline def setRecipientsVarargs(value: Contact*): Self = StObject.set(x, "recipients", js.Array(value*))
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setSourceItemId(value: String): Self = StObject.set(x, "sourceItemId", value.asInstanceOf[js.Any])
        
        inline def setSourceItemIdUndefined: Self = StObject.set(x, "sourceItemId", js.undefined)
        
        inline def setSpeakableText(value: String): Self = StObject.set(x, "speakableText", value.asInstanceOf[js.Any])
        
        inline def setSpeakableTextUndefined: Self = StObject.set(x, "speakableText", js.undefined)
        
        inline def setSpeakableType(value: String): Self = StObject.set(x, "speakableType", value.asInstanceOf[js.Any])
        
        inline def setSpeakableTypeUndefined: Self = StObject.set(x, "speakableType", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    trait TimelineListResponse extends StObject {
      
      var items: js.UndefOr[js.Array[TimelineItem]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object TimelineListResponse {
      
      inline def apply(): TimelineListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimelineListResponse]
      }
      
      extension [Self <: TimelineListResponse](x: Self) {
        
        inline def setItems(value: js.Array[TimelineItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: TimelineItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait UserAction extends StObject {
      
      var payload: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object UserAction {
      
      inline def apply(): UserAction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserAction]
      }
      
      extension [Self <: UserAction](x: Self) {
        
        inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait UserData extends StObject {
      
      var key: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object UserData {
      
      inline def apply(): UserData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserData]
      }
      
      extension [Self <: UserData](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
