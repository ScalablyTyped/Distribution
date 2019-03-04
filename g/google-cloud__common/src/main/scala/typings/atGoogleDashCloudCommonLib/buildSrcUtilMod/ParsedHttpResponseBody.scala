package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHttpResponseBody extends js.Object {
  var body: ResponseBody
  var err: js.UndefOr[nodeLib.Error] = js.undefined
}

object ParsedHttpResponseBody {
  @scala.inline
  def apply(body: ResponseBody, err: nodeLib.Error = null): ParsedHttpResponseBody = {
    val __obj = js.Dynamic.literal(body = body)
    if (err != null) __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[ParsedHttpResponseBody]
  }
}

