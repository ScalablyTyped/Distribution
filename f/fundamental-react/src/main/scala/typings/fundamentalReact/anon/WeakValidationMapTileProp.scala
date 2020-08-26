package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
@js.native
trait WeakValidationMapTileProp extends js.Object {
  var active: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var backgroundImage: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.native
  var productTile: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
}

object WeakValidationMapTileProp {
  @scala.inline
  def apply(): WeakValidationMapTileProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileProp]
  }
  @scala.inline
  implicit class WeakValidationMapTilePropOps[Self <: WeakValidationMapTileProp] (val x: Self) extends AnyVal {
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
    def setActive(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setBackgroundImage(value: Validator[js.UndefOr[Null | String]]): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setProductTile(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("productTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductTile: Self = this.set("productTile", js.undefined)
    @scala.inline
    def setTabIndex(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
  
}

