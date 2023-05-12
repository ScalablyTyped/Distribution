package typings.fluentuiReactThemeProvider

import typings.fluentuiReactThemeProvider.libMakeStylesMod.UseStylesOptions
import typings.fluentuiTheme.libTypesThemeMod.Theme
import typings.std.Record
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMakeVariantClassesMod {
  
  @JSImport("@fluentui/react-theme-provider/lib/makeVariantClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeVariantClasses[TState, TVariants](options: MakeVariantClassesOptions[TVariants]): js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeVariantClasses")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit]]
  
  trait MakeVariantClassesOptions[TVariants] extends StObject {
    
    /**
      * Name of the component to use for fetching variants from the theme.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Prefix for css variables within the variants.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Styles for the component.
      */
    var styles: js.UndefOr[
        (Record[String, IStyle]) | (js.Function1[/* theme */ Theme, Record[String, IStyle]])
      ] = js.undefined
    
    /**
      * Variants for the styles. A variant defines token values when a particular prop is present, or the
      * variant prop matches.
      */
    var variants: js.UndefOr[TVariants | (js.Function1[/* theme */ Theme, TVariants])] = js.undefined
  }
  object MakeVariantClassesOptions {
    
    inline def apply[TVariants](): MakeVariantClassesOptions[TVariants] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MakeVariantClassesOptions[TVariants]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MakeVariantClassesOptions[?], TVariants] (val x: Self & MakeVariantClassesOptions[TVariants]) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStyles(value: (Record[String, IStyle]) | (js.Function1[/* theme */ Theme, Record[String, IStyle]])): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: /* theme */ Theme => Record[String, IStyle]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setVariants(value: TVariants | (js.Function1[/* theme */ Theme, TVariants])): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsFunction1(value: /* theme */ Theme => TVariants): Self = StObject.set(x, "variants", js.Any.fromFunction1(value))
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    }
  }
}
