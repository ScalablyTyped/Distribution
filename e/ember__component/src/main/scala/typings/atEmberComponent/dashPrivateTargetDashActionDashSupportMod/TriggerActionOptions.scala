package typings.atEmberComponent.dashPrivateTargetDashActionDashSupportMod

import typings.atEmberObject.atEmberObjectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
trait TriggerActionOptions extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var actionContext: js.UndefOr[default] = js.undefined
  var target: js.UndefOr[default] = js.undefined
}

object TriggerActionOptions {
  @scala.inline
  def apply(action: String = null, actionContext: default = null, target: default = null): TriggerActionOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actionContext != null) __obj.updateDynamic("actionContext")(actionContext.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerActionOptions]
  }
}

