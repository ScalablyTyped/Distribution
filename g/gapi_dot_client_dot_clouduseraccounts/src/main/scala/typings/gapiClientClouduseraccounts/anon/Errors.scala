package typings.gapiClientClouduseraccounts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  /** [Output Only] The array of errors encountered while processing this operation. */
  var errors: js.UndefOr[js.Array[Code]] = js.undefined
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[Code] = null): Errors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

