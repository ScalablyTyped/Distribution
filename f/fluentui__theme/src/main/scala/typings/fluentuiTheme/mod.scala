package typings.fluentuiTheme

import typings.fluentuiTheme.ianimationstylesMod.IAnimationStyles
import typings.fluentuiTheme.ianimationstylesMod.IAnimationVariables
import typings.fluentuiTheme.ieffectsMod.IEffects
import typings.fluentuiTheme.ifontstylesMod.IFontStyles
import typings.fluentuiTheme.ipaletteMod.IPalette
import typings.fluentuiTheme.ispacingMod.ISpacing
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.fluentuiTheme.themeMod.PartialTheme
import typings.fluentuiTheme.themeMod.Theme
import typings.uifabricMergeStyles.irawstylebaseMod.IFontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/theme", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val AnimationStyles: IAnimationStyles = js.native
  
  val AnimationVariables: IAnimationVariables = js.native
  
  val DefaultEffects: IEffects = js.native
  
  val DefaultFontStyles: IFontStyles = js.native
  
  val DefaultPalette: IPalette = js.native
  
  val DefaultSpacing: ISpacing = js.native
  
  val FluentTheme: ITheme = js.native
  
  def createFontStyles(): IFontStyles = js.native
  def createFontStyles(localeCode: String): IFontStyles = js.native
  
  def createTheme(): Theme = js.native
  def createTheme(theme: js.UndefOr[scala.Nothing], depComments: Boolean): Theme = js.native
  def createTheme(theme: PartialTheme): Theme = js.native
  def createTheme(theme: PartialTheme, depComments: Boolean): Theme = js.native
  
  def mergeThemes(theme: Theme): Theme = js.native
  def mergeThemes(theme: Theme, partialTheme: PartialTheme): Theme = js.native
  
  def registerDefaultFontFaces(baseUrl: String): Unit = js.native
  
  @js.native
  object CommunicationColors extends js.Object {
    
    val primary: /* "#0078d4" */ String = js.native
    
    val shade10: /* "#106ebe" */ String = js.native
    
    val shade20: /* "#005a9e" */ String = js.native
    
    val shade30: /* "#004578" */ String = js.native
    
    val tint10: /* "#2b88d8" */ String = js.native
    
    val tint20: /* "#c7e0f4" */ String = js.native
    
    val tint30: /* "#deecf9" */ String = js.native
    
    val tint40: /* "#eff6fc" */ String = js.native
  }
  
  @js.native
  object Depths extends js.Object {
    
    val depth0: /* "0 0 0 0 transparent" */ String = js.native
    
    val depth16: /* "0 6.4px 14.4px 0 rgba(0, 0, 0, 0.132), 0 1.2px 3.6px 0 rgba(0, 0, 0, 0.108)" */ String = js.native
    
    val depth4: /* "0 1.6px 3.6px 0 rgba(0, 0, 0, 0.132), 0 0.3px 0.9px 0 rgba(0, 0, 0, 0.108)" */ String = js.native
    
    val depth64: /* "0 25.6px 57.6px 0 rgba(0, 0, 0, 0.22), 0 4.8px 14.4px 0 rgba(0, 0, 0, 0.18)" */ String = js.native
    
    val depth8: /* "0 3.2px 7.2px 0 rgba(0, 0, 0, 0.132), 0 0.6px 1.8px 0 rgba(0, 0, 0, 0.108)" */ String = js.native
  }
  
  @js.native
  object FontSizes extends js.Object {
    
    val icon: String = js.native
    
    val large: String = js.native
    
    val medium: String = js.native
    
    val mediumPlus: String = js.native
    
    val mega: String = js.native
    
    val mini: String = js.native
    
    val size10: /* "10px" */ String = js.native
    
    val size12: /* "12px" */ String = js.native
    
    val size14: /* "14px" */ String = js.native
    
    val size16: /* "16px" */ String = js.native
    
    val size18: /* "18px" */ String = js.native
    
    val size20: /* "20px" */ String = js.native
    
    val size24: /* "24px" */ String = js.native
    
    val size28: /* "28px" */ String = js.native
    
    val size32: /* "32px" */ String = js.native
    
    val size42: /* "42px" */ String = js.native
    
    val size68: /* "68px" */ String = js.native
    
    val small: String = js.native
    
    val smallPlus: String = js.native
    
    val superLarge: String = js.native
    
    val xLarge: String = js.native
    
    val xLargePlus: String = js.native
    
    val xSmall: String = js.native
    
    val xxLarge: String = js.native
    
    val xxLargePlus: String = js.native
  }
  
  @js.native
  object FontWeights extends js.Object {
    
    val bold: IFontWeight = js.native
    
    val light: IFontWeight = js.native
    
    val regular: IFontWeight = js.native
    
    val semibold: IFontWeight = js.native
    
    val semilight: IFontWeight = js.native
  }
  
  @js.native
  object IconFontSizes extends js.Object {
    
    val large: String = js.native
    
    val medium: String = js.native
    
    val small: String = js.native
    
    val xSmall: String = js.native
  }
  
  @js.native
  object LocalizedFontFamilies extends js.Object {
    
    val Arabic: String = js.native
    
    val Armenian: String = js.native
    
    val ChineseSimplified: /* "'Microsoft Yahei UI', Verdana, Simsun" */ String = js.native
    
    val ChineseTraditional: /* "'Microsoft Jhenghei UI', Pmingliu" */ String = js.native
    
    val Cyrillic: String = js.native
    
    val EastEuropean: String = js.native
    
    val Georgian: String = js.native
    
    val Greek: String = js.native
    
    val Hebrew: String = js.native
    
    val Hindi: /* "'Nirmala UI'" */ String = js.native
    
    val Japanese: /* "'Yu Gothic UI', 'Meiryo UI', Meiryo, 'MS Pgothic', Osaka" */ String = js.native
    
    val Korean: /* "'Malgun Gothic', Gulim" */ String = js.native
    
    val Selawik: String = js.native
    
    val Thai: /* "'Leelawadee UI Web', 'Kmer UI'" */ String = js.native
    
    val Vietnamese: String = js.native
    
    val WestEuropean: String = js.native
  }
  
  @js.native
  object LocalizedFontNames extends js.Object {
    
    val Arabic: /* "Segoe UI Web (Arabic)" */ String = js.native
    
    val Armenian: /* "Segoe UI Web (Armenian)" */ String = js.native
    
    val Cyrillic: /* "Segoe UI Web (Cyrillic)" */ String = js.native
    
    val EastEuropean: /* "Segoe UI Web (East European)" */ String = js.native
    
    val Georgian: /* "Segoe UI Web (Georgian)" */ String = js.native
    
    val Greek: /* "Segoe UI Web (Greek)" */ String = js.native
    
    val Hebrew: /* "Segoe UI Web (Hebrew)" */ String = js.native
    
    val Selawik: /* "Selawik Web" */ String = js.native
    
    val Thai: /* "Leelawadee UI Web" */ String = js.native
    
    val Vietnamese: /* "Segoe UI Web (Vietnamese)" */ String = js.native
    
    val WestEuropean: /* "Segoe UI Web (West European)" */ String = js.native
  }
  
  @js.native
  object MotionAnimations extends js.Object {
    
    val fadeIn: String = js.native
    
    val fadeOut: String = js.native
    
    val scaleDownIn: String = js.native
    
    val scaleDownOut: String = js.native
    
    val slideDownIn: String = js.native
    
    val slideDownOut: String = js.native
    
    val slideLeftIn: String = js.native
    
    val slideLeftOut: String = js.native
    
    val slideRightIn: String = js.native
    
    val slideRightOut: String = js.native
    
    val slideUpIn: String = js.native
    
    val slideUpOut: String = js.native
  }
  
  @js.native
  object MotionDurations extends js.Object {
    
    val duration1: /* "100ms" */ String = js.native
    
    val duration2: /* "200ms" */ String = js.native
    
    val duration3: /* "300ms" */ String = js.native
    
    val duration4: /* "400ms" */ String = js.native
  }
  
  @js.native
  object MotionTimings extends js.Object {
    
    val accelerate: /* "cubic-bezier(0.9, 0.1, 1, 0.2)" */ String = js.native
    
    val decelerate: /* "cubic-bezier(0.1, 0.9, 0.2, 1)" */ String = js.native
    
    val linear: /* "cubic-bezier(0, 0, 1, 1)" */ String = js.native
    
    val standard: /* "cubic-bezier(0.8, 0, 0.2, 1)" */ String = js.native
  }
  
  @js.native
  object NeutralColors extends js.Object {
    
    val black: /* "#000000" */ String = js.native
    
    val gray10: /* "#faf9f8" */ String = js.native
    
    val gray100: /* "#979593" */ String = js.native
    
    val gray110: /* "#8a8886" */ String = js.native
    
    val gray120: /* "#797775" */ String = js.native
    
    val gray130: /* "#605e5c" */ String = js.native
    
    val gray140: /* "#484644" */ String = js.native
    
    val gray150: /* "#3b3a39" */ String = js.native
    
    val gray160: /* "#323130" */ String = js.native
    
    val gray170: /* "#292827" */ String = js.native
    
    val gray180: /* "#252423" */ String = js.native
    
    val gray190: /* "#201f1e" */ String = js.native
    
    val gray20: /* "#f3f2f1" */ String = js.native
    
    val gray200: /* "#1b1a19" */ String = js.native
    
    val gray210: /* "#161514" */ String = js.native
    
    val gray220: /* "#11100f" */ String = js.native
    
    val gray30: /* "#edebe9" */ String = js.native
    
    val gray40: /* "#e1dfdd" */ String = js.native
    
    val gray50: /* "#d2d0ce" */ String = js.native
    
    val gray60: /* "#c8c6c4" */ String = js.native
    
    val gray70: /* "#bebbb8" */ String = js.native
    
    val gray80: /* "#b3b0ad" */ String = js.native
    
    val gray90: /* "#a19f9d" */ String = js.native
    
    val white: /* "#ffffff" */ String = js.native
  }
  
  @js.native
  object SharedColors extends js.Object {
    
    val blue10: /* "#4f6bed" */ String = js.native
    
    val blueMagenta10: /* "#8378de" */ String = js.native
    
    val blueMagenta20: /* "#8764b8" */ String = js.native
    
    val blueMagenta30: /* "#5c2e91" */ String = js.native
    
    val blueMagenta40: /* "#373277" */ String = js.native
    
    val cyan10: /* "#00b7c3" */ String = js.native
    
    val cyan20: /* "#038387" */ String = js.native
    
    val cyan30: /* "#005b70" */ String = js.native
    
    val cyan40: /* "#005e50" */ String = js.native
    
    val cyanBlue10: /* "#0078d4" */ String = js.native
    
    val cyanBlue20: /* "#004e8c" */ String = js.native
    
    val gray10: /* "#a0aeb2" */ String = js.native
    
    val gray20: /* "#69797e" */ String = js.native
    
    val gray30: /* "#7a7574" */ String = js.native
    
    val gray40: /* "#393939" */ String = js.native
    
    val green10: /* "#498205" */ String = js.native
    
    val green20: /* "#0b6a0b" */ String = js.native
    
    val greenCyan10: /* "#00ad56" */ String = js.native
    
    val magenta10: /* "#c239b3" */ String = js.native
    
    val magenta20: /* "#881798" */ String = js.native
    
    val magentaPink10: /* "#e3008c" */ String = js.native
    
    val magentaPink20: /* "#9b0062" */ String = js.native
    
    val orange10: /* "#ffaa44" */ String = js.native
    
    val orange20: /* "#ca5010" */ String = js.native
    
    val orange30: /* "#8e562e" */ String = js.native
    
    val orangeYellow10: /* "#c19c00" */ String = js.native
    
    val orangeYellow20: /* "#986f0b" */ String = js.native
    
    val pinkRed10: /* "#750b1c" */ String = js.native
    
    val red10: /* "#d13438" */ String = js.native
    
    val red20: /* "#a4262c" */ String = js.native
    
    val redOrange10: /* "#da3b01" */ String = js.native
    
    val redOrange20: /* "#603d30" */ String = js.native
    
    val yellow10: /* "#fce100" */ String = js.native
    
    val yellowGreen10: /* "#8cbd18" */ String = js.native
  }
}
