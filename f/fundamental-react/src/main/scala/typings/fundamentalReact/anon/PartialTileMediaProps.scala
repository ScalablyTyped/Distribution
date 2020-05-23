package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileMediaProps> */
trait PartialTileMediaProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var productTile: js.UndefOr[Boolean] = js.undefined
}

object PartialTileMediaProps {
  @scala.inline
  def apply(className: String = null, productTile: js.UndefOr[Boolean] = js.undefined): PartialTileMediaProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(productTile)) __obj.updateDynamic("productTile")(productTile.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTileMediaProps]
  }
}

