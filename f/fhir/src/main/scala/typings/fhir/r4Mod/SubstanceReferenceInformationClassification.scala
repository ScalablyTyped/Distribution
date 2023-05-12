package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceReferenceInformationClassification
  extends StObject
     with BackboneElement {
  
  /**
    * Todo.
    */
  var classification: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var domain: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Todo.
    */
  var subtype: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object SubstanceReferenceInformationClassification {
  
  inline def apply(): SubstanceReferenceInformationClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceReferenceInformationClassification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceReferenceInformationClassification] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: CodeableConcept): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setDomain(value: CodeableConcept): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setSubtype(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setSubtypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "subtype", js.Array(value*))
  }
}
