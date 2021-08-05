package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Group of multiple entities
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Group
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'actual'.
    */
  var _actual: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'quantity'.
    */
  var _quantity: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether this group's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Descriptive or actual
    */
  var actual: Boolean
  
  /**
    * Trait of group members
    */
  var characteristic: js.UndefOr[js.Array[GroupCharacteristic]] = js.undefined
  
  /**
    * Kind of Group members
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Unique id
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Who or what is in group
    */
  var member: js.UndefOr[js.Array[GroupMember]] = js.undefined
  
  /**
    * Label for Group
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Number of members
    */
  var quantity: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * person | animal | practitioner | device | medication | substance
    */
  var `type`: code
}
object Group {
  
  inline def apply(actual: Boolean, `type`: code): Group = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setActual(value: Boolean): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setCharacteristic(value: js.Array[GroupCharacteristic]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: GroupCharacteristic*): Self = StObject.set(x, "characteristic", js.Array(value :_*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setMember(value: js.Array[GroupMember]): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setMemberVarargs(value: GroupMember*): Self = StObject.set(x, "member", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuantity(value: unsignedInt): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_actual(value: Element): Self = StObject.set(x, "_actual", value.asInstanceOf[js.Any])
    
    inline def set_actualUndefined: Self = StObject.set(x, "_actual", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_quantity(value: Element): Self = StObject.set(x, "_quantity", value.asInstanceOf[js.Any])
    
    inline def set_quantityUndefined: Self = StObject.set(x, "_quantity", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
