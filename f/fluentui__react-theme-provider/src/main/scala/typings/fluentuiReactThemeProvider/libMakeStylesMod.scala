package typings.fluentuiReactThemeProvider

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiReactThemeProvider.libStyleRenderersTypesMod.StyleRenderer
import typings.fluentuiTheme.libTypesThemeMod.Theme
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMakeStylesMod {
  
  @JSImport("@fluentui/react-theme-provider/lib/makeStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeStyles[TStyleSet /* <: StringDictionary[IStyle] */](styleOrFunction: TStyleSet): js.Function1[
    /* options */ js.UndefOr[UseStylesOptions], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TStyleSet ]: string} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* options */ js.UndefOr[UseStylesOptions], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TStyleSet ]: string} */ js.Any
  ]]
  inline def makeStyles[TStyleSet /* <: StringDictionary[IStyle] */](styleOrFunction: js.Function1[/* theme */ Theme, TStyleSet]): js.Function1[
    /* options */ js.UndefOr[UseStylesOptions], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TStyleSet ]: string} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* options */ js.UndefOr[UseStylesOptions], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TStyleSet ]: string} */ js.Any
  ]]
  
  trait UseStylesOptions extends StObject {
    
    var renderer: js.UndefOr[StyleRenderer] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object UseStylesOptions {
    
    inline def apply(): UseStylesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseStylesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseStylesOptions] (val x: Self) extends AnyVal {
      
      inline def setRenderer(value: StyleRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
