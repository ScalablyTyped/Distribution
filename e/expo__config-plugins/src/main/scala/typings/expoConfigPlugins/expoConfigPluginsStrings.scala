package typings.expoConfigPlugins

import typings.expoConfigPlugins.errorsMod.PluginErrorCode
import typings.expoConfigPlugins.iosConfigTypesMod.InterfaceOrientation
import typings.expoConfigPlugins.iosConfigTypesMod.InterfaceStyle
import typings.expoConfigPlugins.iosPathsMod.AppleLanguage
import typings.expoConfigPlugins.manifestMod.StringBoolean
import typings.expoConfigPlugins.matchBracketsMod.LeftBracket
import typings.expoConfigPlugins.matchBracketsMod.RightBracket
import typings.expoConfigPlugins.pluginTypesMod.ModPlatform
import typings.expoConfigPlugins.resourcesMod.ResourceKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoConfigPluginsStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait ALWAYS extends StObject
  inline def ALWAYS: ALWAYS = "ALWAYS".asInstanceOf[ALWAYS]
  
  @js.native
  sealed trait Automatic
    extends StObject
       with InterfaceStyle
  inline def Automatic: Automatic = "Automatic".asInstanceOf[Automatic]
  
  @js.native
  sealed trait CONFLICTING_PROVIDER
    extends StObject
       with PluginErrorCode
  inline def CONFLICTING_PROVIDER: CONFLICTING_PROVIDER = "CONFLICTING_PROVIDER".asInstanceOf[CONFLICTING_PROVIDER]
  
  @js.native
  sealed trait Dark
    extends StObject
       with InterfaceStyle
  inline def Dark: Dark = "Dark".asInstanceOf[Dark]
  
  @js.native
  sealed trait Debug extends StObject
  inline def Debug: Debug = "Debug".asInstanceOf[Debug]
  
  @js.native
  sealed trait DotMainApplication extends StObject
  inline def DotMainApplication: DotMainApplication = ".MainApplication".asInstanceOf[DotMainApplication]
  
  @js.native
  sealed trait ERROR_RECOVERY_ONLY extends StObject
  inline def ERROR_RECOVERY_ONLY: ERROR_RECOVERY_ONLY = "ERROR_RECOVERY_ONLY".asInstanceOf[ERROR_RECOVERY_ONLY]
  
  @js.native
  sealed trait INVALID_MOD_ORDER
    extends StObject
       with PluginErrorCode
  inline def INVALID_MOD_ORDER: INVALID_MOD_ORDER = "INVALID_MOD_ORDER".asInstanceOf[INVALID_MOD_ORDER]
  
  @js.native
  sealed trait INVALID_PLUGIN_IMPORT
    extends StObject
       with PluginErrorCode
  inline def INVALID_PLUGIN_IMPORT: INVALID_PLUGIN_IMPORT = "INVALID_PLUGIN_IMPORT".asInstanceOf[INVALID_PLUGIN_IMPORT]
  
  @js.native
  sealed trait INVALID_PLUGIN_TYPE
    extends StObject
       with PluginErrorCode
  inline def INVALID_PLUGIN_TYPE: INVALID_PLUGIN_TYPE = "INVALID_PLUGIN_TYPE".asInstanceOf[INVALID_PLUGIN_TYPE]
  
  @js.native
  sealed trait Leftcurlybracket
    extends StObject
       with LeftBracket
  inline def Leftcurlybracket: Leftcurlybracket = "{".asInstanceOf[Leftcurlybracket]
  
  @js.native
  sealed trait Leftparenthesis
    extends StObject
       with LeftBracket
  inline def Leftparenthesis: Leftparenthesis = "(".asInstanceOf[Leftparenthesis]
  
  @js.native
  sealed trait Light
    extends StObject
       with InterfaceStyle
  inline def Light: Light = "Light".asInstanceOf[Light]
  
  @js.native
  sealed trait MISSING_PROVIDER
    extends StObject
       with PluginErrorCode
  inline def MISSING_PROVIDER: MISSING_PROVIDER = "MISSING_PROVIDER".asInstanceOf[MISSING_PROVIDER]
  
  @js.native
  sealed trait NEVER extends StObject
  inline def NEVER: NEVER = "NEVER".asInstanceOf[NEVER]
  
  @js.native
  sealed trait PBXShellScriptBuildPhase extends StObject
  inline def PBXShellScriptBuildPhase: PBXShellScriptBuildPhase = "PBXShellScriptBuildPhase".asInstanceOf[PBXShellScriptBuildPhase]
  
  @js.native
  sealed trait PLUGIN_NOT_FOUND
    extends StObject
       with PluginErrorCode
  inline def PLUGIN_NOT_FOUND: PLUGIN_NOT_FOUND = "PLUGIN_NOT_FOUND".asInstanceOf[PLUGIN_NOT_FOUND]
  
  @js.native
  sealed trait Release extends StObject
  inline def Release: Release = "Release".asInstanceOf[Release]
  
  @js.native
  sealed trait Rightcurlybracket
    extends StObject
       with RightBracket
  inline def Rightcurlybracket: Rightcurlybracket = "}".asInstanceOf[Rightcurlybracket]
  
  @js.native
  sealed trait Rightparenthesis
    extends StObject
       with RightBracket
  inline def Rightparenthesis: Rightparenthesis = ")".asInstanceOf[Rightparenthesis]
  
  @js.native
  sealed trait `SlashSlash Build integration with EASLinefeedLinefeedimport javaDotnioDotfileDotPathsLinefeedLinefeedandroid LeftcurlybracketLinefeed  signingConfigs LeftcurlybracketLinefeed    release LeftcurlybracketLinefeed      SlashSlash This is necessary to avoid needing the user to define a release signing config manuallyLinefeed      SlashSlash If no release config is definedComma and this is not presentComma build for assembleRelease will crashLinefeed    RightcurlybracketLinefeed  RightcurlybracketLin` extends StObject
  inline def `SlashSlash Build integration with EASLinefeedLinefeedimport javaDotnioDotfileDotPathsLinefeedLinefeedandroid LeftcurlybracketLinefeed  signingConfigs LeftcurlybracketLinefeed    release LeftcurlybracketLinefeed      SlashSlash This is necessary to avoid needing the user to define a release signing config manuallyLinefeed      SlashSlash If no release config is definedComma and this is not presentComma build for assembleRelease will crashLinefeed    RightcurlybracketLinefeed  RightcurlybracketLin`: `SlashSlash Build integration with EASLinefeedLinefeedimport javaDotnioDotfileDotPathsLinefeedLinefeedandroid LeftcurlybracketLinefeed  signingConfigs LeftcurlybracketLinefeed    release LeftcurlybracketLinefeed      SlashSlash This is necessary to avoid needing the user to define a release signing config manuallyLinefeed      SlashSlash If no release config is definedComma and this is not presentComma build for assembleRelease will crashLinefeed    RightcurlybracketLinefeed  RightcurlybracketLin` = ("// Build integration with EAS\n\nimport java.nio.file.Paths\n\nandroid {\n  signingConfigs {\n    release {\n      // This is necessary to avoid needing the user to define a release signing config manually\n      // If no release config is defined, and this is not present, build for assembleRelease will crash\n    }\n  }\n\n  buildTypes {\n    release {\n      // This is necessary to avoid needing the user to define a release build type manually\n    }\n  }\n}\n\ndef isEasBuildConfigured = false\n\ntasks.whenTaskAdded {\n  def debug = gradle.startParameter.taskNames.any { it.toLowerCase().contains('debug') }\n\n  if (debug) {\n    return\n  }\n\n  // We only need to configure EAS build once\n  if (isEasBuildConfigured) {\n    return\n  }\n\n  isEasBuildConfigured = true;\n\n  android.signingConfigs.release {\n    def credentialsJson = rootProject.file(\"../credentials.json\");\n\n    if (credentialsJson.exists()) {\n      if (storeFile && !System.getenv(\"EAS_BUILD\")) {\n        println(\"Path to release keystore file is already set, ignoring 'credentials.json'\")\n      } else {\n        try {\n          def credentials = new groovy.json.JsonSlurper().parse(credentialsJson)\n          def keystorePath = Paths.get(credentials.android.keystore.keystorePath);\n          def storeFilePath = keystorePath.isAbsolute()\n            ? keystorePath\n            : rootProject.file(\"..\").toPath().resolve(keystorePath);\n\n          storeFile storeFilePath.toFile()\n          storePassword credentials.android.keystore.keystorePassword\n          keyAlias credentials.android.keystore.keyAlias\n          if (credentials.android.keystore.containsKey(\"keyPassword\")) {\n            keyPassword credentials.android.keystore.keyPassword\n          } else {\n            // key password is required by Gradle, but PKCS keystores don't have one\n            // using the keystore password seems to satisfy the requirement\n            keyPassword credentials.android.keystore.keystorePassword\n          }\n        } catch (Exception e) {\n          println(\"An error occurred while parsing 'credentials.json': \" + e.message)\n        }\n      }\n    } else {\n      if (storeFile == null) {\n        println(\"Couldn't find a 'credentials.json' file, skipping release keystore configuration\")\n      }\n    }\n  }\n\n  android.buildTypes.release {\n    signingConfig android.signingConfigs.release\n  }\n}\n").asInstanceOf[`SlashSlash Build integration with EASLinefeedLinefeedimport javaDotnioDotfileDotPathsLinefeedLinefeedandroid LeftcurlybracketLinefeed  signingConfigs LeftcurlybracketLinefeed    release LeftcurlybracketLinefeed      SlashSlash This is necessary to avoid needing the user to define a release signing config manuallyLinefeed      SlashSlash If no release config is definedComma and this is not presentComma build for assembleRelease will crashLinefeed    RightcurlybracketLinefeed  RightcurlybracketLin`]
  
  @js.native
  sealed trait SplashScreen extends StObject
  inline def SplashScreen: SplashScreen = "SplashScreen".asInstanceOf[SplashScreen]
  
  @js.native
  sealed trait UIInterfaceOrientationLandscapeLeft
    extends StObject
       with InterfaceOrientation
  inline def UIInterfaceOrientationLandscapeLeft: UIInterfaceOrientationLandscapeLeft = "UIInterfaceOrientationLandscapeLeft".asInstanceOf[UIInterfaceOrientationLandscapeLeft]
  
  @js.native
  sealed trait UIInterfaceOrientationLandscapeRight
    extends StObject
       with InterfaceOrientation
  inline def UIInterfaceOrientationLandscapeRight: UIInterfaceOrientationLandscapeRight = "UIInterfaceOrientationLandscapeRight".asInstanceOf[UIInterfaceOrientationLandscapeRight]
  
  @js.native
  sealed trait UIInterfaceOrientationPortrait
    extends StObject
       with InterfaceOrientation
  inline def UIInterfaceOrientationPortrait: UIInterfaceOrientationPortrait = "UIInterfaceOrientationPortrait".asInstanceOf[UIInterfaceOrientationPortrait]
  
  @js.native
  sealed trait UIInterfaceOrientationPortraitUpsideDown
    extends StObject
       with InterfaceOrientation
  inline def UIInterfaceOrientationPortraitUpsideDown: UIInterfaceOrientationPortraitUpsideDown = "UIInterfaceOrientationPortraitUpsideDown".asInstanceOf[UIInterfaceOrientationPortraitUpsideDown]
  
  @js.native
  sealed trait adjustPan extends StObject
  inline def adjustPan: adjustPan = "adjustPan".asInstanceOf[adjustPan]
  
  @js.native
  sealed trait adjustResize extends StObject
  inline def adjustResize: adjustResize = "adjustResize".asInstanceOf[adjustResize]
  
  @js.native
  sealed trait adjustUnspecified extends StObject
  inline def adjustUnspecified: adjustUnspecified = "adjustUnspecified".asInstanceOf[adjustUnspecified]
  
  @js.native
  sealed trait android
    extends StObject
       with ModPlatform
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait androidDotintentDotactionDotVIEW extends StObject
  inline def androidDotintentDotactionDotVIEW: androidDotintentDotactionDotVIEW = "android.intent.action.VIEW".asInstanceOf[androidDotintentDotactionDotVIEW]
  
  @js.native
  sealed trait automatic_ extends StObject
  inline def automatic_ : automatic_ = "automatic".asInstanceOf[automatic_]
  
  @js.native
  sealed trait colors extends StObject
  inline def colors: colors = "colors".asInstanceOf[colors]
  
  @js.native
  sealed trait comment extends StObject
  inline def comment: comment = "comment".asInstanceOf[comment]
  
  @js.native
  sealed trait `dark-content` extends StObject
  inline def `dark-content`: `dark-content` = "dark-content".asInstanceOf[`dark-content`]
  
  @js.native
  sealed trait dark_ extends StObject
  inline def dark_ : dark_ = "dark".asInstanceOf[dark_]
  
  @js.native
  sealed trait drawable
    extends StObject
       with ResourceKind
  inline def drawable: drawable = "drawable".asInstanceOf[drawable]
  
  @js.native
  sealed trait empty extends StObject
  inline def empty: empty = "empty".asInstanceOf[empty]
  
  @js.native
  sealed trait `false`
    extends StObject
       with StringBoolean
  inline def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait groovy extends StObject
  inline def groovy: groovy = "groovy".asInstanceOf[groovy]
  
  @js.native
  sealed trait head extends StObject
  inline def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait ios
    extends StObject
       with ModPlatform
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait java_ extends StObject
  inline def java_ : java_ = "java".asInstanceOf[java_]
  
  @js.native
  sealed trait kt extends StObject
  inline def kt: kt = "kt".asInstanceOf[kt]
  
  @js.native
  sealed trait landscape extends StObject
  inline def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait `light-content` extends StObject
  inline def `light-content`: `light-content` = "light-content".asInstanceOf[`light-content`]
  
  @js.native
  sealed trait light_ extends StObject
  inline def light_ : light_ = "light".asInstanceOf[light_]
  
  @js.native
  sealed trait methodName extends StObject
  inline def methodName: methodName = "methodName".asInstanceOf[methodName]
  
  @js.native
  sealed trait objc
    extends StObject
       with AppleLanguage
  inline def objc: objc = "objc".asInstanceOf[objc]
  
  @js.native
  sealed trait objcpp
    extends StObject
       with AppleLanguage
  inline def objcpp: objcpp = "objcpp".asInstanceOf[objcpp]
  
  @js.native
  sealed trait portrait extends StObject
  inline def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait property extends StObject
  inline def property: property = "property".asInstanceOf[property]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait resource extends StObject
  inline def resource: resource = "resource".asInstanceOf[resource]
  
  @js.native
  sealed trait saveToInternal extends StObject
  inline def saveToInternal: saveToInternal = "saveToInternal".asInstanceOf[saveToInternal]
  
  @js.native
  sealed trait signature extends StObject
  inline def signature: signature = "signature".asInstanceOf[signature]
  
  @js.native
  sealed trait skipEmptyMod extends StObject
  inline def skipEmptyMod: skipEmptyMod = "skipEmptyMod".asInstanceOf[skipEmptyMod]
  
  @js.native
  sealed trait stateAlwaysHidden extends StObject
  inline def stateAlwaysHidden: stateAlwaysHidden = "stateAlwaysHidden".asInstanceOf[stateAlwaysHidden]
  
  @js.native
  sealed trait stateAlwaysVisible extends StObject
  inline def stateAlwaysVisible: stateAlwaysVisible = "stateAlwaysVisible".asInstanceOf[stateAlwaysVisible]
  
  @js.native
  sealed trait stateHidden extends StObject
  inline def stateHidden: stateHidden = "stateHidden".asInstanceOf[stateHidden]
  
  @js.native
  sealed trait stateUnchanged extends StObject
  inline def stateUnchanged: stateUnchanged = "stateUnchanged".asInstanceOf[stateUnchanged]
  
  @js.native
  sealed trait stateUnspecified extends StObject
  inline def stateUnspecified: stateUnspecified = "stateUnspecified".asInstanceOf[stateUnspecified]
  
  @js.native
  sealed trait stateVisible extends StObject
  inline def stateVisible: stateVisible = "stateVisible".asInstanceOf[stateVisible]
  
  @js.native
  sealed trait strings extends StObject
  inline def strings: strings = "strings".asInstanceOf[strings]
  
  @js.native
  sealed trait styles extends StObject
  inline def styles: styles = "styles".asInstanceOf[styles]
  
  @js.native
  sealed trait swift
    extends StObject
       with AppleLanguage
  inline def swift: swift = "swift".asInstanceOf[swift]
  
  @js.native
  sealed trait tail extends StObject
  inline def tail: tail = "tail".asInstanceOf[tail]
  
  @js.native
  sealed trait tailBeforeLastReturn extends StObject
  inline def tailBeforeLastReturn: tailBeforeLastReturn = "tailBeforeLastReturn".asInstanceOf[tailBeforeLastReturn]
  
  @js.native
  sealed trait `true`
    extends StObject
       with StringBoolean
  inline def `true`: `true` = "true".asInstanceOf[`true`]
  
  @js.native
  sealed trait value extends StObject
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait values
    extends StObject
       with ResourceKind
  inline def values: values = "values".asInstanceOf[values]
  
  @js.native
  sealed trait `values-night`
    extends StObject
       with ResourceKind
  inline def `values-night`: `values-night` = "values-night".asInstanceOf[`values-night`]
  
  @js.native
  sealed trait `values-night-v23`
    extends StObject
       with ResourceKind
  inline def `values-night-v23`: `values-night-v23` = "values-night-v23".asInstanceOf[`values-night-v23`]
  
  @js.native
  sealed trait `values-v23`
    extends StObject
       with ResourceKind
  inline def `values-v23`: `values-v23` = "values-v23".asInstanceOf[`values-v23`]
}
