package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapGroup
  extends StObject
     with BackboneElement {
  
  var _source: js.UndefOr[Element] = js.undefined
  
  var _sourceVersion: js.UndefOr[Element] = js.undefined
  
  var _target: js.UndefOr[Element] = js.undefined
  
  var _targetVersion: js.UndefOr[Element] = js.undefined
  
  /**
    * Generally, the ideal is that there would only be one mapping for each concept in the source value set, but a given concept may be mapped multiple times with different comments or dependencies.
    */
  var element: js.Array[ConceptMapGroupElement]
  
  /**
    * An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The specification of a particular code system version may be required for code systems which lack concept permanence.
    */
  var sourceVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Target may be omitted if all the targget element equivalence values are 'unmatched'.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * The specification of a particular code system version may be required for code systems which lack concept permanence.
    */
  var targetVersion: js.UndefOr[String] = js.undefined
  
  /**
    * This only applies if the source code is in the system defined for the group.
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
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
    
    inline def setUnmapped(value: ConceptMapGroupUnmapped): Self = StObject.set(x, "unmapped", value.asInstanceOf[js.Any])
    
    inline def setUnmappedUndefined: Self = StObject.set(x, "unmapped", js.undefined)
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVersion(value: Element): Self = StObject.set(x, "_sourceVersion", value.asInstanceOf[js.Any])
    
    inline def set_sourceVersionUndefined: Self = StObject.set(x, "_sourceVersion", js.undefined)
    
    inline def set_target(value: Element): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
    
    inline def set_targetVersion(value: Element): Self = StObject.set(x, "_targetVersion", value.asInstanceOf[js.Any])
    
    inline def set_targetVersionUndefined: Self = StObject.set(x, "_targetVersion", js.undefined)
  }
}
