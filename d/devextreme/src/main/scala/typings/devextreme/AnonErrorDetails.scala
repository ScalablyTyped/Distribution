package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorDetails extends js.Object {
  var errorDetails: js.UndefOr[js.Any] = js.undefined
  var httpStatus: js.UndefOr[Double] = js.undefined
  var requestOptions: js.UndefOr[js.Any] = js.undefined
}

object AnonErrorDetails {
  @scala.inline
  def apply(errorDetails: js.Any = null, httpStatus: Int | Double = null, requestOptions: js.Any = null): AnonErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    if (httpStatus != null) __obj.updateDynamic("httpStatus")(httpStatus.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorDetails]
  }
}

