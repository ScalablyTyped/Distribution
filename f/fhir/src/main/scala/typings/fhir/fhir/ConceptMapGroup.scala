package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Same source and target systems
  */
trait ConceptMapGroup
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sourceVersion'.
    */
  var _sourceVersion: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'target'.
    */
  var _target: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'targetVersion'.
    */
  var _targetVersion: js.UndefOr[Element] = js.undefined
  
  /**
    * Mappings for a concept from the source set
    */
  var element: js.Array[ConceptMapGroupElement]
  
  /**
    * Code System (if value set crosses code systems)
    */
  var source: js.UndefOr[uri] = js.undefined
  
  /**
    * Specific version of the  code system
    */
  var sourceVersion: js.UndefOr[String] = js.undefined
  
  /**
    * System of the target (if necessary)
    */
  var target: js.UndefOr[uri] = js.undefined
  
  /**
    * Specific version of the  code system
    */
  var targetVersion: js.UndefOr[String] = js.undefined
  
  /**
    * When no match in the mappings
    */
  var unmapped: js.UndefOr[ConceptMapGroupUnmapped] = js.undefined
}
object ConceptMapGroup {
  
  inline def apply(element: js.Array[ConceptMapGroupElement]): ConceptMapGroup = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroup]
  }
  
  extension [Self <: ConceptMapGroup](x: Self) {
    
    inline def setElement(value: js.Array[ConceptMapGroupElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementVarargs(value: ConceptMapGroupElement*): Self = StObject.set(x, "element", js.Array(value :_*))
    
    inline def setSource(value: uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
    
    inline def setTarget(value: uri): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
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
