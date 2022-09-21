package typings.fhir.mod

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
    * Need to keep track where the contact person can be contacted per postal mail or visited.
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * Needed to address the person correctly.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * Contact persons need to be identified by name, but it is uncommon to need details about multiple other names for that contact person.
    */
  var name: js.UndefOr[HumanName] = js.undefined
  
  /**
    * For guardians or business related contacts, the organization is relevant.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period during which this contact person or organization is valid to be contacted relating to this patient.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Used to determine which contact person is the most relevant to approach, depending on circumstances.
    */
  var relationship: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * People have (primary) ways to contact them in some way such as phone, email.
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
