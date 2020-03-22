package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorsArray extends js.Object {
  var errors: js.UndefOr[js.Array[AnonLocation]] = js.native
}

object AnonErrorsArray {
  @scala.inline
  def apply(errors: js.Array[AnonLocation] = null): AnonErrorsArray = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorsArray]
  }
}

