package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Concept in target system for element
  */
trait ConceptMapGroupElementTarget
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'equivalence'.
    */
  var _equivalence: js.UndefOr[Element] = js.undefined
  
  /**
    * Code that identifies the target element
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.undefined
  
  /**
    * Description of status/issues in mapping
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Other elements required for this mapping (from context)
    */
  var dependsOn: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.undefined
  
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * relatedto | equivalent | equal | wider | subsumes | narrower | specializes | inexact | unmatched | disjoint
    */
  var equivalence: js.UndefOr[code] = js.undefined
  
  /**
    * Other concepts that this mapping also produces
    */
  var product: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.undefined
}
object ConceptMapGroupElementTarget {
  
  inline def apply(): ConceptMapGroupElementTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptMapGroupElementTarget]
  }
  
  extension [Self <: ConceptMapGroupElementTarget](x: Self) {
    
    inline def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDependsOn(value: js.Array[ConceptMapGroupElementTargetDependsOn]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: ConceptMapGroupElementTargetDependsOn*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setEquivalence(value: code): Self = StObject.set(x, "equivalence", value.asInstanceOf[js.Any])
    
    inline def setEquivalenceUndefined: Self = StObject.set(x, "equivalence", js.undefined)
    
    inline def setProduct(value: js.Array[ConceptMapGroupElementTargetDependsOn]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProductVarargs(value: ConceptMapGroupElementTargetDependsOn*): Self = StObject.set(x, "product", js.Array(value :_*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_equivalence(value: Element): Self = StObject.set(x, "_equivalence", value.asInstanceOf[js.Any])
    
    inline def set_equivalenceUndefined: Self = StObject.set(x, "_equivalence", js.undefined)
  }
}
