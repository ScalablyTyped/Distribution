package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEnvironmentMod {
  
  @JSImport("@firebase/util/dist/src/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areCookiesEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areCookiesEnabled")().asInstanceOf[Boolean]
  
  inline def getGlobal(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")().asInstanceOf[Any]
  
  inline def getUA(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUA")().asInstanceOf[String]
  
  inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  inline def isBrowserExtension(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserExtension")().asInstanceOf[Boolean]
  
  inline def isElectron(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElectron")().asInstanceOf[Boolean]
  
  inline def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
  
  inline def isIndexedDBAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedDBAvailable")().asInstanceOf[Boolean]
  
  inline def isMobileCordova(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobileCordova")().asInstanceOf[Boolean]
  
  inline def isNode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")().asInstanceOf[Boolean]
  
  inline def isNodeSdk(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeSdk")().asInstanceOf[Boolean]
  
  inline def isReactNative(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNative")().asInstanceOf[Boolean]
  
  inline def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
  
  inline def isUWP(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUWP")().asInstanceOf[Boolean]
  
  inline def validateIndexedDBOpenable(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateIndexedDBOpenable")().asInstanceOf[js.Promise[Boolean]]
}
