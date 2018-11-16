package typings
package easyDashXDashHeadersLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eNs {
  type Errback = js.Function1[/* err */ nodeLib.Error, scala.Unit]
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
