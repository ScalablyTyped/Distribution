package typings.extjs.Ext.layout.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITable extends IContainer {
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_ITable: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.native
  /** [Method] This method if implemented is called after all layouts have completed  */
  @JSName("finalizeLayout")
  var finalizeLayout_ITable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Validates item is in the proper place in the dom
    * @param item Object
    * @param target Object
    * @param rowIdx Object
    * @param cellIdx Object
    */
  @JSName("isValidParent")
  var isValidParent_ITable: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* cellIdx */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Object) */
  var tableAttrs: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var tdAttrs: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var trAttrs: js.UndefOr[js.Any] = js.native
}

object ITable {
  @scala.inline
  def apply(): ITable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITable]
  }
  @scala.inline
  implicit class ITableOps[Self <: ITable] (val x: Self) extends AnyVal {
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
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("calculate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setFinalizeLayout(value: () => Unit): Self = this.set("finalizeLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFinalizeLayout: Self = this.set("finalizeLayout", js.undefined)
    @scala.inline
    def setIsValidParent(
      value: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* rowIdx */ js.UndefOr[js.Any], /* cellIdx */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("isValidParent", js.Any.fromFunction4(value))
    @scala.inline
    def deleteIsValidParent: Self = this.set("isValidParent", js.undefined)
    @scala.inline
    def setTableAttrs(value: js.Any): Self = this.set("tableAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableAttrs: Self = this.set("tableAttrs", js.undefined)
    @scala.inline
    def setTdAttrs(value: js.Any): Self = this.set("tdAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTdAttrs: Self = this.set("tdAttrs", js.undefined)
    @scala.inline
    def setTrAttrs(value: js.Any): Self = this.set("trAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrAttrs: Self = this.set("trAttrs", js.undefined)
  }
  
}

