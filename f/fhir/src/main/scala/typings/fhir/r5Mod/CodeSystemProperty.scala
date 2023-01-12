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

trait CodeSystemProperty
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _uri: js.UndefOr[Element] = js.undefined
  
  /**
    * A code that is used to identify the property. The code is used internally (in CodeSystem.concept.property.code) and also externally, such as in property filters.
    */
  var code: String
  
  /**
    * A description of the property- why it is defined, and how its value might be used.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the property value. Properties of type "code" contain a code defined by the code system (e.g. a reference to another defined concept).
    */
  var `type`: code | typings.fhir.fhirStrings.Coding | string | integer | boolean | dateTime | decimal
  
  /**
    * Reference to the formal meaning of the property. One possible source of meaning is the [Concept Properties](codesystem-concept-properties.html) code system.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object CodeSystemProperty {
  
  inline def apply(
    code: String,
    `type`: code | typings.fhir.fhirStrings.Coding | string | integer | boolean | dateTime | decimal
  ): CodeSystemProperty = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeSystemProperty] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setType(value: code | typings.fhir.fhirStrings.Coding | string | integer | boolean | dateTime | decimal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
