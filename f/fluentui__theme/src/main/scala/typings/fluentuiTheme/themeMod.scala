package typings.fluentuiTheme

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.fluentuiTheme.anon.Dictkey
import typings.fluentuiTheme.anon.PartialIEffects
import typings.fluentuiTheme.anon.PartialIFontStyles
import typings.fluentuiTheme.anon.PartialIPalette
import typings.fluentuiTheme.anon.PartialISemanticColors
import typings.fluentuiTheme.anon.PartialISpacing
import typings.fluentuiTheme.anon.PinISchemeNamesIScheme
import typings.fluentuiTheme.anon.RecursivePartialTokens
import typings.fluentuiTheme.ieffectsMod.IEffects
import typings.fluentuiTheme.ifontstylesMod.IFontStyles
import typings.fluentuiTheme.ipaletteMod.IPalette
import typings.fluentuiTheme.ischemeMod.IScheme
import typings.fluentuiTheme.isemanticcolorsMod.ISemanticColors
import typings.fluentuiTheme.ispacingMod.ISpacing
import typings.std.Record
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  trait ColorTokenSet extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var contentColor: js.UndefOr[String] = js.undefined
    
    var dividerColor: js.UndefOr[String] = js.undefined
    
    var focusColor: js.UndefOr[String] = js.undefined
    
    var focusInnerColor: js.UndefOr[String] = js.undefined
    
    var highContrast: js.UndefOr[ColorTokens] = js.undefined
    
    var iconColor: js.UndefOr[String] = js.undefined
    
    var linkColor: js.UndefOr[String] = js.undefined
    
    var menuIconColor: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[String] = js.undefined
    
    var secondaryContentColor: js.UndefOr[String] = js.undefined
  }
  object ColorTokenSet {
    
    inline def apply(): ColorTokenSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorTokenSet]
    }
    
    extension [Self <: ColorTokenSet](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setContentColor(value: String): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
      
      inline def setContentColorUndefined: Self = StObject.set(x, "contentColor", js.undefined)
      
      inline def setDividerColor(value: String): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
      
      inline def setDividerColorUndefined: Self = StObject.set(x, "dividerColor", js.undefined)
      
      inline def setFocusColor(value: String): Self = StObject.set(x, "focusColor", value.asInstanceOf[js.Any])
      
      inline def setFocusColorUndefined: Self = StObject.set(x, "focusColor", js.undefined)
      
      inline def setFocusInnerColor(value: String): Self = StObject.set(x, "focusInnerColor", value.asInstanceOf[js.Any])
      
      inline def setFocusInnerColorUndefined: Self = StObject.set(x, "focusInnerColor", js.undefined)
      
      inline def setHighContrast(value: ColorTokens): Self = StObject.set(x, "highContrast", value.asInstanceOf[js.Any])
      
      inline def setHighContrastUndefined: Self = StObject.set(x, "highContrast", js.undefined)
      
      inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      inline def setLinkColorUndefined: Self = StObject.set(x, "linkColor", js.undefined)
      
      inline def setMenuIconColor(value: String): Self = StObject.set(x, "menuIconColor", value.asInstanceOf[js.Any])
      
      inline def setMenuIconColorUndefined: Self = StObject.set(x, "menuIconColor", js.undefined)
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSecondaryContentColor(value: String): Self = StObject.set(x, "secondaryContentColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryContentColorUndefined: Self = StObject.set(x, "secondaryContentColor", js.undefined)
    }
  }
  
  trait ColorTokens
    extends StObject
       with ColorTokenSet {
    
    var checked: js.UndefOr[ColorTokens] = js.undefined
    
    var checkedHovered: js.UndefOr[ColorTokens] = js.undefined
    
    var checkedPressed: js.UndefOr[ColorTokens] = js.undefined
    
    var disabled: js.UndefOr[ColorTokenSet] = js.undefined
    
    var expanded: js.UndefOr[ColorTokenSet] = js.undefined
    
    var focused: js.UndefOr[ColorTokenSet] = js.undefined
    
    var hovered: js.UndefOr[ColorTokenSet] = js.undefined
    
    var pressed: js.UndefOr[ColorTokenSet] = js.undefined
  }
  object ColorTokens {
    
    inline def apply(): ColorTokens = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorTokens]
    }
    
    extension [Self <: ColorTokens](x: Self) {
      
      inline def setChecked(value: ColorTokens): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedHovered(value: ColorTokens): Self = StObject.set(x, "checkedHovered", value.asInstanceOf[js.Any])
      
      inline def setCheckedHoveredUndefined: Self = StObject.set(x, "checkedHovered", js.undefined)
      
      inline def setCheckedPressed(value: ColorTokens): Self = StObject.set(x, "checkedPressed", value.asInstanceOf[js.Any])
      
      inline def setCheckedPressedUndefined: Self = StObject.set(x, "checkedPressed", js.undefined)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDisabled(value: ColorTokenSet): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpanded(value: ColorTokenSet): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setFocused(value: ColorTokenSet): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHovered(value: ColorTokenSet): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
      
      inline def setHoveredUndefined: Self = StObject.set(x, "hovered", js.undefined)
      
      inline def setPressed(value: ColorTokenSet): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
    }
  }
  
  trait ComponentStyles extends StObject {
    
    /**
      * styles prop for a component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[js.Any, js.Any]] = js.undefined
    
    /**
      * The variants property is still in an experimental phase. This is only applied by `ThemeProvider`.
      */
    var variants: js.UndefOr[Variants] = js.undefined
  }
  object ComponentStyles {
    
    inline def apply(): ComponentStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentStyles]
    }
    
    extension [Self <: ComponentStyles](x: Self) {
      
      inline def setStyles(value: IStyleFunctionOrObject[js.Any, js.Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: js.Any => DeepPartial[js.Any]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setVariants(value: Variants): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    }
  }
  
  type ComponentsStyles = StringDictionary[ComponentStyles]
  
  /* Inlined std.Partial<{  fontFamily :string,   fontSize :string,   fontWeight :string}> */
  trait FontTokens extends StObject {
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
  }
  object FontTokens {
    
    inline def apply(): FontTokens = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontTokens]
    }
    
    extension [Self <: FontTokens](x: Self) {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    }
  }
  
  trait PartialTheme extends StObject {
    
    var components: js.UndefOr[ComponentsStyles] = js.undefined
    
    /**
      * Use this property to specify font property defaults.
      */
    var defaultFontStyle: js.UndefOr[IRawStyle] = js.undefined
    
    var disableGlobalClassNames: js.UndefOr[Boolean] = js.undefined
    
    var effects: js.UndefOr[PartialIEffects] = js.undefined
    
    var fonts: js.UndefOr[PartialIFontStyles] = js.undefined
    
    var isInverted: js.UndefOr[Boolean] = js.undefined
    
    var palette: js.UndefOr[PartialIPalette] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @internal
      * The schemes property is still in an experimental phase. The intent is to have it work
      * in conjunction with new 'schemes' prop that any component making use of Foundation can use.
      * Alternative themes that can be referred to by name.
      */
    var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.undefined
    
    var semanticColors: js.UndefOr[PartialISemanticColors] = js.undefined
    
    var spacing: js.UndefOr[PartialISpacing] = js.undefined
    
    /**
      * @internal
      * CSS stylesheets to be registered.
      * This is still in an experimental phase and is only applied by `ThemeProvider`.
      */
    var stylesheets: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @internal
      * Global tokens. This is experimental and not production-ready.
      * */
    var tokens: js.UndefOr[RecursivePartialTokens] = js.undefined
  }
  object PartialTheme {
    
    inline def apply(): PartialTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTheme]
    }
    
    extension [Self <: PartialTheme](x: Self) {
      
      inline def setComponents(value: ComponentsStyles): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDefaultFontStyle(value: IRawStyle): Self = StObject.set(x, "defaultFontStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultFontStyleUndefined: Self = StObject.set(x, "defaultFontStyle", js.undefined)
      
      inline def setDisableGlobalClassNames(value: Boolean): Self = StObject.set(x, "disableGlobalClassNames", value.asInstanceOf[js.Any])
      
      inline def setDisableGlobalClassNamesUndefined: Self = StObject.set(x, "disableGlobalClassNames", js.undefined)
      
      inline def setEffects(value: PartialIEffects): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      inline def setFonts(value: PartialIFontStyles): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
      
      inline def setIsInvertedUndefined: Self = StObject.set(x, "isInverted", js.undefined)
      
      inline def setPalette(value: PartialIPalette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSchemes(value: PinISchemeNamesIScheme): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      inline def setSemanticColors(value: PartialISemanticColors): Self = StObject.set(x, "semanticColors", value.asInstanceOf[js.Any])
      
      inline def setSemanticColorsUndefined: Self = StObject.set(x, "semanticColors", js.undefined)
      
      inline def setSpacing(value: PartialISpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setStylesheets(value: js.Array[String]): Self = StObject.set(x, "stylesheets", value.asInstanceOf[js.Any])
      
      inline def setStylesheetsUndefined: Self = StObject.set(x, "stylesheets", js.undefined)
      
      inline def setStylesheetsVarargs(value: String*): Self = StObject.set(x, "stylesheets", js.Array(value :_*))
      
      inline def setTokens(value: RecursivePartialTokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer I>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<I> * / object> : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<T[P]> * / object}
    */ typings.fluentuiTheme.fluentuiThemeStrings.RecursivePartial & TopLevel[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentuiTheme.fluentuiThemeStrings.smallest
    - typings.fluentuiTheme.fluentuiThemeStrings.smaller
    - typings.fluentuiTheme.fluentuiThemeStrings.small
    - typings.fluentuiTheme.fluentuiThemeStrings.medium
    - typings.fluentuiTheme.fluentuiThemeStrings.large
    - typings.fluentuiTheme.fluentuiThemeStrings.larger
    - typings.fluentuiTheme.fluentuiThemeStrings.largest
  */
  trait SizeValue extends StObject
  object SizeValue {
    
    inline def large: typings.fluentuiTheme.fluentuiThemeStrings.large = "large".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.large]
    
    inline def larger: typings.fluentuiTheme.fluentuiThemeStrings.larger = "larger".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.larger]
    
    inline def largest: typings.fluentuiTheme.fluentuiThemeStrings.largest = "largest".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.largest]
    
    inline def medium: typings.fluentuiTheme.fluentuiThemeStrings.medium = "medium".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.medium]
    
    inline def small: typings.fluentuiTheme.fluentuiThemeStrings.small = "small".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.small]
    
    inline def smaller: typings.fluentuiTheme.fluentuiThemeStrings.smaller = "smaller".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.smaller]
    
    inline def smallest: typings.fluentuiTheme.fluentuiThemeStrings.smallest = "smallest".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.smallest]
  }
  
  trait Theme
    extends StObject
       with IScheme {
    
    /**
      * Component-level styles and token set.
      * This is still in an experimental phase and is only applied by `ThemeProvider`.
      */
    var components: js.UndefOr[ComponentsStyles] = js.undefined
    
    /**
      * @internal
      * Id of the theme. This is for internal use only.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * @internal
      * The schemes property is still in an experimental phase. The intent is to have it work
      * in conjunction with new 'schemes' prop that any component making use of Foundation can use.
      * Alternative themes that can be referred to by name.
      */
    var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.undefined
    
    /**
      * @internal
      * CSS stylesheets to be registered.
      * This is still in an experimental phase and is only applied by `ThemeProvider`.
      */
    var stylesheets: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @internal
      * Global tokens. This is for internal use only and is not production-ready.
      * */
    var tokens: js.UndefOr[RecursivePartialTokens] = js.undefined
  }
  object Theme {
    
    inline def apply(
      disableGlobalClassNames: Boolean,
      effects: IEffects,
      fonts: IFontStyles,
      isInverted: Boolean,
      palette: IPalette,
      semanticColors: ISemanticColors,
      spacing: ISpacing
    ): Theme = {
      val __obj = js.Dynamic.literal(disableGlobalClassNames = disableGlobalClassNames.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setComponents(value: ComponentsStyles): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setSchemes(value: PinISchemeNamesIScheme): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      inline def setStylesheets(value: js.Array[String]): Self = StObject.set(x, "stylesheets", value.asInstanceOf[js.Any])
      
      inline def setStylesheetsUndefined: Self = StObject.set(x, "stylesheets", js.undefined)
      
      inline def setStylesheetsVarargs(value: String*): Self = StObject.set(x, "stylesheets", js.Array(value :_*))
      
      inline def setTokens(value: RecursivePartialTokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  trait TokenSetType
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[TokenSetType | String | Double]]
  object TokenSetType {
    
    inline def apply(): TokenSetType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenSetType]
    }
  }
  
  trait Tokens
    extends StObject
       with /* key */ StringDictionary[TokenSetType] {
    
    var color: Dictkey
  }
  object Tokens {
    
    inline def apply(color: Dictkey): Tokens = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tokens]
    }
    
    extension [Self <: Tokens](x: Self) {
      
      inline def setColor(value: Dictkey): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  type Variants = Record[String, js.Any]
}
