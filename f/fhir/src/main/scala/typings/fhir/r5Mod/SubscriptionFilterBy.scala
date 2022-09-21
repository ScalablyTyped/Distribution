package typings.fhir.r5Mod

import typings.fhir.fhirStrings.Equalssign
import typings.fhir.fhirStrings.`not-in`
import typings.fhir.fhirStrings.`of-type`
import typings.fhir.fhirStrings.above
import typings.fhir.fhirStrings.ap
import typings.fhir.fhirStrings.below
import typings.fhir.fhirStrings.eb
import typings.fhir.fhirStrings.eq
import typings.fhir.fhirStrings.ge
import typings.fhir.fhirStrings.gt
import typings.fhir.fhirStrings.in
import typings.fhir.fhirStrings.le
import typings.fhir.fhirStrings.lt
import typings.fhir.fhirStrings.ne
import typings.fhir.fhirStrings.sa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionFilterBy
  extends StObject
     with BackboneElement {
  
  var _resourceType: js.UndefOr[Element] = js.undefined
  
  var _searchModifier: js.UndefOr[Element] = js.undefined
  
  var _searchParamName: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * If the element is a reference to another resource, this element contains "Reference", and the targetProfile element defines what resources can be referenced. The targetProfile may be a reference to the general definition of a resource (e.g. http://hl7.org/fhir/StructureDefinition/Patient).
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The operator to apply to the filter value when determining matches (Search modifiers).
    */
  var searchModifier: js.UndefOr[
    Equalssign | eq | ne | gt | lt | ge | le | sa | eb | ap | above | below | in | `not-in` | `of-type`
  ] = js.undefined
  
  /**
    * The filter label (=key) as defined in the `SubscriptionTopic.canfilterBy.searchParamName`  element.
    */
  var searchParamName: String
  
  /**
    * The literal value or resource path as is legal in search - for example, "Patient/123" or "le1950".
    */
  var value: String
}
object SubscriptionFilterBy {
  
  inline def apply(searchParamName: String, value: String): SubscriptionFilterBy = {
    val __obj = js.Dynamic.literal(searchParamName = searchParamName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionFilterBy]
  }
  
  extension [Self <: SubscriptionFilterBy](x: Self) {
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSearchModifier(
      value: Equalssign | eq | ne | gt | lt | ge | le | sa | eb | ap | above | below | in | `not-in` | `of-type`
    ): Self = StObject.set(x, "searchModifier", value.asInstanceOf[js.Any])
    
    inline def setSearchModifierUndefined: Self = StObject.set(x, "searchModifier", js.undefined)
    
    inline def setSearchParamName(value: String): Self = StObject.set(x, "searchParamName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_resourceType(value: Element): Self = StObject.set(x, "_resourceType", value.asInstanceOf[js.Any])
    
    inline def set_resourceTypeUndefined: Self = StObject.set(x, "_resourceType", js.undefined)
    
    inline def set_searchModifier(value: Element): Self = StObject.set(x, "_searchModifier", value.asInstanceOf[js.Any])
    
    inline def set_searchModifierUndefined: Self = StObject.set(x, "_searchModifier", js.undefined)
    
    inline def set_searchParamName(value: Element): Self = StObject.set(x, "_searchParamName", value.asInstanceOf[js.Any])
    
    inline def set_searchParamNameUndefined: Self = StObject.set(x, "_searchParamName", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
