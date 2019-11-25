package typings.fundamentalDashReact.libPanelPanelGridMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`1`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelGridProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  /* The number of columns in the grid. */
  var cols: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  /* Set to **true** to remove the margins between the panels. */
  var nogap: js.UndefOr[Boolean] = js.undefined
}

object PanelGridProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    cols: `1` | `2` | `3` | `4` | `5` | `6` = null,
    nogap: js.UndefOr[Boolean] = js.undefined
  ): PanelGridProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (!js.isUndefined(nogap)) __obj.updateDynamic("nogap")(nogap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelGridProps]
  }
}

