package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeBusyRequestItem extends StObject {
  
  /**
    * The identifier of a calendar or a group.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaFreeBusyRequestItem {
  
  inline def apply(): SchemaFreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyRequestItem]
  }
  
  extension [Self <: SchemaFreeBusyRequestItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
