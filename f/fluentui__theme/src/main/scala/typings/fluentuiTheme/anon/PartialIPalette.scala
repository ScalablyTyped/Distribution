package typings.fluentuiTheme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@fluentui/theme.@fluentui/theme/lib/types.IPalette> */
@js.native
trait PartialIPalette extends js.Object {
  
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
  implicit class PartialIPaletteOps[Self <: PartialIPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccent(value: String): Self = this.set("accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccent: Self = this.set("accent", js.undefined)
    
    @scala.inline
    def setBlack(value: String): Self = this.set("black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlack: Self = this.set("black", js.undefined)
    
    @scala.inline
    def setBlackTranslucent40(value: String): Self = this.set("blackTranslucent40", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackTranslucent40: Self = this.set("blackTranslucent40", js.undefined)
    
    @scala.inline
    def setBlue(value: String): Self = this.set("blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlue: Self = this.set("blue", js.undefined)
    
    @scala.inline
    def setBlueDark(value: String): Self = this.set("blueDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlueDark: Self = this.set("blueDark", js.undefined)
    
    @scala.inline
    def setBlueLight(value: String): Self = this.set("blueLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlueLight: Self = this.set("blueLight", js.undefined)
    
    @scala.inline
    def setBlueMid(value: String): Self = this.set("blueMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlueMid: Self = this.set("blueMid", js.undefined)
    
    @scala.inline
    def setGreen(value: String): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    
    @scala.inline
    def setGreenDark(value: String): Self = this.set("greenDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenDark: Self = this.set("greenDark", js.undefined)
    
    @scala.inline
    def setGreenLight(value: String): Self = this.set("greenLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenLight: Self = this.set("greenLight", js.undefined)
    
    @scala.inline
    def setMagenta(value: String): Self = this.set("magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagenta: Self = this.set("magenta", js.undefined)
    
    @scala.inline
    def setMagentaDark(value: String): Self = this.set("magentaDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagentaDark: Self = this.set("magentaDark", js.undefined)
    
    @scala.inline
    def setMagentaLight(value: String): Self = this.set("magentaLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagentaLight: Self = this.set("magentaLight", js.undefined)
    
    @scala.inline
    def setNeutralDark(value: String): Self = this.set("neutralDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralDark: Self = this.set("neutralDark", js.undefined)
    
    @scala.inline
    def setNeutralLight(value: String): Self = this.set("neutralLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralLight: Self = this.set("neutralLight", js.undefined)
    
    @scala.inline
    def setNeutralLighter(value: String): Self = this.set("neutralLighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralLighter: Self = this.set("neutralLighter", js.undefined)
    
    @scala.inline
    def setNeutralLighterAlt(value: String): Self = this.set("neutralLighterAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralLighterAlt: Self = this.set("neutralLighterAlt", js.undefined)
    
    @scala.inline
    def setNeutralPrimary(value: String): Self = this.set("neutralPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralPrimary: Self = this.set("neutralPrimary", js.undefined)
    
    @scala.inline
    def setNeutralPrimaryAlt(value: String): Self = this.set("neutralPrimaryAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralPrimaryAlt: Self = this.set("neutralPrimaryAlt", js.undefined)
    
    @scala.inline
    def setNeutralQuaternary(value: String): Self = this.set("neutralQuaternary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralQuaternary: Self = this.set("neutralQuaternary", js.undefined)
    
    @scala.inline
    def setNeutralQuaternaryAlt(value: String): Self = this.set("neutralQuaternaryAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralQuaternaryAlt: Self = this.set("neutralQuaternaryAlt", js.undefined)
    
    @scala.inline
    def setNeutralSecondary(value: String): Self = this.set("neutralSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralSecondary: Self = this.set("neutralSecondary", js.undefined)
    
    @scala.inline
    def setNeutralSecondaryAlt(value: String): Self = this.set("neutralSecondaryAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralSecondaryAlt: Self = this.set("neutralSecondaryAlt", js.undefined)
    
    @scala.inline
    def setNeutralTertiary(value: String): Self = this.set("neutralTertiary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralTertiary: Self = this.set("neutralTertiary", js.undefined)
    
    @scala.inline
    def setNeutralTertiaryAlt(value: String): Self = this.set("neutralTertiaryAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralTertiaryAlt: Self = this.set("neutralTertiaryAlt", js.undefined)
    
    @scala.inline
    def setOrange(value: String): Self = this.set("orange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrange: Self = this.set("orange", js.undefined)
    
    @scala.inline
    def setOrangeLight(value: String): Self = this.set("orangeLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrangeLight: Self = this.set("orangeLight", js.undefined)
    
    @scala.inline
    def setOrangeLighter(value: String): Self = this.set("orangeLighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrangeLighter: Self = this.set("orangeLighter", js.undefined)
    
    @scala.inline
    def setPurple(value: String): Self = this.set("purple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurple: Self = this.set("purple", js.undefined)
    
    @scala.inline
    def setPurpleDark(value: String): Self = this.set("purpleDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurpleDark: Self = this.set("purpleDark", js.undefined)
    
    @scala.inline
    def setPurpleLight(value: String): Self = this.set("purpleLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurpleLight: Self = this.set("purpleLight", js.undefined)
    
    @scala.inline
    def setRed(value: String): Self = this.set("red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
    
    @scala.inline
    def setRedDark(value: String): Self = this.set("redDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedDark: Self = this.set("redDark", js.undefined)
    
    @scala.inline
    def setTeal(value: String): Self = this.set("teal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeal: Self = this.set("teal", js.undefined)
    
    @scala.inline
    def setTealDark(value: String): Self = this.set("tealDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTealDark: Self = this.set("tealDark", js.undefined)
    
    @scala.inline
    def setTealLight(value: String): Self = this.set("tealLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTealLight: Self = this.set("tealLight", js.undefined)
    
    @scala.inline
    def setThemeDark(value: String): Self = this.set("themeDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeDark: Self = this.set("themeDark", js.undefined)
    
    @scala.inline
    def setThemeDarkAlt(value: String): Self = this.set("themeDarkAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeDarkAlt: Self = this.set("themeDarkAlt", js.undefined)
    
    @scala.inline
    def setThemeDarker(value: String): Self = this.set("themeDarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeDarker: Self = this.set("themeDarker", js.undefined)
    
    @scala.inline
    def setThemeLight(value: String): Self = this.set("themeLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeLight: Self = this.set("themeLight", js.undefined)
    
    @scala.inline
    def setThemeLighter(value: String): Self = this.set("themeLighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeLighter: Self = this.set("themeLighter", js.undefined)
    
    @scala.inline
    def setThemeLighterAlt(value: String): Self = this.set("themeLighterAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeLighterAlt: Self = this.set("themeLighterAlt", js.undefined)
    
    @scala.inline
    def setThemePrimary(value: String): Self = this.set("themePrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemePrimary: Self = this.set("themePrimary", js.undefined)
    
    @scala.inline
    def setThemeSecondary(value: String): Self = this.set("themeSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeSecondary: Self = this.set("themeSecondary", js.undefined)
    
    @scala.inline
    def setThemeTertiary(value: String): Self = this.set("themeTertiary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeTertiary: Self = this.set("themeTertiary", js.undefined)
    
    @scala.inline
    def setWhite(value: String): Self = this.set("white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhite: Self = this.set("white", js.undefined)
    
    @scala.inline
    def setWhiteTranslucent40(value: String): Self = this.set("whiteTranslucent40", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteTranslucent40: Self = this.set("whiteTranslucent40", js.undefined)
    
    @scala.inline
    def setYellow(value: String): Self = this.set("yellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYellow: Self = this.set("yellow", js.undefined)
    
    @scala.inline
    def setYellowDark(value: String): Self = this.set("yellowDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYellowDark: Self = this.set("yellowDark", js.undefined)
    
    @scala.inline
    def setYellowLight(value: String): Self = this.set("yellowLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYellowLight: Self = this.set("yellowLight", js.undefined)
  }
}
