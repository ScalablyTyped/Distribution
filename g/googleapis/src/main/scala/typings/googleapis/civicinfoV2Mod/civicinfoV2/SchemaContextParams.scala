package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaContextParams extends js.Object {
  var clientProfile: js.UndefOr[String] = js.native
}

object SchemaContextParams {
  @scala.inline
  def apply(clientProfile: String = null): SchemaContextParams = {
    val __obj = js.Dynamic.literal()
    if (clientProfile != null) __obj.updateDynamic("clientProfile")(clientProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContextParams]
  }
}

