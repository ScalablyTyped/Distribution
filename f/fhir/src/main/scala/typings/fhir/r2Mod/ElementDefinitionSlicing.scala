package typings.fhir.r2Mod

import typings.fhir.fhirStrings.closed
import typings.fhir.fhirStrings.open
import typings.fhir.fhirStrings.openAtEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionSlicing
  extends StObject
     with Element {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _discriminator: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _ordered: js.UndefOr[Element] = js.undefined
  
  var _rules: js.UndefOr[Element] = js.undefined
  
  /**
    * A human-readable text description of how the slicing works. If there is no discriminator, this is required to be present to provide whatever information is possible about how the slices can be differentiated.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.
    */
  var discriminator: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If the matching elements have to occur in the same order as defined in the profile.
    */
  var ordered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether additional slices are allowed or not. When the slices are ordered, profile authors can also say that additional slices are only allowed at the end.
    */
  var rules: closed | open | openAtEnd
}
object ElementDefinitionSlicing {
  
  inline def apply(rules: closed | open | openAtEnd): ElementDefinitionSlicing = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionSlicing]
  }
  
  extension [Self <: ElementDefinitionSlicing](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscriminator(value: js.Array[String]): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    inline def setDiscriminatorVarargs(value: String*): Self = StObject.set(x, "discriminator", js.Array(value*))
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setRules(value: closed | open | openAtEnd): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_discriminator(value: js.Array[Element]): Self = StObject.set(x, "_discriminator", value.asInstanceOf[js.Any])
    
    inline def set_discriminatorUndefined: Self = StObject.set(x, "_discriminator", js.undefined)
    
    inline def set_discriminatorVarargs(value: Element*): Self = StObject.set(x, "_discriminator", js.Array(value*))
    
    inline def set_ordered(value: Element): Self = StObject.set(x, "_ordered", value.asInstanceOf[js.Any])
    
    inline def set_orderedUndefined: Self = StObject.set(x, "_ordered", js.undefined)
    
    inline def set_rules(value: Element): Self = StObject.set(x, "_rules", value.asInstanceOf[js.Any])
    
    inline def set_rulesUndefined: Self = StObject.set(x, "_rules", js.undefined)
  }
}
