package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error information about the response.
  */
@js.native
trait Schema$ErrorInfo extends js.Object {
  var errorMessages: js.UndefOr[js.Array[Schema$ErrorMessage]] = js.native
}

object Schema$ErrorInfo {
  @scala.inline
  def apply(errorMessages: js.Array[Schema$ErrorMessage] = null): Schema$ErrorInfo = {
    val __obj = js.Dynamic.literal()
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ErrorInfo]
  }
}

