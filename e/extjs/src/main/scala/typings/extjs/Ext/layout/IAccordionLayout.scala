package typings.extjs.Ext.layout

import typings.extjs.Ext.layout.container.IVBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccordionLayout extends IVBox {
  /** [Config Option] (Boolean) */
  var activeOnTop: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var animate: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoWidth: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var collapseFirst: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var hideCollapseTool: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var multi: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var titleCollapse: js.UndefOr[Boolean] = js.native
}

object IAccordionLayout {
  @scala.inline
  def apply(): IAccordionLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionLayout]
  }
  @scala.inline
  implicit class IAccordionLayoutOps[Self <: IAccordionLayout] (val x: Self) extends AnyVal {
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
    def setActiveOnTop(value: Boolean): Self = this.set("activeOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOnTop: Self = this.set("activeOnTop", js.undefined)
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    @scala.inline
    def setCollapseFirst(value: Boolean): Self = this.set("collapseFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseFirst: Self = this.set("collapseFirst", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHideCollapseTool(value: Boolean): Self = this.set("hideCollapseTool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideCollapseTool: Self = this.set("hideCollapseTool", js.undefined)
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setTitleCollapse(value: Boolean): Self = this.set("titleCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleCollapse: Self = this.set("titleCollapse", js.undefined)
  }
  
}

