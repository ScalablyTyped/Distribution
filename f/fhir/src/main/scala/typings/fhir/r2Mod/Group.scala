package typings.fhir.r2Mod

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
  
  var _actual: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * There are use-cases for groups that define specific collections of individuals, and other groups that define "types" of intended individuals.  The requirements for both kinds of groups are similar, so we use a single resource, distinguished by this flag.
    */
  var actual: Boolean
  
  /**
    * Needs to be a generic mechanism for identifying what individuals can be part of a group.
    */
  var characteristic: js.UndefOr[js.Array[GroupCharacteristic]] = js.undefined
  
  /**
    * Provides a specific type of resource the group includes; e.g. "cow", "syringe", etc.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Allows the group to be referenced from external specifications.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Often the only thing of interest about a group is "who's in it".
    */
  var member: js.UndefOr[js.Array[GroupMember]] = js.undefined
  
  /**
    * Used to identify the group in human communication.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Group size is a common defining characteristic.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Group: typings.fhir.fhirStrings.Group
  
  /**
    * Identifies what type of resources the group is made up of.
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
    
    inline def setActual(value: Boolean): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setCharacteristic(value: js.Array[GroupCharacteristic]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: GroupCharacteristic*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMember(value: js.Array[GroupMember]): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setMemberVarargs(value: GroupMember*): Self = StObject.set(x, "member", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Group): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setType(value: person_ | animal | practitioner_ | device_ | medication_ | substance_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_actual(value: Element): Self = StObject.set(x, "_actual", value.asInstanceOf[js.Any])
    
    inline def set_actualUndefined: Self = StObject.set(x, "_actual", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
