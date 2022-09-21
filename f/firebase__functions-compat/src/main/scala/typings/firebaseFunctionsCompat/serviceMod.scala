package typings.firebaseFunctionsCompat

import typings.firebaseAppCompat.mod.FirebaseService
import typings.firebaseFunctions.mod.Functions
import typings.firebaseFunctions.mod.HttpsCallableOptions
import typings.firebaseFunctionsCompat.mod.FirebaseApp
import typings.firebaseFunctionsTypes.mod.FirebaseFunctions
import typings.firebaseFunctionsTypes.mod.HttpsCallable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("@firebase/functions-compat/dist/src/service", "FunctionsService")
  @js.native
  open class FunctionsService protected ()
    extends FirebaseFunctions
       with FirebaseService {
    def this(app: FirebaseApp, _delegate: Functions) = this()
    
    /**
      * For testing.
      * @internal
      */
    var _customDomain: String | Null = js.native
    
    /* CompleteClass */
    var _delegate: Any = js.native
    @JSName("_delegate")
    val _delegate_FunctionsService: Functions = js.native
    
    /**
      * For testing.
      * @internal
      */
    var _region: String = js.native
    
    /* CompleteClass */
    var app: typings.firebaseAppCompat.mod.FirebaseApp = js.native
    @JSName("app")
    var app_FunctionsService: FirebaseApp = js.native
    
    def httpsCallable(name: String, options: HttpsCallableOptions): HttpsCallable = js.native
    
    def httpsCallableFromURL(url: String): HttpsCallable = js.native
    def httpsCallableFromURL(url: String, options: HttpsCallableOptions): HttpsCallable = js.native
  }
}
