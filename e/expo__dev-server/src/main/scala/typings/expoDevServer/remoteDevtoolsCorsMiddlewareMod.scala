package typings.expoDevServer

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteDevtoolsCorsMiddlewareMod {
  
  @JSImport("@expo/dev-server/build/middleware/remoteDevtoolsCorsMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def remoteDevtoolsCorsMiddleware(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteDevtoolsCorsMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
