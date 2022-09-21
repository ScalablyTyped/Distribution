package typings.emotionReact

import typings.emotionReact.anon.ThemeExclude
import typings.emotionReact.anon.ThemeT
import typings.emotionReact.emotionReactMod.Theme
import typings.emotionReact.emotionReactStrings.theme
import typings.emotionReact.helperMod.DistributiveOmit
import typings.emotionReact.helperMod.PropsOf
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themingMod {
  
  @JSImport("@emotion/react/types/theming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@emotion/react/types/theming", "ThemeProvider")
  @js.native
  val ThemeProvider: typings.emotionReact.themingMod.ThemeProvider = js.native
  type ThemeProvider = js.Function1[/* props */ ThemeProviderProps, ReactElement]
  
  inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]
  
  @JSImport("@emotion/react/types/theming", "withTheme")
  @js.native
  val withTheme: typings.emotionReact.themingMod.withTheme = js.native
  type withTheme = js.Function1[
    /* component */ Any, 
    FC[(DistributiveOmit[PropsOf[Any], theme]) & typings.emotionReact.anon.Theme]
  ]
  
  trait ThemeProviderProps extends StObject {
    
    var children: ReactNode
    
    var theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])
  }
  object ThemeProviderProps {
    
    inline def apply(theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  type WithTheme_[P, T] = (P & ThemeT[T]) | (P & ThemeExclude)
}
