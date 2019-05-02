package typings
package fundamentalDashReactLib.libIconIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var glyph: java.lang.String
  /* Size of the icon. Options include **xs**, **s**, **compact**, and **l**. If no size is provided, default (normal) will be used. */
  var size: js.UndefOr[IconSize] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    glyph: java.lang.String,
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    size: IconSize = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(glyph = glyph)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[IconProps]
  }
}

