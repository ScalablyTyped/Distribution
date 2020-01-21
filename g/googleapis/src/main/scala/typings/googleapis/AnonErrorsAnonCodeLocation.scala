package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorsAnonCodeLocation extends js.Object {
  var errors: js.UndefOr[js.Array[AnonCodeLocation]] = js.native
}

object AnonErrorsAnonCodeLocation {
  @scala.inline
  def apply(errors: js.Array[AnonCodeLocation] = null): AnonErrorsAnonCodeLocation = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorsAnonCodeLocation]
  }
}

