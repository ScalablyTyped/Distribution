package typings.fluentuiTheme

import typings.fluentuiTheme.ieffectsMod.IEffects
import typings.fluentuiTheme.ifontstylesMod.IFontStyles
import typings.fluentuiTheme.ipaletteMod.IPalette
import typings.fluentuiTheme.isemanticcolorsMod.ISemanticColors
import typings.fluentuiTheme.ispacingMod.ISpacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ischemeMod {
  
  trait IScheme extends StObject {
    
    /**
      * This setting is for a very narrow use case and you probably don't need to worry about,
      * unless you share a environment with others that also use fabric.
      * It is used for disabling global styles on fabric components. This will prevent global
      * overrides that might have been set by other fabric users from applying to your components.
      * When you set this setting to `true` on your theme the components in the subtree of your
      * Customizer will not get the global styles applied to them.
      */
    var disableGlobalClassNames: Boolean
    
    var effects: IEffects
    
    var fonts: IFontStyles
    
    var isInverted: Boolean
    
    var palette: IPalette
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var semanticColors: ISemanticColors
    
    /**
      * @internal
      * The spacing property is still in an experimental phase. The intent is to have it
      * be used for padding and margin sizes in a future release, but it is still undergoing review.
      * Avoid using it until it is finalized.
      */
    var spacing: ISpacing
  }
  object IScheme {
    
    inline def apply(
      disableGlobalClassNames: Boolean,
      effects: IEffects,
      fonts: IFontStyles,
      isInverted: Boolean,
      palette: IPalette,
      semanticColors: ISemanticColors,
      spacing: ISpacing
    ): IScheme = {
      val __obj = js.Dynamic.literal(disableGlobalClassNames = disableGlobalClassNames.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScheme]
    }
    
    extension [Self <: IScheme](x: Self) {
      
      inline def setDisableGlobalClassNames(value: Boolean): Self = StObject.set(x, "disableGlobalClassNames", value.asInstanceOf[js.Any])
      
      inline def setEffects(value: IEffects): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setFonts(value: IFontStyles): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
      
      inline def setPalette(value: IPalette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSemanticColors(value: ISemanticColors): Self = StObject.set(x, "semanticColors", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: ISpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentuiTheme.fluentuiThemeStrings.default
    - typings.fluentuiTheme.fluentuiThemeStrings.neutral
    - typings.fluentuiTheme.fluentuiThemeStrings.soft
    - typings.fluentuiTheme.fluentuiThemeStrings.strong
  */
  trait ISchemeNames extends StObject
  object ISchemeNames {
    
    inline def default: typings.fluentuiTheme.fluentuiThemeStrings.default = "default".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.default]
    
    inline def neutral: typings.fluentuiTheme.fluentuiThemeStrings.neutral = "neutral".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.neutral]
    
    inline def soft: typings.fluentuiTheme.fluentuiThemeStrings.soft = "soft".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.soft]
    
    inline def strong: typings.fluentuiTheme.fluentuiThemeStrings.strong = "strong".asInstanceOf[typings.fluentuiTheme.fluentuiThemeStrings.strong]
  }
}
