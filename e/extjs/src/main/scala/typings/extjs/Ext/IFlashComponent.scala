package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFlashComponent
  extends StObject
     with IComponent {
  
  /** [Property] (String) */
  var EXPRESS_INSTALL_URL: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var expressInstall: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var flashAttributes: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var flashParams: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var flashVars: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var flashVersion: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Retrieves the id of the SWF object embed element  */
  var getSwfId: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Ext.Element) */
  var swf: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (String/Number) */
  var swfHeight: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Number) */
  var swfWidth: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var wmode: js.UndefOr[java.lang.String] = js.undefined
}
object IFlashComponent {
  
  inline def apply(): IFlashComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlashComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFlashComponent] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: java.lang.String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setEXPRESS_INSTALL_URL(value: java.lang.String): Self = StObject.set(x, "EXPRESS_INSTALL_URL", value.asInstanceOf[js.Any])
    
    inline def setEXPRESS_INSTALL_URLUndefined: Self = StObject.set(x, "EXPRESS_INSTALL_URL", js.undefined)
    
    inline def setExpressInstall(value: Boolean): Self = StObject.set(x, "expressInstall", value.asInstanceOf[js.Any])
    
    inline def setExpressInstallUndefined: Self = StObject.set(x, "expressInstall", js.undefined)
    
    inline def setFlashAttributes(value: Any): Self = StObject.set(x, "flashAttributes", value.asInstanceOf[js.Any])
    
    inline def setFlashAttributesUndefined: Self = StObject.set(x, "flashAttributes", js.undefined)
    
    inline def setFlashParams(value: Any): Self = StObject.set(x, "flashParams", value.asInstanceOf[js.Any])
    
    inline def setFlashParamsUndefined: Self = StObject.set(x, "flashParams", js.undefined)
    
    inline def setFlashVars(value: Any): Self = StObject.set(x, "flashVars", value.asInstanceOf[js.Any])
    
    inline def setFlashVarsUndefined: Self = StObject.set(x, "flashVars", js.undefined)
    
    inline def setFlashVersion(value: java.lang.String): Self = StObject.set(x, "flashVersion", value.asInstanceOf[js.Any])
    
    inline def setFlashVersionUndefined: Self = StObject.set(x, "flashVersion", js.undefined)
    
    inline def setGetSwfId(value: () => Unit): Self = StObject.set(x, "getSwfId", js.Any.fromFunction0(value))
    
    inline def setGetSwfIdUndefined: Self = StObject.set(x, "getSwfId", js.undefined)
    
    inline def setSwf(value: IElement): Self = StObject.set(x, "swf", value.asInstanceOf[js.Any])
    
    inline def setSwfHeight(value: Any): Self = StObject.set(x, "swfHeight", value.asInstanceOf[js.Any])
    
    inline def setSwfHeightUndefined: Self = StObject.set(x, "swfHeight", js.undefined)
    
    inline def setSwfUndefined: Self = StObject.set(x, "swf", js.undefined)
    
    inline def setSwfWidth(value: Any): Self = StObject.set(x, "swfWidth", value.asInstanceOf[js.Any])
    
    inline def setSwfWidthUndefined: Self = StObject.set(x, "swfWidth", js.undefined)
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWmode(value: java.lang.String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
    
    inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
  }
}
