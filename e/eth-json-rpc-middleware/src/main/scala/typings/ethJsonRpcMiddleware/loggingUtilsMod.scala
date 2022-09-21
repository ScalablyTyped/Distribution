package typings.ethJsonRpcMiddleware

import typings.debug.mod.Debugger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingUtilsMod {
  
  @JSImport("eth-json-rpc-middleware/dist/logging-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createModuleLogger(projectLogger: Debugger, moduleName: String): Debugger = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleLogger")(projectLogger.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[Debugger]
  
  @JSImport("eth-json-rpc-middleware/dist/logging-utils", "projectLogger")
  @js.native
  val projectLogger: Debugger = js.native
}
