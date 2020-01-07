package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_ErrorsAnonCodeLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedInstanceLastAttempt extends js.Object {
  /**
    * [Output Only] Encountered errors during the last attempt to create or
    * delete the instance.
    */
  var errors: js.UndefOr[Anon_ErrorsAnonCodeLocation] = js.native
}

object Schema$ManagedInstanceLastAttempt {
  @scala.inline
  def apply(errors: Anon_ErrorsAnonCodeLocation = null): Schema$ManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedInstanceLastAttempt]
  }
}

