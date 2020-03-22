package typings.fundamentalReact

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileActionsProps> */
trait WeakValidationMapTileActi extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}

object WeakValidationMapTileActi {
  @scala.inline
  def apply(className: Validator[js.UndefOr[Null | String]] = null): WeakValidationMapTileActi = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapTileActi]
  }
}

