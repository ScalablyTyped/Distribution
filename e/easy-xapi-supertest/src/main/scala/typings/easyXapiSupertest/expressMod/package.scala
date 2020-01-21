package typings.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressMod {
  type Errback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  type ErrorRequestHandler = js.Function4[
    /* err */ js.Any, 
    /* req */ typings.easyXapiSupertest.expressMod.Request, 
    /* res */ typings.easyXapiSupertest.expressMod.Response, 
    /* next */ js.Function, 
    js.Any
  ]
  type Handler = typings.easyXapiSupertest.expressMod.RequestHandler
  type RequestHandler = js.Function3[
    /* req */ typings.easyXapiSupertest.expressMod.Request, 
    /* res */ typings.easyXapiSupertest.expressMod.Response, 
    /* next */ js.Function, 
    js.Any
  ]
  type RequestParamHandler = js.Function4[
    /* req */ typings.easyXapiSupertest.expressMod.Request, 
    /* res */ typings.easyXapiSupertest.expressMod.Response, 
    /* next */ js.Function, 
    /* param */ js.Any, 
    js.Any
  ]
}
