package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingObjectSelection
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authoringTime: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * Track the selection decision maker.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Date and time when the selection was made can be important to understand the content of selection.
    */
  var authoringTime: js.UndefOr[String] = js.undefined
  
  /**
    * Need to provide a narrative description of the SOP instances in the selection.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * SOP Instances in ImagingObjectSelection must be from the same patient.
    */
  var patient: Reference
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ImagingObjectSelection: typings.fhir.fhirStrings.ImagingObjectSelection
  
  /**
    * DICOM SOP instances are identified through the UIDs of the study - series - instance hierarchy. In addition, the locator at the study level provide a means of retrieving the entire study.
    */
  var study: js.Array[ImagingObjectSelectionStudy]
  
  /**
    * Need to represent the application purpose that the SOP instances in ImagingObjectSelection are selected for.
    */
  var title: CodeableConcept
  
  /**
    * DICOM SOP Instance is always assigned with a unique identifier (UID).
    */
  var uid: String
}
object ImagingObjectSelection {
  
  inline def apply(
    patient: Reference,
    study: js.Array[ImagingObjectSelectionStudy],
    title: CodeableConcept,
    uid: String
  ): ImagingObjectSelection = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "ImagingObjectSelection", study = study.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingObjectSelection]
  }
  
  extension [Self <: ImagingObjectSelection](x: Self) {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthoringTime(value: String): Self = StObject.set(x, "authoringTime", value.asInstanceOf[js.Any])
    
    inline def setAuthoringTimeUndefined: Self = StObject.set(x, "authoringTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImagingObjectSelection): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStudy(value: js.Array[ImagingObjectSelectionStudy]): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setStudyVarargs(value: ImagingObjectSelectionStudy*): Self = StObject.set(x, "study", js.Array(value*))
    
    inline def setTitle(value: CodeableConcept): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_authoringTime(value: Element): Self = StObject.set(x, "_authoringTime", value.asInstanceOf[js.Any])
    
    inline def set_authoringTimeUndefined: Self = StObject.set(x, "_authoringTime", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
