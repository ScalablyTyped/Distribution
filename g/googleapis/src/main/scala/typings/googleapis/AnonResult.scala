package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResult extends js.Object {
  var details: js.UndefOr[js.Array[AnonArgs]] = js.native
  var result: js.UndefOr[AnonArgs] = js.native
}

object AnonResult {
  @scala.inline
  def apply(details: js.Array[AnonArgs] = null, result: AnonArgs = null): AnonResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResult]
  }
}

