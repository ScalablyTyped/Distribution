package typings.firebaseFunctions

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicTypesMod {
  
  trait Functions extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `Functions` instance is associated with.
      */
    var app: FirebaseApp
    
    /**
      * A custom domain hosting the callable Cloud Functions.
      * ex: https://mydomain.com
      */
    var customDomain: String | Null
    
    /**
      * The region the callable Cloud Functions are located in.
      * Default is `us-central-1`.
      */
    var region: String
  }
  object Functions {
    
    inline def apply(app: FirebaseApp, region: String): Functions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], customDomain = null)
      __obj.asInstanceOf[Functions]
    }
    
    extension [Self <: Functions](x: Self) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setCustomDomain(value: String): Self = StObject.set(x, "customDomain", value.asInstanceOf[js.Any])
      
      inline def setCustomDomainNull: Self = StObject.set(x, "customDomain", null)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FunctionsError extends FirebaseError {
    
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    @JSName("code")
    val code_FunctionsError: FunctionsErrorCode = js.native
    
    /**
      * Extra data to be converted to JSON and included in the error response.
      */
    val details: js.UndefOr[Any] = js.native
  }
  
  type FunctionsErrorCode = /* template literal string: functions/${FunctionsErrorCodeCore} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFunctions.firebaseFunctionsStrings.ok
    - typings.firebaseFunctions.firebaseFunctionsStrings.cancelled
    - typings.firebaseFunctions.firebaseFunctionsStrings.unknown
    - typings.firebaseFunctions.firebaseFunctionsStrings.`invalid-argument`
    - typings.firebaseFunctions.firebaseFunctionsStrings.`deadline-exceeded`
    - typings.firebaseFunctions.firebaseFunctionsStrings.`not-found`
    - typings.firebaseFunctions.firebaseFunctionsStrings.`already-exists`
    - typings.firebaseFunctions.firebaseFunctionsStrings.`permission-denied`
    - typings.firebaseFunctions.firebaseFunctionsStrings.`resource-exhausted`
    - typings.firebaseFunctions.firebaseFunctionsStrings.`failed-precondition`
    - typings.firebaseFunctions.firebaseFunctionsStrings.aborted
    - typings.firebaseFunctions.firebaseFunctionsStrings.`out-of-range`
    - typings.firebaseFunctions.firebaseFunctionsStrings.unimplemented
    - typings.firebaseFunctions.firebaseFunctionsStrings.internal
    - typings.firebaseFunctions.firebaseFunctionsStrings.unavailable
    - typings.firebaseFunctions.firebaseFunctionsStrings.`data-loss`
    - typings.firebaseFunctions.firebaseFunctionsStrings.unauthenticated
  */
  trait FunctionsErrorCodeCore extends StObject
  object FunctionsErrorCodeCore {
    
    inline def aborted: typings.firebaseFunctions.firebaseFunctionsStrings.aborted = "aborted".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.aborted]
    
    inline def `already-exists`: typings.firebaseFunctions.firebaseFunctionsStrings.`already-exists` = "already-exists".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.`already-exists`]
    
    inline def cancelled: typings.firebaseFunctions.firebaseFunctionsStrings.cancelled = "cancelled".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.cancelled]
    
    inline def `data-loss`: typings.firebaseFunctions.firebaseFunctionsStrings.`data-loss` = "data-loss".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typings.firebaseFunctions.firebaseFunctionsStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typings.firebaseFunctions.firebaseFunctionsStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.`failed-precondition`]
    
    inline def internal: typings.firebaseFunctions.firebaseFunctionsStrings.internal = "internal".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.internal]
    
    inline def `invalid-argument`: typings.firebaseFunctions.firebaseFunctionsStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.`invalid-argument`]
    
    inline def `not-found`: typings.firebaseFunctions.firebaseFunctionsStrings.`not-found` = "not-found".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.`not-found`]
    
    inline def ok: typings.firebaseFunctions.firebaseFunctionsStrings.ok = "ok".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.ok]
    
    inline def `out-of-range`: typings.firebaseFunctions.firebaseFunctionsStrings.`out-of-range` = "out-of-range".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.`out-of-range`]
    
    inline def `permission-denied`: typings.firebaseFunctions.firebaseFunctionsStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typings.firebaseFunctions.firebaseFunctionsStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.`resource-exhausted`]
    
    inline def unauthenticated: typings.firebaseFunctions.firebaseFunctionsStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.unauthenticated]
    
    inline def unavailable: typings.firebaseFunctions.firebaseFunctionsStrings.unavailable = "unavailable".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.unavailable]
    
    inline def unimplemented: typings.firebaseFunctions.firebaseFunctionsStrings.unimplemented = "unimplemented".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.unimplemented]
    
    inline def unknown: typings.firebaseFunctions.firebaseFunctionsStrings.unknown = "unknown".asInstanceOf[typings.firebaseFunctions.firebaseFunctionsStrings.unknown]
  }
  
  type HttpsCallable[RequestData, ResponseData] = js.Function1[
    /* data */ js.UndefOr[RequestData | Null], 
    js.Promise[HttpsCallableResult[ResponseData]]
  ]
  
  trait HttpsCallableOptions extends StObject {
    
    /**
      * Time in milliseconds after which to cancel if there is no response.
      * Default is 70000.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object HttpsCallableOptions {
    
    inline def apply(): HttpsCallableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsCallableOptions]
    }
    
    extension [Self <: HttpsCallableOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait HttpsCallableResult[ResponseData] extends StObject {
    
    /**
      * Data returned from callable function.
      */
    val data: ResponseData
  }
  object HttpsCallableResult {
    
    inline def apply[ResponseData](data: ResponseData): HttpsCallableResult[ResponseData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsCallableResult[ResponseData]]
    }
    
    extension [Self <: HttpsCallableResult[?], ResponseData](x: Self & HttpsCallableResult[ResponseData]) {
      
      inline def setData(value: ResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var functions: Functions
    }
    object NameServiceMapping {
      
      inline def apply(functions: Functions): NameServiceMapping = {
        val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setFunctions(value: Functions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      }
    }
  }
}
