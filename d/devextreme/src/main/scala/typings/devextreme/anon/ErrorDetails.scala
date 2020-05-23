package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetails extends js.Object {
  var errorDetails: js.UndefOr[js.Any] = js.undefined
  var httpStatus: js.UndefOr[Double] = js.undefined
  var requestOptions: js.UndefOr[js.Any] = js.undefined
}

object ErrorDetails {
  @scala.inline
  def apply(
    errorDetails: js.Any = null,
    httpStatus: js.UndefOr[Double] = js.undefined,
    requestOptions: js.Any = null
  ): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(httpStatus)) __obj.updateDynamic("httpStatus")(httpStatus.get.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
}

