package typings.gatsbyCoreUtils

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gatsby-core-utils/dist/service-lock", JSImport.Namespace)
@js.native
object serviceLockMod extends js.Object {
  
  def createServiceLock(programPath: String, serviceName: String, content: Record[String, _]): js.Promise[UnlockFn | Null] = js.native
  
  def getService[T](programPath: String, serviceName: String): js.Promise[T | Null] = js.native
  def getService[T](programPath: String, serviceName: String, ignoreLockfile: Boolean): js.Promise[T | Null] = js.native
  
  def getServices(programPath: String): js.Promise[_] = js.native
  
  type UnlockFn = js.Function0[js.Promise[Unit]]
}
