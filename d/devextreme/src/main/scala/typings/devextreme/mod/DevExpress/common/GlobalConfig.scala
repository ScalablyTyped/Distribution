package typings.devextreme.mod.DevExpress.common

import typings.devextreme.anon.CloseIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalConfig extends StObject {
  
  /**
    * 
    * @deprecated 
    */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var defaultCurrency: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var defaultUseCurrencyAccountingStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var editorStylingMode: js.UndefOr[EditorStyle] = js.undefined
  
  /**
    * 
    */
  var floatingActionButtonConfig: js.UndefOr[CloseIcon] = js.undefined
  
  /**
    * 
    */
  var forceIsoDateParsing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var oDataFilterToLower: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var serverDecimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * 
    * @deprecated 
    */
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var useLegacyStoreResult: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var useLegacyVisibleIndex: js.UndefOr[Boolean] = js.undefined
}
object GlobalConfig {
  
  inline def apply(): GlobalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalConfig] (val x: Self) extends AnyVal {
    
    inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    inline def setDefaultCurrency(value: String): Self = StObject.set(x, "defaultCurrency", value.asInstanceOf[js.Any])
    
    inline def setDefaultCurrencyUndefined: Self = StObject.set(x, "defaultCurrency", js.undefined)
    
    inline def setDefaultUseCurrencyAccountingStyle(value: Boolean): Self = StObject.set(x, "defaultUseCurrencyAccountingStyle", value.asInstanceOf[js.Any])
    
    inline def setDefaultUseCurrencyAccountingStyleUndefined: Self = StObject.set(x, "defaultUseCurrencyAccountingStyle", js.undefined)
    
    inline def setEditorStylingMode(value: EditorStyle): Self = StObject.set(x, "editorStylingMode", value.asInstanceOf[js.Any])
    
    inline def setEditorStylingModeUndefined: Self = StObject.set(x, "editorStylingMode", js.undefined)
    
    inline def setFloatingActionButtonConfig(value: CloseIcon): Self = StObject.set(x, "floatingActionButtonConfig", value.asInstanceOf[js.Any])
    
    inline def setFloatingActionButtonConfigUndefined: Self = StObject.set(x, "floatingActionButtonConfig", js.undefined)
    
    inline def setForceIsoDateParsing(value: Boolean): Self = StObject.set(x, "forceIsoDateParsing", value.asInstanceOf[js.Any])
    
    inline def setForceIsoDateParsingUndefined: Self = StObject.set(x, "forceIsoDateParsing", js.undefined)
    
    inline def setODataFilterToLower(value: Boolean): Self = StObject.set(x, "oDataFilterToLower", value.asInstanceOf[js.Any])
    
    inline def setODataFilterToLowerUndefined: Self = StObject.set(x, "oDataFilterToLower", js.undefined)
    
    inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
    
    inline def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
    
    inline def setServerDecimalSeparator(value: String): Self = StObject.set(x, "serverDecimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setServerDecimalSeparatorUndefined: Self = StObject.set(x, "serverDecimalSeparator", js.undefined)
    
    inline def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    
    inline def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
    
    inline def setUseLegacyStoreResult(value: Boolean): Self = StObject.set(x, "useLegacyStoreResult", value.asInstanceOf[js.Any])
    
    inline def setUseLegacyStoreResultUndefined: Self = StObject.set(x, "useLegacyStoreResult", js.undefined)
    
    inline def setUseLegacyVisibleIndex(value: Boolean): Self = StObject.set(x, "useLegacyVisibleIndex", value.asInstanceOf[js.Any])
    
    inline def setUseLegacyVisibleIndexUndefined: Self = StObject.set(x, "useLegacyVisibleIndex", js.undefined)
  }
}
