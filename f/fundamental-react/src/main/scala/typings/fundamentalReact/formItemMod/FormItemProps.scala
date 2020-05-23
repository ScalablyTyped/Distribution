package typings.fundamentalReact.formItemMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var isHorizontal: js.UndefOr[Boolean] = js.undefined
  var isInline: js.UndefOr[Boolean] = js.undefined
}

object FormItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    isHorizontal: js.UndefOr[Boolean] = js.undefined,
    isInline: js.UndefOr[Boolean] = js.undefined
  ): FormItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHorizontal)) __obj.updateDynamic("isHorizontal")(isHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemProps]
  }
}

