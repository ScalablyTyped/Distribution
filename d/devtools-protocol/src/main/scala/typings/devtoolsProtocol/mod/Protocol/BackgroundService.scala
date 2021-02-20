package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.RegistrationID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackgroundService {
  
  @js.native
  trait BackgroundServiceEvent extends StObject {
    
    /**
      * A list of event-specific information.
      */
    var eventMetadata: js.Array[EventMetadata] = js.native
    
    /**
      * A description of the event.
      */
    var eventName: String = js.native
    
    /**
      * An identifier that groups related events together.
      */
    var instanceId: String = js.native
    
    /**
      * The origin this event belongs to.
      */
    var origin: String = js.native
    
    /**
      * The Background Service this event belongs to.
      */
    var service: ServiceName = js.native
    
    /**
      * The Service Worker ID that initiated the event.
      */
    var serviceWorkerRegistrationId: RegistrationID = js.native
    
    /**
      * Timestamp of the event (in seconds).
      */
    var timestamp: TimeSinceEpoch = js.native
  }
  object BackgroundServiceEvent {
    
    @scala.inline
    def apply(
      eventMetadata: js.Array[EventMetadata],
      eventName: String,
      instanceId: String,
      origin: String,
      service: ServiceName,
      serviceWorkerRegistrationId: RegistrationID,
      timestamp: TimeSinceEpoch
    ): BackgroundServiceEvent = {
      val __obj = js.Dynamic.literal(eventMetadata = eventMetadata.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], serviceWorkerRegistrationId = serviceWorkerRegistrationId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundServiceEvent]
    }
    
    @scala.inline
    implicit class BackgroundServiceEventMutableBuilder[Self <: BackgroundServiceEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventMetadata(value: js.Array[EventMetadata]): Self = StObject.set(x, "eventMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventMetadataVarargs(value: EventMetadata*): Self = StObject.set(x, "eventMetadata", js.Array(value :_*))
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceWorkerRegistrationId(value: RegistrationID): Self = StObject.set(x, "serviceWorkerRegistrationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BackgroundServiceEventReceivedEvent extends StObject {
    
    var backgroundServiceEvent: BackgroundServiceEvent = js.native
  }
  object BackgroundServiceEventReceivedEvent {
    
    @scala.inline
    def apply(backgroundServiceEvent: BackgroundServiceEvent): BackgroundServiceEventReceivedEvent = {
      val __obj = js.Dynamic.literal(backgroundServiceEvent = backgroundServiceEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundServiceEventReceivedEvent]
    }
    
    @scala.inline
    implicit class BackgroundServiceEventReceivedEventMutableBuilder[Self <: BackgroundServiceEventReceivedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundServiceEvent(value: BackgroundServiceEvent): Self = StObject.set(x, "backgroundServiceEvent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClearEventsRequest extends StObject {
    
    var service: ServiceName = js.native
  }
  object ClearEventsRequest {
    
    @scala.inline
    def apply(service: ServiceName): ClearEventsRequest = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearEventsRequest]
    }
    
    @scala.inline
    implicit class ClearEventsRequestMutableBuilder[Self <: ClearEventsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventMetadata extends StObject {
    
    var key: String = js.native
    
    var value: String = js.native
  }
  object EventMetadata {
    
    @scala.inline
    def apply(key: String, value: String): EventMetadata = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMetadata]
    }
    
    @scala.inline
    implicit class EventMetadataMutableBuilder[Self <: EventMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecordingStateChangedEvent extends StObject {
    
    var isRecording: Boolean = js.native
    
    var service: ServiceName = js.native
  }
  object RecordingStateChangedEvent {
    
    @scala.inline
    def apply(isRecording: Boolean, service: ServiceName): RecordingStateChangedEvent = {
      val __obj = js.Dynamic.literal(isRecording = isRecording.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingStateChangedEvent]
    }
    
    @scala.inline
    implicit class RecordingStateChangedEventMutableBuilder[Self <: RecordingStateChangedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRecording(value: Boolean): Self = StObject.set(x, "isRecording", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.backgroundFetch
    - typings.devtoolsProtocol.devtoolsProtocolStrings.backgroundSync
    - typings.devtoolsProtocol.devtoolsProtocolStrings.pushMessaging
    - typings.devtoolsProtocol.devtoolsProtocolStrings.notifications
    - typings.devtoolsProtocol.devtoolsProtocolStrings.paymentHandler
    - typings.devtoolsProtocol.devtoolsProtocolStrings.periodicBackgroundSync
  */
  trait ServiceName extends StObject
  object ServiceName {
    
    @scala.inline
    def backgroundFetch: typings.devtoolsProtocol.devtoolsProtocolStrings.backgroundFetch = "backgroundFetch".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.backgroundFetch]
    
    @scala.inline
    def backgroundSync: typings.devtoolsProtocol.devtoolsProtocolStrings.backgroundSync = "backgroundSync".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.backgroundSync]
    
    @scala.inline
    def notifications: typings.devtoolsProtocol.devtoolsProtocolStrings.notifications = "notifications".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.notifications]
    
    @scala.inline
    def paymentHandler: typings.devtoolsProtocol.devtoolsProtocolStrings.paymentHandler = "paymentHandler".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.paymentHandler]
    
    @scala.inline
    def periodicBackgroundSync: typings.devtoolsProtocol.devtoolsProtocolStrings.periodicBackgroundSync = "periodicBackgroundSync".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.periodicBackgroundSync]
    
    @scala.inline
    def pushMessaging: typings.devtoolsProtocol.devtoolsProtocolStrings.pushMessaging = "pushMessaging".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.pushMessaging]
  }
  
  @js.native
  trait SetRecordingRequest extends StObject {
    
    var service: ServiceName = js.native
    
    var shouldRecord: Boolean = js.native
  }
  object SetRecordingRequest {
    
    @scala.inline
    def apply(service: ServiceName, shouldRecord: Boolean): SetRecordingRequest = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], shouldRecord = shouldRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetRecordingRequest]
    }
    
    @scala.inline
    implicit class SetRecordingRequestMutableBuilder[Self <: SetRecordingRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRecord(value: Boolean): Self = StObject.set(x, "shouldRecord", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StartObservingRequest extends StObject {
    
    var service: ServiceName = js.native
  }
  object StartObservingRequest {
    
    @scala.inline
    def apply(service: ServiceName): StartObservingRequest = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartObservingRequest]
    }
    
    @scala.inline
    implicit class StartObservingRequestMutableBuilder[Self <: StartObservingRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StopObservingRequest extends StObject {
    
    var service: ServiceName = js.native
  }
  object StopObservingRequest {
    
    @scala.inline
    def apply(service: ServiceName): StopObservingRequest = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[StopObservingRequest]
    }
    
    @scala.inline
    implicit class StopObservingRequestMutableBuilder[Self <: StopObservingRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
}
