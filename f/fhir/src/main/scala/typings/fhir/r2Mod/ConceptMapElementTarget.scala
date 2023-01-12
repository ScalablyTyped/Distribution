package typings.fhir.r2Mod

import typings.fhir.fhirStrings.disjoint
import typings.fhir.fhirStrings.equal
import typings.fhir.fhirStrings.equivalent
import typings.fhir.fhirStrings.inexact
import typings.fhir.fhirStrings.narrower
import typings.fhir.fhirStrings.specializes
import typings.fhir.fhirStrings.subsumes
import typings.fhir.fhirStrings.unmatched
import typings.fhir.fhirStrings.wider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapElementTarget
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _codeSystem: js.UndefOr[Element] = js.undefined
  
  var _comments: js.UndefOr[Element] = js.undefined
  
  var _equivalence: js.UndefOr[Element] = js.undefined
  
  /**
    * Identity (code or path) or the element/item that the map refers to.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).
    */
  var codeSystem: js.UndefOr[String] = js.undefined
  
  /**
    * A description of status/issues in mapping that conveys additional information not represented in  the structured data.
    */
  var comments: js.UndefOr[String] = js.undefined
  
  /**
    * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.
    */
  var dependsOn: js.UndefOr[js.Array[ConceptMapElementTargetDependsOn]] = js.undefined
  
  /**
    * The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).
    */
  var equivalence: equivalent | equal | wider | subsumes | narrower | specializes | inexact | unmatched | disjoint
  
  /**
    * A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on.
    */
  var product: js.UndefOr[js.Array[ConceptMapElementTargetDependsOn]] = js.undefined
}
object ConceptMapElementTarget {
  
  inline def apply(
    equivalence: equivalent | equal | wider | subsumes | narrower | specializes | inexact | unmatched | disjoint
  ): ConceptMapElementTarget = {
    val __obj = js.Dynamic.literal(equivalence = equivalence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapElementTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConceptMapElementTarget] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeSystem(value: String): Self = StObject.set(x, "codeSystem", value.asInstanceOf[js.Any])
    
    inline def setCodeSystemUndefined: Self = StObject.set(x, "codeSystem", js.undefined)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setDependsOn(value: js.Array[ConceptMapElementTargetDependsOn]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: ConceptMapElementTargetDependsOn*): Self = StObject.set(x, "dependsOn", js.Array(value*))
    
    inline def setEquivalence(
      value: equivalent | equal | wider | subsumes | narrower | specializes | inexact | unmatched | disjoint
    ): Self = StObject.set(x, "equivalence", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: js.Array[ConceptMapElementTargetDependsOn]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProductVarargs(value: ConceptMapElementTargetDependsOn*): Self = StObject.set(x, "product", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeSystem(value: Element): Self = StObject.set(x, "_codeSystem", value.asInstanceOf[js.Any])
    
    inline def set_codeSystemUndefined: Self = StObject.set(x, "_codeSystem", js.undefined)
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_comments(value: Element): Self = StObject.set(x, "_comments", value.asInstanceOf[js.Any])
    
    inline def set_commentsUndefined: Self = StObject.set(x, "_comments", js.undefined)
    
    inline def set_equivalence(value: Element): Self = StObject.set(x, "_equivalence", value.asInstanceOf[js.Any])
    
    inline def set_equivalenceUndefined: Self = StObject.set(x, "_equivalence", js.undefined)
  }
}
