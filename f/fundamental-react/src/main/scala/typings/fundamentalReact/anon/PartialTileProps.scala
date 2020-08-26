package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
@js.native
trait PartialTileProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var backgroundImage: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var productTile: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
}

object PartialTileProps {
  @scala.inline
  def apply(): PartialTileProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileProps]
  }
  @scala.inline
  implicit class PartialTilePropsOps[Self <: PartialTileProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setBackgroundImage(value: String): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setProductTile(value: Boolean): Self = this.set("productTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductTile: Self = this.set("productTile", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
  
}

