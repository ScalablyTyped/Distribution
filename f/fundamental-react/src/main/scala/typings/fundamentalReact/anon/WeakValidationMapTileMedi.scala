package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileMediaProps> */
@js.native
trait WeakValidationMapTileMedi extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var productTile: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapTileMedi {
  @scala.inline
  def apply(): WeakValidationMapTileMedi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileMedi]
  }
  @scala.inline
  implicit class WeakValidationMapTileMediOps[Self <: WeakValidationMapTileMedi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setProductTile(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("productTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductTile: Self = this.set("productTile", js.undefined)
  }
  
}

