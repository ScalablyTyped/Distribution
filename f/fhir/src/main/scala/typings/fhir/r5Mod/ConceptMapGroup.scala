package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapGroup
  extends StObject
     with BackboneElement {
  
  var _source: js.UndefOr[Element] = js.undefined
  
  var _target: js.UndefOr[Element] = js.undefined
  
  /**
    * Generally, the ideal is that there would only be one mapping for each concept in the source value set, but a given concept may be mapped multiple times with different comments or dependencies.
    */
  var element: js.Array[ConceptMapGroupElement]
  
  /**
    * This is not needed if the source value set is specified and it contains concepts from only a single system.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * This is not needed if the target value set is specified and it contains concepts from only a single system. The group target may also be omitted if all of the target element relationship values are 'not-related-to'.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * The 'unmapped' element is ignored if a code is specified to have relationship = not-related-to or if ConceptMap.group.element.noMap = true.
    */
  var unmapped: js.UndefOr[ConceptMapGroupUnmapped] = js.undefined
}
object ConceptMapGroup {
  
  inline def apply(element: js.Array[ConceptMapGroupElement]): ConceptMapGroup = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConceptMapGroup] (val x: Self) extends AnyVal {
    
    inline def setElement(value: js.Array[ConceptMapGroupElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementVarargs(value: ConceptMapGroupElement*): Self = StObject.set(x, "element", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUnmapped(value: ConceptMapGroupUnmapped): Self = StObject.set(x, "unmapped", value.asInstanceOf[js.Any])
    
    inline def setUnmappedUndefined: Self = StObject.set(x, "unmapped", js.undefined)
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_target(value: Element): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
  }
}
