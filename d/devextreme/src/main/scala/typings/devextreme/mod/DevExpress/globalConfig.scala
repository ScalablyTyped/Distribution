package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.CloseIcon
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.underlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait globalConfig extends StObject {
  
  /**
    * [descr:globalConfig.decimalSeparator]
    * @deprecated [depNote:globalConfig.decimalSeparator]
    */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:globalConfig.defaultCurrency]
    */
  var defaultCurrency: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:globalConfig.editorStylingMode]
    */
  var editorStylingMode: js.UndefOr[outlined | underlined | filled] = js.undefined
  
  /**
    * [descr:globalConfig.floatingActionButtonConfig]
    */
  var floatingActionButtonConfig: js.UndefOr[CloseIcon] = js.undefined
  
  /**
    * [descr:globalConfig.forceIsoDateParsing]
    */
  var forceIsoDateParsing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:globalConfig.oDataFilterToLower]
    */
  var oDataFilterToLower: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:globalConfig.rtlEnabled]
    */
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:globalConfig.serverDecimalSeparator]
    */
  var serverDecimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:globalConfig.thousandsSeparator]
    * @deprecated [depNote:globalConfig.thousandsSeparator]
    */
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:globalConfig.useLegacyStoreResult]
    */
  var useLegacyStoreResult: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:globalConfig.useLegacyVisibleIndex]
    */
  var useLegacyVisibleIndex: js.UndefOr[Boolean] = js.undefined
}
object globalConfig {
  
  inline def apply(): globalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[globalConfig]
  }
  
  extension [Self <: globalConfig](x: Self) {
    
    inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    inline def setDefaultCurrency(value: String): Self = StObject.set(x, "defaultCurrency", value.asInstanceOf[js.Any])
    
    inline def setDefaultCurrencyUndefined: Self = StObject.set(x, "defaultCurrency", js.undefined)
    
    inline def setEditorStylingMode(value: outlined | underlined | filled): Self = StObject.set(x, "editorStylingMode", value.asInstanceOf[js.Any])
    
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
