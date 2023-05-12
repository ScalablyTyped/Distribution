package typings.fhir.r4bMod

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
  
  var _ordered: js.UndefOr[Element] = js.undefined
  
  var _rules: js.UndefOr[Element] = js.undefined
  
  /**
    * If it's really not possible to differentiate them, the design should be re-evaluated to make the content usable.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If there is no discriminator, the content is hard to process, so this should be avoided.
    */
  var discriminator: js.UndefOr[js.Array[ElementDefinitionSlicingDiscriminator]] = js.undefined
  
  /**
    * Order should only be required when it is a pressing concern for presentation. Profile authors should consider making the order a feature of the rules about the narrative, not the rules about the data - requiring ordered data makes the profile much less re-usable.
    */
  var ordered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allowing additional elements makes for a much for flexible template - it's open for use in wider contexts, but also means that the content of the resource is not closed, and applications have to decide how to handle content not described by the profile.
    */
  var rules: closed | open | openAtEnd
}
object ElementDefinitionSlicing {
  
  inline def apply(rules: closed | open | openAtEnd): ElementDefinitionSlicing = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionSlicing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementDefinitionSlicing] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscriminator(value: js.Array[ElementDefinitionSlicingDiscriminator]): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    inline def setDiscriminatorVarargs(value: ElementDefinitionSlicingDiscriminator*): Self = StObject.set(x, "discriminator", js.Array(value*))
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setRules(value: closed | open | openAtEnd): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_ordered(value: Element): Self = StObject.set(x, "_ordered", value.asInstanceOf[js.Any])
    
    inline def set_orderedUndefined: Self = StObject.set(x, "_ordered", js.undefined)
    
    inline def set_rules(value: Element): Self = StObject.set(x, "_rules", value.asInstanceOf[js.Any])
    
    inline def set_rulesUndefined: Self = StObject.set(x, "_rules", js.undefined)
  }
}
