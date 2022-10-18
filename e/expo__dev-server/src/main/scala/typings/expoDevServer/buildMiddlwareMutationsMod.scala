package typings.expoDevServer

import typings.connect.mod.HandleFunction
import typings.connect.mod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMiddlwareMutationsMod {
  
  @JSImport("@expo/dev-server/build/middlwareMutations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prependMiddleware(app: Server, middleware: HandleFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prependMiddleware")(app.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceMiddlewareWith(app: Server, sourceMiddleware: HandleFunction, targetMiddleware: HandleFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceMiddlewareWith")(app.asInstanceOf[js.Any], sourceMiddleware.asInstanceOf[js.Any], targetMiddleware.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
