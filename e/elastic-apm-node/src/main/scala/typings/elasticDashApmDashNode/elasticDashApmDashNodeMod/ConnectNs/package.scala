package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ConnectNs {
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.ServerResponse

  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ NextFunction, 
    Unit
  ]
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
}
