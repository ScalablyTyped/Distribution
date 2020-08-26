package typings.gestalt.mod

import typings.gestalt.anon.Data
import typings.gestalt.gestaltStrings.MasonryDefaultLayout
import typings.gestalt.gestaltStrings.MasonryUniformRowLayout
import typings.react.mod.ComponentType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasonryProps extends js.Object {
  var columnWidth: js.UndefOr[Double] = js.native
  var comp: ComponentType[Data] = js.native
  var flexible: js.UndefOr[Boolean] = js.native
  var gutterWidth: js.UndefOr[Double] = js.native
  var items: js.Array[_] = js.native
  var layout: js.UndefOr[MasonryDefaultLayout | MasonryUniformRowLayout] = js.native
  var loadItems: js.UndefOr[js.Function0[Unit]] = js.native
  var measurementStore: js.UndefOr[js.Any] = js.native
  var minCols: js.UndefOr[Double] = js.native
  var scrollContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  var virtualBoundsBottom: js.UndefOr[Double] = js.native
  var virtualBoundsTop: js.UndefOr[Double] = js.native
  var virtualize: js.UndefOr[Boolean] = js.native
}

object MasonryProps {
  @scala.inline
  def apply(comp: ComponentType[Data], items: js.Array[_]): MasonryProps = {
    val __obj = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps]
  }
  @scala.inline
  implicit class MasonryPropsOps[Self <: MasonryProps] (val x: Self) extends AnyVal {
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
    def setComp(value: ComponentType[Data]): Self = this.set("comp", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setFlexible(value: Boolean): Self = this.set("flexible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexible: Self = this.set("flexible", js.undefined)
    @scala.inline
    def setGutterWidth(value: Double): Self = this.set("gutterWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutterWidth: Self = this.set("gutterWidth", js.undefined)
    @scala.inline
    def setLayout(value: MasonryDefaultLayout | MasonryUniformRowLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLoadItems(value: () => Unit): Self = this.set("loadItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLoadItems: Self = this.set("loadItems", js.undefined)
    @scala.inline
    def setMeasurementStore(value: js.Any): Self = this.set("measurementStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasurementStore: Self = this.set("measurementStore", js.undefined)
    @scala.inline
    def setMinCols(value: Double): Self = this.set("minCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCols: Self = this.set("minCols", js.undefined)
    @scala.inline
    def setScrollContainer(value: () => HTMLElement): Self = this.set("scrollContainer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScrollContainer: Self = this.set("scrollContainer", js.undefined)
    @scala.inline
    def setVirtualBoundsBottom(value: Double): Self = this.set("virtualBoundsBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualBoundsBottom: Self = this.set("virtualBoundsBottom", js.undefined)
    @scala.inline
    def setVirtualBoundsTop(value: Double): Self = this.set("virtualBoundsTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualBoundsTop: Self = this.set("virtualBoundsTop", js.undefined)
    @scala.inline
    def setVirtualize(value: Boolean): Self = this.set("virtualize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualize: Self = this.set("virtualize", js.undefined)
  }
  
}

