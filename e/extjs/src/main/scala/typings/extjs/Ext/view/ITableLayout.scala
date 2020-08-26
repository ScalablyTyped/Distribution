package typings.extjs.Ext.view

import typings.extjs.Ext.layout.component.IAuto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableLayout extends IAuto {
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_ITableLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM  */
  @JSName("finishedLayout")
  var finishedLayout_ITableLayout: js.UndefOr[js.Function0[Unit]] = js.native
}

object ITableLayout {
  @scala.inline
  def apply(): ITableLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableLayout]
  }
  @scala.inline
  implicit class ITableLayoutOps[Self <: ITableLayout] (val x: Self) extends AnyVal {
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
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeginLayout: Self = this.set("beginLayout", js.undefined)
    @scala.inline
    def setFinishedLayout(value: () => Unit): Self = this.set("finishedLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFinishedLayout: Self = this.set("finishedLayout", js.undefined)
  }
  
}

