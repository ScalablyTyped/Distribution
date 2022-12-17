package typings.emotionStyled

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var theme: js.UndefOr[typings.emotionReact.mod.Theme] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setTheme(value: typings.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait As extends StObject {
    
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    var theme: js.UndefOr[typings.emotionReact.mod.Theme] = js.undefined
  }
  object As {
    
    inline def apply(): As = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As]
    }
    
    extension [Self <: As](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setTheme(value: typings.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Ref[C /* <: ComponentClass[ComponentProps[C], ComponentState] */] extends StObject {
    
    var ref: js.UndefOr[typings.react.mod.Ref[InstanceType[C]]] = js.undefined
  }
  object Ref {
    
    inline def apply[C /* <: ComponentClass[ComponentProps[C], ComponentState] */](): Ref[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[C]]
    }
    
    extension [Self <: Ref[?], C /* <: ComponentClass[ComponentProps[C], ComponentState] */](x: Self & Ref[C]) {
      
      inline def setRef(value: typings.react.mod.Ref[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ InstanceType[C] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Theme extends StObject {
    
    var theme: typings.emotionReact.mod.Theme
  }
  object Theme {
    
    inline def apply(theme: typings.emotionReact.mod.Theme): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setTheme(value: typings.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
