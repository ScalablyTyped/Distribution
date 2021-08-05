package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Links records for 'same' item
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Linkage
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether this linkage assertion is active or not
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Who is responsible for linkages
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Item to be linked
    */
  var item: js.Array[LinkageItem]
}
object Linkage {
  
  inline def apply(item: js.Array[LinkageItem]): Linkage = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linkage]
  }
  
  extension [Self <: Linkage](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setItem(value: js.Array[LinkageItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemVarargs(value: LinkageItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
  }
}
