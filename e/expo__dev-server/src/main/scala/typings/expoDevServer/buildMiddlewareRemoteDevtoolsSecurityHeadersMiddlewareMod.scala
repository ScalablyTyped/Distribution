package typings.expoDevServer

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMiddlewareRemoteDevtoolsSecurityHeadersMiddlewareMod {
  
  @JSImport("@expo/dev-server/build/middleware/remoteDevtoolsSecurityHeadersMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def remoteDevtoolsSecurityHeadersMiddleware(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteDevtoolsSecurityHeadersMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
