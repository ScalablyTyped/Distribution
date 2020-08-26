package typings.extjs.Ext.grid.locking

import typings.extjs.Ext.Array
import typings.extjs.Ext.grid.header.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderContainer extends IContainer {
  /** [Method] This is the function which all other column access methods are based upon Return the full column set for the whole Lo
    * @returns Array
    */
  @JSName("getGridColumns")
  var getGridColumns_IHeaderContainer: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th  */
  @JSName("getRefItems")
  var getRefItems_IHeaderContainer: js.UndefOr[js.Function0[Unit]] = js.native
}

object IHeaderContainer {
  @scala.inline
  def apply(): IHeaderContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderContainer]
  }
  @scala.inline
  implicit class IHeaderContainerOps[Self <: IHeaderContainer] (val x: Self) extends AnyVal {
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
    def setGetGridColumns(value: () => Array): Self = this.set("getGridColumns", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGridColumns: Self = this.set("getGridColumns", js.undefined)
    @scala.inline
    def setGetRefItems(value: () => Unit): Self = this.set("getRefItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRefItems: Self = this.set("getRefItems", js.undefined)
  }
  
}

