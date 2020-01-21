package typings.elasticApmNode.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Inlined from @types/connect - start
@JSImport("elastic-apm-node", "Connect")
@js.native
object Connect extends js.Object {
  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ NextFunction, 
    Unit
  ]
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
}

