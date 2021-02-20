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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themingMod {
  
  @JSImport("@emotion/react/types/theming", "ThemeProvider")
  @js.native
  val ThemeProvider: typings.emotionReact.themingMod.ThemeProvider = js.native
  type ThemeProvider = js.Function1[/* props */ ThemeProviderProps, ReactElement]
  
  @JSImport("@emotion/react/types/theming", "useTheme")
  @js.native
  def useTheme(): Theme = js.native
  
  @JSImport("@emotion/react/types/theming", "withTheme")
  @js.native
  val withTheme: typings.emotionReact.themingMod.withTheme = js.native
  type withTheme = js.Function1[
    /* component */ js.Any, 
    FC[(DistributiveOmit[PropsOf[_], theme]) with typings.emotionReact.anon.Theme]
  ]
  
  @js.native
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme]) = js.native
  }
  object ThemeProviderProps {
    
    @scala.inline
    def apply(theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps = {
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
      def setTheme(value: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  type WithTheme_[P, T] = (P with ThemeT[T]) | (P with ThemeExclude)
}
