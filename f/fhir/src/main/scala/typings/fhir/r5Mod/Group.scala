package typings.fhir.r5Mod

import typings.fhir.fhirStrings.animal
import typings.fhir.fhirStrings.careteam_
import typings.fhir.fhirStrings.definitional
import typings.fhir.fhirStrings.device_
import typings.fhir.fhirStrings.enumerated
import typings.fhir.fhirStrings.healthcareservice_
import typings.fhir.fhirStrings.location_
import typings.fhir.fhirStrings.organization_
import typings.fhir.fhirStrings.person_
import typings.fhir.fhirStrings.practitioner_
import typings.fhir.fhirStrings.relatedperson_
import typings.fhir.fhirStrings.specimen_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _membership: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates whether the record for the group is available for use or is merely being retained for historical purposes.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * All the identified characteristics must be true for an entity to a member of the group.
    */
  var characteristic: js.UndefOr[js.Array[GroupCharacteristic]] = js.undefined
  
  /**
    * This would generally be omitted for Person resources.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Explanation of what the group represents and how it is intended to be used.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Note: This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This does not strictly align with ownership of a herd or flock, but may suffice to represent that relationship in simple cases. More complex cases will require an extension.
    */
  var managingEntity: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the resource instances that are members of the group.
    */
  var member: js.UndefOr[js.Array[GroupMember]] = js.undefined
  
  /**
    * Basis for membership in the Group:
    * * 'definitional': The Group.characteristics specified are both necessary and sufficient to determine membership. All entities that meet the criteria are considered to be members of the group, whether referenced by the group or not. If members are present, they are individuals that happen to be known as meeting the Group.characteristics. The list cannot be presumed to be complete.
    * * 'enumerated': The Group.characteristics are necessary but not sufficient to determine membership. Membership is determined by being listed as one of the Group.member.
    */
  var membership: definitional | enumerated
  
  /**
    * A label assigned to the group for human identification and communication.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Note that the quantity may be less than the number of members if some of the members are not active.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Group: typings.fhir.fhirStrings.Group
  
  /**
    * Group members SHALL be of the appropriate resource type (Patient for person or animal; or Practitioner, PractitionerRole, Device, CareTeam, HealthcareService, Location, Organization, RelatedPerson, or Specimen for the other types.), or a Group of the resources of the appropriate type.
    */
  var `type`: person_ | animal | practitioner_ | device_ | careteam_ | healthcareservice_ | location_ | organization_ | relatedperson_ | specimen_
}
object Group {
  
  inline def apply(
    membership: definitional | enumerated,
    `type`: person_ | animal | practitioner_ | device_ | careteam_ | healthcareservice_ | location_ | organization_ | relatedperson_ | specimen_
  ): Group = {
    val __obj = js.Dynamic.literal(membership = membership.asInstanceOf[js.Any], resourceType = "Group")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCharacteristic(value: js.Array[GroupCharacteristic]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: GroupCharacteristic*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManagingEntity(value: Reference): Self = StObject.set(x, "managingEntity", value.asInstanceOf[js.Any])
    
    inline def setManagingEntityUndefined: Self = StObject.set(x, "managingEntity", js.undefined)
    
    inline def setMember(value: js.Array[GroupMember]): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setMemberVarargs(value: GroupMember*): Self = StObject.set(x, "member", js.Array(value*))
    
    inline def setMembership(value: definitional | enumerated): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Group): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: person_ | animal | practitioner_ | device_ | careteam_ | healthcareservice_ | location_ | organization_ | relatedperson_ | specimen_
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_membership(value: Element): Self = StObject.set(x, "_membership", value.asInstanceOf[js.Any])
    
    inline def set_membershipUndefined: Self = StObject.set(x, "_membership", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
