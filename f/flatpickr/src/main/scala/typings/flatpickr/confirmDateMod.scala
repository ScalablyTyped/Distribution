package typings.flatpickr

import typings.flatpickr.optionsMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmDateMod {
  
  @JSImport("flatpickr/dist/plugins/confirmDate/confirmDate", JSImport.Default)
  @js.native
  def default(pluginConfig: Config): Plugin[js.Object] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var confirmIcon: js.UndefOr[String] = js.native
    
    var confirmText: js.UndefOr[String] = js.native
    
    var showAlways: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmIcon(value: String): Self = StObject.set(x, "confirmIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmIconUndefined: Self = StObject.set(x, "confirmIcon", js.undefined)
      
      @scala.inline
      def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
      
      @scala.inline
      def setShowAlways(value: Boolean): Self = StObject.set(x, "showAlways", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAlwaysUndefined: Self = StObject.set(x, "showAlways", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
