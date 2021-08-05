package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Key Object Selection
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ImagingManifest
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'authoringTime'.
    */
  var _authoringTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Author (human or machine)
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Time when the selection of instances was made
    */
  var authoringTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Description text
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * SOP Instance UID
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Patient of the selected objects
    */
  var patient: Reference
  
  /**
    * Study identity of the selected instances
    */
  var study: js.Array[ImagingManifestStudy]
}
object ImagingManifest {
  
  inline def apply(patient: Reference, study: js.Array[ImagingManifestStudy]): ImagingManifest = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifest]
  }
  
  extension [Self <: ImagingManifest](x: Self) {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthoringTime(value: dateTime): Self = StObject.set(x, "authoringTime", value.asInstanceOf[js.Any])
    
    inline def setAuthoringTimeUndefined: Self = StObject.set(x, "authoringTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setStudy(value: js.Array[ImagingManifestStudy]): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setStudyVarargs(value: ImagingManifestStudy*): Self = StObject.set(x, "study", js.Array(value :_*))
    
    inline def set_authoringTime(value: Element): Self = StObject.set(x, "_authoringTime", value.asInstanceOf[js.Any])
    
    inline def set_authoringTimeUndefined: Self = StObject.set(x, "_authoringTime", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
