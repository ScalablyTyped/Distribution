package typings.fluentuiReactThemeProvider

import typings.fluentuiReactThemeProvider.libThemeProviderDottypesMod.ThemeProviderState
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Render extends StObject {
    
    def render(state: ThemeProviderState): Element
    
    var state: ThemeProviderState
  }
  object Render {
    
    inline def apply(render: ThemeProviderState => Element, state: ThemeProviderState): Render = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Render]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
      inline def setRender(value: ThemeProviderState => Element): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setState(value: ThemeProviderState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tokens: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any
      ] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTokens(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any
      ): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
}
