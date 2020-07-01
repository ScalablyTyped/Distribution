package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorsArray extends js.Object {
  var errors: js.UndefOr[js.Array[Location]] = js.native
}

object ErrorsArray {
  @scala.inline
  def apply(errors: js.Array[Location] = null): ErrorsArray = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorsArray]
  }
}

