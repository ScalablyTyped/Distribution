package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CheckAccessResponse extends js.Object {
  /**
    * Returns true if principal has access.  Returns false otherwise.
    */
  var hasAccess: js.UndefOr[Boolean] = js.native
}

object Schema$CheckAccessResponse {
  @scala.inline
  def apply(hasAccess: js.UndefOr[Boolean] = js.undefined): Schema$CheckAccessResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasAccess)) __obj.updateDynamic("hasAccess")(hasAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CheckAccessResponse]
  }
}

