package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCheckAccessResponse extends js.Object {
  /**
    * Returns true if principal has access.  Returns false otherwise.
    */
  var hasAccess: js.UndefOr[Boolean] = js.native
}

object SchemaCheckAccessResponse {
  @scala.inline
  def apply(hasAccess: js.UndefOr[Boolean] = js.undefined): SchemaCheckAccessResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasAccess)) __obj.updateDynamic("hasAccess")(hasAccess.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCheckAccessResponse]
  }
}

