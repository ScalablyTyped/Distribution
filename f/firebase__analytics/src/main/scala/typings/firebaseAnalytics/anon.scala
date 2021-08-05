package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.firebaseAnalyticsStrings.config
import typings.firebaseAnalytics.firebaseAnalyticsStrings.event
import typings.firebaseAnalytics.firebaseAnalyticsStrings.set
import typings.firebaseAnalyticsTypes.mod.ControlParams
import typings.firebaseAnalyticsTypes.mod.CustomParams
import typings.firebaseAnalyticsTypes.mod.DynamicConfig
import typings.firebaseAnalyticsTypes.mod.EventParams
import typings.firebaseAnalyticsTypes.mod.Gtag
import typings.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApiKey extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var appId: js.UndefOr[String] = js.undefined
    
    var measurementId: js.UndefOr[String] = js.undefined
  }
  object ApiKey {
    
    inline def apply(): ApiKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKey]
    }
    
    extension [Self <: ApiKey](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
      
      inline def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    }
  }
  
  trait DynamicConfigPromisesList extends StObject {
    
    var dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]]
    
    var initializationPromisesMap: StringDictionary[js.Promise[String]]
  }
  object DynamicConfigPromisesList {
    
    inline def apply(
      dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
      initializationPromisesMap: StringDictionary[js.Promise[String]]
    ): DynamicConfigPromisesList = {
      val __obj = js.Dynamic.literal(dynamicConfigPromisesList = dynamicConfigPromisesList.asInstanceOf[js.Any], initializationPromisesMap = initializationPromisesMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicConfigPromisesList]
    }
    
    extension [Self <: DynamicConfigPromisesList](x: Self) {
      
      inline def setDynamicConfigPromisesList(value: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]]): Self = StObject.set(x, "dynamicConfigPromisesList", value.asInstanceOf[js.Any])
      
      inline def setDynamicConfigPromisesListVarargs(value: (js.Promise[DynamicConfig | MinimalDynamicConfig])*): Self = StObject.set(x, "dynamicConfigPromisesList", js.Array(value :_*))
      
      inline def setInitializationPromisesMap(value: StringDictionary[js.Promise[String]]): Self = StObject.set(x, "initializationPromisesMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorInfo extends StObject {
    
    var errorInfo: String
  }
  object ErrorInfo {
    
    inline def apply(errorInfo: String): ErrorInfo = {
      val __obj = js.Dynamic.literal(errorInfo = errorInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    extension [Self <: ErrorInfo](x: Self) {
      
      inline def setErrorInfo(value: String): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait GtagCore extends StObject {
    
    @JSName("gtagCore")
    var gtagCore_Original: Gtag
    @JSName("gtagCore")
    def gtagCore_config(command: config, targetId: String): Unit
    @JSName("gtagCore")
    def gtagCore_config(command: config, targetId: String, config: ControlParams): Unit
    @JSName("gtagCore")
    def gtagCore_config(command: config, targetId: String, config: CustomParams): Unit
    @JSName("gtagCore")
    def gtagCore_config(command: config, targetId: String, config: EventParams): Unit
    @JSName("gtagCore")
    def gtagCore_event(command: event, eventName: String): Unit
    @JSName("gtagCore")
    def gtagCore_event(command: event, eventName: String, eventParams: ControlParams): Unit
    @JSName("gtagCore")
    def gtagCore_event(command: event, eventName: String, eventParams: CustomParams): Unit
    @JSName("gtagCore")
    def gtagCore_event(command: event, eventName: String, eventParams: EventParams): Unit
    @JSName("gtagCore")
    def gtagCore_set(command: set, config: CustomParams): Unit
    
    @JSName("wrappedGtag")
    var wrappedGtag_Original: Gtag
    @JSName("wrappedGtag")
    def wrappedGtag_config(command: config, targetId: String): Unit
    @JSName("wrappedGtag")
    def wrappedGtag_config(command: config, targetId: String, config: ControlParams): Unit
    @JSName("wrappedGtag")
    def wrappedGtag_config(command: config, targetId: String, config: CustomParams): Unit
    @JSName("wrappedGtag")
    def wrappedGtag_config(command: config, targetId: String, config: EventParams): Unit
    @JSName("wrappedGtag")
    def wrappedGtag_event(command: event, eventName: String): Unit
    @JSName("wrappedGtag")
    def wrappedGtag_event(command: event, eventName: String, eventParams: ControlParams): Unit
    @JSName("wrappedGtag")
    def wrappedGtag_event(command: event, eventName: String, eventParams: CustomParams): Unit
    @JSName("wrappedGtag")
    def wrappedGtag_event(command: event, eventName: String, eventParams: EventParams): Unit
    @JSName("wrappedGtag")
    def wrappedGtag_set(command: set, config: CustomParams): Unit
  }
  object GtagCore {
    
    inline def apply(gtagCore: Gtag, wrappedGtag: Gtag): GtagCore = {
      val __obj = js.Dynamic.literal(gtagCore = gtagCore.asInstanceOf[js.Any], wrappedGtag = wrappedGtag.asInstanceOf[js.Any])
      __obj.asInstanceOf[GtagCore]
    }
    
    extension [Self <: GtagCore](x: Self) {
      
      inline def setGtagCore(value: Gtag): Self = StObject.set(x, "gtagCore", value.asInstanceOf[js.Any])
      
      inline def setWrappedGtag(value: Gtag): Self = StObject.set(x, "wrappedGtag", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpStatus extends StObject {
    
    var httpStatus: Double
    
    var responseMessage: String
  }
  object HttpStatus {
    
    inline def apply(httpStatus: Double, responseMessage: String): HttpStatus = {
      val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any], responseMessage = responseMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpStatus]
    }
    
    extension [Self <: HttpStatus](x: Self) {
      
      inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
      
      inline def setResponseMessage(value: String): Self = StObject.set(x, "responseMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reason extends StObject {
    
    var reason: Error
  }
  object Reason {
    
    inline def apply(reason: Error): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    extension [Self <: Reason](x: Self) {
      
      inline def setReason(value: Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThrottleEndTimeMillis extends StObject {
    
    var throttleEndTimeMillis: Double
  }
  object ThrottleEndTimeMillis {
    
    inline def apply(throttleEndTimeMillis: Double): ThrottleEndTimeMillis = {
      val __obj = js.Dynamic.literal(throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleEndTimeMillis]
    }
    
    extension [Self <: ThrottleEndTimeMillis](x: Self) {
      
      inline def setThrottleEndTimeMillis(value: Double): Self = StObject.set(x, "throttleEndTimeMillis", value.asInstanceOf[js.Any])
    }
  }
}
