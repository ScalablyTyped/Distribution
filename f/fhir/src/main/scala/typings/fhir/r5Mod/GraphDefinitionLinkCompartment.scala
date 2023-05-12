package typings.fhir.r5Mod

import typings.fhir.fhirStrings.custom
import typings.fhir.fhirStrings.different
import typings.fhir.fhirStrings.identical
import typings.fhir.fhirStrings.matching
import typings.fhir.fhirStrings.requires
import typings.fhir.fhirStrings.where
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphDefinitionLinkCompartment
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _expression: js.UndefOr[Element] = js.undefined
  
  var _rule: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifies the compartment.
    */
  var code: typings.fhir.fhirStrings.Patient | typings.fhir.fhirStrings.Encounter | typings.fhir.fhirStrings.RelatedPerson | typings.fhir.fhirStrings.Practitioner | typings.fhir.fhirStrings.Device | typings.fhir.fhirStrings.EpisodeOfCare
  
  /**
    * Documentation for FHIRPath expression.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Custom rule, as a FHIRPath expression.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * identical | matching | different | no-rule | custom.
    */
  var rule: identical | matching | different | custom
  
  /**
    * All conditional rules are evaluated; if they are true, then the rules are evaluated.
    */
  var use: where | requires
}
object GraphDefinitionLinkCompartment {
  
  inline def apply(
    code: typings.fhir.fhirStrings.Patient | typings.fhir.fhirStrings.Encounter | typings.fhir.fhirStrings.RelatedPerson | typings.fhir.fhirStrings.Practitioner | typings.fhir.fhirStrings.Device | typings.fhir.fhirStrings.EpisodeOfCare,
    rule: identical | matching | different | custom,
    use: where | requires
  ): GraphDefinitionLinkCompartment = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLinkCompartment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphDefinitionLinkCompartment] (val x: Self) extends AnyVal {
    
    inline def setCode(
      value: typings.fhir.fhirStrings.Patient | typings.fhir.fhirStrings.Encounter | typings.fhir.fhirStrings.RelatedPerson | typings.fhir.fhirStrings.Practitioner | typings.fhir.fhirStrings.Device | typings.fhir.fhirStrings.EpisodeOfCare
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setRule(value: identical | matching | different | custom): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setUse(value: where | requires): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_rule(value: Element): Self = StObject.set(x, "_rule", value.asInstanceOf[js.Any])
    
    inline def set_ruleUndefined: Self = StObject.set(x, "_rule", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
