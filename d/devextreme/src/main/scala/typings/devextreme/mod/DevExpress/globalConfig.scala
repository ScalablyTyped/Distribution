package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.CloseIcon
import typings.devextreme.mod.DevExpress.common.EditorStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait globalConfig extends StObject {
  
  /**
    * A decimal separator. No longer applies.
    * @deprecated 
    */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * The default currency. Accepts a 3-letter ISO 4217 code.
    */
  var defaultCurrency: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var defaultUseCurrencyAccountingStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how editors&apos; text fields are styled in your application.
    */
  var editorStylingMode: js.UndefOr[EditorStyle] = js.undefined
  
  /**
    * Configures a Floating Action Button (FAB) that emits a stack of related actions (speed dial).
    */
  var floatingActionButtonConfig: js.UndefOr[CloseIcon] = js.undefined
  
  /**
    * Specifies whether dates are parsed and serialized according to the ISO 8601 standard in all browsers.
    */
  var forceIsoDateParsing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to convert string values to lowercase in filter and search requests to OData services. Applies to the following operations: &apos;startswith&apos;, &apos;endswith&apos;, &apos;contains&apos;, and &apos;notcontains&apos;.
    */
  var oDataFilterToLower: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the UI components support a right-to-left representation. Available for individual UI components as well.
    */
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The decimal separator that is used when submitting a value to the server.
    */
  var serverDecimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * A group separator. No longer applies.
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
object globalConfig {
  
  inline def apply(): globalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[globalConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: globalConfig] (val x: Self) extends AnyVal {
    
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
