package typings.fhir.fhir

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
  implicit class ImagingManifestOps[Self <: ImagingManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudyVarargs(value: ImagingManifestStudy*): Self = this.set("study", js.Array(value :_*))
    
    @scala.inline
    def setStudy(value: js.Array[ImagingManifestStudy]): Self = this.set("study", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authoringTime(value: Element): Self = this.set("_authoringTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_authoringTime: Self = this.set("_authoringTime", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def setAuthor(value: Reference): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setAuthoringTime(value: dateTime): Self = this.set("authoringTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoringTime: Self = this.set("authoringTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
  }
}
