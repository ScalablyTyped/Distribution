package typings.expressToKoa

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    middleware: js.Function3[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(middleware.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("express-to-koa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
