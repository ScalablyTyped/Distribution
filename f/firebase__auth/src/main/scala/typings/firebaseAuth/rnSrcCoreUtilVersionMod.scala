package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.Browser
import typings.firebaseAuth.firebaseAuthStrings.Cordova
import typings.firebaseAuth.firebaseAuthStrings.JsCore
import typings.firebaseAuth.firebaseAuthStrings.Node
import typings.firebaseAuth.firebaseAuthStrings.ReactNative
import typings.firebaseAuth.firebaseAuthStrings.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rnSrcCoreUtilVersionMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/util/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClientVersion(clientPlatform: ClientPlatform): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_getClientVersion")(clientPlatform.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getClientVersion(clientPlatform: ClientPlatform, frameworks: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getClientVersion")(clientPlatform.asInstanceOf[js.Any], frameworks.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object ClientImplementation {
    
    inline def CORE: JsCore = "JsCore".asInstanceOf[JsCore]
  }
  type ClientImplementation = JsCore
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.Browser
    - typings.firebaseAuth.firebaseAuthStrings.Node
    - typings.firebaseAuth.firebaseAuthStrings.ReactNative
    - typings.firebaseAuth.firebaseAuthStrings.Cordova
    - typings.firebaseAuth.firebaseAuthStrings.Worker
  */
  trait ClientPlatform extends StObject
  object ClientPlatform {
    
    inline def BROWSER: Browser = "Browser".asInstanceOf[Browser]
    
    inline def CORDOVA: Cordova = "Cordova".asInstanceOf[Cordova]
    
    inline def NODE: Node = "Node".asInstanceOf[Node]
    
    inline def REACT_NATIVE: ReactNative = "ReactNative".asInstanceOf[ReactNative]
    
    inline def WORKER: Worker = "Worker".asInstanceOf[Worker]
  }
}
