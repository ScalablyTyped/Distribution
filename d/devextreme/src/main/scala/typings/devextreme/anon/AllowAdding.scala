package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowAdding extends StObject {
  
  /**
    * Specifies whether or not an end-user can add appointments.
    */
  var allowAdding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not an end-user can delete appointments.
    */
  var allowDeleting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether users can drag and drop appointments.
    */
  var allowDragging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not an end-user can change an appointment duration.
    */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether users can edit appointment time zones.
    */
  var allowTimeZoneEditing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not an end-user can change appointment properties.
    */
  var allowUpdating: js.UndefOr[Boolean] = js.undefined
}
object AllowAdding {
  
  inline def apply(): AllowAdding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAdding]
  }
  
  extension [Self <: AllowAdding](x: Self) {
    
    inline def setAllowAdding(value: Boolean): Self = StObject.set(x, "allowAdding", value.asInstanceOf[js.Any])
    
    inline def setAllowAddingUndefined: Self = StObject.set(x, "allowAdding", js.undefined)
    
    inline def setAllowDeleting(value: Boolean): Self = StObject.set(x, "allowDeleting", value.asInstanceOf[js.Any])
    
    inline def setAllowDeletingUndefined: Self = StObject.set(x, "allowDeleting", js.undefined)
    
    inline def setAllowDragging(value: Boolean): Self = StObject.set(x, "allowDragging", value.asInstanceOf[js.Any])
    
    inline def setAllowDraggingUndefined: Self = StObject.set(x, "allowDragging", js.undefined)
    
    inline def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
    
    inline def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
    
    inline def setAllowTimeZoneEditing(value: Boolean): Self = StObject.set(x, "allowTimeZoneEditing", value.asInstanceOf[js.Any])
    
    inline def setAllowTimeZoneEditingUndefined: Self = StObject.set(x, "allowTimeZoneEditing", js.undefined)
    
    inline def setAllowUpdating(value: Boolean): Self = StObject.set(x, "allowUpdating", value.asInstanceOf[js.Any])
    
    inline def setAllowUpdatingUndefined: Self = StObject.set(x, "allowUpdating", js.undefined)
  }
}
