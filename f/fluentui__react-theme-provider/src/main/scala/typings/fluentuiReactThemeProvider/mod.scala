package typings.fluentuiReactThemeProvider

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiReactThemeProvider.anon.Children
import typings.fluentuiReactThemeProvider.anon.Render
import typings.fluentuiReactThemeProvider.anon.Style
import typings.fluentuiReactThemeProvider.libMakeStylesMod.UseStylesOptions
import typings.fluentuiReactThemeProvider.libMakeVariantClassesMod.MakeVariantClassesOptions
import typings.fluentuiReactThemeProvider.libStyleRenderersTypesMod.StyleRenderer
import typings.fluentuiReactThemeProvider.libThemeProviderDottypesMod.ThemeProviderProps
import typings.fluentuiReactThemeProvider.libThemeProviderDottypesMod.ThemeProviderState
import typings.fluentuiReactThemeProvider.libTypesMod.StyleOptions
import typings.fluentuiReactThemeProvider.libTypesMod.StyleProps
import typings.fluentuiTheme.libTypesThemeMod.Theme
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.Record
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/react-theme-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MergeStylesProvider(param0: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeStylesProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@fluentui/react-theme-provider", "StyleRendererContext")
  @js.native
  val StyleRendererContext: Context[StyleRenderer] = js.native
  
  @JSImport("@fluentui/react-theme-provider", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[Theme]] = js.native
  
  @JSImport("@fluentui/react-theme-provider", "ThemeProvider")
  @js.native
  val ThemeProvider: FunctionComponent[ThemeProviderProps] = js.native
  
  inline def applyClasses[TState /* <: js.Object */](state: TState, classMap: Record[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyClasses")(state.asInstanceOf[js.Any], classMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getStyleFromPropsAndOptions[TProps /* <: StyleProps[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_theme.ColorTokenSet */ Any
  ] */, TOptions /* <: StyleOptions[TProps] */](props: TProps, options: TOptions): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleFromPropsAndOptions")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def getStyleFromPropsAndOptions[TProps /* <: StyleProps[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_theme.ColorTokenSet */ Any
  ] */, TOptions /* <: StyleOptions[TProps] */](props: TProps, options: TOptions, prefix: String): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleFromPropsAndOptions")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  inline def makeClasses[TState /* <: js.Object */](styleOrFunction: js.Function1[/* theme */ Theme, Record[String, IStyle]]): js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClasses")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit]]
  inline def makeClasses[TState /* <: js.Object */](styleOrFunction: Record[String, IStyle]): js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClasses")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit]]
  
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
  
  inline def makeVariantClasses[TState, TVariants](options: MakeVariantClassesOptions[TVariants]): js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeVariantClasses")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit]]
  
  @JSImport("@fluentui/react-theme-provider", "mergeStylesRenderer")
  @js.native
  val mergeStylesRenderer: StyleRenderer = js.native
  
  inline def tokensToStyleObject(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")().asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any
  ): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any,
    prefix: String
  ): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any,
    prefix: String,
    style: CSSProperties
  ): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenSetType */ Any,
    prefix: Unit,
    style: CSSProperties
  ): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: Unit, prefix: String): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: Unit, prefix: String, style: CSSProperties): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: Unit, prefix: Unit, style: CSSProperties): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: CSSProperties): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: CSSProperties, prefix: String): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: CSSProperties, prefix: String, style: CSSProperties): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def tokensToStyleObject(tokens: CSSProperties, prefix: Unit, style: CSSProperties): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToStyleObject")(tokens.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  inline def useInlineTokens(draftState: Style, prefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInlineTokens")(draftState.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useStyleRenderer(): StyleRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleRenderer")().asInstanceOf[StyleRenderer]
  
  inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]
  
  inline def useThemeProvider(props: ThemeProviderProps, ref: Ref[HTMLElement], defaultProps: ThemeProviderProps): Render = (^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProvider")(props.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[Render]
  
  inline def useThemeProviderClasses(state: ThemeProviderState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProviderClasses")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useThemeProviderState(draftState: ThemeProviderState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProviderState")(draftState.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withThemeProvider[TProps](Component: FunctionComponent[TProps]): ForwardRefExoticComponent[PropsWithoutRef[TProps] & RefAttributes[HTMLButtonElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeProvider")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TProps] & RefAttributes[HTMLButtonElement]]]
}
