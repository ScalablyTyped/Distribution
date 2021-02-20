package typings.fluentuiTheme

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.ischemeMod.IScheme
import typings.fluentuiTheme.themeMod.ColorTokenSet
import typings.fluentuiTheme.themeMod.ColorTokens
import typings.fluentuiTheme.themeMod.RecursivePartial
import typings.fluentuiTheme.themeMod.TokenSetType
import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey extends /* key */ StringDictionary[TokenSetType] {
    
    var body: ColorTokenSet with TokenSetType = js.native
    
    var brand: ColorTokenSet with TokenSetType = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(body: ColorTokenSet with TokenSetType, brand: ColorTokenSet with TokenSetType): Dictkey = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: ColorTokenSet with TokenSetType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand(value: ColorTokenSet with TokenSetType): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@fluentui/theme.@fluentui/theme/lib/types.IEffects> */
  @js.native
  trait PartialIEffects extends StObject {
    
    var elevation16: js.UndefOr[String] = js.native
    
    var elevation4: js.UndefOr[String] = js.native
    
    var elevation64: js.UndefOr[String] = js.native
    
    var elevation8: js.UndefOr[String] = js.native
    
    var roundedCorner2: js.UndefOr[String] = js.native
    
    var roundedCorner4: js.UndefOr[String] = js.native
    
    var roundedCorner6: js.UndefOr[String] = js.native
  }
  object PartialIEffects {
    
    @scala.inline
    def apply(): PartialIEffects = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIEffects]
    }
    
    @scala.inline
    implicit class PartialIEffectsMutableBuilder[Self <: PartialIEffects] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElevation16(value: String): Self = StObject.set(x, "elevation16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevation16Undefined: Self = StObject.set(x, "elevation16", js.undefined)
      
      @scala.inline
      def setElevation4(value: String): Self = StObject.set(x, "elevation4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevation4Undefined: Self = StObject.set(x, "elevation4", js.undefined)
      
      @scala.inline
      def setElevation64(value: String): Self = StObject.set(x, "elevation64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevation64Undefined: Self = StObject.set(x, "elevation64", js.undefined)
      
      @scala.inline
      def setElevation8(value: String): Self = StObject.set(x, "elevation8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevation8Undefined: Self = StObject.set(x, "elevation8", js.undefined)
      
      @scala.inline
      def setRoundedCorner2(value: String): Self = StObject.set(x, "roundedCorner2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedCorner2Undefined: Self = StObject.set(x, "roundedCorner2", js.undefined)
      
      @scala.inline
      def setRoundedCorner4(value: String): Self = StObject.set(x, "roundedCorner4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedCorner4Undefined: Self = StObject.set(x, "roundedCorner4", js.undefined)
      
      @scala.inline
      def setRoundedCorner6(value: String): Self = StObject.set(x, "roundedCorner6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedCorner6Undefined: Self = StObject.set(x, "roundedCorner6", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@fluentui/theme.@fluentui/theme/lib/types/IFontStyles.IFontStyles> */
  @js.native
  trait PartialIFontStyles extends StObject {
    
    var large: js.UndefOr[IRawStyle] = js.native
    
    var medium: js.UndefOr[IRawStyle] = js.native
    
    var mediumPlus: js.UndefOr[IRawStyle] = js.native
    
    var mega: js.UndefOr[IRawStyle] = js.native
    
    var small: js.UndefOr[IRawStyle] = js.native
    
    var smallPlus: js.UndefOr[IRawStyle] = js.native
    
    var superLarge: js.UndefOr[IRawStyle] = js.native
    
    var tiny: js.UndefOr[IRawStyle] = js.native
    
    var xLarge: js.UndefOr[IRawStyle] = js.native
    
    var xLargePlus: js.UndefOr[IRawStyle] = js.native
    
    var xSmall: js.UndefOr[IRawStyle] = js.native
    
    var xxLarge: js.UndefOr[IRawStyle] = js.native
    
    var xxLargePlus: js.UndefOr[IRawStyle] = js.native
  }
  object PartialIFontStyles {
    
    @scala.inline
    def apply(): PartialIFontStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIFontStyles]
    }
    
    @scala.inline
    implicit class PartialIFontStylesMutableBuilder[Self <: PartialIFontStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLarge(value: IRawStyle): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setMedium(value: IRawStyle): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumPlus(value: IRawStyle): Self = StObject.set(x, "mediumPlus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumPlusUndefined: Self = StObject.set(x, "mediumPlus", js.undefined)
      
      @scala.inline
      def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      @scala.inline
      def setMega(value: IRawStyle): Self = StObject.set(x, "mega", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMegaUndefined: Self = StObject.set(x, "mega", js.undefined)
      
      @scala.inline
      def setSmall(value: IRawStyle): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallPlus(value: IRawStyle): Self = StObject.set(x, "smallPlus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallPlusUndefined: Self = StObject.set(x, "smallPlus", js.undefined)
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      @scala.inline
      def setSuperLarge(value: IRawStyle): Self = StObject.set(x, "superLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperLargeUndefined: Self = StObject.set(x, "superLarge", js.undefined)
      
      @scala.inline
      def setTiny(value: IRawStyle): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTinyUndefined: Self = StObject.set(x, "tiny", js.undefined)
      
      @scala.inline
      def setXLarge(value: IRawStyle): Self = StObject.set(x, "xLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXLargePlus(value: IRawStyle): Self = StObject.set(x, "xLargePlus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXLargePlusUndefined: Self = StObject.set(x, "xLargePlus", js.undefined)
      
      @scala.inline
      def setXLargeUndefined: Self = StObject.set(x, "xLarge", js.undefined)
      
      @scala.inline
      def setXSmall(value: IRawStyle): Self = StObject.set(x, "xSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXSmallUndefined: Self = StObject.set(x, "xSmall", js.undefined)
      
      @scala.inline
      def setXxLarge(value: IRawStyle): Self = StObject.set(x, "xxLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxLargePlus(value: IRawStyle): Self = StObject.set(x, "xxLargePlus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxLargePlusUndefined: Self = StObject.set(x, "xxLargePlus", js.undefined)
      
      @scala.inline
      def setXxLargeUndefined: Self = StObject.set(x, "xxLarge", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@fluentui/theme.@fluentui/theme/lib/types.IPalette> */
  @js.native
  trait PartialIPalette extends StObject {
    
    var accent: js.UndefOr[String] = js.native
    
    var black: js.UndefOr[String] = js.native
    
    var blackTranslucent40: js.UndefOr[String] = js.native
    
    var blue: js.UndefOr[String] = js.native
    
    var blueDark: js.UndefOr[String] = js.native
    
    var blueLight: js.UndefOr[String] = js.native
    
    var blueMid: js.UndefOr[String] = js.native
    
    var green: js.UndefOr[String] = js.native
    
    var greenDark: js.UndefOr[String] = js.native
    
    var greenLight: js.UndefOr[String] = js.native
    
    var magenta: js.UndefOr[String] = js.native
    
    var magentaDark: js.UndefOr[String] = js.native
    
    var magentaLight: js.UndefOr[String] = js.native
    
    var neutralDark: js.UndefOr[String] = js.native
    
    var neutralLight: js.UndefOr[String] = js.native
    
    var neutralLighter: js.UndefOr[String] = js.native
    
    var neutralLighterAlt: js.UndefOr[String] = js.native
    
    var neutralPrimary: js.UndefOr[String] = js.native
    
    var neutralPrimaryAlt: js.UndefOr[String] = js.native
    
    var neutralQuaternary: js.UndefOr[String] = js.native
    
    var neutralQuaternaryAlt: js.UndefOr[String] = js.native
    
    var neutralSecondary: js.UndefOr[String] = js.native
    
    var neutralSecondaryAlt: js.UndefOr[String] = js.native
    
    var neutralTertiary: js.UndefOr[String] = js.native
    
    var neutralTertiaryAlt: js.UndefOr[String] = js.native
    
    var orange: js.UndefOr[String] = js.native
    
    var orangeLight: js.UndefOr[String] = js.native
    
    var orangeLighter: js.UndefOr[String] = js.native
    
    var purple: js.UndefOr[String] = js.native
    
    var purpleDark: js.UndefOr[String] = js.native
    
    var purpleLight: js.UndefOr[String] = js.native
    
    var red: js.UndefOr[String] = js.native
    
    var redDark: js.UndefOr[String] = js.native
    
    var teal: js.UndefOr[String] = js.native
    
    var tealDark: js.UndefOr[String] = js.native
    
    var tealLight: js.UndefOr[String] = js.native
    
    var themeDark: js.UndefOr[String] = js.native
    
    var themeDarkAlt: js.UndefOr[String] = js.native
    
    var themeDarker: js.UndefOr[String] = js.native
    
    var themeLight: js.UndefOr[String] = js.native
    
    var themeLighter: js.UndefOr[String] = js.native
    
    var themeLighterAlt: js.UndefOr[String] = js.native
    
    var themePrimary: js.UndefOr[String] = js.native
    
    var themeSecondary: js.UndefOr[String] = js.native
    
    var themeTertiary: js.UndefOr[String] = js.native
    
    var white: js.UndefOr[String] = js.native
    
    var whiteTranslucent40: js.UndefOr[String] = js.native
    
    var yellow: js.UndefOr[String] = js.native
    
    var yellowDark: js.UndefOr[String] = js.native
    
    var yellowLight: js.UndefOr[String] = js.native
  }
  object PartialIPalette {
    
    @scala.inline
    def apply(): PartialIPalette = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIPalette]
    }
    
    @scala.inline
    implicit class PartialIPaletteMutableBuilder[Self <: PartialIPalette] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccent(value: String): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
      
      @scala.inline
      def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackTranslucent40(value: String): Self = StObject.set(x, "blackTranslucent40", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackTranslucent40Undefined: Self = StObject.set(x, "blackTranslucent40", js.undefined)
      
      @scala.inline
      def setBlackUndefined: Self = StObject.set(x, "black", js.undefined)
      
      @scala.inline
      def setBlue(value: String): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueDark(value: String): Self = StObject.set(x, "blueDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueDarkUndefined: Self = StObject.set(x, "blueDark", js.undefined)
      
      @scala.inline
      def setBlueLight(value: String): Self = StObject.set(x, "blueLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueLightUndefined: Self = StObject.set(x, "blueLight", js.undefined)
      
      @scala.inline
      def setBlueMid(value: String): Self = StObject.set(x, "blueMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueMidUndefined: Self = StObject.set(x, "blueMid", js.undefined)
      
      @scala.inline
      def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
      
      @scala.inline
      def setGreen(value: String): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreenDark(value: String): Self = StObject.set(x, "greenDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreenDarkUndefined: Self = StObject.set(x, "greenDark", js.undefined)
      
      @scala.inline
      def setGreenLight(value: String): Self = StObject.set(x, "greenLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreenLightUndefined: Self = StObject.set(x, "greenLight", js.undefined)
      
      @scala.inline
      def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
      
      @scala.inline
      def setMagenta(value: String): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagentaDark(value: String): Self = StObject.set(x, "magentaDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagentaDarkUndefined: Self = StObject.set(x, "magentaDark", js.undefined)
      
      @scala.inline
      def setMagentaLight(value: String): Self = StObject.set(x, "magentaLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagentaLightUndefined: Self = StObject.set(x, "magentaLight", js.undefined)
      
      @scala.inline
      def setMagentaUndefined: Self = StObject.set(x, "magenta", js.undefined)
      
      @scala.inline
      def setNeutralDark(value: String): Self = StObject.set(x, "neutralDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralDarkUndefined: Self = StObject.set(x, "neutralDark", js.undefined)
      
      @scala.inline
      def setNeutralLight(value: String): Self = StObject.set(x, "neutralLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralLightUndefined: Self = StObject.set(x, "neutralLight", js.undefined)
      
      @scala.inline
      def setNeutralLighter(value: String): Self = StObject.set(x, "neutralLighter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralLighterAlt(value: String): Self = StObject.set(x, "neutralLighterAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralLighterAltUndefined: Self = StObject.set(x, "neutralLighterAlt", js.undefined)
      
      @scala.inline
      def setNeutralLighterUndefined: Self = StObject.set(x, "neutralLighter", js.undefined)
      
      @scala.inline
      def setNeutralPrimary(value: String): Self = StObject.set(x, "neutralPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralPrimaryAlt(value: String): Self = StObject.set(x, "neutralPrimaryAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralPrimaryAltUndefined: Self = StObject.set(x, "neutralPrimaryAlt", js.undefined)
      
      @scala.inline
      def setNeutralPrimaryUndefined: Self = StObject.set(x, "neutralPrimary", js.undefined)
      
      @scala.inline
      def setNeutralQuaternary(value: String): Self = StObject.set(x, "neutralQuaternary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralQuaternaryAlt(value: String): Self = StObject.set(x, "neutralQuaternaryAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralQuaternaryAltUndefined: Self = StObject.set(x, "neutralQuaternaryAlt", js.undefined)
      
      @scala.inline
      def setNeutralQuaternaryUndefined: Self = StObject.set(x, "neutralQuaternary", js.undefined)
      
      @scala.inline
      def setNeutralSecondary(value: String): Self = StObject.set(x, "neutralSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralSecondaryAlt(value: String): Self = StObject.set(x, "neutralSecondaryAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralSecondaryAltUndefined: Self = StObject.set(x, "neutralSecondaryAlt", js.undefined)
      
      @scala.inline
      def setNeutralSecondaryUndefined: Self = StObject.set(x, "neutralSecondary", js.undefined)
      
      @scala.inline
      def setNeutralTertiary(value: String): Self = StObject.set(x, "neutralTertiary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralTertiaryAlt(value: String): Self = StObject.set(x, "neutralTertiaryAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralTertiaryAltUndefined: Self = StObject.set(x, "neutralTertiaryAlt", js.undefined)
      
      @scala.inline
      def setNeutralTertiaryUndefined: Self = StObject.set(x, "neutralTertiary", js.undefined)
      
      @scala.inline
      def setOrange(value: String): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrangeLight(value: String): Self = StObject.set(x, "orangeLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrangeLightUndefined: Self = StObject.set(x, "orangeLight", js.undefined)
      
      @scala.inline
      def setOrangeLighter(value: String): Self = StObject.set(x, "orangeLighter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrangeLighterUndefined: Self = StObject.set(x, "orangeLighter", js.undefined)
      
      @scala.inline
      def setOrangeUndefined: Self = StObject.set(x, "orange", js.undefined)
      
      @scala.inline
      def setPurple(value: String): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurpleDark(value: String): Self = StObject.set(x, "purpleDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurpleDarkUndefined: Self = StObject.set(x, "purpleDark", js.undefined)
      
      @scala.inline
      def setPurpleLight(value: String): Self = StObject.set(x, "purpleLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurpleLightUndefined: Self = StObject.set(x, "purpleLight", js.undefined)
      
      @scala.inline
      def setPurpleUndefined: Self = StObject.set(x, "purple", js.undefined)
      
      @scala.inline
      def setRed(value: String): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedDark(value: String): Self = StObject.set(x, "redDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedDarkUndefined: Self = StObject.set(x, "redDark", js.undefined)
      
      @scala.inline
      def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
      
      @scala.inline
      def setTeal(value: String): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTealDark(value: String): Self = StObject.set(x, "tealDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTealDarkUndefined: Self = StObject.set(x, "tealDark", js.undefined)
      
      @scala.inline
      def setTealLight(value: String): Self = StObject.set(x, "tealLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTealLightUndefined: Self = StObject.set(x, "tealLight", js.undefined)
      
      @scala.inline
      def setTealUndefined: Self = StObject.set(x, "teal", js.undefined)
      
      @scala.inline
      def setThemeDark(value: String): Self = StObject.set(x, "themeDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeDarkAlt(value: String): Self = StObject.set(x, "themeDarkAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeDarkAltUndefined: Self = StObject.set(x, "themeDarkAlt", js.undefined)
      
      @scala.inline
      def setThemeDarkUndefined: Self = StObject.set(x, "themeDark", js.undefined)
      
      @scala.inline
      def setThemeDarker(value: String): Self = StObject.set(x, "themeDarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeDarkerUndefined: Self = StObject.set(x, "themeDarker", js.undefined)
      
      @scala.inline
      def setThemeLight(value: String): Self = StObject.set(x, "themeLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeLightUndefined: Self = StObject.set(x, "themeLight", js.undefined)
      
      @scala.inline
      def setThemeLighter(value: String): Self = StObject.set(x, "themeLighter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeLighterAlt(value: String): Self = StObject.set(x, "themeLighterAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeLighterAltUndefined: Self = StObject.set(x, "themeLighterAlt", js.undefined)
      
      @scala.inline
      def setThemeLighterUndefined: Self = StObject.set(x, "themeLighter", js.undefined)
      
      @scala.inline
      def setThemePrimary(value: String): Self = StObject.set(x, "themePrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemePrimaryUndefined: Self = StObject.set(x, "themePrimary", js.undefined)
      
      @scala.inline
      def setThemeSecondary(value: String): Self = StObject.set(x, "themeSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeSecondaryUndefined: Self = StObject.set(x, "themeSecondary", js.undefined)
      
      @scala.inline
      def setThemeTertiary(value: String): Self = StObject.set(x, "themeTertiary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeTertiaryUndefined: Self = StObject.set(x, "themeTertiary", js.undefined)
      
      @scala.inline
      def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteTranslucent40(value: String): Self = StObject.set(x, "whiteTranslucent40", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteTranslucent40Undefined: Self = StObject.set(x, "whiteTranslucent40", js.undefined)
      
      @scala.inline
      def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
      
      @scala.inline
      def setYellow(value: String): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYellowDark(value: String): Self = StObject.set(x, "yellowDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYellowDarkUndefined: Self = StObject.set(x, "yellowDark", js.undefined)
      
      @scala.inline
      def setYellowLight(value: String): Self = StObject.set(x, "yellowLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYellowLightUndefined: Self = StObject.set(x, "yellowLight", js.undefined)
      
      @scala.inline
      def setYellowUndefined: Self = StObject.set(x, "yellow", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@fluentui/theme.@fluentui/theme/lib/types.ISemanticColors> */
  @js.native
  trait PartialISemanticColors extends StObject {
    
    var accentButtonBackground: js.UndefOr[String] = js.native
    
    var accentButtonText: js.UndefOr[String] = js.native
    
    var actionLink: js.UndefOr[String] = js.native
    
    var actionLinkHovered: js.UndefOr[String] = js.native
    
    var blockingBackground: js.UndefOr[String] = js.native
    
    var blockingIcon: js.UndefOr[String] = js.native
    
    var bodyBackground: js.UndefOr[String] = js.native
    
    var bodyBackgroundChecked: js.UndefOr[String] = js.native
    
    var bodyBackgroundHovered: js.UndefOr[String] = js.native
    
    var bodyDivider: js.UndefOr[String] = js.native
    
    var bodyFrameBackground: js.UndefOr[String] = js.native
    
    var bodyFrameDivider: js.UndefOr[String] = js.native
    
    var bodyStandoutBackground: js.UndefOr[String] = js.native
    
    var bodySubtext: js.UndefOr[String] = js.native
    
    var bodyText: js.UndefOr[String] = js.native
    
    var bodyTextChecked: js.UndefOr[String] = js.native
    
    var buttonBackground: js.UndefOr[String] = js.native
    
    var buttonBackgroundChecked: js.UndefOr[String] = js.native
    
    var buttonBackgroundCheckedHovered: js.UndefOr[String] = js.native
    
    var buttonBackgroundDisabled: js.UndefOr[String] = js.native
    
    var buttonBackgroundHovered: js.UndefOr[String] = js.native
    
    var buttonBackgroundPressed: js.UndefOr[String] = js.native
    
    var buttonBorder: js.UndefOr[String] = js.native
    
    var buttonBorderDisabled: js.UndefOr[String] = js.native
    
    var buttonText: js.UndefOr[String] = js.native
    
    var buttonTextChecked: js.UndefOr[String] = js.native
    
    var buttonTextCheckedHovered: js.UndefOr[String] = js.native
    
    var buttonTextDisabled: js.UndefOr[String] = js.native
    
    var buttonTextHovered: js.UndefOr[String] = js.native
    
    var buttonTextPressed: js.UndefOr[String] = js.native
    
    var cardShadow: js.UndefOr[String] = js.native
    
    var cardShadowHovered: js.UndefOr[String] = js.native
    
    var cardStandoutBackground: js.UndefOr[String] = js.native
    
    var defaultStateBackground: js.UndefOr[String] = js.native
    
    var disabledBackground: js.UndefOr[String] = js.native
    
    var disabledBodySubtext: js.UndefOr[String] = js.native
    
    var disabledBodyText: js.UndefOr[String] = js.native
    
    var disabledBorder: js.UndefOr[String] = js.native
    
    var disabledSubtext: js.UndefOr[String] = js.native
    
    var disabledText: js.UndefOr[String] = js.native
    
    var errorBackground: js.UndefOr[String] = js.native
    
    var errorIcon: js.UndefOr[String] = js.native
    
    var errorText: js.UndefOr[String] = js.native
    
    var focusBorder: js.UndefOr[String] = js.native
    
    var infoBackground: js.UndefOr[String] = js.native
    
    var infoIcon: js.UndefOr[String] = js.native
    
    var inputBackground: js.UndefOr[String] = js.native
    
    var inputBackgroundChecked: js.UndefOr[String] = js.native
    
    var inputBackgroundCheckedHovered: js.UndefOr[String] = js.native
    
    var inputBorder: js.UndefOr[String] = js.native
    
    var inputBorderHovered: js.UndefOr[String] = js.native
    
    var inputFocusBorderAlt: js.UndefOr[String] = js.native
    
    var inputForegroundChecked: js.UndefOr[String] = js.native
    
    var inputIcon: js.UndefOr[String] = js.native
    
    var inputIconDisabled: js.UndefOr[String] = js.native
    
    var inputIconHovered: js.UndefOr[String] = js.native
    
    var inputPlaceholderBackgroundChecked: js.UndefOr[String] = js.native
    
    var inputPlaceholderText: js.UndefOr[String] = js.native
    
    var inputText: js.UndefOr[String] = js.native
    
    var inputTextHovered: js.UndefOr[String] = js.native
    
    var link: js.UndefOr[String] = js.native
    
    var linkHovered: js.UndefOr[String] = js.native
    
    var listBackground: js.UndefOr[String] = js.native
    
    var listHeaderBackgroundHovered: js.UndefOr[String] = js.native
    
    var listHeaderBackgroundPressed: js.UndefOr[String] = js.native
    
    var listItemBackgroundChecked: js.UndefOr[String] = js.native
    
    var listItemBackgroundCheckedHovered: js.UndefOr[String] = js.native
    
    var listItemBackgroundHovered: js.UndefOr[String] = js.native
    
    var listText: js.UndefOr[String] = js.native
    
    var listTextColor: js.UndefOr[String] = js.native
    
    var menuBackground: js.UndefOr[String] = js.native
    
    var menuDivider: js.UndefOr[String] = js.native
    
    var menuHeader: js.UndefOr[String] = js.native
    
    var menuIcon: js.UndefOr[String] = js.native
    
    var menuItemBackgroundChecked: js.UndefOr[String] = js.native
    
    var menuItemBackgroundHovered: js.UndefOr[String] = js.native
    
    var menuItemBackgroundPressed: js.UndefOr[String] = js.native
    
    var menuItemText: js.UndefOr[String] = js.native
    
    var menuItemTextHovered: js.UndefOr[String] = js.native
    
    var messageLink: js.UndefOr[String] = js.native
    
    var messageLinkHovered: js.UndefOr[String] = js.native
    
    var messageText: js.UndefOr[String] = js.native
    
    var primaryButtonBackground: js.UndefOr[String] = js.native
    
    var primaryButtonBackgroundDisabled: js.UndefOr[String] = js.native
    
    var primaryButtonBackgroundHovered: js.UndefOr[String] = js.native
    
    var primaryButtonBackgroundPressed: js.UndefOr[String] = js.native
    
    var primaryButtonBorder: js.UndefOr[String] = js.native
    
    var primaryButtonText: js.UndefOr[String] = js.native
    
    var primaryButtonTextDisabled: js.UndefOr[String] = js.native
    
    var primaryButtonTextHovered: js.UndefOr[String] = js.native
    
    var primaryButtonTextPressed: js.UndefOr[String] = js.native
    
    var severeWarningBackground: js.UndefOr[String] = js.native
    
    var severeWarningIcon: js.UndefOr[String] = js.native
    
    var smallInputBorder: js.UndefOr[String] = js.native
    
    var successBackground: js.UndefOr[String] = js.native
    
    var successIcon: js.UndefOr[String] = js.native
    
    var successText: js.UndefOr[String] = js.native
    
    var variantBorder: js.UndefOr[String] = js.native
    
    var variantBorderHovered: js.UndefOr[String] = js.native
    
    var warningBackground: js.UndefOr[String] = js.native
    
    var warningHighlight: js.UndefOr[String] = js.native
    
    var warningIcon: js.UndefOr[String] = js.native
    
    var warningText: js.UndefOr[String] = js.native
  }
  object PartialISemanticColors {
    
    @scala.inline
    def apply(): PartialISemanticColors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialISemanticColors]
    }
    
    @scala.inline
    implicit class PartialISemanticColorsMutableBuilder[Self <: PartialISemanticColors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentButtonBackground(value: String): Self = StObject.set(x, "accentButtonBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentButtonBackgroundUndefined: Self = StObject.set(x, "accentButtonBackground", js.undefined)
      
      @scala.inline
      def setAccentButtonText(value: String): Self = StObject.set(x, "accentButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentButtonTextUndefined: Self = StObject.set(x, "accentButtonText", js.undefined)
      
      @scala.inline
      def setActionLink(value: String): Self = StObject.set(x, "actionLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionLinkHovered(value: String): Self = StObject.set(x, "actionLinkHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionLinkHoveredUndefined: Self = StObject.set(x, "actionLinkHovered", js.undefined)
      
      @scala.inline
      def setActionLinkUndefined: Self = StObject.set(x, "actionLink", js.undefined)
      
      @scala.inline
      def setBlockingBackground(value: String): Self = StObject.set(x, "blockingBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockingBackgroundUndefined: Self = StObject.set(x, "blockingBackground", js.undefined)
      
      @scala.inline
      def setBlockingIcon(value: String): Self = StObject.set(x, "blockingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockingIconUndefined: Self = StObject.set(x, "blockingIcon", js.undefined)
      
      @scala.inline
      def setBodyBackground(value: String): Self = StObject.set(x, "bodyBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyBackgroundChecked(value: String): Self = StObject.set(x, "bodyBackgroundChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyBackgroundCheckedUndefined: Self = StObject.set(x, "bodyBackgroundChecked", js.undefined)
      
      @scala.inline
      def setBodyBackgroundHovered(value: String): Self = StObject.set(x, "bodyBackgroundHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyBackgroundHoveredUndefined: Self = StObject.set(x, "bodyBackgroundHovered", js.undefined)
      
      @scala.inline
      def setBodyBackgroundUndefined: Self = StObject.set(x, "bodyBackground", js.undefined)
      
      @scala.inline
      def setBodyDivider(value: String): Self = StObject.set(x, "bodyDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyDividerUndefined: Self = StObject.set(x, "bodyDivider", js.undefined)
      
      @scala.inline
      def setBodyFrameBackground(value: String): Self = StObject.set(x, "bodyFrameBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyFrameBackgroundUndefined: Self = StObject.set(x, "bodyFrameBackground", js.undefined)
      
      @scala.inline
      def setBodyFrameDivider(value: String): Self = StObject.set(x, "bodyFrameDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyFrameDividerUndefined: Self = StObject.set(x, "bodyFrameDivider", js.undefined)
      
      @scala.inline
      def setBodyStandoutBackground(value: String): Self = StObject.set(x, "bodyStandoutBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStandoutBackgroundUndefined: Self = StObject.set(x, "bodyStandoutBackground", js.undefined)
      
      @scala.inline
      def setBodySubtext(value: String): Self = StObject.set(x, "bodySubtext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodySubtextUndefined: Self = StObject.set(x, "bodySubtext", js.undefined)
      
      @scala.inline
      def setBodyText(value: String): Self = StObject.set(x, "bodyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyTextChecked(value: String): Self = StObject.set(x, "bodyTextChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyTextCheckedUndefined: Self = StObject.set(x, "bodyTextChecked", js.undefined)
      
      @scala.inline
      def setBodyTextUndefined: Self = StObject.set(x, "bodyText", js.undefined)
      
      @scala.inline
      def setButtonBackground(value: String): Self = StObject.set(x, "buttonBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonBackgroundChecked(value: String): Self = StObject.set(x, "buttonBackgroundChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonBackgroundCheckedHovered(value: String): Self = StObject.set(x, "buttonBackgroundCheckedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonBackgroundCheckedHoveredUndefined: Self = StObject.set(x, "buttonBackgroundCheckedHovered", js.undefined)
      
      @scala.inline
      def setButtonBackgroundCheckedUndefined: Self = StObject.set(x, "buttonBackgroundChecked", js.undefined)
      
      @scala.inline
      def setButtonBackgroundDisabled(value: String): Self = StObject.set(x, "buttonBackgroundDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonBackgroundDisabledUndefined: Self = StObject.set(x, "buttonBackgroundDisabled", js.undefined)
      
      @scala.inline
      def setButtonBackgroundHovered(value: String): Self = StObject.set(x, "buttonBackgroundHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonBackgroundHoveredUndefined: Self = StObject.set(x, "buttonBackgroundHovered", js.undefined)
      
      @scala.inline
      def setButtonBackgroundPressed(value: String): Self = StObject.set(x, "buttonBackgroundPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonBackgroundPressedUndefined: Self = StObject.set(x, "buttonBackgroundPressed", js.undefined)
      
      @scala.inline
      def setButtonBackgroundUndefined: Self = StObject.set(x, "buttonBackground", js.undefined)
      
      @scala.inline
      def setButtonBorder(value: String): Self = StObject.set(x, "buttonBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonBorderDisabled(value: String): Self = StObject.set(x, "buttonBorderDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonBorderDisabledUndefined: Self = StObject.set(x, "buttonBorderDisabled", js.undefined)
      
      @scala.inline
      def setButtonBorderUndefined: Self = StObject.set(x, "buttonBorder", js.undefined)
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextChecked(value: String): Self = StObject.set(x, "buttonTextChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextCheckedHovered(value: String): Self = StObject.set(x, "buttonTextCheckedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextCheckedHoveredUndefined: Self = StObject.set(x, "buttonTextCheckedHovered", js.undefined)
      
      @scala.inline
      def setButtonTextCheckedUndefined: Self = StObject.set(x, "buttonTextChecked", js.undefined)
      
      @scala.inline
      def setButtonTextDisabled(value: String): Self = StObject.set(x, "buttonTextDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextDisabledUndefined: Self = StObject.set(x, "buttonTextDisabled", js.undefined)
      
      @scala.inline
      def setButtonTextHovered(value: String): Self = StObject.set(x, "buttonTextHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextHoveredUndefined: Self = StObject.set(x, "buttonTextHovered", js.undefined)
      
      @scala.inline
      def setButtonTextPressed(value: String): Self = StObject.set(x, "buttonTextPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextPressedUndefined: Self = StObject.set(x, "buttonTextPressed", js.undefined)
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setCardShadow(value: String): Self = StObject.set(x, "cardShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardShadowHovered(value: String): Self = StObject.set(x, "cardShadowHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardShadowHoveredUndefined: Self = StObject.set(x, "cardShadowHovered", js.undefined)
      
      @scala.inline
      def setCardShadowUndefined: Self = StObject.set(x, "cardShadow", js.undefined)
      
      @scala.inline
      def setCardStandoutBackground(value: String): Self = StObject.set(x, "cardStandoutBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardStandoutBackgroundUndefined: Self = StObject.set(x, "cardStandoutBackground", js.undefined)
      
      @scala.inline
      def setDefaultStateBackground(value: String): Self = StObject.set(x, "defaultStateBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStateBackgroundUndefined: Self = StObject.set(x, "defaultStateBackground", js.undefined)
      
      @scala.inline
      def setDisabledBackground(value: String): Self = StObject.set(x, "disabledBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledBackgroundUndefined: Self = StObject.set(x, "disabledBackground", js.undefined)
      
      @scala.inline
      def setDisabledBodySubtext(value: String): Self = StObject.set(x, "disabledBodySubtext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledBodySubtextUndefined: Self = StObject.set(x, "disabledBodySubtext", js.undefined)
      
      @scala.inline
      def setDisabledBodyText(value: String): Self = StObject.set(x, "disabledBodyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledBodyTextUndefined: Self = StObject.set(x, "disabledBodyText", js.undefined)
      
      @scala.inline
      def setDisabledBorder(value: String): Self = StObject.set(x, "disabledBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledBorderUndefined: Self = StObject.set(x, "disabledBorder", js.undefined)
      
      @scala.inline
      def setDisabledSubtext(value: String): Self = StObject.set(x, "disabledSubtext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledSubtextUndefined: Self = StObject.set(x, "disabledSubtext", js.undefined)
      
      @scala.inline
      def setDisabledText(value: String): Self = StObject.set(x, "disabledText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledTextUndefined: Self = StObject.set(x, "disabledText", js.undefined)
      
      @scala.inline
      def setErrorBackground(value: String): Self = StObject.set(x, "errorBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorBackgroundUndefined: Self = StObject.set(x, "errorBackground", js.undefined)
      
      @scala.inline
      def setErrorIcon(value: String): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIconUndefined: Self = StObject.set(x, "errorIcon", js.undefined)
      
      @scala.inline
      def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
      
      @scala.inline
      def setFocusBorder(value: String): Self = StObject.set(x, "focusBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusBorderUndefined: Self = StObject.set(x, "focusBorder", js.undefined)
      
      @scala.inline
      def setInfoBackground(value: String): Self = StObject.set(x, "infoBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoBackgroundUndefined: Self = StObject.set(x, "infoBackground", js.undefined)
      
      @scala.inline
      def setInfoIcon(value: String): Self = StObject.set(x, "infoIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoIconUndefined: Self = StObject.set(x, "infoIcon", js.undefined)
      
      @scala.inline
      def setInputBackground(value: String): Self = StObject.set(x, "inputBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputBackgroundChecked(value: String): Self = StObject.set(x, "inputBackgroundChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputBackgroundCheckedHovered(value: String): Self = StObject.set(x, "inputBackgroundCheckedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputBackgroundCheckedHoveredUndefined: Self = StObject.set(x, "inputBackgroundCheckedHovered", js.undefined)
      
      @scala.inline
      def setInputBackgroundCheckedUndefined: Self = StObject.set(x, "inputBackgroundChecked", js.undefined)
      
      @scala.inline
      def setInputBackgroundUndefined: Self = StObject.set(x, "inputBackground", js.undefined)
      
      @scala.inline
      def setInputBorder(value: String): Self = StObject.set(x, "inputBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputBorderHovered(value: String): Self = StObject.set(x, "inputBorderHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputBorderHoveredUndefined: Self = StObject.set(x, "inputBorderHovered", js.undefined)
      
      @scala.inline
      def setInputBorderUndefined: Self = StObject.set(x, "inputBorder", js.undefined)
      
      @scala.inline
      def setInputFocusBorderAlt(value: String): Self = StObject.set(x, "inputFocusBorderAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFocusBorderAltUndefined: Self = StObject.set(x, "inputFocusBorderAlt", js.undefined)
      
      @scala.inline
      def setInputForegroundChecked(value: String): Self = StObject.set(x, "inputForegroundChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputForegroundCheckedUndefined: Self = StObject.set(x, "inputForegroundChecked", js.undefined)
      
      @scala.inline
      def setInputIcon(value: String): Self = StObject.set(x, "inputIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIconDisabled(value: String): Self = StObject.set(x, "inputIconDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIconDisabledUndefined: Self = StObject.set(x, "inputIconDisabled", js.undefined)
      
      @scala.inline
      def setInputIconHovered(value: String): Self = StObject.set(x, "inputIconHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIconHoveredUndefined: Self = StObject.set(x, "inputIconHovered", js.undefined)
      
      @scala.inline
      def setInputIconUndefined: Self = StObject.set(x, "inputIcon", js.undefined)
      
      @scala.inline
      def setInputPlaceholderBackgroundChecked(value: String): Self = StObject.set(x, "inputPlaceholderBackgroundChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPlaceholderBackgroundCheckedUndefined: Self = StObject.set(x, "inputPlaceholderBackgroundChecked", js.undefined)
      
      @scala.inline
      def setInputPlaceholderText(value: String): Self = StObject.set(x, "inputPlaceholderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPlaceholderTextUndefined: Self = StObject.set(x, "inputPlaceholderText", js.undefined)
      
      @scala.inline
      def setInputText(value: String): Self = StObject.set(x, "inputText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTextHovered(value: String): Self = StObject.set(x, "inputTextHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTextHoveredUndefined: Self = StObject.set(x, "inputTextHovered", js.undefined)
      
      @scala.inline
      def setInputTextUndefined: Self = StObject.set(x, "inputText", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkHovered(value: String): Self = StObject.set(x, "linkHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkHoveredUndefined: Self = StObject.set(x, "linkHovered", js.undefined)
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setListBackground(value: String): Self = StObject.set(x, "listBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListBackgroundUndefined: Self = StObject.set(x, "listBackground", js.undefined)
      
      @scala.inline
      def setListHeaderBackgroundHovered(value: String): Self = StObject.set(x, "listHeaderBackgroundHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeaderBackgroundHoveredUndefined: Self = StObject.set(x, "listHeaderBackgroundHovered", js.undefined)
      
      @scala.inline
      def setListHeaderBackgroundPressed(value: String): Self = StObject.set(x, "listHeaderBackgroundPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeaderBackgroundPressedUndefined: Self = StObject.set(x, "listHeaderBackgroundPressed", js.undefined)
      
      @scala.inline
      def setListItemBackgroundChecked(value: String): Self = StObject.set(x, "listItemBackgroundChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemBackgroundCheckedHovered(value: String): Self = StObject.set(x, "listItemBackgroundCheckedHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemBackgroundCheckedHoveredUndefined: Self = StObject.set(x, "listItemBackgroundCheckedHovered", js.undefined)
      
      @scala.inline
      def setListItemBackgroundCheckedUndefined: Self = StObject.set(x, "listItemBackgroundChecked", js.undefined)
      
      @scala.inline
      def setListItemBackgroundHovered(value: String): Self = StObject.set(x, "listItemBackgroundHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemBackgroundHoveredUndefined: Self = StObject.set(x, "listItemBackgroundHovered", js.undefined)
      
      @scala.inline
      def setListText(value: String): Self = StObject.set(x, "listText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTextColor(value: String): Self = StObject.set(x, "listTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTextColorUndefined: Self = StObject.set(x, "listTextColor", js.undefined)
      
      @scala.inline
      def setListTextUndefined: Self = StObject.set(x, "listText", js.undefined)
      
      @scala.inline
      def setMenuBackground(value: String): Self = StObject.set(x, "menuBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuBackgroundUndefined: Self = StObject.set(x, "menuBackground", js.undefined)
      
      @scala.inline
      def setMenuDivider(value: String): Self = StObject.set(x, "menuDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuDividerUndefined: Self = StObject.set(x, "menuDivider", js.undefined)
      
      @scala.inline
      def setMenuHeader(value: String): Self = StObject.set(x, "menuHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHeaderUndefined: Self = StObject.set(x, "menuHeader", js.undefined)
      
      @scala.inline
      def setMenuIcon(value: String): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconUndefined: Self = StObject.set(x, "menuIcon", js.undefined)
      
      @scala.inline
      def setMenuItemBackgroundChecked(value: String): Self = StObject.set(x, "menuItemBackgroundChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemBackgroundCheckedUndefined: Self = StObject.set(x, "menuItemBackgroundChecked", js.undefined)
      
      @scala.inline
      def setMenuItemBackgroundHovered(value: String): Self = StObject.set(x, "menuItemBackgroundHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemBackgroundHoveredUndefined: Self = StObject.set(x, "menuItemBackgroundHovered", js.undefined)
      
      @scala.inline
      def setMenuItemBackgroundPressed(value: String): Self = StObject.set(x, "menuItemBackgroundPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemBackgroundPressedUndefined: Self = StObject.set(x, "menuItemBackgroundPressed", js.undefined)
      
      @scala.inline
      def setMenuItemText(value: String): Self = StObject.set(x, "menuItemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemTextHovered(value: String): Self = StObject.set(x, "menuItemTextHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemTextHoveredUndefined: Self = StObject.set(x, "menuItemTextHovered", js.undefined)
      
      @scala.inline
      def setMenuItemTextUndefined: Self = StObject.set(x, "menuItemText", js.undefined)
      
      @scala.inline
      def setMessageLink(value: String): Self = StObject.set(x, "messageLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageLinkHovered(value: String): Self = StObject.set(x, "messageLinkHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageLinkHoveredUndefined: Self = StObject.set(x, "messageLinkHovered", js.undefined)
      
      @scala.inline
      def setMessageLinkUndefined: Self = StObject.set(x, "messageLink", js.undefined)
      
      @scala.inline
      def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
      
      @scala.inline
      def setPrimaryButtonBackground(value: String): Self = StObject.set(x, "primaryButtonBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonBackgroundDisabled(value: String): Self = StObject.set(x, "primaryButtonBackgroundDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonBackgroundDisabledUndefined: Self = StObject.set(x, "primaryButtonBackgroundDisabled", js.undefined)
      
      @scala.inline
      def setPrimaryButtonBackgroundHovered(value: String): Self = StObject.set(x, "primaryButtonBackgroundHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonBackgroundHoveredUndefined: Self = StObject.set(x, "primaryButtonBackgroundHovered", js.undefined)
      
      @scala.inline
      def setPrimaryButtonBackgroundPressed(value: String): Self = StObject.set(x, "primaryButtonBackgroundPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonBackgroundPressedUndefined: Self = StObject.set(x, "primaryButtonBackgroundPressed", js.undefined)
      
      @scala.inline
      def setPrimaryButtonBackgroundUndefined: Self = StObject.set(x, "primaryButtonBackground", js.undefined)
      
      @scala.inline
      def setPrimaryButtonBorder(value: String): Self = StObject.set(x, "primaryButtonBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonBorderUndefined: Self = StObject.set(x, "primaryButtonBorder", js.undefined)
      
      @scala.inline
      def setPrimaryButtonText(value: String): Self = StObject.set(x, "primaryButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonTextDisabled(value: String): Self = StObject.set(x, "primaryButtonTextDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonTextDisabledUndefined: Self = StObject.set(x, "primaryButtonTextDisabled", js.undefined)
      
      @scala.inline
      def setPrimaryButtonTextHovered(value: String): Self = StObject.set(x, "primaryButtonTextHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonTextHoveredUndefined: Self = StObject.set(x, "primaryButtonTextHovered", js.undefined)
      
      @scala.inline
      def setPrimaryButtonTextPressed(value: String): Self = StObject.set(x, "primaryButtonTextPressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonTextPressedUndefined: Self = StObject.set(x, "primaryButtonTextPressed", js.undefined)
      
      @scala.inline
      def setPrimaryButtonTextUndefined: Self = StObject.set(x, "primaryButtonText", js.undefined)
      
      @scala.inline
      def setSevereWarningBackground(value: String): Self = StObject.set(x, "severeWarningBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSevereWarningBackgroundUndefined: Self = StObject.set(x, "severeWarningBackground", js.undefined)
      
      @scala.inline
      def setSevereWarningIcon(value: String): Self = StObject.set(x, "severeWarningIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSevereWarningIconUndefined: Self = StObject.set(x, "severeWarningIcon", js.undefined)
      
      @scala.inline
      def setSmallInputBorder(value: String): Self = StObject.set(x, "smallInputBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallInputBorderUndefined: Self = StObject.set(x, "smallInputBorder", js.undefined)
      
      @scala.inline
      def setSuccessBackground(value: String): Self = StObject.set(x, "successBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessBackgroundUndefined: Self = StObject.set(x, "successBackground", js.undefined)
      
      @scala.inline
      def setSuccessIcon(value: String): Self = StObject.set(x, "successIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessIconUndefined: Self = StObject.set(x, "successIcon", js.undefined)
      
      @scala.inline
      def setSuccessText(value: String): Self = StObject.set(x, "successText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessTextUndefined: Self = StObject.set(x, "successText", js.undefined)
      
      @scala.inline
      def setVariantBorder(value: String): Self = StObject.set(x, "variantBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantBorderHovered(value: String): Self = StObject.set(x, "variantBorderHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantBorderHoveredUndefined: Self = StObject.set(x, "variantBorderHovered", js.undefined)
      
      @scala.inline
      def setVariantBorderUndefined: Self = StObject.set(x, "variantBorder", js.undefined)
      
      @scala.inline
      def setWarningBackground(value: String): Self = StObject.set(x, "warningBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningBackgroundUndefined: Self = StObject.set(x, "warningBackground", js.undefined)
      
      @scala.inline
      def setWarningHighlight(value: String): Self = StObject.set(x, "warningHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningHighlightUndefined: Self = StObject.set(x, "warningHighlight", js.undefined)
      
      @scala.inline
      def setWarningIcon(value: String): Self = StObject.set(x, "warningIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningIconUndefined: Self = StObject.set(x, "warningIcon", js.undefined)
      
      @scala.inline
      def setWarningText(value: String): Self = StObject.set(x, "warningText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningTextUndefined: Self = StObject.set(x, "warningText", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@fluentui/theme.@fluentui/theme/lib/types/ISpacing.ISpacing> */
  @js.native
  trait PartialISpacing extends StObject {
    
    var l1: js.UndefOr[String] = js.native
    
    var l2: js.UndefOr[String] = js.native
    
    var m: js.UndefOr[String] = js.native
    
    var s1: js.UndefOr[String] = js.native
    
    var s2: js.UndefOr[String] = js.native
  }
  object PartialISpacing {
    
    @scala.inline
    def apply(): PartialISpacing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialISpacing]
    }
    
    @scala.inline
    implicit class PartialISpacingMutableBuilder[Self <: PartialISpacing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setL1(value: String): Self = StObject.set(x, "l1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL1Undefined: Self = StObject.set(x, "l1", js.undefined)
      
      @scala.inline
      def setL2(value: String): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL2Undefined: Self = StObject.set(x, "l2", js.undefined)
      
      @scala.inline
      def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setS1(value: String): Self = StObject.set(x, "s1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS1Undefined: Self = StObject.set(x, "s1", js.undefined)
      
      @scala.inline
      def setS2(value: String): Self = StObject.set(x, "s2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS2Undefined: Self = StObject.set(x, "s2", js.undefined)
    }
  }
  
  /* Inlined {[ P in @fluentui/theme.@fluentui/theme/lib/types/IScheme.ISchemeNames ]:? @fluentui/theme.@fluentui/theme/lib/types/IScheme.IScheme} */
  @js.native
  trait PinISchemeNamesIScheme extends StObject {
    
    var default: js.UndefOr[IScheme] = js.native
    
    var neutral: js.UndefOr[IScheme] = js.native
    
    var soft: js.UndefOr[IScheme] = js.native
    
    var strong: js.UndefOr[IScheme] = js.native
  }
  object PinISchemeNamesIScheme {
    
    @scala.inline
    def apply(): PinISchemeNamesIScheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinISchemeNamesIScheme]
    }
    
    @scala.inline
    implicit class PinISchemeNamesISchemeMutableBuilder[Self <: PinISchemeNamesIScheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: IScheme): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setNeutral(value: IScheme): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutralUndefined: Self = StObject.set(x, "neutral", js.undefined)
      
      @scala.inline
      def setSoft(value: IScheme): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
      
      @scala.inline
      def setStrong(value: IScheme): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    }
  }
  
  /* Inlined @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet & @fluentui/theme.@fluentui/theme/lib/types/Theme.TokenSetType> */
  @js.native
  trait RecursivePartialColorToke extends StObject {
    
    var background: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var borderColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var contentColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var dividerColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var focusColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var focusInnerColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var highContrast: js.UndefOr[RecursivePartial[js.UndefOr[ColorTokens]] | js.Array[RecursivePartial[_]]] = js.native
    
    var iconColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var linkColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var menuIconColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var opacity: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
    
    var secondaryContentColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  }
  object RecursivePartialColorToke {
    
    @scala.inline
    def apply(): RecursivePartialColorToke = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecursivePartialColorToke]
    }
    
    @scala.inline
    implicit class RecursivePartialColorTokeMutableBuilder[Self <: RecursivePartialColorToke] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBackgroundVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "background", js.Array(value :_*))
      
      @scala.inline
      def setBorderColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
      
      @scala.inline
      def setContentColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentColorUndefined: Self = StObject.set(x, "contentColor", js.undefined)
      
      @scala.inline
      def setContentColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "contentColor", js.Array(value :_*))
      
      @scala.inline
      def setDividerColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerColorUndefined: Self = StObject.set(x, "dividerColor", js.undefined)
      
      @scala.inline
      def setDividerColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "dividerColor", js.Array(value :_*))
      
      @scala.inline
      def setFocusColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "focusColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusColorUndefined: Self = StObject.set(x, "focusColor", js.undefined)
      
      @scala.inline
      def setFocusColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "focusColor", js.Array(value :_*))
      
      @scala.inline
      def setFocusInnerColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "focusInnerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusInnerColorUndefined: Self = StObject.set(x, "focusInnerColor", js.undefined)
      
      @scala.inline
      def setFocusInnerColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "focusInnerColor", js.Array(value :_*))
      
      @scala.inline
      def setHighContrast(value: RecursivePartial[js.UndefOr[ColorTokens]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "highContrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighContrastUndefined: Self = StObject.set(x, "highContrast", js.undefined)
      
      @scala.inline
      def setHighContrastVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "highContrast", js.Array(value :_*))
      
      @scala.inline
      def setIconColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      @scala.inline
      def setIconColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "iconColor", js.Array(value :_*))
      
      @scala.inline
      def setLinkColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkColorUndefined: Self = StObject.set(x, "linkColor", js.undefined)
      
      @scala.inline
      def setLinkColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "linkColor", js.Array(value :_*))
      
      @scala.inline
      def setMenuIconColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "menuIconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconColorUndefined: Self = StObject.set(x, "menuIconColor", js.undefined)
      
      @scala.inline
      def setMenuIconColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "menuIconColor", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpacityVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      @scala.inline
      def setSecondaryContentColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "secondaryContentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryContentColorUndefined: Self = StObject.set(x, "secondaryContentColor", js.undefined)
      
      @scala.inline
      def setSecondaryContentColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "secondaryContentColor", js.Array(value :_*))
    }
  }
  
  /* Inlined @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<@fluentui/theme.@fluentui/theme/lib/types/Theme.Tokens> */
  @js.native
  trait RecursivePartialTokens extends StObject {
    
    var color: js.UndefOr[RecursivePartialbodyColor | js.Array[RecursivePartial[_]]] = js.native
  }
  object RecursivePartialTokens {
    
    @scala.inline
    def apply(): RecursivePartialTokens = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecursivePartialTokens]
    }
    
    @scala.inline
    implicit class RecursivePartialTokensMutableBuilder[Self <: RecursivePartialTokens] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: RecursivePartialbodyColor | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "color", js.Array(value :_*))
    }
  }
  
  /* Inlined @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<{  body :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet & @fluentui/theme.@fluentui/theme/lib/types/Theme.TokenSetType,   brand :@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet & @fluentui/theme.@fluentui/theme/lib/types/Theme.TokenSetType, [key: string] : @fluentui/theme.@fluentui/theme/lib/types/Theme.TokenSetType}> */
  @js.native
  trait RecursivePartialbodyColor extends StObject {
    
    var body: js.UndefOr[RecursivePartialColorToke | js.Array[RecursivePartial[_]]] = js.native
    
    var brand: js.UndefOr[RecursivePartialColorToke | js.Array[RecursivePartial[_]]] = js.native
  }
  object RecursivePartialbodyColor {
    
    @scala.inline
    def apply(): RecursivePartialbodyColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecursivePartialbodyColor]
    }
    
    @scala.inline
    implicit class RecursivePartialbodyColorMutableBuilder[Self <: RecursivePartialbodyColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: RecursivePartialColorToke | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setBodyVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "body", js.Array(value :_*))
      
      @scala.inline
      def setBrand(value: RecursivePartialColorToke | js.Array[RecursivePartial[_]]): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setBrandVarargs(value: RecursivePartial[js.Any]*): Self = StObject.set(x, "brand", js.Array(value :_*))
    }
  }
}
