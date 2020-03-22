package typings.downshift.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLLabelElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseComboboxGetLabelPropsOptions
  extends AllHTMLAttributes[HTMLLabelElement]
     with ClassAttributes[HTMLLabelElement]

object UseComboboxGetLabelPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLLabelElement] = null,
    ClassAttributes: ClassAttributes[HTMLLabelElement] = null
  ): UseComboboxGetLabelPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[UseComboboxGetLabelPropsOptions]
  }
}

