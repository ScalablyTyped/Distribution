package typings
package fundamentalDashReactLib.libTileTileGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileGridProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var col: js.UndefOr[
    fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6`
  ] = js.undefined
}

object TileGridProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    col: fundamentalDashReactLib.fundamentalDashReactLibNumbers.`1` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`2` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`3` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`4` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`5` | fundamentalDashReactLib.fundamentalDashReactLibNumbers.`6` = null
  ): TileGridProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileGridProps]
  }
}

