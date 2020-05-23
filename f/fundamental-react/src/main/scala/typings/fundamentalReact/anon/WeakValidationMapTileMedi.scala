package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileMediaProps> */
trait WeakValidationMapTileMedi extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var productTile: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}

object WeakValidationMapTileMedi {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    productTile: Validator[js.UndefOr[Boolean | Null]] = null
  ): WeakValidationMapTileMedi = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (productTile != null) __obj.updateDynamic("productTile")(productTile.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapTileMedi]
  }
}

