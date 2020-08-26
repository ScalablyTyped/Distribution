package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specific and identified anatomical location
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait BodySite extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Whether this body site record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Named anatomical location
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * Anatomical location description
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Bodysite identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Attached images
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.native
  /**
    * Who this is about
    */
  var patient: Reference = js.native
  /**
    * Modification to location code
    */
  var qualifier: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object BodySite {
  @scala.inline
  def apply(patient: Reference): BodySite = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySite]
  }
  @scala.inline
  implicit class BodySiteOps[Self <: BodySite] (val x: Self) extends AnyVal {
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
    def set_active(value: Element): Self = this.set("_active", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_active: Self = this.set("_active", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setImageVarargs(value: Attachment*): Self = this.set("image", js.Array(value :_*))
    @scala.inline
    def setImage(value: js.Array[Attachment]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setQualifierVarargs(value: CodeableConcept*): Self = this.set("qualifier", js.Array(value :_*))
    @scala.inline
    def setQualifier(value: js.Array[CodeableConcept]): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifier: Self = this.set("qualifier", js.undefined)
  }
  
}

