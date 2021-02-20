package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entries in the list
  */
@js.native
trait ListEntry extends BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'deleted'.
    */
  var _deleted: js.UndefOr[Element] = js.native
  
  /**
    * When item added to list
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * If this item is actually marked as deleted
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Status/Workflow information about this item
    */
  var flag: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Actual entry
    */
  var item: Reference = js.native
}
object ListEntry {
  
  @scala.inline
  def apply(item: Reference): ListEntry = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntry]
  }
  
  @scala.inline
  implicit class ListEntryMutableBuilder[Self <: ListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setFlag(value: CodeableConcept): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    @scala.inline
    def setItem(value: Reference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_deleted(value: Element): Self = StObject.set(x, "_deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_deletedUndefined: Self = StObject.set(x, "_deleted", js.undefined)
  }
}
