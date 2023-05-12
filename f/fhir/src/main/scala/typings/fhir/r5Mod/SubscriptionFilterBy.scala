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

trait SubscriptionFilterBy
  extends StObject
     with BackboneElement {
  
  var _comparator: js.UndefOr[Element] = js.undefined
  
  var _filterParameter: js.UndefOr[Element] = js.undefined
  
  var _modifier: js.UndefOr[Element] = js.undefined
  
  var _resourceType: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Must be a comparator allowed by the SubscriptionTopic relevant to this Subscription filter.
    */
  var comparator: js.UndefOr[eq | ne | gt | lt | ge | le | sa | eb | ap] = js.undefined
  
  /**
    * The filter as defined in the `SubscriptionTopic.canFilterBy.filterParameter` element.
    */
  var filterParameter: String
  
  /**
    * Must be a modifier allowed by the SubscriptionTopic relevant to this Subscription filter.
    */
  var modifier: js.UndefOr[
    missing | exact | contains | not | text | in | `not-in` | below | above | `type` | identifier | `of-type` | `code-text` | `text-advanced` | iterate
  ] = js.undefined
  
  /**
    * A resource listed in the `SubscriptionTopic` this `Subscription` references (`SubscriptionTopic.canFilterBy.resource`). This element can be used to differentiate filters for topics that include more than one resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The literal value or resource path as is legal in search - for example, `Patient/123` or `le1950`.
    */
  var value: String
}
object SubscriptionFilterBy {
  
  inline def apply(filterParameter: String, value: String): SubscriptionFilterBy = {
    val __obj = js.Dynamic.literal(filterParameter = filterParameter.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionFilterBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionFilterBy] (val x: Self) extends AnyVal {
    
    inline def setComparator(value: eq | ne | gt | lt | ge | le | sa | eb | ap): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setFilterParameter(value: String): Self = StObject.set(x, "filterParameter", value.asInstanceOf[js.Any])
    
    inline def setModifier(
      value: missing | exact | contains | not | text | in | `not-in` | below | above | `type` | identifier | `of-type` | `code-text` | `text-advanced` | iterate
    ): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_comparator(value: Element): Self = StObject.set(x, "_comparator", value.asInstanceOf[js.Any])
    
    inline def set_comparatorUndefined: Self = StObject.set(x, "_comparator", js.undefined)
    
    inline def set_filterParameter(value: Element): Self = StObject.set(x, "_filterParameter", value.asInstanceOf[js.Any])
    
    inline def set_filterParameterUndefined: Self = StObject.set(x, "_filterParameter", js.undefined)
    
    inline def set_modifier(value: Element): Self = StObject.set(x, "_modifier", value.asInstanceOf[js.Any])
    
    inline def set_modifierUndefined: Self = StObject.set(x, "_modifier", js.undefined)
    
    inline def set_resourceType(value: Element): Self = StObject.set(x, "_resourceType", value.asInstanceOf[js.Any])
    
    inline def set_resourceTypeUndefined: Self = StObject.set(x, "_resourceType", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
