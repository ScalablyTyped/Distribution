package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileMediaProps> */
@js.native
trait PartialTileMediaProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var productTile: js.UndefOr[Boolean] = js.native
}

object PartialTileMediaProps {
  @scala.inline
  def apply(): PartialTileMediaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileMediaProps]
  }
  @scala.inline
  implicit class PartialTileMediaPropsOps[Self <: PartialTileMediaProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setProductTile(value: Boolean): Self = this.set("productTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductTile: Self = this.set("productTile", js.undefined)
  }
  
}

