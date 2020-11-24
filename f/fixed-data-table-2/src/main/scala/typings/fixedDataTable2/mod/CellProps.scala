package typings.fixedDataTable2.mod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellProps extends HTMLAttributes[Cell] {
  
  /**
    * Optional prop that if specified on the `Column` will be passed to the
    * cell. It can be used to uniquely identify which column is the cell is in.
    */
  var columnKey: js.UndefOr[String | Double] = js.native
  
  /**
    * Outer height of the cell.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Optional prop that represents the rows index in the table.
    * For the 'cell' prop of a Column, this parameter will exist for any
    * cell in a row with a positive index.
    *
    * Below that entry point the user is welcome to consume or
    * pass the prop through at their discretion.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /**
    * Outer width of the cell.
    */
  var width: js.UndefOr[Double] = js.native
}
object CellProps {
  
  @scala.inline
  def apply(): CellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellProps]
  }
  
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps] (val x: Self) extends AnyVal {
    
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
    def setColumnKey(value: String | Double): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
