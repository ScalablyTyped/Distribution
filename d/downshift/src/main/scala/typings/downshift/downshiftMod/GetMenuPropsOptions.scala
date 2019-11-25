package typings.downshift.downshiftMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMenuPropsOptions
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var refKey: js.UndefOr[String] = js.undefined
}

object GetMenuPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    refKey: String = null
  ): GetMenuPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (refKey != null) __obj.updateDynamic("refKey")(refKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMenuPropsOptions]
  }
}

