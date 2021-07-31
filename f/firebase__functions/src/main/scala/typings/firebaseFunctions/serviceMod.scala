package typings.firebaseFunctions

import typings.firebaseAppTypes.privateMod.FirebaseService
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFunctions.anon.Delete
import typings.firebaseFunctions.anon.Details
import typings.firebaseFunctions.anon.FnCall
import typings.firebaseFunctions.mod.FirebaseApp
import typings.firebaseFunctionsTypes.mod.FirebaseFunctions
import typings.firebaseMessagingTypes.mod.FirebaseMessagingName
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("@firebase/functions/dist/src/api/service", "Service")
  @js.native
  class Service protected ()
    extends FirebaseFunctions
       with FirebaseService {
    /**
      * Creates a new Functions service for the given app and (optional) region or custom domain.
      * @param app_ The FirebaseApp to use.
      * @param regionOrCustomDomain_ one of:
      *   a) A region to call functions from, such as us-central1
      *   b) A custom domain to use as a functions prefix, such as https://mydomain.com
      */
    def this(
      app_ : FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      messagingProvider: Provider[FirebaseMessagingName],
      regionOrCustomDomain_ : String,
      fetchImpl: FnCall
    ) = this()
    def this(
      app_ : FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      messagingProvider: Provider[FirebaseMessagingName],
      regionOrCustomDomain_ : Unit,
      fetchImpl: FnCall
    ) = this()
    
    @JSName("INTERNAL")
    var INTERNAL_Service: Delete = js.native
    
    /**
      * Returns the URL for a callable with the given name.
      * @param name The name of the callable.
      */
    def _url(name: String): String = js.native
    
    /* CompleteClass */
    var app: typings.firebaseAppTypes.mod.FirebaseApp = js.native
    
    var app_ : js.Any = js.native
    
    @JSName("app")
    def app_MService: FirebaseApp = js.native
    
    /**
      * Calls a callable function asynchronously and returns the result.
      * @param name The name of the callable trigger.
      * @param data The data to pass as params to the function.s
      */
    var call: js.Any = js.native
    
    var cancelAllRequests: js.Any = js.native
    
    val contextProvider: js.Any = js.native
    
    var customDomain: js.Any = js.native
    
    var deleteService: js.Any = js.native
    
    var emulatorOrigin: js.Any = js.native
    
    def fetchImpl(input: RequestInfo): js.Promise[Response] = js.native
    def fetchImpl(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    
    /**
      * Does an HTTP POST and returns the completed response.
      * @param url The url to post to.
      * @param body The JSON body of the post.
      * @param headers The HTTP headers to include in the request.
      * @return A Promise that will succeed when the request finishes.
      */
    var postJSON: js.Any = js.native
    
    var region: js.Any = js.native
    
    val serializer: js.Any = js.native
  }
  
  trait HttpResponseBody extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var error: js.UndefOr[Details] = js.undefined
    
    var result: js.UndefOr[js.Any] = js.undefined
  }
  object HttpResponseBody {
    
    @scala.inline
    def apply(): HttpResponseBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpResponseBody]
    }
    
    @scala.inline
    implicit class HttpResponseBodyMutableBuilder[Self <: HttpResponseBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setError(value: Details): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
