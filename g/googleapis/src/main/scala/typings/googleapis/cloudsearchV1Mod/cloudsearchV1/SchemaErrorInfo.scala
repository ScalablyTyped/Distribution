package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error information about the response.
  */
@js.native
trait SchemaErrorInfo extends js.Object {
  var errorMessages: js.UndefOr[js.Array[SchemaErrorMessage]] = js.native
}

object SchemaErrorInfo {
  @scala.inline
  def apply(errorMessages: js.Array[SchemaErrorMessage] = null): SchemaErrorInfo = {
    val __obj = js.Dynamic.literal()
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorInfo]
  }
}

