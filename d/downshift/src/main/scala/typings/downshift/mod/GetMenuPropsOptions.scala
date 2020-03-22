package typings.downshift.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMenuPropsOptions
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with GetPropsWithRefKey

object GetMenuPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    GetPropsWithRefKey: GetPropsWithRefKey = null
  ): GetMenuPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    __obj.asInstanceOf[GetMenuPropsOptions]
  }
}

