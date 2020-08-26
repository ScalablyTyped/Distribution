package typings.extjs.Ext.chart

import typings.extjs.Ext.draw.ICompositeSprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILegendItem extends ICompositeSprite {
  /** [Method] Creates all the individual sprites for this legend item
    * @param config Object
    */
  var createLegend: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Update the positions of all this item s sprites to match the root position of the legend box
    * @param relativeTo Object If specified, this object's 'x' and 'y' values will be used as the reference point for the relative positioning. Defaults to the Legend.
    */
  var updatePosition: js.UndefOr[js.Function1[/* relativeTo */ js.UndefOr[js.Any], Unit]] = js.native
}

object ILegendItem {
  @scala.inline
  def apply(): ILegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILegendItem]
  }
  @scala.inline
  implicit class ILegendItemOps[Self <: ILegendItem] (val x: Self) extends AnyVal {
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
    def setCreateLegend(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("createLegend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateLegend: Self = this.set("createLegend", js.undefined)
    @scala.inline
    def setUpdatePosition(value: /* relativeTo */ js.UndefOr[js.Any] => Unit): Self = this.set("updatePosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdatePosition: Self = this.set("updatePosition", js.undefined)
  }
  
}

