package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.ActivitiesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.ChannelsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.CustomerUsageReportsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.EntityUsageReportsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection.UserUsageReportCollection
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Schema.Activities
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Schema.Channel
import typings.googleAppsScript.GoogleAppsScript.AdminReports.Schema.UsageReports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminReports extends StObject {
  
  var Activities: js.UndefOr[ActivitiesCollection] = js.undefined
  
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  
  var CustomerUsageReports: js.UndefOr[CustomerUsageReportsCollection] = js.undefined
  
  var EntityUsageReports: js.UndefOr[EntityUsageReportsCollection] = js.undefined
  
  var UserUsageReport: js.UndefOr[UserUsageReportCollection] = js.undefined
  
  // Create a new instance of Channel
  def newChannel(): Channel
}
object AdminReports {
  
  inline def apply(newChannel: () => Channel): AdminReports = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel))
    __obj.asInstanceOf[AdminReports]
  }
  
  object Collection {
    
    @js.native
    trait ActivitiesCollection extends StObject {
      
      // Retrieves a list of activities for a specific customer and application.
      def list(userKey: String, applicationName: String): Activities = js.native
      // Retrieves a list of activities for a specific customer and application.
      def list(userKey: String, applicationName: String, optionalArgs: js.Object): Activities = js.native
      
      // Push changes to activities
      def watch(resource: Channel, userKey: String, applicationName: String): Channel = js.native
      // Push changes to activities
      def watch(resource: Channel, userKey: String, applicationName: String, optionalArgs: js.Object): Channel = js.native
    }
    
    trait ChannelsCollection extends StObject {
      
      // Stop watching resources through this channel
      def stop(resource: Channel): Unit
    }
    object ChannelsCollection {
      
      inline def apply(stop: Channel => Unit): ChannelsCollection = {
        val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
        __obj.asInstanceOf[ChannelsCollection]
      }
      
      extension [Self <: ChannelsCollection](x: Self) {
        
        inline def setStop(value: Channel => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait CustomerUsageReportsCollection extends StObject {
      
      // Retrieves a report which is a collection of properties / statistics for a specific customer.
      def get(date: String): UsageReports = js.native
      // Retrieves a report which is a collection of properties / statistics for a specific customer.
      def get(date: String, optionalArgs: js.Object): UsageReports = js.native
    }
    
    @js.native
    trait EntityUsageReportsCollection extends StObject {
      
      // Retrieves a report which is a collection of properties / statistics for a set of objects.
      def get(entityType: String, entityKey: String, date: String): UsageReports = js.native
      // Retrieves a report which is a collection of properties / statistics for a set of objects.
      def get(entityType: String, entityKey: String, date: String, optionalArgs: js.Object): UsageReports = js.native
    }
    
    @js.native
    trait UserUsageReportCollection extends StObject {
      
      // Retrieves a report which is a collection of properties / statistics for a set of users.
      def get(userKey: String, date: String): UsageReports = js.native
      // Retrieves a report which is a collection of properties / statistics for a set of users.
      def get(userKey: String, date: String, optionalArgs: js.Object): UsageReports = js.native
    }
  }
  
  extension [Self <: AdminReports](x: Self) {
    
    inline def setActivities(value: ActivitiesCollection): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    inline def setChannels(value: ChannelsCollection): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setCustomerUsageReports(value: CustomerUsageReportsCollection): Self = StObject.set(x, "CustomerUsageReports", value.asInstanceOf[js.Any])
    
    inline def setCustomerUsageReportsUndefined: Self = StObject.set(x, "CustomerUsageReports", js.undefined)
    
    inline def setEntityUsageReports(value: EntityUsageReportsCollection): Self = StObject.set(x, "EntityUsageReports", value.asInstanceOf[js.Any])
    
    inline def setEntityUsageReportsUndefined: Self = StObject.set(x, "EntityUsageReports", js.undefined)
    
    inline def setNewChannel(value: () => Channel): Self = StObject.set(x, "newChannel", js.Any.fromFunction0(value))
    
    inline def setUserUsageReport(value: UserUsageReportCollection): Self = StObject.set(x, "UserUsageReport", value.asInstanceOf[js.Any])
    
    inline def setUserUsageReportUndefined: Self = StObject.set(x, "UserUsageReport", js.undefined)
  }
  
  object Schema {
    
    trait Activities extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Activity]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object Activities {
      
      inline def apply(): Activities = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Activities]
      }
      
      extension [Self <: Activities](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[Activity]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Activity*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait Activity extends StObject {
      
      var actor: js.UndefOr[ActivityActor] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var events: js.UndefOr[js.Array[ActivityEvents]] = js.undefined
      
      var id: js.UndefOr[ActivityId] = js.undefined
      
      var ipAddress: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var ownerDomain: js.UndefOr[String] = js.undefined
    }
    object Activity {
      
      inline def apply(): Activity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Activity]
      }
      
      extension [Self <: Activity](x: Self) {
        
        inline def setActor(value: ActivityActor): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
        
        inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setEvents(value: js.Array[ActivityEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
        
        inline def setEventsVarargs(value: ActivityEvents*): Self = StObject.set(x, "events", js.Array(value*))
        
        inline def setId(value: ActivityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
        
        inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setOwnerDomain(value: String): Self = StObject.set(x, "ownerDomain", value.asInstanceOf[js.Any])
        
        inline def setOwnerDomainUndefined: Self = StObject.set(x, "ownerDomain", js.undefined)
      }
    }
    
    trait ActivityActor extends StObject {
      
      var callerType: js.UndefOr[String] = js.undefined
      
      var email: js.UndefOr[String] = js.undefined
      
      var key: js.UndefOr[String] = js.undefined
      
      var profileId: js.UndefOr[String] = js.undefined
    }
    object ActivityActor {
      
      inline def apply(): ActivityActor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityActor]
      }
      
      extension [Self <: ActivityActor](x: Self) {
        
        inline def setCallerType(value: String): Self = StObject.set(x, "callerType", value.asInstanceOf[js.Any])
        
        inline def setCallerTypeUndefined: Self = StObject.set(x, "callerType", js.undefined)
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
        
        inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
      }
    }
    
    trait ActivityEvents extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var parameters: js.UndefOr[js.Array[ActivityEventsParameters]] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object ActivityEvents {
      
      inline def apply(): ActivityEvents = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityEvents]
      }
      
      extension [Self <: ActivityEvents](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setParameters(value: js.Array[ActivityEventsParameters]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        inline def setParametersVarargs(value: ActivityEventsParameters*): Self = StObject.set(x, "parameters", js.Array(value*))
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait ActivityEventsParameters extends StObject {
      
      var boolValue: js.UndefOr[Boolean] = js.undefined
      
      var intValue: js.UndefOr[String] = js.undefined
      
      var multiIntValue: js.UndefOr[js.Array[String]] = js.undefined
      
      var multiValue: js.UndefOr[js.Array[String]] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object ActivityEventsParameters {
      
      inline def apply(): ActivityEventsParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityEventsParameters]
      }
      
      extension [Self <: ActivityEventsParameters](x: Self) {
        
        inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
        
        inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
        
        inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
        
        inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
        
        inline def setMultiIntValue(value: js.Array[String]): Self = StObject.set(x, "multiIntValue", value.asInstanceOf[js.Any])
        
        inline def setMultiIntValueUndefined: Self = StObject.set(x, "multiIntValue", js.undefined)
        
        inline def setMultiIntValueVarargs(value: String*): Self = StObject.set(x, "multiIntValue", js.Array(value*))
        
        inline def setMultiValue(value: js.Array[String]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
        
        inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
        
        inline def setMultiValueVarargs(value: String*): Self = StObject.set(x, "multiValue", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait ActivityId extends StObject {
      
      var applicationName: js.UndefOr[String] = js.undefined
      
      var customerId: js.UndefOr[String] = js.undefined
      
      var time: js.UndefOr[String] = js.undefined
      
      var uniqueQualifier: js.UndefOr[String] = js.undefined
    }
    object ActivityId {
      
      inline def apply(): ActivityId = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityId]
      }
      
      extension [Self <: ActivityId](x: Self) {
        
        inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
        
        inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
        
        inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
        
        inline def setUniqueQualifier(value: String): Self = StObject.set(x, "uniqueQualifier", value.asInstanceOf[js.Any])
        
        inline def setUniqueQualifierUndefined: Self = StObject.set(x, "uniqueQualifier", js.undefined)
      }
    }
    
    trait Channel extends StObject {
      
      var address: js.UndefOr[String] = js.undefined
      
      var expiration: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var params: js.UndefOr[js.Object] = js.undefined
      
      var payload: js.UndefOr[Boolean] = js.undefined
      
      var resourceId: js.UndefOr[String] = js.undefined
      
      var resourceUri: js.UndefOr[String] = js.undefined
      
      var token: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Channel {
      
      inline def apply(): Channel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Channel]
      }
      
      extension [Self <: Channel](x: Self) {
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
        
        inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
        
        inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
        
        inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait UsageReport extends StObject {
      
      var date: js.UndefOr[String] = js.undefined
      
      var entity: js.UndefOr[UsageReportEntity] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var parameters: js.UndefOr[js.Array[UsageReportParameters]] = js.undefined
    }
    object UsageReport {
      
      inline def apply(): UsageReport = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReport]
      }
      
      extension [Self <: UsageReport](x: Self) {
        
        inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        inline def setEntity(value: UsageReportEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
        
        inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setParameters(value: js.Array[UsageReportParameters]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        inline def setParametersVarargs(value: UsageReportParameters*): Self = StObject.set(x, "parameters", js.Array(value*))
      }
    }
    
    trait UsageReportEntity extends StObject {
      
      var customerId: js.UndefOr[String] = js.undefined
      
      var entityId: js.UndefOr[String] = js.undefined
      
      var profileId: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var userEmail: js.UndefOr[String] = js.undefined
    }
    object UsageReportEntity {
      
      inline def apply(): UsageReportEntity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReportEntity]
      }
      
      extension [Self <: UsageReportEntity](x: Self) {
        
        inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
        
        inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
        
        inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
        
        inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
        
        inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
      }
    }
    
    trait UsageReportParameters extends StObject {
      
      var boolValue: js.UndefOr[Boolean] = js.undefined
      
      var datetimeValue: js.UndefOr[String] = js.undefined
      
      var intValue: js.UndefOr[String] = js.undefined
      
      var msgValue: js.UndefOr[js.Array[js.Object]] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var stringValue: js.UndefOr[String] = js.undefined
    }
    object UsageReportParameters {
      
      inline def apply(): UsageReportParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReportParameters]
      }
      
      extension [Self <: UsageReportParameters](x: Self) {
        
        inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
        
        inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
        
        inline def setDatetimeValue(value: String): Self = StObject.set(x, "datetimeValue", value.asInstanceOf[js.Any])
        
        inline def setDatetimeValueUndefined: Self = StObject.set(x, "datetimeValue", js.undefined)
        
        inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
        
        inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
        
        inline def setMsgValue(value: js.Array[js.Object]): Self = StObject.set(x, "msgValue", value.asInstanceOf[js.Any])
        
        inline def setMsgValueUndefined: Self = StObject.set(x, "msgValue", js.undefined)
        
        inline def setMsgValueVarargs(value: js.Object*): Self = StObject.set(x, "msgValue", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
        
        inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
      }
    }
    
    trait UsageReports extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var usageReports: js.UndefOr[js.Array[UsageReport]] = js.undefined
      
      var warnings: js.UndefOr[js.Array[UsageReportsWarnings]] = js.undefined
    }
    object UsageReports {
      
      inline def apply(): UsageReports = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReports]
      }
      
      extension [Self <: UsageReports](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setUsageReports(value: js.Array[UsageReport]): Self = StObject.set(x, "usageReports", value.asInstanceOf[js.Any])
        
        inline def setUsageReportsUndefined: Self = StObject.set(x, "usageReports", js.undefined)
        
        inline def setUsageReportsVarargs(value: UsageReport*): Self = StObject.set(x, "usageReports", js.Array(value*))
        
        inline def setWarnings(value: js.Array[UsageReportsWarnings]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
        
        inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
        
        inline def setWarningsVarargs(value: UsageReportsWarnings*): Self = StObject.set(x, "warnings", js.Array(value*))
      }
    }
    
    trait UsageReportsWarnings extends StObject {
      
      var code: js.UndefOr[String] = js.undefined
      
      var data: js.UndefOr[js.Array[UsageReportsWarningsData]] = js.undefined
      
      var message: js.UndefOr[String] = js.undefined
    }
    object UsageReportsWarnings {
      
      inline def apply(): UsageReportsWarnings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReportsWarnings]
      }
      
      extension [Self <: UsageReportsWarnings](x: Self) {
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setData(value: js.Array[UsageReportsWarningsData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDataVarargs(value: UsageReportsWarningsData*): Self = StObject.set(x, "data", js.Array(value*))
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    trait UsageReportsWarningsData extends StObject {
      
      var key: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object UsageReportsWarningsData {
      
      inline def apply(): UsageReportsWarningsData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReportsWarningsData]
      }
      
      extension [Self <: UsageReportsWarningsData](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
