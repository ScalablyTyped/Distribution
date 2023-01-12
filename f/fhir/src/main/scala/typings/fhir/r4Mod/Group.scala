package typings.fhir.r4Mod

import typings.fhir.fhirStrings.animal
import typings.fhir.fhirStrings.device_
import typings.fhir.fhirStrings.medication_
import typings.fhir.fhirStrings.person_
import typings.fhir.fhirStrings.practitioner_
import typings.fhir.fhirStrings.substance_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _actual: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates whether the record for the group is available for use or is merely being retained for historical purposes.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.
    */
  var actual: Boolean
  
  /**
    * All the identified characteristics must be true for an entity to a member of the group.
    */
  var characteristic: js.UndefOr[js.Array[GroupCharacteristic]] = js.undefined
  
  /**
    * This would generally be omitted for Person resources.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A unique business identifier for this group.
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
    * Group members SHALL be of the appropriate resource type (Patient for person or animal; or Practitioner, Device, Medication or Substance for the other types.).
    */
  var `type`: person_ | animal | practitioner_ | device_ | medication_ | substance_
}
object Group {
  
  inline def apply(actual: Boolean, `type`: person_ | animal | practitioner_ | device_ | medication_ | substance_): Group = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], resourceType = "Group")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setActual(value: Boolean): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setCharacteristic(value: js.Array[GroupCharacteristic]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: GroupCharacteristic*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManagingEntity(value: Reference): Self = StObject.set(x, "managingEntity", value.asInstanceOf[js.Any])
    
    inline def setManagingEntityUndefined: Self = StObject.set(x, "managingEntity", js.undefined)
    
    inline def setMember(value: js.Array[GroupMember]): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setMemberVarargs(value: GroupMember*): Self = StObject.set(x, "member", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Group): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setType(value: person_ | animal | practitioner_ | device_ | medication_ | substance_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_actual(value: Element): Self = StObject.set(x, "_actual", value.asInstanceOf[js.Any])
    
    inline def set_actualUndefined: Self = StObject.set(x, "_actual", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
