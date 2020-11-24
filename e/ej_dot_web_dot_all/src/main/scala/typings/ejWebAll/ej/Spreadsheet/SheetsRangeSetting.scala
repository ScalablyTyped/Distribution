package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsRangeSetting extends js.Object {
  
  /** Gets or sets the data to render the Spreadsheet.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /** Specifies the header styles for the headers in datasource range.
    * @Default {null}
    */
  var headerStyles: js.UndefOr[js.Any] = js.native
  
  /** Specifies the primary key for the datasource in Spreadsheet.
    */
  var primaryKey: js.UndefOr[String] = js.native
  
  /** Specifies the query for the datasource in Spreadsheet.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  
  /** Specifies the start cell for the datasource range in Spreadsheet.
    * @Default {A1}
    */
  var startCell: js.UndefOr[String] = js.native
}
object SheetsRangeSetting {
  
  @scala.inline
  def apply(): SheetsRangeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRangeSetting]
  }
  
  @scala.inline
  implicit class SheetsRangeSettingOps[Self <: SheetsRangeSetting] (val x: Self) extends AnyVal {
    
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
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setHeaderStyles(value: js.Any): Self = this.set("headerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyles: Self = this.set("headerStyles", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    
    @scala.inline
    def setStartCell(value: String): Self = this.set("startCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartCell: Self = this.set("startCell", js.undefined)
  }
}
