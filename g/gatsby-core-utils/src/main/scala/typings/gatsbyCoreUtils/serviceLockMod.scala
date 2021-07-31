package typings.gatsbyCoreUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceLockMod {
  
  @JSImport("gatsby-core-utils/dist/service-lock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createServiceLock(programPath: String, serviceName: String, content: Record[String, js.Any]): js.Promise[UnlockFn | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServiceLock")(programPath.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnlockFn | Null]]
  
  @scala.inline
  def getService[T](programPath: String, serviceName: String): js.Promise[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getService")(programPath.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Null]]
  @scala.inline
  def getService[T](programPath: String, serviceName: String, ignoreLockfile: Boolean): js.Promise[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getService")(programPath.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], ignoreLockfile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Null]]
  
  @scala.inline
  def getServices(programPath: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServices")(programPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  type UnlockFn = js.Function0[js.Promise[Unit]]
}
