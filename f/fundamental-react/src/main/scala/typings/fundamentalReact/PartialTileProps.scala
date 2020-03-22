package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.fundamentalReactNumbers.`1`
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.fundamentalReact.fundamentalReactNumbers.`7`
import typings.fundamentalReact.fundamentalReactNumbers.`8`
import typings.fundamentalReact.fundamentalReactNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
trait PartialTileProps extends js.Object {
  var backgroundColor: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colorAccent: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  var columnSpan: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var productTile: js.UndefOr[Boolean] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object PartialTileProps {
  @scala.inline
  def apply(
    backgroundColor: Int | Double = null,
    className: String = null,
    colorAccent: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    columnSpan: `1` | `2` | `3` | `4` | `5` | `6` = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    productTile: js.UndefOr[Boolean] = js.undefined,
    rowSpan: Int | Double = null
  ): PartialTileProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colorAccent != null) __obj.updateDynamic("colorAccent")(colorAccent.asInstanceOf[js.Any])
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(productTile)) __obj.updateDynamic("productTile")(productTile.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTileProps]
  }
}

