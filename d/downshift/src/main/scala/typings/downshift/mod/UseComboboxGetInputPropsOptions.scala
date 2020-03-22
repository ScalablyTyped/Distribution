package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseComboboxGetInputPropsOptions
  extends GetInputPropsOptions
     with GetPropsWithRefKey

object UseComboboxGetInputPropsOptions {
  @scala.inline
  def apply(GetInputPropsOptions: GetInputPropsOptions = null, GetPropsWithRefKey: GetPropsWithRefKey = null): UseComboboxGetInputPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (GetInputPropsOptions != null) js.Dynamic.global.Object.assign(__obj, GetInputPropsOptions)
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    __obj.asInstanceOf[UseComboboxGetInputPropsOptions]
  }
}

