package typings.emotionStyledBase

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[Theme /* <: js.Object */] extends StObject {
    
    var theme: js.UndefOr[Theme] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[Theme /* <: js.Object */](): `0`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Theme]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_], Theme /* <: js.Object */] (val x: Self with `0`[Theme]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait Theme extends StObject {
    
    var theme: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(theme: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThemeExclude extends StObject {
    
    var theme: Exclude[_, js.UndefOr[scala.Nothing]] = js.native
  }
  object ThemeExclude {
    
    @scala.inline
    def apply(theme: Exclude[_, js.UndefOr[scala.Nothing]]): ThemeExclude = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeExclude]
    }
    
    @scala.inline
    implicit class ThemeExcludeMutableBuilder[Self <: ThemeExclude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: Exclude[_, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThemeT[T] extends StObject {
    
    var theme: T = js.native
  }
  object ThemeT {
    
    @scala.inline
    def apply[T](theme: T): ThemeT[T] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeT[T]]
    }
    
    @scala.inline
    implicit class ThemeTMutableBuilder[Self <: ThemeT[_], T] (val x: Self with ThemeT[T]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
