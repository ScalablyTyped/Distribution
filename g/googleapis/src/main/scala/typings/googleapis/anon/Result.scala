package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var details: js.UndefOr[js.Array[Args]] = js.native
  var result: js.UndefOr[Args] = js.native
}

object Result {
  @scala.inline
  def apply(details: js.Array[Args] = null, result: Args = null): Result = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

