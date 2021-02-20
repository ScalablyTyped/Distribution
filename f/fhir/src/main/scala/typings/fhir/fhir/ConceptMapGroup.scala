package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Same source and target systems
  */
@js.native
trait ConceptMapGroup extends BackboneElement {
  
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sourceVersion'.
    */
  var _sourceVersion: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'target'.
    */
  var _target: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'targetVersion'.
    */
  var _targetVersion: js.UndefOr[Element] = js.native
  
  /**
    * Mappings for a concept from the source set
    */
  var element: js.Array[ConceptMapGroupElement] = js.native
  
  /**
    * Code System (if value set crosses code systems)
    */
  var source: js.UndefOr[uri] = js.native
  
  /**
    * Specific version of the  code system
    */
  var sourceVersion: js.UndefOr[String] = js.native
  
  /**
    * System of the target (if necessary)
    */
  var target: js.UndefOr[uri] = js.native
  
  /**
    * Specific version of the  code system
    */
  var targetVersion: js.UndefOr[String] = js.native
  
  /**
    * When no match in the mappings
    */
  var unmapped: js.UndefOr[ConceptMapGroupUnmapped] = js.native
}
object ConceptMapGroup {
  
  @scala.inline
  def apply(element: js.Array[ConceptMapGroupElement]): ConceptMapGroup = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroup]
  }
  
  @scala.inline
  implicit class ConceptMapGroupMutableBuilder[Self <: ConceptMapGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: js.Array[ConceptMapGroupElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementVarargs(value: ConceptMapGroupElement*): Self = StObject.set(x, "element", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
    
    @scala.inline
    def setTarget(value: uri): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
    
    @scala.inline
    def setUnmapped(value: ConceptMapGroupUnmapped): Self = StObject.set(x, "unmapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmappedUndefined: Self = StObject.set(x, "unmapped", js.undefined)
    
    @scala.inline
    def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    @scala.inline
    def set_sourceVersion(value: Element): Self = StObject.set(x, "_sourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceVersionUndefined: Self = StObject.set(x, "_sourceVersion", js.undefined)
    
    @scala.inline
    def set_target(value: Element): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
    
    @scala.inline
    def set_targetVersion(value: Element): Self = StObject.set(x, "_targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_targetVersionUndefined: Self = StObject.set(x, "_targetVersion", js.undefined)
  }
}
