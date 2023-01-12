package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`not-in`
import typings.fhir.fhirStrings.`type`
import typings.fhir.fhirStrings.above
import typings.fhir.fhirStrings.below
import typings.fhir.fhirStrings.composite
import typings.fhir.fhirStrings.contains
import typings.fhir.fhirStrings.date
import typings.fhir.fhirStrings.exact
import typings.fhir.fhirStrings.in
import typings.fhir.fhirStrings.missing
import typings.fhir.fhirStrings.not
import typings.fhir.fhirStrings.number
import typings.fhir.fhirStrings.quantity_
import typings.fhir.fhirStrings.reference
import typings.fhir.fhirStrings.string
import typings.fhir.fhirStrings.text
import typings.fhir.fhirStrings.token
import typings.fhir.fhirStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceRestResourceSearchParam
  extends StObject
     with BackboneElement {
  
  var _chain: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _modifier: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _target: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type.
    */
  var chain: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * A modifier supported for the search parameter.
    */
  var modifier: js.UndefOr[
    js.Array[missing | exact | contains | not | text | in | `not-in` | below | above | `type`]
  ] = js.undefined
  
  /**
    * The name of the search parameter used in the interface.
    */
  var name: String
  
  /**
    * Types of resource (if a resource is referenced).
    */
  var target: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The type of value a search parameter refers to, and how the content is interpreted.
    */
  var `type`: number | date | string | token | reference | composite | quantity_ | uri
}
object ConformanceRestResourceSearchParam {
  
  inline def apply(name: String, `type`: number | date | string | token | reference | composite | quantity_ | uri): ConformanceRestResourceSearchParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformanceRestResourceSearchParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConformanceRestResourceSearchParam] (val x: Self) extends AnyVal {
    
    inline def setChain(value: js.Array[String]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    inline def setChainVarargs(value: String*): Self = StObject.set(x, "chain", js.Array(value*))
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setModifier(value: js.Array[missing | exact | contains | not | text | in | `not-in` | below | above | `type`]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: (missing | exact | contains | not | text | in | `not-in` | below | above | `type`)*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setType(value: number | date | string | token | reference | composite | quantity_ | uri): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_chain(value: js.Array[Element]): Self = StObject.set(x, "_chain", value.asInstanceOf[js.Any])
    
    inline def set_chainUndefined: Self = StObject.set(x, "_chain", js.undefined)
    
    inline def set_chainVarargs(value: Element*): Self = StObject.set(x, "_chain", js.Array(value*))
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_modifier(value: js.Array[Element]): Self = StObject.set(x, "_modifier", value.asInstanceOf[js.Any])
    
    inline def set_modifierUndefined: Self = StObject.set(x, "_modifier", js.undefined)
    
    inline def set_modifierVarargs(value: Element*): Self = StObject.set(x, "_modifier", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_target(value: js.Array[Element]): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
    
    inline def set_targetVarargs(value: Element*): Self = StObject.set(x, "_target", js.Array(value*))
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
