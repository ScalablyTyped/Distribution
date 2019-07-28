package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClientDotCompute.Anon_Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedInstanceLastAttempt extends js.Object {
  /** [Output Only] Encountered errors during the last attempt to create or delete the instance. */
  var errors: js.UndefOr[Anon_Errors] = js.undefined
}

object ManagedInstanceLastAttempt {
  @scala.inline
  def apply(errors: Anon_Errors = null): ManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[ManagedInstanceLastAttempt]
  }
}

