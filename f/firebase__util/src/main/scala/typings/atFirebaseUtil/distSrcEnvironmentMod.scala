package typings.atFirebaseUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/environment", JSImport.Namespace)
@js.native
object distSrcEnvironmentMod extends js.Object {
  def getUA(): String = js.native
  def isBrowser(): Boolean = js.native
  def isMobileCordova(): Boolean = js.native
  def isNode(): Boolean = js.native
  def isNodeSdk(): Boolean = js.native
  def isReactNative(): Boolean = js.native
}

