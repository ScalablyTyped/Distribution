package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod {
  
  @JSImport("@firebase/util/dist/src/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def areCookiesEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areCookiesEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def getUA(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUA")().asInstanceOf[String]
  
  @scala.inline
  def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  @scala.inline
  def isBrowserExtension(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserExtension")().asInstanceOf[Boolean]
  
  @scala.inline
  def isElectron(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElectron")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIndexedDBAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedDBAvailable")().asInstanceOf[Boolean]
  
  @scala.inline
  def isMobileCordova(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobileCordova")().asInstanceOf[Boolean]
  
  @scala.inline
  def isNode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")().asInstanceOf[Boolean]
  
  @scala.inline
  def isNodeSdk(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeSdk")().asInstanceOf[Boolean]
  
  @scala.inline
  def isReactNative(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNative")().asInstanceOf[Boolean]
  
  @scala.inline
  def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
  
  @scala.inline
  def isUWP(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUWP")().asInstanceOf[Boolean]
  
  @scala.inline
  def validateIndexedDBOpenable(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateIndexedDBOpenable")().asInstanceOf[js.Promise[Boolean]]
}
