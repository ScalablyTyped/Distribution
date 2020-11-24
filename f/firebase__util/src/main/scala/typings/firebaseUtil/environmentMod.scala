package typings.firebaseUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/util/dist/src/environment", JSImport.Namespace)
@js.native
object environmentMod extends js.Object {
  
  def areCookiesEnabled(): Boolean = js.native
  
  def getUA(): String = js.native
  
  def isBrowser(): Boolean = js.native
  
  def isBrowserExtension(): Boolean = js.native
  
  def isElectron(): Boolean = js.native
  
  def isIE(): Boolean = js.native
  
  def isIndexedDBAvailable(): Boolean = js.native
  
  def isMobileCordova(): Boolean = js.native
  
  def isNode(): Boolean = js.native
  
  def isNodeSdk(): Boolean = js.native
  
  def isReactNative(): Boolean = js.native
  
  def isSafari(): Boolean = js.native
  
  def isUWP(): Boolean = js.native
  
  def validateIndexedDBOpenable(): js.Promise[Boolean] = js.native
}
