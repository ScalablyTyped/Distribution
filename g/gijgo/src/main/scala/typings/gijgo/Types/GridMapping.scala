package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridMapping extends StObject {
  
  var dataField: js.UndefOr[String] = js.native
  
  var totalRecordsField: js.UndefOr[String] = js.native
}
object GridMapping {
  
  @scala.inline
  def apply(): GridMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMapping]
  }
  
  @scala.inline
  implicit class GridMappingMutableBuilder[Self <: GridMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    @scala.inline
    def setTotalRecordsField(value: String): Self = StObject.set(x, "totalRecordsField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRecordsFieldUndefined: Self = StObject.set(x, "totalRecordsField", js.undefined)
  }
}
