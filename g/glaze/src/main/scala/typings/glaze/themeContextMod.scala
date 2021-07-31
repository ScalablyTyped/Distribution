package typings.glaze

import typings.glaze.themeMod.RuntimeTheme
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeContextMod {
  
  @JSImport("glaze/dist-types/ThemeContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ThemeProvider(hasThemeChildren: ThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def useTheme(): RuntimeTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[RuntimeTheme]
  
  trait ThemeProviderProps extends StObject {
    
    var children: ReactNode
    
    var theme: RuntimeTheme
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
