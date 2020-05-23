package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMultipleSelectionComboboxGetDropdownProps
  extends GetInputPropsOptions
     with GetPropsWithRefKey
     with UseMultipleSelectionGetDropdownProps {
  var preventKeyAction: js.UndefOr[Boolean] = js.undefined
}

object UseMultipleSelectionComboboxGetDropdownProps {
  @scala.inline
  def apply(
    GetInputPropsOptions: GetInputPropsOptions = null,
    GetPropsWithRefKey: GetPropsWithRefKey = null,
    UseMultipleSelectionGetDropdownProps: UseMultipleSelectionGetDropdownProps = null,
    preventKeyAction: js.UndefOr[Boolean] = js.undefined
  ): UseMultipleSelectionComboboxGetDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (GetInputPropsOptions != null) js.Dynamic.global.Object.assign(__obj, GetInputPropsOptions)
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    if (UseMultipleSelectionGetDropdownProps != null) js.Dynamic.global.Object.assign(__obj, UseMultipleSelectionGetDropdownProps)
    if (!js.isUndefined(preventKeyAction)) __obj.updateDynamic("preventKeyAction")(preventKeyAction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionComboboxGetDropdownProps]
  }
}

