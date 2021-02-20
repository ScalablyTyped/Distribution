package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify existing data source. To create a data source table with new data source, see
  * DataSourceTable.
  */
@js.native
trait DataSource extends StObject {
  
  def getSpec(): DataSourceSpec = js.native
  
  def updateSpec(spec: DataSourceSpec): DataSource = js.native
}
object DataSource {
  
  @scala.inline
  def apply(getSpec: () => DataSourceSpec, updateSpec: DataSourceSpec => DataSource): DataSource = {
    val __obj = js.Dynamic.literal(getSpec = js.Any.fromFunction0(getSpec), updateSpec = js.Any.fromFunction1(updateSpec))
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSpec(value: () => DataSourceSpec): Self = StObject.set(x, "getSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateSpec(value: DataSourceSpec => DataSource): Self = StObject.set(x, "updateSpec", js.Any.fromFunction1(value))
  }
}
