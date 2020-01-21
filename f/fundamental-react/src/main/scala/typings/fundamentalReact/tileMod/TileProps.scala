package typings.fundamentalReact.tileMod

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

trait TileProps
  extends /* x */ StringDictionary[js.Any] {
  /* Sets a background color class. */
  var backgroundColor: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /* Sets a background color accent class. Options include numbers from 1 to 9. */
  var colorAccent: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  /* Number of columns the tile covers. */
  var columnSpan: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to mark component as a product tile. */
  var productTile: js.UndefOr[Boolean] = js.undefined
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
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    productTile: js.UndefOr[Boolean] = js.undefined,
    rowSpan: Int | Double = null
  ): TileProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colorAccent != null) __obj.updateDynamic("colorAccent")(colorAccent.asInstanceOf[js.Any])
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(productTile)) __obj.updateDynamic("productTile")(productTile.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileProps]
  }
}

