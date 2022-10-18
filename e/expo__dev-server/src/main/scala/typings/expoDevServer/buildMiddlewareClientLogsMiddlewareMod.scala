package typings.expoDevServer

import typings.connect.mod.HandleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMiddlewareClientLogsMiddlewareMod {
  
  @JSImport("@expo/dev-server/build/middleware/clientLogsMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(logger: typings.expoBunyan.mod.^): HandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(logger.asInstanceOf[js.Any]).asInstanceOf[HandleFunction]
  
  inline def getDevicePlatformFromAppRegistryStartupMessage(body: js.Array[String]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevicePlatformFromAppRegistryStartupMessage")(body.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
