package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedInstanceLastAttempt extends js.Object {
  /** [Output Only] Encountered errors during the last attempt to create or delete the instance. */
  var errors: js.UndefOr[AnonErrors] = js.undefined
}

object ManagedInstanceLastAttempt {
  @scala.inline
  def apply(errors: AnonErrors = null): ManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedInstanceLastAttempt]
  }
}

