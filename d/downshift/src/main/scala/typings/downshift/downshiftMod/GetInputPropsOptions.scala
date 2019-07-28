package typings.downshift.downshiftMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInputPropsOptions extends HTMLProps[HTMLInputElement]

object GetInputPropsOptions {
  @scala.inline
  def apply(HTMLProps: HTMLProps[HTMLInputElement] = null, disabled: js.UndefOr[Boolean] = js.undefined): GetInputPropsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[GetInputPropsOptions]
  }
}

