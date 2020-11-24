package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access existing data source parameters.
  */
@js.native
trait DataSourceParameter extends js.Object {
  
  def getName(): String = js.native
  
  def getSourceCell(): String | Null = js.native
  
  def getType(): DataSourceParameterType = js.native
}
object DataSourceParameter {
  
  @scala.inline
  def apply(getName: () => String, getSourceCell: () => String | Null, getType: () => DataSourceParameterType): DataSourceParameter = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getSourceCell = js.Any.fromFunction0(getSourceCell), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[DataSourceParameter]
  }
  
  @scala.inline
  implicit class DataSourceParameterOps[Self <: DataSourceParameter] (val x: Self) extends AnyVal {
    
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
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSourceCell(value: () => String | Null): Self = this.set("getSourceCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => DataSourceParameterType): Self = this.set("getType", js.Any.fromFunction0(value))
  }
}
