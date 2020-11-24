package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLPivot extends js.Object {
  
  /** This property is used to clear the pivot table list in Spreadsheet.
    * @param {string} Pass the name of the pivot table.
    * @returns {void}
    */
  def clearPivotFieldList(pivotName: String): Unit = js.native
  
  /** This method is used to create pivot table.
    * @param {string} It specifies the range for which the pivot table is created.
    * @param {string} It specifies the location in which the pivot table is created.
    * @param {string} It specifies the name of the pivot table.
    * @param {Spreadsheet.PivotOptions} Pass Object PivotOptions.
    * @param {any} Pass the pivot range, sheet index, address and data source .
    * @returns {string}
    */
  def createPivotTable(range: String, location: String, name: String, settings: PivotOptions, pvt: js.Any): String = js.native
  
  /** This method is used to delete the pivot table which is selected.
    * @param {string} Pass the name of the pivot table.
    * @returns {void}
    */
  def deletePivotTable(pivotName: String): Unit = js.native
  
  /** This method is used to refresh data in pivot table.
    * @param {string} Optional. Pass the name of the pivot table.
    * @param {number} Optional. Pass the index of the sheet.
    * @returns {void}
    */
  def refreshDataSource(name: String, sheetIdx: Double): Unit = js.native
}
object XLPivot {
  
  @scala.inline
  def apply(
    clearPivotFieldList: String => Unit,
    createPivotTable: (String, String, String, PivotOptions, js.Any) => String,
    deletePivotTable: String => Unit,
    refreshDataSource: (String, Double) => Unit
  ): XLPivot = {
    val __obj = js.Dynamic.literal(clearPivotFieldList = js.Any.fromFunction1(clearPivotFieldList), createPivotTable = js.Any.fromFunction5(createPivotTable), deletePivotTable = js.Any.fromFunction1(deletePivotTable), refreshDataSource = js.Any.fromFunction2(refreshDataSource))
    __obj.asInstanceOf[XLPivot]
  }
  
  @scala.inline
  implicit class XLPivotOps[Self <: XLPivot] (val x: Self) extends AnyVal {
    
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
    def setClearPivotFieldList(value: String => Unit): Self = this.set("clearPivotFieldList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatePivotTable(value: (String, String, String, PivotOptions, js.Any) => String): Self = this.set("createPivotTable", js.Any.fromFunction5(value))
    
    @scala.inline
    def setDeletePivotTable(value: String => Unit): Self = this.set("deletePivotTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefreshDataSource(value: (String, Double) => Unit): Self = this.set("refreshDataSource", js.Any.fromFunction2(value))
  }
}
