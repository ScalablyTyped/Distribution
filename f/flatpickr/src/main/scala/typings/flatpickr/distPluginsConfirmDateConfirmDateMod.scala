package typings.flatpickr

import typings.flatpickr.distTypesOptionsMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsConfirmDateConfirmDateMod {
  
  @JSImport("flatpickr/dist/plugins/confirmDate/confirmDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pluginConfig: Config): Plugin[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pluginConfig.asInstanceOf[js.Any]).asInstanceOf[Plugin[js.Object]]
  
  trait Config extends StObject {
    
    var confirmIcon: js.UndefOr[String] = js.undefined
    
    var confirmText: js.UndefOr[String] = js.undefined
    
    var showAlways: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setConfirmIcon(value: String): Self = StObject.set(x, "confirmIcon", value.asInstanceOf[js.Any])
      
      inline def setConfirmIconUndefined: Self = StObject.set(x, "confirmIcon", js.undefined)
      
      inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
      
      inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
      
      inline def setShowAlways(value: Boolean): Self = StObject.set(x, "showAlways", value.asInstanceOf[js.Any])
      
      inline def setShowAlwaysUndefined: Self = StObject.set(x, "showAlways", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
