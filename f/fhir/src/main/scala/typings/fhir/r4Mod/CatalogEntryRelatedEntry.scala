package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`is-replaced-by`
import typings.fhir.fhirStrings.triggers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogEntryRelatedEntry
  extends StObject
     with BackboneElement {
  
  var _relationtype: js.UndefOr[Element] = js.undefined
  
  /**
    * The reference to the related item.
    */
  var item: Reference
  
  /**
    * The type of relation to the related item: child, parent, packageContent, containerPackage, usedIn, uses, requires, etc.
    */
  var relationtype: triggers | `is-replaced-by`
}
object CatalogEntryRelatedEntry {
  
  inline def apply(item: Reference, relationtype: triggers | `is-replaced-by`): CatalogEntryRelatedEntry = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], relationtype = relationtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogEntryRelatedEntry]
  }
  
  extension [Self <: CatalogEntryRelatedEntry](x: Self) {
    
    inline def setItem(value: Reference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setRelationtype(value: triggers | `is-replaced-by`): Self = StObject.set(x, "relationtype", value.asInstanceOf[js.Any])
    
    inline def set_relationtype(value: Element): Self = StObject.set(x, "_relationtype", value.asInstanceOf[js.Any])
    
    inline def set_relationtypeUndefined: Self = StObject.set(x, "_relationtype", js.undefined)
  }
}
