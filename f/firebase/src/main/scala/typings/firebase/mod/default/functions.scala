package typings.firebase.mod.default

import typings.firebase.mod.firebase.app.App
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functions {
  
  @JSImport("firebase", "default.functions")
  @js.native
  def apply(): typings.firebase.mod.firebase.functions.Functions = js.native
  @JSImport("firebase", "default.functions")
  @js.native
  def apply(app: App): typings.firebase.mod.firebase.functions.Functions = js.native
  
  @JSImport("firebase", "default.functions.Functions")
  @js.native
  class Functions protected () extends StObject {
    
    /**
      * Gets an `HttpsCallable` instance that refers to the function with the given
      * name.
      *
      * @param name The name of the https callable function.
      * @param options The options for this HttpsCallable instance.
      * @return The `HttpsCallable` instance.
      */
    def httpsCallable(name: String): typings.firebase.mod.firebase.functions.HttpsCallable = js.native
    def httpsCallable(name: String, options: typings.firebase.mod.firebase.functions.HttpsCallableOptions): typings.firebase.mod.firebase.functions.HttpsCallable = js.native
    
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
    def useFunctionsEmulator(url: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebase.firebaseStrings.ok
    - typings.firebase.firebaseStrings.cancelled
    - typings.firebase.firebaseStrings.unknown
    - typings.firebase.firebaseStrings.`invalid-argument`
    - typings.firebase.firebaseStrings.`deadline-exceeded`
    - typings.firebase.firebaseStrings.`not-found`
    - typings.firebase.firebaseStrings.`already-exists`
    - typings.firebase.firebaseStrings.`permission-denied`
    - typings.firebase.firebaseStrings.`resource-exhausted`
    - typings.firebase.firebaseStrings.`failed-precondition`
    - typings.firebase.firebaseStrings.aborted
    - typings.firebase.firebaseStrings.`out-of-range`
    - typings.firebase.firebaseStrings.unimplemented
    - typings.firebase.firebaseStrings.internal
    - typings.firebase.firebaseStrings.unavailable
    - typings.firebase.firebaseStrings.`data-loss`
    - typings.firebase.firebaseStrings.unauthenticated
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    @scala.inline
    def aborted: typings.firebase.firebaseStrings.aborted = "aborted".asInstanceOf[typings.firebase.firebaseStrings.aborted]
    
    @scala.inline
    def `already-exists`: typings.firebase.firebaseStrings.`already-exists` = "already-exists".asInstanceOf[typings.firebase.firebaseStrings.`already-exists`]
    
    @scala.inline
    def cancelled: typings.firebase.firebaseStrings.cancelled = "cancelled".asInstanceOf[typings.firebase.firebaseStrings.cancelled]
    
    @scala.inline
    def `data-loss`: typings.firebase.firebaseStrings.`data-loss` = "data-loss".asInstanceOf[typings.firebase.firebaseStrings.`data-loss`]
    
    @scala.inline
    def `deadline-exceeded`: typings.firebase.firebaseStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typings.firebase.firebaseStrings.`deadline-exceeded`]
    
    @scala.inline
    def `failed-precondition`: typings.firebase.firebaseStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.firebase.firebaseStrings.`failed-precondition`]
    
    @scala.inline
    def internal: typings.firebase.firebaseStrings.internal = "internal".asInstanceOf[typings.firebase.firebaseStrings.internal]
    
    @scala.inline
    def `invalid-argument`: typings.firebase.firebaseStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebase.firebaseStrings.`invalid-argument`]
    
    @scala.inline
    def `not-found`: typings.firebase.firebaseStrings.`not-found` = "not-found".asInstanceOf[typings.firebase.firebaseStrings.`not-found`]
    
    @scala.inline
    def ok: typings.firebase.firebaseStrings.ok = "ok".asInstanceOf[typings.firebase.firebaseStrings.ok]
    
    @scala.inline
    def `out-of-range`: typings.firebase.firebaseStrings.`out-of-range` = "out-of-range".asInstanceOf[typings.firebase.firebaseStrings.`out-of-range`]
    
    @scala.inline
    def `permission-denied`: typings.firebase.firebaseStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.firebase.firebaseStrings.`permission-denied`]
    
    @scala.inline
    def `resource-exhausted`: typings.firebase.firebaseStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.firebase.firebaseStrings.`resource-exhausted`]
    
    @scala.inline
    def unauthenticated: typings.firebase.firebaseStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.firebase.firebaseStrings.unauthenticated]
    
    @scala.inline
    def unavailable: typings.firebase.firebaseStrings.unavailable = "unavailable".asInstanceOf[typings.firebase.firebaseStrings.unavailable]
    
    @scala.inline
    def unimplemented: typings.firebase.firebaseStrings.unimplemented = "unimplemented".asInstanceOf[typings.firebase.firebaseStrings.unimplemented]
    
    @scala.inline
    def unknown: typings.firebase.firebaseStrings.unknown = "unknown".asInstanceOf[typings.firebase.firebaseStrings.unknown]
  }
  
  type HttpsCallable = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    js.Promise[typings.firebase.mod.firebase.functions.HttpsCallableResult]
  ]
  
  @js.native
  trait HttpsCallableOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object HttpsCallableOptions {
    
    @scala.inline
    def apply(): HttpsCallableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsCallableOptions]
    }
    
    @scala.inline
    implicit class HttpsCallableOptionsMutableBuilder[Self <: HttpsCallableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait HttpsCallableResult extends StObject {
    
    val data: js.Any = js.native
  }
  object HttpsCallableResult {
    
    @scala.inline
    def apply(data: js.Any): HttpsCallableResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsCallableResult]
    }
    
    @scala.inline
    implicit class HttpsCallableResultMutableBuilder[Self <: HttpsCallableResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpsError extends Error {
    
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    val code: typings.firebase.mod.firebase.functions.FunctionsErrorCode = js.native
    
    /**
      * Extra data to be converted to JSON and included in the error response.
      */
    val details: js.UndefOr[js.Any] = js.native
  }
  object HttpsError {
    
    @scala.inline
    def apply(code: typings.firebase.mod.firebase.functions.FunctionsErrorCode, message: String, name: String): HttpsError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsError]
    }
    
    @scala.inline
    implicit class HttpsErrorMutableBuilder[Self <: HttpsError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: typings.firebase.mod.firebase.functions.FunctionsErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    }
  }
}
