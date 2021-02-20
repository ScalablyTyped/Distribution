package typings.gatsbyCoreUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceLockMod {
  
  @JSImport("gatsby-core-utils/dist/service-lock", "createServiceLock")
  @js.native
  def createServiceLock(programPath: String, serviceName: String, content: Record[String, _]): js.Promise[UnlockFn | Null] = js.native
  
  @JSImport("gatsby-core-utils/dist/service-lock", "getService")
  @js.native
  def getService[T](programPath: String, serviceName: String): js.Promise[T | Null] = js.native
  @JSImport("gatsby-core-utils/dist/service-lock", "getService")
  @js.native
  def getService[T](programPath: String, serviceName: String, ignoreLockfile: Boolean): js.Promise[T | Null] = js.native
  
  @JSImport("gatsby-core-utils/dist/service-lock", "getServices")
  @js.native
  def getServices(programPath: String): js.Promise[_] = js.native
  
  type UnlockFn = js.Function0[js.Promise[Unit]]
}
