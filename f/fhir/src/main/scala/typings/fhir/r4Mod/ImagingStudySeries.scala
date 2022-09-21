package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingStudySeries
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _started: js.UndefOr[Element] = js.undefined
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.laterality.
    */
  var bodySite: js.UndefOr[Coding] = js.undefined
  
  /**
    * A description of the series.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Typical endpoint types include DICOM WADO-RS, which is used to retrieve DICOM instances in native or rendered (e.g., JPG, PNG) formats using a RESTful API; DICOM WADO-URI, which can similarly retrieve native or rendered instances, except using an HTTP query-based approach; and DICOM QIDO-RS, which allows RESTful query for DICOM information without retrieving the actual instances.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A single SOP instance within the series, e.g. an image, or presentation state.
    */
  var instance: js.UndefOr[js.Array[ImagingStudySeriesInstance]] = js.undefined
  
  /**
    * The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite.
    */
  var laterality: js.UndefOr[Coding] = js.undefined
  
  /**
    * The modality of this series sequence.
    */
  var modality: Coding
  
  /**
    * The numeric identifier of this series in the study.
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of SOP Instances in the Study. The value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
    */
  var numberOfInstances: js.UndefOr[Double] = js.undefined
  
  /**
    * If the person who performed the series is not known, their Organization may be recorded. A patient, or related person, may be the performer, e.g. for patient-captured images.
    */
  var performer: js.UndefOr[js.Array[ImagingStudySeriesPerformer]] = js.undefined
  
  /**
    * The specimen imaged, e.g., for whole slide imaging of a biopsy.
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The date and time the series was started.
    */
  var started: js.UndefOr[String] = js.undefined
  
  /**
    * See [DICOM PS3.3 C.7.3](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.7.3.html).
    */
  var uid: String
}
object ImagingStudySeries {
  
  inline def apply(modality: Coding, uid: String): ImagingStudySeries = {
    val __obj = js.Dynamic.literal(modality = modality.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeries]
  }
  
  extension [Self <: ImagingStudySeries](x: Self) {
    
    inline def setBodySite(value: Coding): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setInstance(value: js.Array[ImagingStudySeriesInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInstanceVarargs(value: ImagingStudySeriesInstance*): Self = StObject.set(x, "instance", js.Array(value*))
    
    inline def setLaterality(value: Coding): Self = StObject.set(x, "laterality", value.asInstanceOf[js.Any])
    
    inline def setLateralityUndefined: Self = StObject.set(x, "laterality", js.undefined)
    
    inline def setModality(value: Coding): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInstances(value: Double): Self = StObject.set(x, "numberOfInstances", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInstancesUndefined: Self = StObject.set(x, "numberOfInstances", js.undefined)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPerformer(value: js.Array[ImagingStudySeriesPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: ImagingStudySeriesPerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value*))
    
    inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_started(value: Element): Self = StObject.set(x, "_started", value.asInstanceOf[js.Any])
    
    inline def set_startedUndefined: Self = StObject.set(x, "_started", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
