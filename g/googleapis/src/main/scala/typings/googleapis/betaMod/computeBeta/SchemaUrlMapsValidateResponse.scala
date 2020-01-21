package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrlMapsValidateResponse extends js.Object {
  var result: js.UndefOr[SchemaUrlMapValidationResult] = js.native
}

object SchemaUrlMapsValidateResponse {
  @scala.inline
  def apply(result: SchemaUrlMapValidationResult = null): SchemaUrlMapsValidateResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlMapsValidateResponse]
  }
}

