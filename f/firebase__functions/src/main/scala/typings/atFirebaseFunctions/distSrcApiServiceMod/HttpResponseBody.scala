package typings.atFirebaseFunctions.distSrcApiServiceMod

import typings.atFirebaseFunctions.Anon_Details
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponseBody extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[Anon_Details] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
}

object HttpResponseBody {
  @scala.inline
  def apply(data: js.Any = null, error: Anon_Details = null, result: js.Any = null): HttpResponseBody = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseBody]
  }
}

