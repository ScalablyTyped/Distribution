package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access existing data source parameters.
  */
@js.native
trait DataSourceParameter extends StObject {
  
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
  implicit class DataSourceParameterMutableBuilder[Self <: DataSourceParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSourceCell(value: () => String | Null): Self = StObject.set(x, "getSourceCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => DataSourceParameterType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
  }
}
