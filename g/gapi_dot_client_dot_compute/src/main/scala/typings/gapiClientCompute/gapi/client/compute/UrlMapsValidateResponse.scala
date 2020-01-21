package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapsValidateResponse extends js.Object {
  var result: js.UndefOr[UrlMapValidationResult] = js.undefined
}

object UrlMapsValidateResponse {
  @scala.inline
  def apply(result: UrlMapValidationResult = null): UrlMapsValidateResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMapsValidateResponse]
  }
}

