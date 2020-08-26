package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> */
@js.native
trait WeakValidationMapTileCont extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var headingLevel: js.UndefOr[Validator[js.UndefOr[`2` | `3` | `4` | `5` | `6` | Null]]] = js.native
  var productTile: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var titleProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
}

object WeakValidationMapTileCont {
  @scala.inline
  def apply(): WeakValidationMapTileCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileCont]
  }
  @scala.inline
  implicit class WeakValidationMapTileContOps[Self <: WeakValidationMapTileCont] (val x: Self) extends AnyVal {
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
    def setHeadingLevel(value: Validator[js.UndefOr[`2` | `3` | `4` | `5` | `6` | Null]]): Self = this.set("headingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadingLevel: Self = this.set("headingLevel", js.undefined)
    @scala.inline
    def setProductTile(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("productTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductTile: Self = this.set("productTile", js.undefined)
    @scala.inline
    def setTitle(value: Validator[js.UndefOr[Null | String]]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
  }
  
}

