package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceReferenceInformation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Todo.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Todo.
    */
  var gene: js.UndefOr[js.Array[SubstanceReferenceInformationGene]] = js.undefined
  
  /**
    * Todo.
    */
  var geneElement: js.UndefOr[js.Array[SubstanceReferenceInformationGeneElement]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SubstanceReferenceInformation: typings.fhir.fhirStrings.SubstanceReferenceInformation
  
  /**
    * Todo.
    */
  var target: js.UndefOr[js.Array[SubstanceReferenceInformationTarget]] = js.undefined
}
object SubstanceReferenceInformation {
  
  inline def apply(): SubstanceReferenceInformation = {
    val __obj = js.Dynamic.literal(resourceType = "SubstanceReferenceInformation")
    __obj.asInstanceOf[SubstanceReferenceInformation]
  }
  
  extension [Self <: SubstanceReferenceInformation](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setGene(value: js.Array[SubstanceReferenceInformationGene]): Self = StObject.set(x, "gene", value.asInstanceOf[js.Any])
    
    inline def setGeneElement(value: js.Array[SubstanceReferenceInformationGeneElement]): Self = StObject.set(x, "geneElement", value.asInstanceOf[js.Any])
    
    inline def setGeneElementUndefined: Self = StObject.set(x, "geneElement", js.undefined)
    
    inline def setGeneElementVarargs(value: SubstanceReferenceInformationGeneElement*): Self = StObject.set(x, "geneElement", js.Array(value*))
    
    inline def setGeneUndefined: Self = StObject.set(x, "gene", js.undefined)
    
    inline def setGeneVarargs(value: SubstanceReferenceInformationGene*): Self = StObject.set(x, "gene", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SubstanceReferenceInformation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Array[SubstanceReferenceInformationTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: SubstanceReferenceInformationTarget*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
  }
}
