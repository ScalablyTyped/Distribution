package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linkage
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * If false, any asserted linkages should not be considered current/relevant/applicable.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the user or organization responsible for asserting the linkages as well as the user or organization who establishes the context in which the nature of each linkage is evaluated.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies which record considered as the reference to the same real-world occurrence as well as how the items should be evaluated within the collection of linked items.
    */
  var item: js.Array[LinkageItem]
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Linkage: typings.fhir.fhirStrings.Linkage
}
object Linkage {
  
  inline def apply(item: js.Array[LinkageItem]): Linkage = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], resourceType = "Linkage")
    __obj.asInstanceOf[Linkage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Linkage] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setItem(value: js.Array[LinkageItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemVarargs(value: LinkageItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Linkage): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
  }
}
