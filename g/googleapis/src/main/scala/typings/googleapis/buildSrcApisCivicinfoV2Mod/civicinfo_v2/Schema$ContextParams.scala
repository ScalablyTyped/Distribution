package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ContextParams extends js.Object {
  var clientProfile: js.UndefOr[String] = js.native
}

object Schema$ContextParams {
  @scala.inline
  def apply(clientProfile: String = null): Schema$ContextParams = {
    val __obj = js.Dynamic.literal()
    if (clientProfile != null) __obj.updateDynamic("clientProfile")(clientProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ContextParams]
  }
}

