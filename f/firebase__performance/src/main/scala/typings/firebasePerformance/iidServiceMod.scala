package typings.firebasePerformance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/performance/dist/src/services/iid_service", JSImport.Namespace)
@js.native
object iidServiceMod extends js.Object {
  
  def getAuthTokenPromise(): js.Promise[String] = js.native
  
  def getAuthenticationToken(): js.UndefOr[String] = js.native
  
  def getIid(): js.UndefOr[String] = js.native
  
  def getIidPromise(): js.Promise[String] = js.native
}
