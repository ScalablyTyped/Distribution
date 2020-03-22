package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseComboboxGetToggleButtonPropsOptions
  extends GetToggleButtonPropsOptions
     with GetPropsWithRefKey

object UseComboboxGetToggleButtonPropsOptions {
  @scala.inline
  def apply(
    GetPropsWithRefKey: GetPropsWithRefKey = null,
    GetToggleButtonPropsOptions: GetToggleButtonPropsOptions = null
  ): UseComboboxGetToggleButtonPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    if (GetToggleButtonPropsOptions != null) js.Dynamic.global.Object.assign(__obj, GetToggleButtonPropsOptions)
    __obj.asInstanceOf[UseComboboxGetToggleButtonPropsOptions]
  }
}

