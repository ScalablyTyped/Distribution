package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectGetToggleButtonPropsOptions
  extends GetToggleButtonPropsOptions
     with GetPropsWithRefKey

object UseSelectGetToggleButtonPropsOptions {
  @scala.inline
  def apply(
    GetPropsWithRefKey: GetPropsWithRefKey = null,
    GetToggleButtonPropsOptions: GetToggleButtonPropsOptions = null
  ): UseSelectGetToggleButtonPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    if (GetToggleButtonPropsOptions != null) js.Dynamic.global.Object.assign(__obj, GetToggleButtonPropsOptions)
    __obj.asInstanceOf[UseSelectGetToggleButtonPropsOptions]
  }
}

