package typings.fundamentalDashReact.libActionBarActionBarMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBarProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* Set to **true** for mobile view of the Action Bar.*/
  var mobile: js.UndefOr[Boolean] = js.undefined
  /* The width of the Action Bar in mobile view. */
  var width: js.UndefOr[String] = js.undefined
}

object ActionBarProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    mobile: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): ActionBarProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBarProps]
  }
}

