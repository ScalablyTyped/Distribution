package typings.followDashRedirects.followDashRedirectsMod

import typings.followDashRedirects.Anon_Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappableResponse extends js.Object {
  var headers: Anon_Location
  var statusCode: js.UndefOr[Double] = js.undefined
  def destroy(): js.Any
}

object WrappableResponse {
  @scala.inline
  def apply(destroy: () => js.Any, headers: Anon_Location, statusCode: Int | Double = null): WrappableResponse = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), headers = headers)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappableResponse]
  }
}

