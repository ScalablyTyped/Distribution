package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenomicStudyAnalysisOutput
  extends StObject
     with BackboneElement {
  
  /**
    * File containing output data.
    */
  var file: js.UndefOr[Reference] = js.undefined
  
  /**
    * Type of output data, e.g., VCF, MAF, or BAM.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object GenomicStudyAnalysisOutput {
  
  inline def apply(): GenomicStudyAnalysisOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenomicStudyAnalysisOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenomicStudyAnalysisOutput] (val x: Self) extends AnyVal {
    
    inline def setFile(value: Reference): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
