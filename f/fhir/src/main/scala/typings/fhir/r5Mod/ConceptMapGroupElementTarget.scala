package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`not-related-to`
import typings.fhir.fhirStrings.`related-to`
import typings.fhir.fhirStrings.`source-is-broader-than-target`
import typings.fhir.fhirStrings.`source-is-narrower-than-target`
import typings.fhir.fhirStrings.equivalent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapGroupElementTarget
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _relationship: js.UndefOr[Element] = js.undefined
  
  /**
    * Identity (code or path) or the element/item that the map refers to.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * A description of status/issues in mapping that conveys additional information not represented in  the structured data.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.
    */
  var dependsOn: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.undefined
  
  /**
    * The display is ignored when processing the map.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the relationship (e.g., equivalent) cannot be relied on.
    */
  var product: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.undefined
  
  /**
    * This element is labeled as a modifier because it may indicate that there is no mapping.
    */
  var relationship: `related-to` | equivalent | `source-is-narrower-than-target` | `source-is-broader-than-target` | `not-related-to`
}
object ConceptMapGroupElementTarget {
  
  inline def apply(
    relationship: `related-to` | equivalent | `source-is-narrower-than-target` | `source-is-broader-than-target` | `not-related-to`
  ): ConceptMapGroupElementTarget = {
    val __obj = js.Dynamic.literal(relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroupElementTarget]
  }
  
  extension [Self <: ConceptMapGroupElementTarget](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDependsOn(value: js.Array[ConceptMapGroupElementTargetDependsOn]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: ConceptMapGroupElementTargetDependsOn*): Self = StObject.set(x, "dependsOn", js.Array(value*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setProduct(value: js.Array[ConceptMapGroupElementTargetDependsOn]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProductVarargs(value: ConceptMapGroupElementTargetDependsOn*): Self = StObject.set(x, "product", js.Array(value*))
    
    inline def setRelationship(
      value: `related-to` | equivalent | `source-is-narrower-than-target` | `source-is-broader-than-target` | `not-related-to`
    ): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_relationship(value: Element): Self = StObject.set(x, "_relationship", value.asInstanceOf[js.Any])
    
    inline def set_relationshipUndefined: Self = StObject.set(x, "_relationship", js.undefined)
  }
}
