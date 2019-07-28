package typings.easyDashXDashHeaders

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressMod {
  type Errback = js.Function1[/* err */ Error, Unit]
  type ErrorRequestHandler = js.Function4[/* err */ js.Any, /* req */ Request, /* res */ Response, /* next */ js.Function, js.Any]
  type Handler = RequestHandler
  type RequestHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ js.Function, js.Any]
  type RequestParamHandler = js.Function4[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ js.Function, 
    /* param */ js.Any, 
    js.Any
  ]
}
