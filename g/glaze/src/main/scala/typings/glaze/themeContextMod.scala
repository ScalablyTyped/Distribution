package typings.glaze

import typings.glaze.themeMod.RuntimeTheme
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeContextMod {
  
  @JSImport("glaze/dist-types/ThemeContext", "ThemeProvider")
  @js.native
  def ThemeProvider(hasThemeChildren: ThemeProviderProps): Element = js.native
  
  @JSImport("glaze/dist-types/ThemeContext", "useTheme")
  @js.native
  def useTheme(): RuntimeTheme = js.native
  
  @js.native
  trait ThemeProviderProps extends StObject {
    
    var children: ReactNode = js.native
    
    var theme: RuntimeTheme = js.native
  }
  object ThemeProviderProps {
    
    @scala.inline
    def apply(theme: RuntimeTheme): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    @scala.inline
    implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTheme(value: RuntimeTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
