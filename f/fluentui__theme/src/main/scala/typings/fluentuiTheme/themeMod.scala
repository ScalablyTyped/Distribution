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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  @js.native
  trait ColorTokenSet extends StObject {
    
    var background: js.UndefOr[String] = js.native
    
    var borderColor: js.UndefOr[String] = js.native
    
    var contentColor: js.UndefOr[String] = js.native
    
    var dividerColor: js.UndefOr[String] = js.native
    
    var focusColor: js.UndefOr[String] = js.native
    
    var focusInnerColor: js.UndefOr[String] = js.native
    
    var highContrast: js.UndefOr[ColorTokens] = js.native
    
    var iconColor: js.UndefOr[String] = js.native
    
    var linkColor: js.UndefOr[String] = js.native
    
    var menuIconColor: js.UndefOr[String] = js.native
    
    var opacity: js.UndefOr[String] = js.native
    
    var secondaryContentColor: js.UndefOr[String] = js.native
  }
  object ColorTokenSet {
    
    @scala.inline
    def apply(): ColorTokenSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorTokenSet]
    }
    
    @scala.inline
    implicit class ColorTokenSetMutableBuilder[Self <: ColorTokenSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setContentColor(value: String): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentColorUndefined: Self = StObject.set(x, "contentColor", js.undefined)
      
      @scala.inline
      def setDividerColor(value: String): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerColorUndefined: Self = StObject.set(x, "dividerColor", js.undefined)
      
      @scala.inline
      def setFocusColor(value: String): Self = StObject.set(x, "focusColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusColorUndefined: Self = StObject.set(x, "focusColor", js.undefined)
      
      @scala.inline
      def setFocusInnerColor(value: String): Self = StObject.set(x, "focusInnerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusInnerColorUndefined: Self = StObject.set(x, "focusInnerColor", js.undefined)
      
      @scala.inline
      def setHighContrast(value: ColorTokens): Self = StObject.set(x, "highContrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighContrastUndefined: Self = StObject.set(x, "highContrast", js.undefined)
      
      @scala.inline
      def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      @scala.inline
      def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkColorUndefined: Self = StObject.set(x, "linkColor", js.undefined)
      
      @scala.inline
      def setMenuIconColor(value: String): Self = StObject.set(x, "menuIconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconColorUndefined: Self = StObject.set(x, "menuIconColor", js.undefined)
      
      @scala.inline
      def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSecondaryContentColor(value: String): Self = StObject.set(x, "secondaryContentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryContentColorUndefined: Self = StObject.set(x, "secondaryContentColor", js.undefined)
    }
  }
  
  /* Inlined @fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet & {  checked :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokens | undefined,   checkedHovered :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokens | undefined,   checkedPressed :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokens | undefined,   disabled :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet | undefined,   expanded :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet | undefined,   focused :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet | undefined,   hovered :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet | undefined,   pressed :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet | undefined} */
  @js.native
  trait ColorTokens extends StObject {
    
    var background: js.UndefOr[String] = js.native
    
    var borderColor: js.UndefOr[String] = js.native
    
    var checked: js.UndefOr[ColorTokens] = js.native
    
    var checkedHovered: js.UndefOr[ColorTokens] = js.native
    
    var checkedPressed: js.UndefOr[ColorTokens] = js.native
    
    var contentColor: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[ColorTokenSet] = js.native
    
    var dividerColor: js.UndefOr[String] = js.native
    
    var expanded: js.UndefOr[ColorTokenSet] = js.native
    
    var focusColor: js.UndefOr[String] = js.native
    
    var focusInnerColor: js.UndefOr[String] = js.native
    
    var focused: js.UndefOr[ColorTokenSet] = js.native
    
    var highContrast: js.UndefOr[ColorTokens] = js.native
    
    var hovered: js.UndefOr[ColorTokenSet] = js.native
    
    var iconColor: js.UndefOr[String] = js.native
    
    var linkColor: js.UndefOr[String] = js.native
    
    var menuIconColor: js.UndefOr[String] = js.native
    
    var opacity: js.UndefOr[String] = js.native
    
    var pressed: js.UndefOr[ColorTokenSet] = js.native
    
    var secondaryContentColor: js.UndefOr[String] = js.native
  }
  object ColorTokens {
    
    @scala.inline
    def apply(): ColorTokens = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorTokens]
    }
    
    @scala.inline
    implicit class ColorTokensMutableBuilder[Self <: ColorTokens] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setChecked(value: ColorTokens): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedHovered(value: ColorTokens): Self = StObject.set(x, "checkedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedHoveredUndefined: Self = StObject.set(x, "checkedHovered", js.undefined)
      
      @scala.inline
      def setCheckedPressed(value: ColorTokens): Self = StObject.set(x, "checkedPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedPressedUndefined: Self = StObject.set(x, "checkedPressed", js.undefined)
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setContentColor(value: String): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentColorUndefined: Self = StObject.set(x, "contentColor", js.undefined)
      
      @scala.inline
      def setDisabled(value: ColorTokenSet): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDividerColor(value: String): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerColorUndefined: Self = StObject.set(x, "dividerColor", js.undefined)
      
      @scala.inline
      def setExpanded(value: ColorTokenSet): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setFocusColor(value: String): Self = StObject.set(x, "focusColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusColorUndefined: Self = StObject.set(x, "focusColor", js.undefined)
      
      @scala.inline
      def setFocusInnerColor(value: String): Self = StObject.set(x, "focusInnerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusInnerColorUndefined: Self = StObject.set(x, "focusInnerColor", js.undefined)
      
      @scala.inline
      def setFocused(value: ColorTokenSet): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setHighContrast(value: ColorTokens): Self = StObject.set(x, "highContrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighContrastUndefined: Self = StObject.set(x, "highContrast", js.undefined)
      
      @scala.inline
      def setHovered(value: ColorTokenSet): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoveredUndefined: Self = StObject.set(x, "hovered", js.undefined)
      
      @scala.inline
      def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      @scala.inline
      def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkColorUndefined: Self = StObject.set(x, "linkColor", js.undefined)
      
      @scala.inline
      def setMenuIconColor(value: String): Self = StObject.set(x, "menuIconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconColorUndefined: Self = StObject.set(x, "menuIconColor", js.undefined)
      
      @scala.inline
      def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPressed(value: ColorTokenSet): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
      
      @scala.inline
      def setSecondaryContentColor(value: String): Self = StObject.set(x, "secondaryContentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryContentColorUndefined: Self = StObject.set(x, "secondaryContentColor", js.undefined)
    }
  }
  
  @js.native
  trait ComponentStyles extends StObject {
    
    /**
      * styles prop for a component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[_, _]] = js.native
    
    /**
      * The variants property is still in an experimental phase. This is only applied by `ThemeProvider`.
      */
    var variants: js.UndefOr[Variants] = js.native
  }
  object ComponentStyles {
    
    @scala.inline
    def apply(): ComponentStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentStyles]
    }
    
    @scala.inline
    implicit class ComponentStylesMutableBuilder[Self <: ComponentStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[_, _]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: _ => DeepPartial[_]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setVariants(value: Variants): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    }
  }
  
  type ComponentsStyles = StringDictionary[ComponentStyles]
  
  /* Inlined std.Partial<{  fontFamily :string,   fontSize :string,   fontWeight :string}> */
  @js.native
  trait FontTokens extends StObject {
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[String] = js.native
    
    var fontWeight: js.UndefOr[String] = js.native
  }
  object FontTokens {
    
    @scala.inline
    def apply(): FontTokens = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontTokens]
    }
    
    @scala.inline
    implicit class FontTokensMutableBuilder[Self <: FontTokens] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    }
  }
  
  @js.native
  trait PartialTheme extends StObject {
    
    var components: js.UndefOr[ComponentsStyles] = js.native
    
    /**
      * Use this property to specify font property defaults.
      */
    var defaultFontStyle: js.UndefOr[IRawStyle] = js.native
    
    var disableGlobalClassNames: js.UndefOr[Boolean] = js.native
    
    var effects: js.UndefOr[PartialIEffects] = js.native
    
    var fonts: js.UndefOr[PartialIFontStyles] = js.native
    
    var isInverted: js.UndefOr[Boolean] = js.native
    
    var palette: js.UndefOr[PartialIPalette] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    /**
      * @internal
      * The schemes property is still in an experimental phase. The intent is to have it work
      * in conjunction with new 'schemes' prop that any component making use of Foundation can use.
      * Alternative themes that can be referred to by name.
      */
    var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.native
    
    var semanticColors: js.UndefOr[PartialISemanticColors] = js.native
    
    var spacing: js.UndefOr[PartialISpacing] = js.native
    
    /**
      * @internal
      * CSS stylesheets to be registered.
      * This is still in an experimental phase and is only applied by `ThemeProvider`.
      */
    var stylesheets: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * @internal
      * Global tokens. This is experimental and not production-ready.
      * */
    var tokens: js.UndefOr[RecursivePartialTokens] = js.native
  }
  object PartialTheme {
    
    @scala.inline
    def apply(): PartialTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTheme]
    }
    
    @scala.inline
    implicit class PartialThemeMutableBuilder[Self <: PartialTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: ComponentsStyles): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDefaultFontStyle(value: IRawStyle): Self = StObject.set(x, "defaultFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFontStyleUndefined: Self = StObject.set(x, "defaultFontStyle", js.undefined)
      
      @scala.inline
      def setDisableGlobalClassNames(value: Boolean): Self = StObject.set(x, "disableGlobalClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableGlobalClassNamesUndefined: Self = StObject.set(x, "disableGlobalClassNames", js.undefined)
      
      @scala.inline
      def setEffects(value: PartialIEffects): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      @scala.inline
      def setFonts(value: PartialIFontStyles): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      @scala.inline
      def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvertedUndefined: Self = StObject.set(x, "isInverted", js.undefined)
      
      @scala.inline
      def setPalette(value: PartialIPalette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSchemes(value: PinISchemeNamesIScheme): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      @scala.inline
      def setSemanticColors(value: PartialISemanticColors): Self = StObject.set(x, "semanticColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemanticColorsUndefined: Self = StObject.set(x, "semanticColors", js.undefined)
      
      @scala.inline
      def setSpacing(value: PartialISpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setStylesheets(value: js.Array[String]): Self = StObject.set(x, "stylesheets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetsUndefined: Self = StObject.set(x, "stylesheets", js.undefined)
      
      @scala.inline
      def setStylesheetsVarargs(value: String*): Self = StObject.set(x, "stylesheets", js.Array(value :_*))
      
      @scala.inline
      def setTokens(value: RecursivePartialTokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer I>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<I> * / object> : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<T[P]> * / object}
    */ typings.fluentuiTheme.fluentuiThemeStrings.RecursivePartial with TopLevel[T]
  
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
    
    @scala.inline
    def large: typings.fluentuiTheme.fluentuiThemeStrings.large = "large".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.large]
    
    @scala.inline
    def larger: typings.fluentuiTheme.fluentuiThemeStrings.larger = "larger".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.larger]
    
    @scala.inline
    def largest: typings.fluentuiTheme.fluentuiThemeStrings.largest = "largest".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.largest]
    
    @scala.inline
    def medium: typings.fluentuiTheme.fluentuiThemeStrings.medium = "medium".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.medium]
    
    @scala.inline
    def small: typings.fluentuiTheme.fluentuiThemeStrings.small = "small".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.small]
    
    @scala.inline
    def smaller: typings.fluentuiTheme.fluentuiThemeStrings.smaller = "smaller".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.smaller]
    
    @scala.inline
    def smallest: typings.fluentuiTheme.fluentuiThemeStrings.smallest = "smallest".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.smallest]
  }
  
  @js.native
  trait Theme extends IScheme {
    
    /**
      * Component-level styles and token set.
      * This is still in an experimental phase and is only applied by `ThemeProvider`.
      */
    var components: js.UndefOr[ComponentsStyles] = js.native
    
    /**
      * @internal
      * Id of the theme. This is for internal use only.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * @internal
      * The schemes property is still in an experimental phase. The intent is to have it work
      * in conjunction with new 'schemes' prop that any component making use of Foundation can use.
      * Alternative themes that can be referred to by name.
      */
    var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.native
    
    /**
      * @internal
      * CSS stylesheets to be registered.
      * This is still in an experimental phase and is only applied by `ThemeProvider`.
      */
    var stylesheets: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * @internal
      * Global tokens. This is for internal use only and is not production-ready.
      * */
    var tokens: js.UndefOr[RecursivePartialTokens] = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: ComponentsStyles): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setSchemes(value: PinISchemeNamesIScheme): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      @scala.inline
      def setStylesheets(value: js.Array[String]): Self = StObject.set(x, "stylesheets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetsUndefined: Self = StObject.set(x, "stylesheets", js.undefined)
      
      @scala.inline
      def setStylesheetsVarargs(value: String*): Self = StObject.set(x, "stylesheets", js.Array(value :_*))
      
      @scala.inline
      def setTokens(value: RecursivePartialTokens): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  @js.native
  trait TokenSetType
    extends /* key */ StringDictionary[js.UndefOr[TokenSetType | String | Double]]
  object TokenSetType {
    
    @scala.inline
    def apply(): TokenSetType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenSetType]
    }
  }
  
  @js.native
  trait Tokens extends /* key */ StringDictionary[TokenSetType] {
    
    var color: Dictkey = js.native
  }
  object Tokens {
    
    @scala.inline
    def apply(color: Dictkey): Tokens = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tokens]
    }
    
    @scala.inline
    implicit class TokensMutableBuilder[Self <: Tokens] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Dictkey): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  type Variants = Record[String, js.Any]
}
