package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcInterfacesLoggingTypesMod {
  
  trait FcmEvent extends StObject {
    
    var analytics_label: js.UndefOr[String] = js.undefined
    
    var collapse_key: String
    
    var event: String
    
    var instance_id: String
    
    var message_id: String
    
    var message_type: String
    
    var package_name: String
    
    var project_number: String
    
    var sdk_platform: String
  }
  object FcmEvent {
    
    inline def apply(
      collapse_key: String,
      event: String,
      instance_id: String,
      message_id: String,
      message_type: String,
      package_name: String,
      project_number: String,
      sdk_platform: String
    ): FcmEvent = {
      val __obj = js.Dynamic.literal(collapse_key = collapse_key.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], instance_id = instance_id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any], package_name = package_name.asInstanceOf[js.Any], project_number = project_number.asInstanceOf[js.Any], sdk_platform = sdk_platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[FcmEvent]
    }
    
    extension [Self <: FcmEvent](x: Self) {
      
      inline def setAnalytics_label(value: String): Self = StObject.set(x, "analytics_label", value.asInstanceOf[js.Any])
      
      inline def setAnalytics_labelUndefined: Self = StObject.set(x, "analytics_label", js.undefined)
      
      inline def setCollapse_key(value: String): Self = StObject.set(x, "collapse_key", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setInstance_id(value: String): Self = StObject.set(x, "instance_id", value.asInstanceOf[js.Any])
      
      inline def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
      
      inline def setMessage_type(value: String): Self = StObject.set(x, "message_type", value.asInstanceOf[js.Any])
      
      inline def setPackage_name(value: String): Self = StObject.set(x, "package_name", value.asInstanceOf[js.Any])
      
      inline def setProject_number(value: String): Self = StObject.set(x, "project_number", value.asInstanceOf[js.Any])
      
      inline def setSdk_platform(value: String): Self = StObject.set(x, "sdk_platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogEvent extends StObject {
    
    var event_time_ms: String
    
    var source_extension_json_proto3: String
  }
  object LogEvent {
    
    inline def apply(event_time_ms: String, source_extension_json_proto3: String): LogEvent = {
      val __obj = js.Dynamic.literal(event_time_ms = event_time_ms.asInstanceOf[js.Any], source_extension_json_proto3 = source_extension_json_proto3.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEvent]
    }
    
    extension [Self <: LogEvent](x: Self) {
      
      inline def setEvent_time_ms(value: String): Self = StObject.set(x, "event_time_ms", value.asInstanceOf[js.Any])
      
      inline def setSource_extension_json_proto3(value: String): Self = StObject.set(x, "source_extension_json_proto3", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogRequest extends StObject {
    
    var log_event: js.Array[LogEvent]
    
    var log_source: String
  }
  object LogRequest {
    
    inline def apply(log_event: js.Array[LogEvent], log_source: String): LogRequest = {
      val __obj = js.Dynamic.literal(log_event = log_event.asInstanceOf[js.Any], log_source = log_source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogRequest]
    }
    
    extension [Self <: LogRequest](x: Self) {
      
      inline def setLog_event(value: js.Array[LogEvent]): Self = StObject.set(x, "log_event", value.asInstanceOf[js.Any])
      
      inline def setLog_eventVarargs(value: LogEvent*): Self = StObject.set(x, "log_event", js.Array(value*))
      
      inline def setLog_source(value: String): Self = StObject.set(x, "log_source", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogResponse extends StObject {
    
    var logResponseDetails: js.Array[LogResponseDetails]
    
    var nextRequestWaitMillis: Double
  }
  object LogResponse {
    
    inline def apply(logResponseDetails: js.Array[LogResponseDetails], nextRequestWaitMillis: Double): LogResponse = {
      val __obj = js.Dynamic.literal(logResponseDetails = logResponseDetails.asInstanceOf[js.Any], nextRequestWaitMillis = nextRequestWaitMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogResponse]
    }
    
    extension [Self <: LogResponse](x: Self) {
      
      inline def setLogResponseDetails(value: js.Array[LogResponseDetails]): Self = StObject.set(x, "logResponseDetails", value.asInstanceOf[js.Any])
      
      inline def setLogResponseDetailsVarargs(value: LogResponseDetails*): Self = StObject.set(x, "logResponseDetails", js.Array(value*))
      
      inline def setNextRequestWaitMillis(value: Double): Self = StObject.set(x, "nextRequestWaitMillis", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogResponseDetails extends StObject {
    
    var responseAction: UserResponse
  }
  object LogResponseDetails {
    
    inline def apply(responseAction: UserResponse): LogResponseDetails = {
      val __obj = js.Dynamic.literal(responseAction = responseAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogResponseDetails]
    }
    
    extension [Self <: LogResponseDetails](x: Self) {
      
      inline def setResponseAction(value: UserResponse): Self = StObject.set(x, "responseAction", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseMessaging.firebaseMessagingStrings.RESPONSE_ACTION_UNKNOWN
    - typings.firebaseMessaging.firebaseMessagingStrings.RETRY_REQUEST_LATER
    - typings.firebaseMessaging.firebaseMessagingStrings.DELETE_REQUEST
  */
  trait UserResponse extends StObject
  object UserResponse {
    
    inline def DELETE_REQUEST: typings.firebaseMessaging.firebaseMessagingStrings.DELETE_REQUEST = "DELETE_REQUEST".asInstanceOf[typings.firebaseMessaging.firebaseMessagingStrings.DELETE_REQUEST]
    
    inline def RESPONSE_ACTION_UNKNOWN: typings.firebaseMessaging.firebaseMessagingStrings.RESPONSE_ACTION_UNKNOWN = "RESPONSE_ACTION_UNKNOWN".asInstanceOf[typings.firebaseMessaging.firebaseMessagingStrings.RESPONSE_ACTION_UNKNOWN]
    
    inline def RETRY_REQUEST_LATER: typings.firebaseMessaging.firebaseMessagingStrings.RETRY_REQUEST_LATER = "RETRY_REQUEST_LATER".asInstanceOf[typings.firebaseMessaging.firebaseMessagingStrings.RETRY_REQUEST_LATER]
  }
}
