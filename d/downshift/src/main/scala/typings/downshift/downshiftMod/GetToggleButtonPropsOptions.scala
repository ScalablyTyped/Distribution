package typings.downshift.downshiftMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetToggleButtonPropsOptions
  extends AllHTMLAttributes[HTMLButtonElement]
     with ClassAttributes[HTMLButtonElement]

object GetToggleButtonPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLButtonElement] = null,
    ClassAttributes: ClassAttributes[HTMLButtonElement] = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): GetToggleButtonPropsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[GetToggleButtonPropsOptions]
  }
}

