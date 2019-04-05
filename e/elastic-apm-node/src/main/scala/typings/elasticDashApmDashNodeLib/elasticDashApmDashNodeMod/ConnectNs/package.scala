package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ConnectNs {
  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ NextFunction, 
    scala.Unit
  ]
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
}
