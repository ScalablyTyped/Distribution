package typings.fhir.r4Mod

import typings.fhir.fhirStrings.female
import typings.fhir.fhirStrings.male
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatientContact
  extends StObject
     with BackboneElement {
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * Address for the contact person.
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * A name associated with the contact person.
    */
  var name: js.UndefOr[HumanName] = js.undefined
  
  /**
    * Organization on behalf of which the contact is acting or for which the contact is working.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period during which this contact person or organization is valid to be contacted relating to this patient.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The nature of the relationship between the patient and the contact person.
    */
  var relationship: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Contact may have multiple ways to be contacted with different uses or applicable periods.  May need to have options for contacting the person urgently, and also to help with identification.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object PatientContact {
  
  inline def apply(): PatientContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatientContact]
  }
  
  extension [Self <: PatientContact](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setName(value: HumanName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRelationship(value: js.Array[CodeableConcept]): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setRelationshipVarargs(value: CodeableConcept*): Self = StObject.set(x, "relationship", js.Array(value*))
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    inline def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
  }
}
