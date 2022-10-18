package typings.fluentuiStyleUtilities

import typings.fluentuiMergeStyles.libIrawstyleMod.IRawStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesCommonStylesMod {
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "EdgeChromiumHighContrastSelector")
  @js.native
  val EdgeChromiumHighContrastSelector: /* "@media screen and (-ms-high-contrast: active), screen and (forced-colors: active)" */ String = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "HighContrastSelector")
  @js.native
  val HighContrastSelector: /* "@media screen and (-ms-high-contrast: active), screen and (forced-colors: active)" */ String = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "HighContrastSelectorBlack")
  @js.native
  val HighContrastSelectorBlack: /* "@media screen and (-ms-high-contrast: white-on-black), screen and (forced-colors: active) and (prefers-color-scheme: dark)" */ String = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "HighContrastSelectorWhite")
  @js.native
  val HighContrastSelectorWhite: /* "@media screen and (-ms-high-contrast: black-on-white), screen and (forced-colors: active) and (prefers-color-scheme: light)" */ String = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMaxLarge")
  @js.native
  val ScreenWidthMaxLarge: Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMaxMedium")
  @js.native
  val ScreenWidthMaxMedium: Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMaxSmall")
  @js.native
  val ScreenWidthMaxSmall: Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMaxXLarge")
  @js.native
  val ScreenWidthMaxXLarge: Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMaxXXLarge")
  @js.native
  val ScreenWidthMaxXXLarge: Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMinLarge")
  @js.native
  val ScreenWidthMinLarge: /* 640 */ Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMinMedium")
  @js.native
  val ScreenWidthMinMedium: /* 480 */ Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMinSmall")
  @js.native
  val ScreenWidthMinSmall: /* 320 */ Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMinUhfMobile")
  @js.native
  val ScreenWidthMinUhfMobile: /* 768 */ Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMinXLarge")
  @js.native
  val ScreenWidthMinXLarge: /* 1024 */ Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMinXXLarge")
  @js.native
  val ScreenWidthMinXXLarge: /* 1366 */ Double = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/CommonStyles", "ScreenWidthMinXXXLarge")
  @js.native
  val ScreenWidthMinXXXLarge: /* 1920 */ Double = js.native
  
  inline def getEdgeChromiumNoHighContrastAdjustSelector(): typings.fluentuiStyleUtilities.anon.EdgeChromiumHighContrastSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeChromiumNoHighContrastAdjustSelector")().asInstanceOf[typings.fluentuiStyleUtilities.anon.EdgeChromiumHighContrastSelector]
  
  inline def getHighContrastNoAdjustStyle(): IRawStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("getHighContrastNoAdjustStyle")().asInstanceOf[IRawStyle]
  
  inline def getScreenSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenSelector")().asInstanceOf[String]
  inline def getScreenSelector(min: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenSelector")(min.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getScreenSelector(min: Double, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getScreenSelector")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getScreenSelector(min: Unit, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getScreenSelector")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
}
