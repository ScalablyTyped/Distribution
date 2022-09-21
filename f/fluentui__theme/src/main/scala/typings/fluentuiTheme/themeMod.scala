package typings.fluentuiTheme

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiMergeStyles.deepPartialMod.DeepPartial
import typings.fluentuiMergeStyles.irawstyleMod.IRawStyle
import typings.fluentuiMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.fluentuiTheme.anon.PartialIEffects
import typings.fluentuiTheme.anon.PartialIFontStyles
import typings.fluentuiTheme.anon.PartialIPalette
import typings.fluentuiTheme.anon.PartialISemanticColors
import typings.fluentuiTheme.anon.PartialISpacing
import typings.fluentuiTheme.anon.PinISchemeNamesIScheme
import typings.fluentuiTheme.ieffectsMod.IEffects
import typings.fluentuiTheme.ifontstylesMod.IFontStyles
import typings.fluentuiTheme.ipaletteMod.IPalette
import typings.fluentuiTheme.ischemeMod.IScheme
import typings.fluentuiTheme.isemanticcolorsMod.ISemanticColors
import typings.fluentuiTheme.ispacingMod.ISpacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  trait ComponentStyles extends StObject {
    
    /**
      * styles prop for a component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[Any, Any]] = js.undefined
  }
  object ComponentStyles {
    
    inline def apply(): ComponentStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentStyles]
    }
    
    extension [Self <: ComponentStyles](x: Self) {
      
      inline def setStyles(value: IStyleFunctionOrObject[Any, Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: Any => DeepPartial[Any]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type ComponentsStyles = StringDictionary[ComponentStyles]
  
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
    }
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
      * User defined identifier for the theme.
      * @example "monokai"
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * @internal
      * The schemes property is still in an experimental phase. The intent is to have it work
      * in conjunction with new 'schemes' prop that any component making use of Foundation can use.
      * Alternative themes that can be referred to by name.
      */
    var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.undefined
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
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSchemes(value: PinISchemeNamesIScheme): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
    }
  }
}
