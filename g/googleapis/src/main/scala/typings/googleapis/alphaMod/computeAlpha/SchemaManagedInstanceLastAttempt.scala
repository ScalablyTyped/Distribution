package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.ErrorsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedInstanceLastAttempt extends js.Object {
  /**
    * [Output Only] Encountered errors during the last attempt to create or
    * delete the instance.
    */
  var errors: js.UndefOr[ErrorsArray] = js.native
}

object SchemaManagedInstanceLastAttempt {
  @scala.inline
  def apply(errors: ErrorsArray = null): SchemaManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedInstanceLastAttempt]
  }
}

