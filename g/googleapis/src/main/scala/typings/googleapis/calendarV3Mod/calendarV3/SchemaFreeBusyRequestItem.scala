package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeBusyRequestItem extends StObject {
  
  /**
    * The identifier of a calendar or a group.
    */
  var id: js.UndefOr[String] = js.undefined
}
object SchemaFreeBusyRequestItem {
  
  @scala.inline
  def apply(): SchemaFreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyRequestItem]
  }
  
  @scala.inline
  implicit class SchemaFreeBusyRequestItemMutableBuilder[Self <: SchemaFreeBusyRequestItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
