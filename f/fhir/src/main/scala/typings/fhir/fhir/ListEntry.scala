package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entries in the list
  */
trait ListEntry
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'deleted'.
    */
  var _deleted: js.UndefOr[Element] = js.undefined
  
  /**
    * When item added to list
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * If this item is actually marked as deleted
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Status/Workflow information about this item
    */
  var flag: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Actual entry
    */
  var item: Reference
}
object ListEntry {
  
  inline def apply(item: Reference): ListEntry = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntry]
  }
  
  extension [Self <: ListEntry](x: Self) {
    
    inline def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setFlag(value: CodeableConcept): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setItem(value: Reference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_deleted(value: Element): Self = StObject.set(x, "_deleted", value.asInstanceOf[js.Any])
    
    inline def set_deletedUndefined: Self = StObject.set(x, "_deleted", js.undefined)
  }
}
