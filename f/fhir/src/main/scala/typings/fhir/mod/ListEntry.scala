package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntry
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _deleted: js.UndefOr[Element] = js.undefined
  
  /**
    * The date may be significant for understanding the meaning of items in a working list.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The flag element may contain codes that an application processing the list does not understand. However there can be no ambiguity if a list item is actually marked as "deleted".
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field is present to support various clinical uses of lists, such as a discharge summary medication list, where flags specify whether the medication was added, modified, or deleted from the list.
    */
  var flag: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A reference to the actual resource from which data was derived.
    */
  var item: Reference
}
object ListEntry {
  
  inline def apply(item: Reference): ListEntry = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntry]
  }
  
  extension [Self <: ListEntry](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
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
