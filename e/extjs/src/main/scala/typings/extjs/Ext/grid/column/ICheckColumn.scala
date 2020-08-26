package typings.extjs.Ext.grid.column

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckColumn extends IColumn {
  /** [Method] Disables this CheckColumn
    * @param silent Boolean
    */
  @JSName("onDisable")
  var onDisable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Enables this CheckColumn
    * @param silent Boolean
    */
  @JSName("onEnable")
  var onEnable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.native
}

object ICheckColumn {
  @scala.inline
  def apply(): ICheckColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckColumn]
  }
  @scala.inline
  implicit class ICheckColumnOps[Self <: ICheckColumn] (val x: Self) extends AnyVal {
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
    def setOnDisable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = this.set("onDisable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDisable: Self = this.set("onDisable", js.undefined)
    @scala.inline
    def setOnEnable(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = this.set("onEnable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnable: Self = this.set("onEnable", js.undefined)
    @scala.inline
    def setStopSelection(value: Boolean): Self = this.set("stopSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopSelection: Self = this.set("stopSelection", js.undefined)
  }
  
}

