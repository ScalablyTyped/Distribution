package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetToggleButtonPropsOptions
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLButtonElement]

object GetToggleButtonPropsOptions {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLButtonElement] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): GetToggleButtonPropsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[GetToggleButtonPropsOptions]
  }
}

