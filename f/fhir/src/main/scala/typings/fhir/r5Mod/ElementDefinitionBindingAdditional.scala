package typings.fhir.r5Mod

import typings.fhir.fhirStrings.candidate
import typings.fhir.fhirStrings.component
import typings.fhir.fhirStrings.current
import typings.fhir.fhirStrings.extensible
import typings.fhir.fhirStrings.maximum
import typings.fhir.fhirStrings.minimum
import typings.fhir.fhirStrings.preferred
import typings.fhir.fhirStrings.required
import typings.fhir.fhirStrings.starter
import typings.fhir.fhirStrings.ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionBindingAdditional
  extends StObject
     with Element {
  
  var _any: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _shortDoco: js.UndefOr[Element] = js.undefined
  
  var _valueSet: js.UndefOr[Element] = js.undefined
  
  /**
    * A common pattern is to make a conformance binding to all repeats, and then make a binding that one of the repeats must conform to.
    */
  var any: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Documentation of the purpose of use of the bindingproviding additional information about how it is intended to be used.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Conformance bindings are in addition to the base binding, not instead of it.
    */
  var purpose: maximum | minimum | required | extensible | candidate | current | preferred | ui | starter | component
  
  /**
    * Concise documentation - for summary tables.
    */
  var shortDoco: js.UndefOr[String] = js.undefined
  
  /**
    * This specification does not define exactly how the context is determined for the usage; typically, this will be described in implementation guides.
    */
  var usage: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * The valueSet that is being bound for the purpose.
    */
  var valueSet: String
}
object ElementDefinitionBindingAdditional {
  
  inline def apply(
    purpose: maximum | minimum | required | extensible | candidate | current | preferred | ui | starter | component,
    valueSet: String
  ): ElementDefinitionBindingAdditional = {
    val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any], valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionBindingAdditional]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementDefinitionBindingAdditional] (val x: Self) extends AnyVal {
    
    inline def setAny(value: Boolean): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setAnyUndefined: Self = StObject.set(x, "any", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setPurpose(
      value: maximum | minimum | required | extensible | candidate | current | preferred | ui | starter | component
    ): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setShortDoco(value: String): Self = StObject.set(x, "shortDoco", value.asInstanceOf[js.Any])
    
    inline def setShortDocoUndefined: Self = StObject.set(x, "shortDoco", js.undefined)
    
    inline def setUsage(value: js.Array[UsageContext]): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setUsageVarargs(value: UsageContext*): Self = StObject.set(x, "usage", js.Array(value*))
    
    inline def setValueSet(value: String): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def set_any(value: Element): Self = StObject.set(x, "_any", value.asInstanceOf[js.Any])
    
    inline def set_anyUndefined: Self = StObject.set(x, "_any", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_shortDoco(value: Element): Self = StObject.set(x, "_shortDoco", value.asInstanceOf[js.Any])
    
    inline def set_shortDocoUndefined: Self = StObject.set(x, "_shortDoco", js.undefined)
    
    inline def set_valueSet(value: Element): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
  }
}
