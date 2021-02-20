package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ValueSet details if this is coded
  */
@js.native
trait OperationDefinitionParameterBinding extends BackboneElement {
  
  /**
    * Contains extended information for property 'strength'.
    */
  var _strength: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueSetUri'.
    */
  var _valueSetUri: js.UndefOr[Element] = js.native
  
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
object OperationDefinitionParameterBinding {
  
  @scala.inline
  def apply(strength: code): OperationDefinitionParameterBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameterBinding]
  }
  
  @scala.inline
  implicit class OperationDefinitionParameterBindingMutableBuilder[Self <: OperationDefinitionParameterBinding] (val x: Self) extends AnyVal {
    
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
    def set_strength(value: Element): Self = StObject.set(x, "_strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_strengthUndefined: Self = StObject.set(x, "_strength", js.undefined)
    
    @scala.inline
    def set_valueSetUri(value: Element): Self = StObject.set(x, "_valueSetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueSetUriUndefined: Self = StObject.set(x, "_valueSetUri", js.undefined)
  }
}
