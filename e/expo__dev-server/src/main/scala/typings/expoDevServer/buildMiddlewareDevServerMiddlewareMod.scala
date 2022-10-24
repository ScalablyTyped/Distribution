package typings.expoDevServer

import typings.expoDevServer.anon.AttachToServer
import typings.expoDevServer.anon.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMiddlewareDevServerMiddlewareMod {
  
  @JSImport("@expo/dev-server/build/middleware/devServerMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDevServerMiddleware(projectRoot: String, param1: Logger): AttachToServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createDevServerMiddleware")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[AttachToServer]
}
