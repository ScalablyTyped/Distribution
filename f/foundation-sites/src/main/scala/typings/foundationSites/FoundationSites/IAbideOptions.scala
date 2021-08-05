package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbideOptions extends StObject {
  
  var formErrorClass: js.UndefOr[String] = js.undefined
  
  var formErrorSelector: js.UndefOr[String] = js.undefined
  
  var inputErrorClass: js.UndefOr[String] = js.undefined
  
  var labelErrorClass: js.UndefOr[String] = js.undefined
  
  var liveValidate: js.UndefOr[Boolean] = js.undefined
  
  var validateOn: js.UndefOr[String] = js.undefined
  
  var validators: js.UndefOr[js.Any] = js.undefined
}
object IAbideOptions {
  
  inline def apply(): IAbideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbideOptions]
  }
  
  extension [Self <: IAbideOptions](x: Self) {
    
    inline def setFormErrorClass(value: String): Self = StObject.set(x, "formErrorClass", value.asInstanceOf[js.Any])
    
    inline def setFormErrorClassUndefined: Self = StObject.set(x, "formErrorClass", js.undefined)
    
    inline def setFormErrorSelector(value: String): Self = StObject.set(x, "formErrorSelector", value.asInstanceOf[js.Any])
    
    inline def setFormErrorSelectorUndefined: Self = StObject.set(x, "formErrorSelector", js.undefined)
    
    inline def setInputErrorClass(value: String): Self = StObject.set(x, "inputErrorClass", value.asInstanceOf[js.Any])
    
    inline def setInputErrorClassUndefined: Self = StObject.set(x, "inputErrorClass", js.undefined)
    
    inline def setLabelErrorClass(value: String): Self = StObject.set(x, "labelErrorClass", value.asInstanceOf[js.Any])
    
    inline def setLabelErrorClassUndefined: Self = StObject.set(x, "labelErrorClass", js.undefined)
    
    inline def setLiveValidate(value: Boolean): Self = StObject.set(x, "liveValidate", value.asInstanceOf[js.Any])
    
    inline def setLiveValidateUndefined: Self = StObject.set(x, "liveValidate", js.undefined)
    
    inline def setValidateOn(value: String): Self = StObject.set(x, "validateOn", value.asInstanceOf[js.Any])
    
    inline def setValidateOnUndefined: Self = StObject.set(x, "validateOn", js.undefined)
    
    inline def setValidators(value: js.Any): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
  }
}
