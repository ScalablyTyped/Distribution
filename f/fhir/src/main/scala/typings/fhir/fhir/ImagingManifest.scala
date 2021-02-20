package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Key Object Selection
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ImagingManifest extends DomainResource {
  
  /**
    * Contains extended information for property 'authoringTime'.
    */
  var _authoringTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Author (human or machine)
    */
  var author: js.UndefOr[Reference] = js.native
  
  /**
    * Time when the selection of instances was made
    */
  var authoringTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Description text
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * SOP Instance UID
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Patient of the selected objects
    */
  var patient: Reference = js.native
  
  /**
    * Study identity of the selected instances
    */
  var study: js.Array[ImagingManifestStudy] = js.native
}
object ImagingManifest {
  
  @scala.inline
  def apply(patient: Reference, study: js.Array[ImagingManifestStudy]): ImagingManifest = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifest]
  }
  
  @scala.inline
  implicit class ImagingManifestMutableBuilder[Self <: ImagingManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setAuthoringTime(value: dateTime): Self = StObject.set(x, "authoringTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoringTimeUndefined: Self = StObject.set(x, "authoringTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudy(value: js.Array[ImagingManifestStudy]): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudyVarargs(value: ImagingManifestStudy*): Self = StObject.set(x, "study", js.Array(value :_*))
    
    @scala.inline
    def set_authoringTime(value: Element): Self = StObject.set(x, "_authoringTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authoringTimeUndefined: Self = StObject.set(x, "_authoringTime", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
