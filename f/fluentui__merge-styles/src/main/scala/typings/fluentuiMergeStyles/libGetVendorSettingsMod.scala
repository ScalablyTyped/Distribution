package typings.fluentuiMergeStyles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetVendorSettingsMod {
  
  @JSImport("@fluentui/merge-styles/lib/getVendorSettings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVendorSettings(): IVendorSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getVendorSettings")().asInstanceOf[IVendorSettings]
  
  inline def setVendorSettings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVendorSettings")().asInstanceOf[Unit]
  inline def setVendorSettings(vendorSettings: IVendorSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVendorSettings")(vendorSettings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IVendorSettings extends StObject {
    
    var isMoz: js.UndefOr[Boolean] = js.undefined
    
    var isMs: js.UndefOr[Boolean] = js.undefined
    
    var isOpera: js.UndefOr[Boolean] = js.undefined
    
    var isWebkit: js.UndefOr[Boolean] = js.undefined
  }
  object IVendorSettings {
    
    inline def apply(): IVendorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVendorSettings]
    }
    
    extension [Self <: IVendorSettings](x: Self) {
      
      inline def setIsMoz(value: Boolean): Self = StObject.set(x, "isMoz", value.asInstanceOf[js.Any])
      
      inline def setIsMozUndefined: Self = StObject.set(x, "isMoz", js.undefined)
      
      inline def setIsMs(value: Boolean): Self = StObject.set(x, "isMs", value.asInstanceOf[js.Any])
      
      inline def setIsMsUndefined: Self = StObject.set(x, "isMs", js.undefined)
      
      inline def setIsOpera(value: Boolean): Self = StObject.set(x, "isOpera", value.asInstanceOf[js.Any])
      
      inline def setIsOperaUndefined: Self = StObject.set(x, "isOpera", js.undefined)
      
      inline def setIsWebkit(value: Boolean): Self = StObject.set(x, "isWebkit", value.asInstanceOf[js.Any])
      
      inline def setIsWebkitUndefined: Self = StObject.set(x, "isWebkit", js.undefined)
    }
  }
}
