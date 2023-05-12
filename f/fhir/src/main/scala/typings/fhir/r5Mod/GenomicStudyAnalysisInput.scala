package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenomicStudyAnalysisInput
  extends StObject
     with BackboneElement {
  
  /**
    * File containing input data.
    */
  var file: js.UndefOr[Reference] = js.undefined
  
  /**
    * The analysis event or other GenomicStudy that generated this input file.
    */
  var generatedByIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The analysis event or other GenomicStudy that generated this input file.
    */
  var generatedByReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Type of input data, e.g., BAM, CRAM, or FASTA.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object GenomicStudyAnalysisInput {
  
  inline def apply(): GenomicStudyAnalysisInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenomicStudyAnalysisInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenomicStudyAnalysisInput] (val x: Self) extends AnyVal {
    
    inline def setFile(value: Reference): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setGeneratedByIdentifier(value: Identifier): Self = StObject.set(x, "generatedByIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGeneratedByIdentifierUndefined: Self = StObject.set(x, "generatedByIdentifier", js.undefined)
    
    inline def setGeneratedByReference(value: Reference): Self = StObject.set(x, "generatedByReference", value.asInstanceOf[js.Any])
    
    inline def setGeneratedByReferenceUndefined: Self = StObject.set(x, "generatedByReference", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
