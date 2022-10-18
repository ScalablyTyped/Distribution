package typings.expoDevServer

import typings.expoDevServer.anon.Body
import typings.expoDevServer.anon.Compiler
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildWebpackSymbolicateMiddlewareMod {
  
  @JSImport("@expo/dev-server/build/webpack/symbolicateMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSymbolicateMiddleware(hasProjectRootLoggerCompiler: Compiler): js.Function2[
    /* req */ IncomingMessage & Body, 
    /* res */ ServerResponse[IncomingMessage], 
    js.Promise[ServerResponse[IncomingMessage]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSymbolicateMiddleware")(hasProjectRootLoggerCompiler.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* req */ IncomingMessage & Body, 
    /* res */ ServerResponse[IncomingMessage], 
    js.Promise[ServerResponse[IncomingMessage]]
  ]]
}
