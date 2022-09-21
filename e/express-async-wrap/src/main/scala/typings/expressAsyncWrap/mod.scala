package typings.expressAsyncWrap

import typings.connect.mod.NextFunction
import typings.expressServeStaticCore.mod.ErrorRequestHandler
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-async-wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    handler: js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, js.Promise[Unit]]
  ): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handler.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  inline def default(
    handler: js.Function4[
      /* err */ Any, 
      /* req */ Request, 
      /* res */ Response, 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): ErrorRequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handler.asInstanceOf[js.Any]).asInstanceOf[ErrorRequestHandler]
}
