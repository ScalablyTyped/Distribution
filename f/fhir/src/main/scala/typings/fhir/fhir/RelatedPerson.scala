package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An person that is related to a patient, but who is not a direct target of care
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait RelatedPerson
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether this related person's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Address where the related person can be contacted or visited
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * The date on which the related person was born
    */
  var birthDate: js.UndefOr[date] = js.undefined
  
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  
  /**
    * A human identifier for this person
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A name associated with the person
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  
  /**
    * The patient this person is related to
    */
  var patient: Reference
  
  /**
    * Period of time that this relationship is considered valid
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Image of the person
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * The nature of the relationship
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object RelatedPerson {
  
  inline def apply(patient: Reference): RelatedPerson = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedPerson]
  }
  
  extension [Self <: RelatedPerson](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value :_*))
    
    inline def setBirthDate(value: date): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    inline def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
    inline def setGender(value: code): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setName(value: js.Array[HumanName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: HumanName*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPhoto(value: js.Array[Attachment]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPhotoVarargs(value: Attachment*): Self = StObject.set(x, "photo", js.Array(value :_*))
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_birthDate(value: Element): Self = StObject.set(x, "_birthDate", value.asInstanceOf[js.Any])
    
    inline def set_birthDateUndefined: Self = StObject.set(x, "_birthDate", js.undefined)
    
    inline def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    inline def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
  }
}
