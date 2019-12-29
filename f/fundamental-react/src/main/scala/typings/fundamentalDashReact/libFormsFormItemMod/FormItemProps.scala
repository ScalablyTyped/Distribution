package typings.fundamentalDashReact.libFormsFormItemMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
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
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    isCheck: js.UndefOr[Boolean] = js.undefined,
    isInline: js.UndefOr[Boolean] = js.undefined
  ): FormItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(isCheck)) __obj.updateDynamic("isCheck")(isCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemProps]
  }
}

