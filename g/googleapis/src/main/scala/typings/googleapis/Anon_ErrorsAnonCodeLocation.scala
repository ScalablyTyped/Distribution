package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ErrorsAnonCodeLocation extends js.Object {
  var errors: js.UndefOr[js.Array[Anon_CodeLocation]] = js.native
}

object Anon_ErrorsAnonCodeLocation {
  @scala.inline
  def apply(errors: js.Array[Anon_CodeLocation] = null): Anon_ErrorsAnonCodeLocation = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorsAnonCodeLocation]
  }
}

