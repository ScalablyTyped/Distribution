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
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
trait WeakValidationMapTileProp extends js.Object {
  var backgroundColor: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var colorAccent: js.UndefOr[
    Validator[js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | Null]]
  ] = js.undefined
  var columnSpan: js.UndefOr[Validator[js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | Null]]] = js.undefined
  var customStyles: js.UndefOr[Validator[js.UndefOr[Null | StringDictionary[_]]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var productTile: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var rowSpan: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
}

object WeakValidationMapTileProp {
  @scala.inline
  def apply(
    backgroundColor: Validator[js.UndefOr[Double | Null]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    colorAccent: Validator[js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | Null]] = null,
    columnSpan: Validator[js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | Null]] = null,
    customStyles: Validator[js.UndefOr[Null | StringDictionary[_]]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    productTile: Validator[js.UndefOr[Boolean | Null]] = null,
    rowSpan: Validator[js.UndefOr[Double | Null]] = null
  ): WeakValidationMapTileProp = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colorAccent != null) __obj.updateDynamic("colorAccent")(colorAccent.asInstanceOf[js.Any])
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (productTile != null) __obj.updateDynamic("productTile")(productTile.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapTileProp]
  }
}

