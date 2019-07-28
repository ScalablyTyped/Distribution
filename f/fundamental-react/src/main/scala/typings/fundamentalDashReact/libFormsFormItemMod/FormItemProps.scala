package typings.fundamentalDashReact.libFormsFormItemMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* Set to **true** to render an `<input>` with `type` of **checkbox**. */
  var isCheck: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to display radio buttons and checkboxes in a row. */
  var isInline: js.UndefOr[Boolean] = js.undefined
}

object FormItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    isCheck: js.UndefOr[Boolean] = js.undefined,
    isInline: js.UndefOr[Boolean] = js.undefined
  ): FormItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(isCheck)) __obj.updateDynamic("isCheck")(isCheck)
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline)
    __obj.asInstanceOf[FormItemProps]
  }
}

