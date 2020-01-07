package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UrlMapsValidateResponse extends js.Object {
  var result: js.UndefOr[Schema$UrlMapValidationResult] = js.native
}

object Schema$UrlMapsValidateResponse {
  @scala.inline
  def apply(result: Schema$UrlMapValidationResult = null): Schema$UrlMapsValidateResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlMapsValidateResponse]
  }
}

