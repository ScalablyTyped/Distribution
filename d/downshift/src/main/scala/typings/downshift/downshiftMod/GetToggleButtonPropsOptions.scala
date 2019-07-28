package typings.downshift.downshiftMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetToggleButtonPropsOptions extends HTMLProps[HTMLButtonElement]

object GetToggleButtonPropsOptions {
  @scala.inline
  def apply(HTMLProps: HTMLProps[HTMLButtonElement] = null, disabled: js.UndefOr[Boolean] = js.undefined): GetToggleButtonPropsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[GetToggleButtonPropsOptions]
  }
}

