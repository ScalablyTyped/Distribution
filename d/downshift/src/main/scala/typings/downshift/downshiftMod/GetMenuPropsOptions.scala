package typings.downshift.downshiftMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMenuPropsOptions extends HTMLProps[HTMLElement] {
  var refKey: js.UndefOr[String] = js.undefined
}

object GetMenuPropsOptions {
  @scala.inline
  def apply(HTMLProps: HTMLProps[HTMLElement] = null, `aria-label`: String = null, refKey: String = null): GetMenuPropsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (refKey != null) __obj.updateDynamic("refKey")(refKey)
    __obj.asInstanceOf[GetMenuPropsOptions]
  }
}

