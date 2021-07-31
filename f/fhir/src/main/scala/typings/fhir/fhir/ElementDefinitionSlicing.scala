package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This element is sliced - slices follow
  */
trait ElementDefinitionSlicing
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'ordered'.
    */
  var _ordered: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'rules'.
    */
  var _rules: js.UndefOr[Element] = js.undefined
  
  /**
    * Text description of how slicing works (or not)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Element values that are used to distinguish the slices
    */
  var discriminator: js.UndefOr[js.Array[ElementDefinitionSlicingDiscriminator]] = js.undefined
  
  /**
    * If elements must be in same order as slices
    */
  var ordered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * closed | open | openAtEnd
    */
  var rules: code
}
object ElementDefinitionSlicing {
  
  @scala.inline
  def apply(rules: code): ElementDefinitionSlicing = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionSlicing]
  }
  
  @scala.inline
  implicit class ElementDefinitionSlicingMutableBuilder[Self <: ElementDefinitionSlicing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDiscriminator(value: js.Array[ElementDefinitionSlicingDiscriminator]): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    @scala.inline
    def setDiscriminatorVarargs(value: ElementDefinitionSlicingDiscriminator*): Self = StObject.set(x, "discriminator", js.Array(value :_*))
    
    @scala.inline
    def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    @scala.inline
    def setRules(value: code): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_ordered(value: Element): Self = StObject.set(x, "_ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_orderedUndefined: Self = StObject.set(x, "_ordered", js.undefined)
    
    @scala.inline
    def set_rules(value: Element): Self = StObject.set(x, "_rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rulesUndefined: Self = StObject.set(x, "_rules", js.undefined)
  }
}
