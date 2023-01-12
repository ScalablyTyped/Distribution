package typings.glaze

import typings.glaze.distTypesThemeMod.RuntimeTheme
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThemeContextMod {
  
  @JSImport("glaze/dist-types/ThemeContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ThemeProvider(param0: ThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useTheme(): RuntimeTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[RuntimeTheme]
  
  trait ThemeProviderProps extends StObject {
    
    var children: ReactNode
    
    var theme: RuntimeTheme
  }
  object ThemeProviderProps {
    
    inline def apply(theme: RuntimeTheme): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: RuntimeTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
