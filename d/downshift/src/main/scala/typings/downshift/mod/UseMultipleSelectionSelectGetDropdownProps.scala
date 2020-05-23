package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMultipleSelectionSelectGetDropdownProps
  extends GetToggleButtonPropsOptions
     with GetPropsWithRefKey
     with UseMultipleSelectionGetDropdownProps {
  var preventKeyAction: js.UndefOr[Boolean] = js.undefined
}

object UseMultipleSelectionSelectGetDropdownProps {
  @scala.inline
  def apply(
    GetPropsWithRefKey: GetPropsWithRefKey = null,
    GetToggleButtonPropsOptions: GetToggleButtonPropsOptions = null,
    UseMultipleSelectionGetDropdownProps: UseMultipleSelectionGetDropdownProps = null,
    preventKeyAction: js.UndefOr[Boolean] = js.undefined
  ): UseMultipleSelectionSelectGetDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    if (GetToggleButtonPropsOptions != null) js.Dynamic.global.Object.assign(__obj, GetToggleButtonPropsOptions)
    if (UseMultipleSelectionGetDropdownProps != null) js.Dynamic.global.Object.assign(__obj, UseMultipleSelectionGetDropdownProps)
    if (!js.isUndefined(preventKeyAction)) __obj.updateDynamic("preventKeyAction")(preventKeyAction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionSelectGetDropdownProps]
  }
}

