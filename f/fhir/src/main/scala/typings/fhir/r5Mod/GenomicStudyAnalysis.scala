package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenomicStudyAnalysis
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[Element] = js.undefined
  
  var _instantiatesUri: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Type of the genomic changes studied in the analysis, e.g., DNA, RNA, or amino acid change.
    */
  var changeType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The date of the analysis event.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Devices used for the analysis (e.g., instruments, software), with settings and parameters.
    */
  var device: js.UndefOr[js.Array[GenomicStudyAnalysisDevice]] = js.undefined
  
  /**
    * If the focus of the analysis is not known, the value of this field SHALL use the data absent extension.
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The reference genome build that is used in this analysis.
    */
  var genomeBuild: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifiers for the analysis event.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Inputs for the analysis event.
    */
  var input: js.UndefOr[js.Array[GenomicStudyAnalysisInput]] = js.undefined
  
  /**
    * The defined protocol that describes the analysis.
    */
  var instantiatesCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * The URL pointing to an externally maintained protocol that describes the analysis.
    */
  var instantiatesUri: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the methods used in the analysis, e.g., Fluorescence in situ hybridization (FISH), Karyotyping, or Microsatellite instability testing (MSI).
    */
  var methodType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Any notes capture with the analysis event.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Outputs for the analysis event.
    */
  var output: js.UndefOr[js.Array[GenomicStudyAnalysisOutput]] = js.undefined
  
  /**
    * Performer for the analysis event.
    */
  var performer: js.UndefOr[js.Array[GenomicStudyAnalysisPerformer]] = js.undefined
  
  /**
    * The protocol that was performed for the analysis event.
    */
  var protocolPerformed: js.UndefOr[Reference] = js.undefined
  
  /**
    * Genomic regions actually called in the analysis event (BED file).
    */
  var regionsCalled: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The genomic regions to be studied in the analysis (BED file).
    */
  var regionsStudied: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The specimen used in the analysis event.
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Name of the analysis event (human friendly).
    */
  var title: js.UndefOr[String] = js.undefined
}
object GenomicStudyAnalysis {
  
  inline def apply(): GenomicStudyAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenomicStudyAnalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenomicStudyAnalysis] (val x: Self) extends AnyVal {
    
    inline def setChangeType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    inline def setChangeTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "changeType", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDevice(value: js.Array[GenomicStudyAnalysisDevice]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: GenomicStudyAnalysisDevice*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setFocus(value: js.Array[Reference]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: Reference*): Self = StObject.set(x, "focus", js.Array(value*))
    
    inline def setGenomeBuild(value: CodeableConcept): Self = StObject.set(x, "genomeBuild", value.asInstanceOf[js.Any])
    
    inline def setGenomeBuildUndefined: Self = StObject.set(x, "genomeBuild", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInput(value: js.Array[GenomicStudyAnalysisInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: GenomicStudyAnalysisInput*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: String): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesUri(value: String): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setMethodType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "methodType", value.asInstanceOf[js.Any])
    
    inline def setMethodTypeUndefined: Self = StObject.set(x, "methodType", js.undefined)
    
    inline def setMethodTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "methodType", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOutput(value: js.Array[GenomicStudyAnalysisOutput]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: GenomicStudyAnalysisOutput*): Self = StObject.set(x, "output", js.Array(value*))
    
    inline def setPerformer(value: js.Array[GenomicStudyAnalysisPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: GenomicStudyAnalysisPerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setProtocolPerformed(value: Reference): Self = StObject.set(x, "protocolPerformed", value.asInstanceOf[js.Any])
    
    inline def setProtocolPerformedUndefined: Self = StObject.set(x, "protocolPerformed", js.undefined)
    
    inline def setRegionsCalled(value: js.Array[Reference]): Self = StObject.set(x, "regionsCalled", value.asInstanceOf[js.Any])
    
    inline def setRegionsCalledUndefined: Self = StObject.set(x, "regionsCalled", js.undefined)
    
    inline def setRegionsCalledVarargs(value: Reference*): Self = StObject.set(x, "regionsCalled", js.Array(value*))
    
    inline def setRegionsStudied(value: js.Array[Reference]): Self = StObject.set(x, "regionsStudied", value.asInstanceOf[js.Any])
    
    inline def setRegionsStudiedUndefined: Self = StObject.set(x, "regionsStudied", js.undefined)
    
    inline def setRegionsStudiedVarargs(value: Reference*): Self = StObject.set(x, "regionsStudied", js.Array(value*))
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_instantiatesCanonical(value: Element): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesUri(value: Element): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
