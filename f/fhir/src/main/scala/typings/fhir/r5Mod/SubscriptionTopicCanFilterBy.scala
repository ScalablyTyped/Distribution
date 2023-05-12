package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`code-text`
import typings.fhir.fhirStrings.`not-in`
import typings.fhir.fhirStrings.`of-type`
import typings.fhir.fhirStrings.`text-advanced`
import typings.fhir.fhirStrings.`type`
import typings.fhir.fhirStrings.above
import typings.fhir.fhirStrings.ap
import typings.fhir.fhirStrings.below
import typings.fhir.fhirStrings.contains
import typings.fhir.fhirStrings.eb
import typings.fhir.fhirStrings.eq
import typings.fhir.fhirStrings.exact
import typings.fhir.fhirStrings.ge
import typings.fhir.fhirStrings.gt
import typings.fhir.fhirStrings.identifier
import typings.fhir.fhirStrings.in
import typings.fhir.fhirStrings.iterate
import typings.fhir.fhirStrings.le
import typings.fhir.fhirStrings.lt
import typings.fhir.fhirStrings.missing
import typings.fhir.fhirStrings.ne
import typings.fhir.fhirStrings.not
import typings.fhir.fhirStrings.sa
import typings.fhir.fhirStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionTopicCanFilterBy
  extends StObject
     with BackboneElement {
  
  var _comparator: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _filterDefinition: js.UndefOr[Element] = js.undefined
  
  var _filterParameter: js.UndefOr[Element] = js.undefined
  
  var _modifier: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  /**
    * If no comparators are listed, clients should not expect servers to support any comparators.
    */
  var comparator: js.UndefOr[js.Array[eq | ne | gt | lt | ge | le | sa | eb | ap]] = js.undefined
  
  /**
    * Description of how this filtering parameter is intended to be used.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Chained parameters are allowed (like "patient.gender") - but can not use colons or modifiers.
    */
  var filterDefinition: js.UndefOr[String] = js.undefined
  
  /**
    * Chained parameters are allowed (like "patient.gender") - but can not use colons or modifiers.
    */
  var filterParameter: String
  
  /**
    * If no modifiers are listed, clients should not expect servers to support any modifiers.
    */
  var modifier: js.UndefOr[
    js.Array[
      missing | exact | contains | not | text | in | `not-in` | below | above | `type` | identifier | `of-type` | `code-text` | `text-advanced` | iterate
    ]
  ] = js.undefined
  
  /**
    * URL of the Resource that is the type used in this filter. Relative URLs are relative to the StructureDefinition root of the implemented FHIR version (e.g., http://hl7.org/fhir/StructureDefinition). For example, "Patient" maps to http://hl7.org/fhir/StructureDefinition/Patient. For more information, see <a href="elementdefinition-definitions.html#ElementDefinition.type.code">ElementDefinition.type.code</a>.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object SubscriptionTopicCanFilterBy {
  
  inline def apply(filterParameter: String): SubscriptionTopicCanFilterBy = {
    val __obj = js.Dynamic.literal(filterParameter = filterParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTopicCanFilterBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionTopicCanFilterBy] (val x: Self) extends AnyVal {
    
    inline def setComparator(value: js.Array[eq | ne | gt | lt | ge | le | sa | eb | ap]): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setComparatorVarargs(value: (eq | ne | gt | lt | ge | le | sa | eb | ap)*): Self = StObject.set(x, "comparator", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilterDefinition(value: String): Self = StObject.set(x, "filterDefinition", value.asInstanceOf[js.Any])
    
    inline def setFilterDefinitionUndefined: Self = StObject.set(x, "filterDefinition", js.undefined)
    
    inline def setFilterParameter(value: String): Self = StObject.set(x, "filterParameter", value.asInstanceOf[js.Any])
    
    inline def setModifier(
      value: js.Array[
          missing | exact | contains | not | text | in | `not-in` | below | above | `type` | identifier | `of-type` | `code-text` | `text-advanced` | iterate
        ]
    ): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(
      value: (missing | exact | contains | not | text | in | `not-in` | below | above | `type` | identifier | `of-type` | `code-text` | `text-advanced` | iterate)*
    ): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def set_comparator(value: js.Array[Element]): Self = StObject.set(x, "_comparator", value.asInstanceOf[js.Any])
    
    inline def set_comparatorUndefined: Self = StObject.set(x, "_comparator", js.undefined)
    
    inline def set_comparatorVarargs(value: Element*): Self = StObject.set(x, "_comparator", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_filterDefinition(value: Element): Self = StObject.set(x, "_filterDefinition", value.asInstanceOf[js.Any])
    
    inline def set_filterDefinitionUndefined: Self = StObject.set(x, "_filterDefinition", js.undefined)
    
    inline def set_filterParameter(value: Element): Self = StObject.set(x, "_filterParameter", value.asInstanceOf[js.Any])
    
    inline def set_filterParameterUndefined: Self = StObject.set(x, "_filterParameter", js.undefined)
    
    inline def set_modifier(value: js.Array[Element]): Self = StObject.set(x, "_modifier", value.asInstanceOf[js.Any])
    
    inline def set_modifierUndefined: Self = StObject.set(x, "_modifier", js.undefined)
    
    inline def set_modifierVarargs(value: Element*): Self = StObject.set(x, "_modifier", js.Array(value*))
    
    inline def set_resource(value: Element): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    inline def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
  }
}
