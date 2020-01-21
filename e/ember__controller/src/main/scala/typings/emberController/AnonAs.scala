package typings.emberController

import typings.emberController.mod.QueryParamScopeTypes
import typings.emberController.mod.QueryParamTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[QueryParamScopeTypes] = js.undefined
  var `type`: js.UndefOr[QueryParamTypes] = js.undefined
}

object AnonAs {
  @scala.inline
  def apply(as: String = null, scope: QueryParamScopeTypes = null, `type`: QueryParamTypes = null): AnonAs = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAs]
  }
}

