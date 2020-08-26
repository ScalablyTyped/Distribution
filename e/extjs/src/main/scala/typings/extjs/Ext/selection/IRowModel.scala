package typings.extjs.Ext.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowModel extends IModel {
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.native
  /** [Method] Returns position of the first selected cell in the selection in the format row row column column  */
  var getCurrentPosition: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var ignoreRightMouseSelection: js.UndefOr[Boolean] = js.native
  /** [Method] Selects the record immediately following the currently selected record
    * @param keepExisting Boolean True to retain existing selections
    * @param suppressEvent Boolean Set to false to not fire a select event
    * @returns Boolean true if there is a next record, else false
    */
  var selectNext: js.UndefOr[
    js.Function2[
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.native
  /** [Method] Selects the record that precedes the currently selected record
    * @param keepExisting Boolean True to retain existing selections
    * @param suppressEvent Boolean Set to false to not fire a select event
    * @returns Boolean true if there is a previous record, else false
    */
  var selectPrevious: js.UndefOr[
    js.Function2[
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.native
}

object IRowModel {
  @scala.inline
  def apply(): IRowModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowModel]
  }
  @scala.inline
  implicit class IRowModelOps[Self <: IRowModel] (val x: Self) extends AnyVal {
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
    def setEnableKeyNav(value: Boolean): Self = this.set("enableKeyNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKeyNav: Self = this.set("enableKeyNav", js.undefined)
    @scala.inline
    def setGetCurrentPosition(value: () => Unit): Self = this.set("getCurrentPosition", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCurrentPosition: Self = this.set("getCurrentPosition", js.undefined)
    @scala.inline
    def setIgnoreRightMouseSelection(value: Boolean): Self = this.set("ignoreRightMouseSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreRightMouseSelection: Self = this.set("ignoreRightMouseSelection", js.undefined)
    @scala.inline
    def setSelectNext(
      value: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean
    ): Self = this.set("selectNext", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelectNext: Self = this.set("selectNext", js.undefined)
    @scala.inline
    def setSelectPrevious(
      value: (/* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Boolean
    ): Self = this.set("selectPrevious", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelectPrevious: Self = this.set("selectPrevious", js.undefined)
  }
  
}

