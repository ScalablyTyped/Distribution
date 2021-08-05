package typings.emotionStyledBase

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Theme /* <: js.Object */] extends StObject {
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object `0` {
    
    inline def apply[Theme /* <: js.Object */](): `0`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Theme]]
    }
    
    extension [Self <: `0`[?], Theme /* <: js.Object */](x: Self & `0`[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Theme extends StObject {
    
    var theme: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any
  }
  object Theme {
    
    inline def apply(theme: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setTheme(value: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeExclude extends StObject {
    
    var theme: Exclude[js.Any, Unit]
  }
  object ThemeExclude {
    
    inline def apply(theme: Exclude[js.Any, Unit]): ThemeExclude = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeExclude]
    }
    
    extension [Self <: ThemeExclude](x: Self) {
      
      inline def setTheme(value: Exclude[js.Any, Unit]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeT[T] extends StObject {
    
    var theme: T
  }
  object ThemeT {
    
    inline def apply[T](theme: T): ThemeT[T] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeT[T]]
    }
    
    extension [Self <: ThemeT[?], T](x: Self & ThemeT[T]) {
      
      inline def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
