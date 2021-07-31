package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specific and identified anatomical location
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait BodySite
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether this body site record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Named anatomical location
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Anatomical location description
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Bodysite identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Attached images
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * Who this is about
    */
  var patient: Reference
  
  /**
    * Modification to location code
    */
  var qualifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object BodySite {
  
  @scala.inline
  def apply(patient: Reference): BodySite = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySite]
  }
  
  @scala.inline
  implicit class BodySiteMutableBuilder[Self <: BodySite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: js.Array[Attachment]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setImageVarargs(value: Attachment*): Self = StObject.set(x, "image", js.Array(value :_*))
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    
    @scala.inline
    def setQualifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "qualifier", js.Array(value :_*))
    
    @scala.inline
    def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
