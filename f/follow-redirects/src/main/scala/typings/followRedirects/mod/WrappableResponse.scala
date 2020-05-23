package typings.followRedirects.mod

import typings.followRedirects.anon.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappableResponse extends js.Object {
  var headers: Location
  var statusCode: js.UndefOr[Double] = js.undefined
  def destroy(): js.Any
}

object WrappableResponse {
  @scala.inline
  def apply(destroy: () => js.Any, headers: Location, statusCode: js.UndefOr[Double] = js.undefined): WrappableResponse = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), headers = headers.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappableResponse]
  }
}

