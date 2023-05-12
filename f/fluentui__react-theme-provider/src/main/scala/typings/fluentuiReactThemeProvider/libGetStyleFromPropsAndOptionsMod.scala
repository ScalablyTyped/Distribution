package typings.fluentuiReactThemeProvider

import typings.fluentuiReactThemeProvider.libTypesMod.StyleOptions
import typings.fluentuiReactThemeProvider.libTypesMod.StyleProps
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetStyleFromPropsAndOptionsMod {
  
  @JSImport("@fluentui/react-theme-provider/lib/getStyleFromPropsAndOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyleFromPropsAndOptions[TProps /* <: StyleProps[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_theme.ColorTokenSet */ Any
  ] */, TOptions /* <: StyleOptions[TProps] */](props: TProps, options: TOptions): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleFromPropsAndOptions")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def getStyleFromPropsAndOptions[TProps /* <: StyleProps[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_theme.ColorTokenSet */ Any
  ] */, TOptions /* <: StyleOptions[TProps] */](props: TProps, options: TOptions, prefix: String): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleFromPropsAndOptions")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
}
