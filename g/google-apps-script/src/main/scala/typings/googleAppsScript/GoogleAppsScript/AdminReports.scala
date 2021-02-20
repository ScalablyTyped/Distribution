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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminReports extends StObject {
  
  var Activities: js.UndefOr[ActivitiesCollection] = js.native
  
  var Channels: js.UndefOr[ChannelsCollection] = js.native
  
  var CustomerUsageReports: js.UndefOr[CustomerUsageReportsCollection] = js.native
  
  var EntityUsageReports: js.UndefOr[EntityUsageReportsCollection] = js.native
  
  var UserUsageReport: js.UndefOr[UserUsageReportCollection] = js.native
  
  // Create a new instance of Channel
  def newChannel(): Channel = js.native
}
object AdminReports {
  
  @scala.inline
  def apply(newChannel: () => Channel): AdminReports = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel))
    __obj.asInstanceOf[AdminReports]
  }
  
  @scala.inline
  implicit class AdminReportsMutableBuilder[Self <: AdminReports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: ActivitiesCollection): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    @scala.inline
    def setChannels(value: ChannelsCollection): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setCustomerUsageReports(value: CustomerUsageReportsCollection): Self = StObject.set(x, "CustomerUsageReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUsageReportsUndefined: Self = StObject.set(x, "CustomerUsageReports", js.undefined)
    
    @scala.inline
    def setEntityUsageReports(value: EntityUsageReportsCollection): Self = StObject.set(x, "EntityUsageReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUsageReportsUndefined: Self = StObject.set(x, "EntityUsageReports", js.undefined)
    
    @scala.inline
    def setNewChannel(value: () => Channel): Self = StObject.set(x, "newChannel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserUsageReport(value: UserUsageReportCollection): Self = StObject.set(x, "UserUsageReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUsageReportUndefined: Self = StObject.set(x, "UserUsageReport", js.undefined)
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
    
    @js.native
    trait ChannelsCollection extends StObject {
      
      // Stop watching resources through this channel
      def stop(resource: Channel): Unit = js.native
    }
    object ChannelsCollection {
      
      @scala.inline
      def apply(stop: Channel => Unit): ChannelsCollection = {
        val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
        __obj.asInstanceOf[ChannelsCollection]
      }
      
      @scala.inline
      implicit class ChannelsCollectionMutableBuilder[Self <: ChannelsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStop(value: Channel => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
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
  
  object Schema {
    
    @js.native
    trait Activities extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[Activity]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object Activities {
      
      @scala.inline
      def apply(): Activities = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Activities]
      }
      
      @scala.inline
      implicit class ActivitiesMutableBuilder[Self <: Activities] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[Activity]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Activity*): Self = StObject.set(x, "items", js.Array(value :_*))
        
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
    trait Activity extends StObject {
      
      var actor: js.UndefOr[ActivityActor] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var events: js.UndefOr[js.Array[ActivityEvents]] = js.native
      
      var id: js.UndefOr[ActivityId] = js.native
      
      var ipAddress: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var ownerDomain: js.UndefOr[String] = js.native
    }
    object Activity {
      
      @scala.inline
      def apply(): Activity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Activity]
      }
      
      @scala.inline
      implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActor(value: ActivityActor): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setEvents(value: js.Array[ActivityEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
        
        @scala.inline
        def setEventsVarargs(value: ActivityEvents*): Self = StObject.set(x, "events", js.Array(value :_*))
        
        @scala.inline
        def setId(value: ActivityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setOwnerDomain(value: String): Self = StObject.set(x, "ownerDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerDomainUndefined: Self = StObject.set(x, "ownerDomain", js.undefined)
      }
    }
    
    @js.native
    trait ActivityActor extends StObject {
      
      var callerType: js.UndefOr[String] = js.native
      
      var email: js.UndefOr[String] = js.native
      
      var key: js.UndefOr[String] = js.native
      
      var profileId: js.UndefOr[String] = js.native
    }
    object ActivityActor {
      
      @scala.inline
      def apply(): ActivityActor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityActor]
      }
      
      @scala.inline
      implicit class ActivityActorMutableBuilder[Self <: ActivityActor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCallerType(value: String): Self = StObject.set(x, "callerType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallerTypeUndefined: Self = StObject.set(x, "callerType", js.undefined)
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
      }
    }
    
    @js.native
    trait ActivityEvents extends StObject {
      
      var name: js.UndefOr[String] = js.native
      
      var parameters: js.UndefOr[js.Array[ActivityEventsParameters]] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object ActivityEvents {
      
      @scala.inline
      def apply(): ActivityEvents = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityEvents]
      }
      
      @scala.inline
      implicit class ActivityEventsMutableBuilder[Self <: ActivityEvents] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setParameters(value: js.Array[ActivityEventsParameters]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        @scala.inline
        def setParametersVarargs(value: ActivityEventsParameters*): Self = StObject.set(x, "parameters", js.Array(value :_*))
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait ActivityEventsParameters extends StObject {
      
      var boolValue: js.UndefOr[Boolean] = js.native
      
      var intValue: js.UndefOr[String] = js.native
      
      var multiIntValue: js.UndefOr[js.Array[String]] = js.native
      
      var multiValue: js.UndefOr[js.Array[String]] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object ActivityEventsParameters {
      
      @scala.inline
      def apply(): ActivityEventsParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityEventsParameters]
      }
      
      @scala.inline
      implicit class ActivityEventsParametersMutableBuilder[Self <: ActivityEventsParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
        
        @scala.inline
        def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
        
        @scala.inline
        def setMultiIntValue(value: js.Array[String]): Self = StObject.set(x, "multiIntValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultiIntValueUndefined: Self = StObject.set(x, "multiIntValue", js.undefined)
        
        @scala.inline
        def setMultiIntValueVarargs(value: String*): Self = StObject.set(x, "multiIntValue", js.Array(value :_*))
        
        @scala.inline
        def setMultiValue(value: js.Array[String]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
        
        @scala.inline
        def setMultiValueVarargs(value: String*): Self = StObject.set(x, "multiValue", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait ActivityId extends StObject {
      
      var applicationName: js.UndefOr[String] = js.native
      
      var customerId: js.UndefOr[String] = js.native
      
      var time: js.UndefOr[String] = js.native
      
      var uniqueQualifier: js.UndefOr[String] = js.native
    }
    object ActivityId {
      
      @scala.inline
      def apply(): ActivityId = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActivityId]
      }
      
      @scala.inline
      implicit class ActivityIdMutableBuilder[Self <: ActivityId] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
        
        @scala.inline
        def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        @scala.inline
        def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
        
        @scala.inline
        def setUniqueQualifier(value: String): Self = StObject.set(x, "uniqueQualifier", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUniqueQualifierUndefined: Self = StObject.set(x, "uniqueQualifier", js.undefined)
      }
    }
    
    @js.native
    trait Channel extends StObject {
      
      var address: js.UndefOr[String] = js.native
      
      var expiration: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var params: js.UndefOr[js.Object] = js.native
      
      var payload: js.UndefOr[Boolean] = js.native
      
      var resourceId: js.UndefOr[String] = js.native
      
      var resourceUri: js.UndefOr[String] = js.native
      
      var token: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Channel {
      
      @scala.inline
      def apply(): Channel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Channel]
      }
      
      @scala.inline
      implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        @scala.inline
        def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        @scala.inline
        def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
        
        @scala.inline
        def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait UsageReport extends StObject {
      
      var date: js.UndefOr[String] = js.native
      
      var entity: js.UndefOr[UsageReportEntity] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var parameters: js.UndefOr[js.Array[UsageReportParameters]] = js.native
    }
    object UsageReport {
      
      @scala.inline
      def apply(): UsageReport = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReport]
      }
      
      @scala.inline
      implicit class UsageReportMutableBuilder[Self <: UsageReport] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        @scala.inline
        def setEntity(value: UsageReportEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setParameters(value: js.Array[UsageReportParameters]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        @scala.inline
        def setParametersVarargs(value: UsageReportParameters*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      }
    }
    
    @js.native
    trait UsageReportEntity extends StObject {
      
      var customerId: js.UndefOr[String] = js.native
      
      var entityId: js.UndefOr[String] = js.native
      
      var profileId: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var userEmail: js.UndefOr[String] = js.native
    }
    object UsageReportEntity {
      
      @scala.inline
      def apply(): UsageReportEntity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReportEntity]
      }
      
      @scala.inline
      implicit class UsageReportEntityMutableBuilder[Self <: UsageReportEntity] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
        
        @scala.inline
        def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
        
        @scala.inline
        def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
      }
    }
    
    @js.native
    trait UsageReportParameters extends StObject {
      
      var boolValue: js.UndefOr[Boolean] = js.native
      
      var datetimeValue: js.UndefOr[String] = js.native
      
      var intValue: js.UndefOr[String] = js.native
      
      var msgValue: js.UndefOr[js.Array[js.Object]] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var stringValue: js.UndefOr[String] = js.native
    }
    object UsageReportParameters {
      
      @scala.inline
      def apply(): UsageReportParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReportParameters]
      }
      
      @scala.inline
      implicit class UsageReportParametersMutableBuilder[Self <: UsageReportParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
        
        @scala.inline
        def setDatetimeValue(value: String): Self = StObject.set(x, "datetimeValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatetimeValueUndefined: Self = StObject.set(x, "datetimeValue", js.undefined)
        
        @scala.inline
        def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
        
        @scala.inline
        def setMsgValue(value: js.Array[js.Object]): Self = StObject.set(x, "msgValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMsgValueUndefined: Self = StObject.set(x, "msgValue", js.undefined)
        
        @scala.inline
        def setMsgValueVarargs(value: js.Object*): Self = StObject.set(x, "msgValue", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
      }
    }
    
    @js.native
    trait UsageReports extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var usageReports: js.UndefOr[js.Array[UsageReport]] = js.native
      
      var warnings: js.UndefOr[js.Array[UsageReportsWarnings]] = js.native
    }
    object UsageReports {
      
      @scala.inline
      def apply(): UsageReports = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReports]
      }
      
      @scala.inline
      implicit class UsageReportsMutableBuilder[Self <: UsageReports] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setUsageReports(value: js.Array[UsageReport]): Self = StObject.set(x, "usageReports", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsageReportsUndefined: Self = StObject.set(x, "usageReports", js.undefined)
        
        @scala.inline
        def setUsageReportsVarargs(value: UsageReport*): Self = StObject.set(x, "usageReports", js.Array(value :_*))
        
        @scala.inline
        def setWarnings(value: js.Array[UsageReportsWarnings]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
        
        @scala.inline
        def setWarningsVarargs(value: UsageReportsWarnings*): Self = StObject.set(x, "warnings", js.Array(value :_*))
      }
    }
    
    @js.native
    trait UsageReportsWarnings extends StObject {
      
      var code: js.UndefOr[String] = js.native
      
      var data: js.UndefOr[js.Array[UsageReportsWarningsData]] = js.native
      
      var message: js.UndefOr[String] = js.native
    }
    object UsageReportsWarnings {
      
      @scala.inline
      def apply(): UsageReportsWarnings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReportsWarnings]
      }
      
      @scala.inline
      implicit class UsageReportsWarningsMutableBuilder[Self <: UsageReportsWarnings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        @scala.inline
        def setData(value: js.Array[UsageReportsWarningsData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setDataVarargs(value: UsageReportsWarningsData*): Self = StObject.set(x, "data", js.Array(value :_*))
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      }
    }
    
    @js.native
    trait UsageReportsWarningsData extends StObject {
      
      var key: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object UsageReportsWarningsData {
      
      @scala.inline
      def apply(): UsageReportsWarningsData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UsageReportsWarningsData]
      }
      
      @scala.inline
      implicit class UsageReportsWarningsDataMutableBuilder[Self <: UsageReportsWarningsData] (val x: Self) extends AnyVal {
        
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
