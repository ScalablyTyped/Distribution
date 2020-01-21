package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error message per source response.
  */
@js.native
trait SchemaErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[String] = js.native
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaErrorMessage {
  @scala.inline
  def apply(errorMessage: String = null, source: SchemaSource = null): SchemaErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorMessage]
  }
}

