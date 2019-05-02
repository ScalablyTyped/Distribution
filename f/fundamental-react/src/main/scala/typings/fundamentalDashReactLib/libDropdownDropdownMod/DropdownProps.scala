package typings
package fundamentalDashReactLib.libDropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Set to **true** to enable a dropdown for toolbar. */
  var standard: js.UndefOr[scala.Boolean] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    standard: js.UndefOr[scala.Boolean] = js.undefined
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(standard)) __obj.updateDynamic("standard")(standard)
    __obj.asInstanceOf[DropdownProps]
  }
}

