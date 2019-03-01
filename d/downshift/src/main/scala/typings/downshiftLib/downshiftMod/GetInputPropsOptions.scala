package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInputPropsOptions
  extends reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLInputElement]

object GetInputPropsOptions {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLInputElement] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): GetInputPropsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[GetInputPropsOptions]
  }
}

