package typings
package fundamentalDashReactLib.libTileTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Sets a background color class. */
  var backgroundColor: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Sets a background color accent class. Options include numbers from 1 to 9. */
  var colorAccent: js.UndefOr[
    fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`7` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`8` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`9`
  ] = js.undefined
  /* Number of columns the tile covers. */
  var columnSpan: js.UndefOr[
    fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6`
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /* Number of rows the tile covers. */
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
}

object TileProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    backgroundColor: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    colorAccent: fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`7` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`8` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`9` = null,
    columnSpan: fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6` = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    rowSpan: scala.Int | scala.Double = null
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

