package typings.djangoBananas

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesMod {
  
  @JSImport("django-bananas/themes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("django-bananas/themes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    @JSImport("django-bananas/themes", "default.default")
    @js.native
    def default: Theme = js.native
    
    @JSImport("django-bananas/themes", "default.dark")
    @js.native
    def dark: Theme = js.native
    inline def dark_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark")(x.asInstanceOf[js.Any])
    
    @JSImport("django-bananas/themes", "default.darth")
    @js.native
    def darth: Theme = js.native
    inline def darth_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darth")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("django-bananas/themes", "default.light")
    @js.native
    def light: Theme = js.native
    inline def light_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
  }
  
  inline def applyThemeDefaults(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("applyThemeDefaults")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def createBananasTheme(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createBananasTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def extendTheme(theme: Theme, overrides: Any): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTheme")(theme.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  type Theme = Record[String, Any]
}
