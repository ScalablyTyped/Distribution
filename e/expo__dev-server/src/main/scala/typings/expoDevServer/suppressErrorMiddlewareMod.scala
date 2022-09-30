package typings.expoDevServer

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suppressErrorMiddlewareMod {
  
  @JSImport("@expo/dev-server/build/middleware/suppressErrorMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def suppressRemoteDebuggingErrorMiddleware(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("suppressRemoteDebuggingErrorMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
