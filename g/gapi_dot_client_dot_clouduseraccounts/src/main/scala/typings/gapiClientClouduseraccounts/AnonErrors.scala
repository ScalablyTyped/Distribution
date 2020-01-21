package typings.gapiClientClouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  /** [Output Only] The array of errors encountered while processing this operation. */
  var errors: js.UndefOr[js.Array[AnonCode]] = js.undefined
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[AnonCode] = null): AnonErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrors]
  }
}

