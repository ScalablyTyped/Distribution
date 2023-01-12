package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceReferenceInformationGene
  extends StObject
     with BackboneElement {
  
  /**
    * Todo.
    */
  var gene: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var geneSequenceOrigin: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
}
object SubstanceReferenceInformationGene {
  
  inline def apply(): SubstanceReferenceInformationGene = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceReferenceInformationGene]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceReferenceInformationGene] (val x: Self) extends AnyVal {
    
    inline def setGene(value: CodeableConcept): Self = StObject.set(x, "gene", value.asInstanceOf[js.Any])
    
    inline def setGeneSequenceOrigin(value: CodeableConcept): Self = StObject.set(x, "geneSequenceOrigin", value.asInstanceOf[js.Any])
    
    inline def setGeneSequenceOriginUndefined: Self = StObject.set(x, "geneSequenceOrigin", js.undefined)
    
    inline def setGeneUndefined: Self = StObject.set(x, "gene", js.undefined)
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
