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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ApiKey extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var appId: js.UndefOr[String] = js.native
    
    var measurementId: js.UndefOr[String] = js.native
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
  
  @js.native
  trait DynamicConfigPromisesList extends StObject {
    
    var dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]] = js.native
    
    var initializationPromisesMap: StringDictionary[js.Promise[String]] = js.native
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
  
  @js.native
  trait ErrorInfo extends StObject {
    
    var errorInfo: String = js.native
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
  
  @js.native
  trait GtagCore extends StObject {
    
    @JSName("gtagCore")
    var gtagCore_Original: Gtag = js.native
    @JSName("gtagCore")
    def gtagCore_config(command: config, targetId: String): Unit = js.native
    @JSName("gtagCore")
    def gtagCore_config(command: config, targetId: String, config: ControlParams): Unit = js.native
    @JSName("gtagCore")
    def gtagCore_config(command: config, targetId: String, config: CustomParams): Unit = js.native
    @JSName("gtagCore")
    def gtagCore_config(command: config, targetId: String, config: EventParams): Unit = js.native
    @JSName("gtagCore")
    def gtagCore_event(command: event, eventName: String): Unit = js.native
    @JSName("gtagCore")
    def gtagCore_event(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
    @JSName("gtagCore")
    def gtagCore_event(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
    @JSName("gtagCore")
    def gtagCore_event(command: event, eventName: String, eventParams: EventParams): Unit = js.native
    @JSName("gtagCore")
    def gtagCore_set(command: set, config: CustomParams): Unit = js.native
    
    @JSName("wrappedGtag")
    var wrappedGtag_Original: Gtag = js.native
    @JSName("wrappedGtag")
    def wrappedGtag_config(command: config, targetId: String): Unit = js.native
    @JSName("wrappedGtag")
    def wrappedGtag_config(command: config, targetId: String, config: ControlParams): Unit = js.native
    @JSName("wrappedGtag")
    def wrappedGtag_config(command: config, targetId: String, config: CustomParams): Unit = js.native
    @JSName("wrappedGtag")
    def wrappedGtag_config(command: config, targetId: String, config: EventParams): Unit = js.native
    @JSName("wrappedGtag")
    def wrappedGtag_event(command: event, eventName: String): Unit = js.native
    @JSName("wrappedGtag")
    def wrappedGtag_event(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
    @JSName("wrappedGtag")
    def wrappedGtag_event(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
    @JSName("wrappedGtag")
    def wrappedGtag_event(command: event, eventName: String, eventParams: EventParams): Unit = js.native
    @JSName("wrappedGtag")
    def wrappedGtag_set(command: set, config: CustomParams): Unit = js.native
  }
  
  @js.native
  trait HttpStatus extends StObject {
    
    var httpStatus: Double = js.native
    
    var responseMessage: String = js.native
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
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
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
  
  @js.native
  trait Reason extends StObject {
    
    var reason: Error = js.native
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
  
  @js.native
  trait ThrottleEndTimeMillis extends StObject {
    
    var throttleEndTimeMillis: Double = js.native
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
