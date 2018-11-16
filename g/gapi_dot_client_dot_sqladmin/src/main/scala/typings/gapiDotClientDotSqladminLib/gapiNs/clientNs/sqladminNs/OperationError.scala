package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OperationError extends js.Object {
  /** Identifies the specific error that occurred. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#operationError. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Additional information about the error encountered. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

