package typings.atEmberController

import typings.atEmberController.atEmberControllerMod.QueryParamScopeTypes
import typings.atEmberController.atEmberControllerMod.QueryParamTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[QueryParamScopeTypes] = js.undefined
  var `type`: js.UndefOr[QueryParamTypes] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply(as: String = null, scope: QueryParamScopeTypes = null, `type`: QueryParamTypes = null): Anon_As = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_As]
  }
}

