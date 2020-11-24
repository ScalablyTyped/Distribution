package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the existing BigQuery data source specification. To create a new data source
  * specification, use SpreadsheetApp.newDataSourceSpec().
  */
@js.native
trait BigQueryDataSourceSpec extends js.Object {
  
  def copy(): DataSourceSpecBuilder = js.native
  
  def getParameters(): js.Array[DataSourceParameter] = js.native
  
  def getProjectId(): String = js.native
  
  def getRawQuery(): String = js.native
  
  def getType(): DataSourceType = js.native
}
object BigQueryDataSourceSpec {
  
  @scala.inline
  def apply(
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getProjectId: () => String,
    getRawQuery: () => String,
    getType: () => DataSourceType
  ): BigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getProjectId = js.Any.fromFunction0(getProjectId), getRawQuery = js.Any.fromFunction0(getRawQuery), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[BigQueryDataSourceSpec]
  }
  
  @scala.inline
  implicit class BigQueryDataSourceSpecOps[Self <: BigQueryDataSourceSpec] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: () => DataSourceSpecBuilder): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => js.Array[DataSourceParameter]): Self = this.set("getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProjectId(value: () => String): Self = this.set("getProjectId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawQuery(value: () => String): Self = this.set("getRawQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => DataSourceType): Self = this.set("getType", js.Any.fromFunction0(value))
  }
}
