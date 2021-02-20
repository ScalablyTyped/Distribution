package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFlashComponent extends IComponent {
  
  /** [Property] (String) */
  var EXPRESS_INSTALL_URL: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var backgroundColor: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Boolean) */
  var expressInstall: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var flashAttributes: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var flashParams: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var flashVars: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var flashVersion: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Retrieves the id of the SWF object embed element  */
  var getSwfId: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Ext.Element) */
  var swf: js.UndefOr[IElement] = js.native
  
  /** [Config Option] (String/Number) */
  var swfHeight: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Number) */
  var swfWidth: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var wmode: js.UndefOr[java.lang.String] = js.native
}
object IFlashComponent {
  
  @scala.inline
  def apply(): IFlashComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlashComponent]
  }
  
  @scala.inline
  implicit class IFlashComponentMutableBuilder[Self <: IFlashComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: java.lang.String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setEXPRESS_INSTALL_URL(value: java.lang.String): Self = StObject.set(x, "EXPRESS_INSTALL_URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXPRESS_INSTALL_URLUndefined: Self = StObject.set(x, "EXPRESS_INSTALL_URL", js.undefined)
    
    @scala.inline
    def setExpressInstall(value: Boolean): Self = StObject.set(x, "expressInstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressInstallUndefined: Self = StObject.set(x, "expressInstall", js.undefined)
    
    @scala.inline
    def setFlashAttributes(value: js.Any): Self = StObject.set(x, "flashAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashAttributesUndefined: Self = StObject.set(x, "flashAttributes", js.undefined)
    
    @scala.inline
    def setFlashParams(value: js.Any): Self = StObject.set(x, "flashParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashParamsUndefined: Self = StObject.set(x, "flashParams", js.undefined)
    
    @scala.inline
    def setFlashVars(value: js.Any): Self = StObject.set(x, "flashVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashVarsUndefined: Self = StObject.set(x, "flashVars", js.undefined)
    
    @scala.inline
    def setFlashVersion(value: java.lang.String): Self = StObject.set(x, "flashVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashVersionUndefined: Self = StObject.set(x, "flashVersion", js.undefined)
    
    @scala.inline
    def setGetSwfId(value: () => Unit): Self = StObject.set(x, "getSwfId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSwfIdUndefined: Self = StObject.set(x, "getSwfId", js.undefined)
    
    @scala.inline
    def setSwf(value: IElement): Self = StObject.set(x, "swf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwfHeight(value: js.Any): Self = StObject.set(x, "swfHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwfHeightUndefined: Self = StObject.set(x, "swfHeight", js.undefined)
    
    @scala.inline
    def setSwfUndefined: Self = StObject.set(x, "swf", js.undefined)
    
    @scala.inline
    def setSwfWidth(value: js.Any): Self = StObject.set(x, "swfWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwfWidthUndefined: Self = StObject.set(x, "swfWidth", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWmode(value: java.lang.String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
  }
}
