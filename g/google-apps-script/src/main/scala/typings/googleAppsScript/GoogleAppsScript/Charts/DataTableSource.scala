package typings.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for objects that can represent their data as a DataTable.
  * Implementing classes
  *
  * NameBrief description
  *
  * DataTableA Data Table to be used in charts.
  *
  * RangeAccess and modify spreadsheet ranges.
  */
@js.native
trait DataTableSource extends StObject {
  
  def getDataTable(): DataTable = js.native
}
object DataTableSource {
  
  @scala.inline
  def apply(getDataTable: () => DataTable): DataTableSource = {
    val __obj = js.Dynamic.literal(getDataTable = js.Any.fromFunction0(getDataTable))
    __obj.asInstanceOf[DataTableSource]
  }
  
  @scala.inline
  implicit class DataTableSourceMutableBuilder[Self <: DataTableSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDataTable(value: () => DataTable): Self = StObject.set(x, "getDataTable", js.Any.fromFunction0(value))
  }
}
