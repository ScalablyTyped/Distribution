package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.downshift.mod.UseMultipleSelectionSelectGetDropdownProps
  - typings.downshift.mod.UseMultipleSelectionComboboxGetDropdownProps
*/
trait UseMultipleSelectionGetDropdownProps extends js.Object

object UseMultipleSelectionGetDropdownProps {
  @scala.inline
  def UseMultipleSelectionSelectGetDropdownProps(
    GetPropsWithRefKey: GetPropsWithRefKey = null,
    GetToggleButtonPropsOptions: GetToggleButtonPropsOptions = null,
    UseMultipleSelectionGetDropdownProps: UseMultipleSelectionGetDropdownProps = null,
    preventKeyAction: js.UndefOr[Boolean] = js.undefined
  ): UseMultipleSelectionGetDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    if (GetToggleButtonPropsOptions != null) js.Dynamic.global.Object.assign(__obj, GetToggleButtonPropsOptions)
    if (UseMultipleSelectionGetDropdownProps != null) js.Dynamic.global.Object.assign(__obj, UseMultipleSelectionGetDropdownProps)
    if (!js.isUndefined(preventKeyAction)) __obj.updateDynamic("preventKeyAction")(preventKeyAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionGetDropdownProps]
  }
  @scala.inline
  def UseMultipleSelectionComboboxGetDropdownProps(
    GetInputPropsOptions: GetInputPropsOptions = null,
    GetPropsWithRefKey: GetPropsWithRefKey = null,
    UseMultipleSelectionGetDropdownProps: UseMultipleSelectionGetDropdownProps = null,
    preventKeyAction: js.UndefOr[Boolean] = js.undefined
  ): UseMultipleSelectionGetDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (GetInputPropsOptions != null) js.Dynamic.global.Object.assign(__obj, GetInputPropsOptions)
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    if (UseMultipleSelectionGetDropdownProps != null) js.Dynamic.global.Object.assign(__obj, UseMultipleSelectionGetDropdownProps)
    if (!js.isUndefined(preventKeyAction)) __obj.updateDynamic("preventKeyAction")(preventKeyAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionGetDropdownProps]
  }
}

