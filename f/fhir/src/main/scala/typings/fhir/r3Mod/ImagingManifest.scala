package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingManifest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authoringTime: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Author of ImagingManifest. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
    */
  var authoringTime: js.UndefOr[String] = js.undefined
  
  /**
    * Free text narrative description of the ImagingManifest.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of the DICOM Key Object Selection (KOS) that this resource represents.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * SOP instances selected in the ImagingManifest can be from different studies, but must be of the same patient.
    */
  var patient: Reference
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ImagingManifest: typings.fhir.fhirStrings.ImagingManifest
  
  /**
    * Study component represents the study level identity and locator information of the DICOM SOP instances in the selection. It is the top level identity of the hierarchical identification of the instances.
    */
  var study: js.Array[ImagingManifestStudy]
}
object ImagingManifest {
  
  inline def apply(patient: Reference, study: js.Array[ImagingManifestStudy]): ImagingManifest = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "ImagingManifest", study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifest]
  }
  
  extension [Self <: ImagingManifest](x: Self) {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthoringTime(value: String): Self = StObject.set(x, "authoringTime", value.asInstanceOf[js.Any])
    
    inline def setAuthoringTimeUndefined: Self = StObject.set(x, "authoringTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImagingManifest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStudy(value: js.Array[ImagingManifestStudy]): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setStudyVarargs(value: ImagingManifestStudy*): Self = StObject.set(x, "study", js.Array(value*))
    
    inline def set_authoringTime(value: Element): Self = StObject.set(x, "_authoringTime", value.asInstanceOf[js.Any])
    
    inline def set_authoringTimeUndefined: Self = StObject.set(x, "_authoringTime", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
