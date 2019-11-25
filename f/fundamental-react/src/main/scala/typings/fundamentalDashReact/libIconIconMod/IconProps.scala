package typings.fundamentalDashReact.libIconIconMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var glyph: String
  /* Size of the icon. Options include **xs**, **s**, **compact**, and **l**. If no size is provided, default (normal) will be used. */
  var size: js.UndefOr[IconSize] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    glyph: String,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    size: IconSize = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

