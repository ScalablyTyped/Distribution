package typings.expressDashToDashKoa

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-to-koa", JSImport.Namespace)
@js.native
object expressDashToDashKoaMod extends js.Object {
  def apply(
    middleware: js.Function3[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Middleware[DefaultState, DefaultContext] = js.native
}

