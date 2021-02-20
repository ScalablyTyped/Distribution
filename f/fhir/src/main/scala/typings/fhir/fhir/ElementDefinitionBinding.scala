package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ValueSet details if this is coded
  */
@js.native
trait ElementDefinitionBinding extends Element {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'strength'.
    */
  var _strength: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueSetUri'.
    */
  var _valueSetUri: js.UndefOr[Element] = js.native
  
  /**
    * Human explanation of the value set
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * required | extensible | preferred | example
    */
  var strength: code = js.native
  
  /**
    * Source of value set
    */
  var valueSetReference: js.UndefOr[Reference] = js.native
  
  /**
    * Source of value set
    */
  var valueSetUri: js.UndefOr[uri] = js.native
}
object ElementDefinitionBinding {
  
  @scala.inline
  def apply(strength: code): ElementDefinitionBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionBinding]
  }
  
  @scala.inline
  implicit class ElementDefinitionBindingMutableBuilder[Self <: ElementDefinitionBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setStrength(value: code): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetReference(value: Reference): Self = StObject.set(x, "valueSetReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetReferenceUndefined: Self = StObject.set(x, "valueSetReference", js.undefined)
    
    @scala.inline
    def setValueSetUri(value: uri): Self = StObject.set(x, "valueSetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetUriUndefined: Self = StObject.set(x, "valueSetUri", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_strength(value: Element): Self = StObject.set(x, "_strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_strengthUndefined: Self = StObject.set(x, "_strength", js.undefined)
    
    @scala.inline
    def set_valueSetUri(value: Element): Self = StObject.set(x, "_valueSetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueSetUriUndefined: Self = StObject.set(x, "_valueSetUri", js.undefined)
  }
}
