package typings.expressAsyncWrap

import typings.connect.mod.NextFunction
import typings.expressServeStaticCore.mod.ErrorRequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.Response
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-async-wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    handler: js.Function3[
      /* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], 
      /* res */ Response[js.Any, Double], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handler.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  @scala.inline
  def default(
    handler: js.Function4[
      /* err */ js.Any, 
      /* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], 
      /* res */ Response[js.Any, Double], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handler.asInstanceOf[js.Any]).asInstanceOf[ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
}
