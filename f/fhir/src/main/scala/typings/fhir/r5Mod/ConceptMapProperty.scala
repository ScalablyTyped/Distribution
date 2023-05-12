package typings.fhir.r5Mod

import typings.fhir.fhirStrings.boolean
import typings.fhir.fhirStrings.code
import typings.fhir.fhirStrings.dateTime
import typings.fhir.fhirStrings.decimal
import typings.fhir.fhirStrings.integer
import typings.fhir.fhirStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapProperty
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _uri: js.UndefOr[Element] = js.undefined
  
  /**
    * A code that is used to identify the property. The code is used internally (in ConceptMap.group.element.target.property.code) and also in the $translate operation.
    */
  var code: String
  
  /**
    * A description of the property - why it is defined, and how its value might be used.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The CodeSystem that defines the codes from which values of type ```code``` in property values.
    */
  var system: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the property value.
    */
  var `type`: typings.fhir.fhirStrings.Coding | string | integer | boolean | dateTime | decimal | code
  
  /**
    * Reference to the formal meaning of the property.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object ConceptMapProperty {
  
  inline def apply(
    code: String,
    `type`: typings.fhir.fhirStrings.Coding | string | integer | boolean | dateTime | decimal | code
  ): ConceptMapProperty = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConceptMapProperty] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setType(value: typings.fhir.fhirStrings.Coding | string | integer | boolean | dateTime | decimal | code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
