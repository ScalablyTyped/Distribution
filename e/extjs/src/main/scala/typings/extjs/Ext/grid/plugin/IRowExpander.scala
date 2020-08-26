package typings.extjs.Ext.grid.plugin

import typings.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowExpander extends IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var expandOnDblClick: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var expandOnEnter: js.UndefOr[Boolean] = js.native
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
    * @param grid Object
    */
  @JSName("init")
  var init_IRowExpander: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var selectRowOnExpand: js.UndefOr[Boolean] = js.native
}

object IRowExpander {
  @scala.inline
  def apply(): IRowExpander = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowExpander]
  }
  @scala.inline
  implicit class IRowExpanderOps[Self <: IRowExpander] (val x: Self) extends AnyVal {
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
    def setExpandOnDblClick(value: Boolean): Self = this.set("expandOnDblClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandOnDblClick: Self = this.set("expandOnDblClick", js.undefined)
    @scala.inline
    def setExpandOnEnter(value: Boolean): Self = this.set("expandOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandOnEnter: Self = this.set("expandOnEnter", js.undefined)
    @scala.inline
    def setInit(value: /* grid */ js.UndefOr[js.Any] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setSelectRowOnExpand(value: Boolean): Self = this.set("selectRowOnExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectRowOnExpand: Self = this.set("selectRowOnExpand", js.undefined)
  }
  
}

