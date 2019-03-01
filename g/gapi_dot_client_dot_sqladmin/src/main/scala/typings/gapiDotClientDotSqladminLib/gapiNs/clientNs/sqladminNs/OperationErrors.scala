package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationErrors extends js.Object {
  /** The list of errors encountered while processing this operation. */
  var errors: js.UndefOr[js.Array[OperationError]] = js.undefined
  /** This is always sql#operationErrors. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object OperationErrors {
  @scala.inline
  def apply(errors: js.Array[OperationError] = null, kind: java.lang.String = null): OperationErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OperationErrors]
  }
}

