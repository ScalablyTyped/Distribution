package typings.fundamentalDashReact.libTileTileMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`1`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`2`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`3`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`4`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`5`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`6`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`7`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`8`
import typings.fundamentalDashReact.fundamentalDashReactNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileProps
  extends /* x */ StringDictionary[js.Any] {
  /* Sets a background color class. */
  var backgroundColor: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /* Sets a background color accent class. Options include numbers from 1 to 9. */
  var colorAccent: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  /* Number of columns the tile covers. */
  var columnSpan: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /* Number of rows the tile covers. */
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object TileProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    backgroundColor: Int | Double = null,
    className: String = null,
    colorAccent: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    columnSpan: `1` | `2` | `3` | `4` | `5` | `6` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    rowSpan: Int | Double = null
  ): TileProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (colorAccent != null) __obj.updateDynamic("colorAccent")(colorAccent.asInstanceOf[js.Any])
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileProps]
  }
}

