package typings.firebaseFunctionsTypes

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/functions-types", "FirebaseFunctions")
  @js.native
  /* private */ class FirebaseFunctions () extends StObject {
    
    /**
      * Gets an `HttpsCallable` instance that refers to the function with the given
      * name.
      *
      * @param name The name of the https callable function.
      * @return The `HttpsCallable` instance.
      */
    def httpsCallable(name: String): HttpsCallable = js.native
    def httpsCallable(name: String, options: HttpsCallableOptions): HttpsCallable = js.native
    
    /**
      * Modify this instance to communicate with the Cloud Functions emulator.
      *
      * Note: this must be called before this instance has been used to do any operations.
      *
      * @param host The emulator host (ex: localhost)
      * @param port The emulator port (ex: 5001)
      */
    def useEmulator(host: String, port: Double): Unit = js.native
    
    /**
      * Changes this instance to point to a Cloud Functions emulator running
      * locally. See https://firebase.google.com/docs/functions/local-emulator
      *
      * @deprecated Prefer the useEmulator(host, port) method.
      * @param origin The origin of the local emulator, such as
      * "http://localhost:5005".
      */
    def useFunctionsEmulator(origin: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.ok
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.cancelled
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unknown
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`invalid-argument`
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`deadline-exceeded`
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`not-found`
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`already-exists`
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`permission-denied`
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`resource-exhausted`
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`failed-precondition`
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.aborted
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`out-of-range`
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unimplemented
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.internal
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unavailable
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`data-loss`
    - typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unauthenticated
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    inline def aborted: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.aborted = "aborted".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.aborted]
    
    inline def `already-exists`: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`already-exists` = "already-exists".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`already-exists`]
    
    inline def cancelled: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.cancelled = "cancelled".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.cancelled]
    
    inline def `data-loss`: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`data-loss` = "data-loss".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`failed-precondition`]
    
    inline def internal: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.internal = "internal".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.internal]
    
    inline def `invalid-argument`: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`invalid-argument`]
    
    inline def `not-found`: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`not-found` = "not-found".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`not-found`]
    
    inline def ok: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.ok = "ok".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.ok]
    
    inline def `out-of-range`: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`out-of-range` = "out-of-range".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`out-of-range`]
    
    inline def `permission-denied`: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`resource-exhausted`]
    
    inline def unauthenticated: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unauthenticated]
    
    inline def unavailable: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unavailable = "unavailable".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unavailable]
    
    inline def unimplemented: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unimplemented = "unimplemented".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unimplemented]
    
    inline def unknown: typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unknown = "unknown".asInstanceOf[typings.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unknown]
  }
  
  type HttpsCallable = js.Function1[/* data */ js.UndefOr[js.Object | Null], js.Promise[HttpsCallableResult]]
  
  trait HttpsCallableOptions extends StObject {
    
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
  
  trait HttpsCallableResult extends StObject {
    
    val data: js.Any
  }
  object HttpsCallableResult {
    
    inline def apply(data: js.Any): HttpsCallableResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsCallableResult]
    }
    
    extension [Self <: HttpsCallableResult](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpsError
    extends StObject
       with Error {
    
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    val code: FunctionsErrorCode
    
    /**
      * Extra data to be converted to JSON and included in the error response.
      */
    val details: js.UndefOr[js.Any] = js.undefined
  }
  object HttpsError {
    
    inline def apply(code: FunctionsErrorCode, message: String, name: String): HttpsError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsError]
    }
    
    extension [Self <: HttpsError](x: Self) {
      
      inline def setCode(value: FunctionsErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    }
  }
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var functions: FirebaseFunctions
    }
    object NameServiceMapping {
      
      inline def apply(functions: FirebaseFunctions): NameServiceMapping = {
        val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setFunctions(value: FirebaseFunctions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      }
    }
  }
}
