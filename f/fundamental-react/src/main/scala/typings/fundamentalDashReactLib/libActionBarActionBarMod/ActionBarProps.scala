package typings
package fundamentalDashReactLib.libActionBarActionBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBarProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Set to **true** for mobile view of the Action Bar.*/
  var mobile: js.UndefOr[scala.Boolean] = js.undefined
  /* The width of the Action Bar in mobile view. */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object ActionBarProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    mobile: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null
  ): ActionBarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ActionBarProps]
  }
}

