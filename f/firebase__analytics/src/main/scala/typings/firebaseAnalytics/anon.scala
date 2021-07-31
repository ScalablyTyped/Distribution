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
    
    @scala.inline
    def apply(): ApiKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKey]
    }
    
    @scala.inline
    implicit class ApiKeyMutableBuilder[Self <: ApiKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    }
  }
  
  trait DynamicConfigPromisesList extends StObject {
    
    var dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]]
    
    var initializationPromisesMap: StringDictionary[js.Promise[String]]
  }
  object DynamicConfigPromisesList {
    
    @scala.inline
    def apply(
      dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
      initializationPromisesMap: StringDictionary[js.Promise[String]]
    ): DynamicConfigPromisesList = {
      val __obj = js.Dynamic.literal(dynamicConfigPromisesList = dynamicConfigPromisesList.asInstanceOf[js.Any], initializationPromisesMap = initializationPromisesMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicConfigPromisesList]
    }
    
    @scala.inline
    implicit class DynamicConfigPromisesListMutableBuilder[Self <: DynamicConfigPromisesList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicConfigPromisesList(value: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]]): Self = StObject.set(x, "dynamicConfigPromisesList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicConfigPromisesListVarargs(value: (js.Promise[DynamicConfig | MinimalDynamicConfig])*): Self = StObject.set(x, "dynamicConfigPromisesList", js.Array(value :_*))
      
      @scala.inline
      def setInitializationPromisesMap(value: StringDictionary[js.Promise[String]]): Self = StObject.set(x, "initializationPromisesMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorInfo extends StObject {
    
    var errorInfo: String
  }
  object ErrorInfo {
    
    @scala.inline
    def apply(errorInfo: String): ErrorInfo = {
      val __obj = js.Dynamic.literal(errorInfo = errorInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    @scala.inline
    implicit class ErrorInfoMutableBuilder[Self <: ErrorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorInfo(value: String): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(gtagCore: Gtag, wrappedGtag: Gtag): GtagCore = {
      val __obj = js.Dynamic.literal(gtagCore = gtagCore.asInstanceOf[js.Any], wrappedGtag = wrappedGtag.asInstanceOf[js.Any])
      __obj.asInstanceOf[GtagCore]
    }
    
    @scala.inline
    implicit class GtagCoreMutableBuilder[Self <: GtagCore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGtagCore(value: Gtag): Self = StObject.set(x, "gtagCore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappedGtag(value: Gtag): Self = StObject.set(x, "wrappedGtag", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpStatus extends StObject {
    
    var httpStatus: Double
    
    var responseMessage: String
  }
  object HttpStatus {
    
    @scala.inline
    def apply(httpStatus: Double, responseMessage: String): HttpStatus = {
      val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any], responseMessage = responseMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpStatus]
    }
    
    @scala.inline
    implicit class HttpStatusMutableBuilder[Self <: HttpStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseMessage(value: String): Self = StObject.set(x, "responseMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reason extends StObject {
    
    var reason: Error
  }
  object Reason {
    
    @scala.inline
    def apply(reason: Error): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    @scala.inline
    implicit class ReasonMutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThrottleEndTimeMillis extends StObject {
    
    var throttleEndTimeMillis: Double
  }
  object ThrottleEndTimeMillis {
    
    @scala.inline
    def apply(throttleEndTimeMillis: Double): ThrottleEndTimeMillis = {
      val __obj = js.Dynamic.literal(throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleEndTimeMillis]
    }
    
    @scala.inline
    implicit class ThrottleEndTimeMillisMutableBuilder[Self <: ThrottleEndTimeMillis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThrottleEndTimeMillis(value: Double): Self = StObject.set(x, "throttleEndTimeMillis", value.asInstanceOf[js.Any])
    }
  }
}
