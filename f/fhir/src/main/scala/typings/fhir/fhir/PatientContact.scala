package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A contact party (e.g. guardian, partner, friend) for the patient
  */
@js.native
trait PatientContact extends BackboneElement {
  
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  
  /**
    * Address for the contact person
    */
  var address: js.UndefOr[Address] = js.native
  
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  
  /**
    * A name associated with the contact person
    */
  var name: js.UndefOr[HumanName] = js.native
  
  /**
    * Organization that is associated with the contact
    */
  var organization: js.UndefOr[Reference] = js.native
  
  /**
    * The period during which this contact person or organization is valid to be contacted relating to this patient
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * The kind of relationship
    */
  var relationship: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}
object PatientContact {
  
  @scala.inline
  def apply(): PatientContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatientContact]
  }
  
  @scala.inline
  implicit class PatientContactMutableBuilder[Self <: PatientContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setGender(value: code): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setName(value: HumanName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setRelationship(value: js.Array[CodeableConcept]): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    @scala.inline
    def setRelationshipVarargs(value: CodeableConcept*): Self = StObject.set(x, "relationship", js.Array(value :_*))
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    @scala.inline
    def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
  }
}
