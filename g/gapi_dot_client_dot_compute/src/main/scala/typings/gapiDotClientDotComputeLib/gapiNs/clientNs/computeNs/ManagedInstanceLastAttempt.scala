package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedInstanceLastAttempt extends js.Object {
  /** [Output Only] Encountered errors during the last attempt to create or delete the instance. */
  var errors: js.UndefOr[gapiDotClientDotComputeLib.Anon_Errors] = js.undefined
}

object ManagedInstanceLastAttempt {
  @scala.inline
  def apply(errors: gapiDotClientDotComputeLib.Anon_Errors = null): ManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[ManagedInstanceLastAttempt]
  }
}

