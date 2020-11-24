package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify existing data source. To create a data source table with new data source, see
  * DataSourceTable.
  */
@js.native
trait DataSource extends js.Object {
  
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
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    
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
    def setGetSpec(value: () => DataSourceSpec): Self = this.set("getSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateSpec(value: DataSourceSpec => DataSource): Self = this.set("updateSpec", js.Any.fromFunction1(value))
  }
}
