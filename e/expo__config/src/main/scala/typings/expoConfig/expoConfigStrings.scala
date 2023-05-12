package typings.expoConfig

import typings.expoConfig.buildConfigDottypesMod.ConfigErrorCode
import typings.expoConfig.buildConfigDottypesMod.HookType
import typings.expoConfig.buildConfigDottypesMod.Platform
import typings.expoConfig.buildConfigDottypesMod.ProjectTarget
import typings.expoConfig.buildGetUserStateMod.ConnectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoConfigStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `Access-Token-Authentication`
    extends StObject
       with ConnectionType
  inline def `Access-Token-Authentication`: `Access-Token-Authentication` = "Access-Token-Authentication".asInstanceOf[`Access-Token-Authentication`]
  
  @js.native
  sealed trait DEPRECATED
    extends StObject
       with ConfigErrorCode
  inline def DEPRECATED: DEPRECATED = "DEPRECATED".asInstanceOf[DEPRECATED]
  
  @js.native
  sealed trait INVALID_CONFIG
    extends StObject
       with ConfigErrorCode
  inline def INVALID_CONFIG: INVALID_CONFIG = "INVALID_CONFIG".asInstanceOf[INVALID_CONFIG]
  
  @js.native
  sealed trait INVALID_FORMAT
    extends StObject
       with ConfigErrorCode
  inline def INVALID_FORMAT: INVALID_FORMAT = "INVALID_FORMAT".asInstanceOf[INVALID_FORMAT]
  
  @js.native
  sealed trait INVALID_MODE
    extends StObject
       with ConfigErrorCode
  inline def INVALID_MODE: INVALID_MODE = "INVALID_MODE".asInstanceOf[INVALID_MODE]
  
  @js.native
  sealed trait INVALID_PLUGIN
    extends StObject
       with ConfigErrorCode
  inline def INVALID_PLUGIN: INVALID_PLUGIN = "INVALID_PLUGIN".asInstanceOf[INVALID_PLUGIN]
  
  @js.native
  sealed trait MODULE_NOT_FOUND
    extends StObject
       with ConfigErrorCode
  inline def MODULE_NOT_FOUND: MODULE_NOT_FOUND = "MODULE_NOT_FOUND".asInstanceOf[MODULE_NOT_FOUND]
  
  @js.native
  sealed trait NOT_OBJECT
    extends StObject
       with ConfigErrorCode
  inline def NOT_OBJECT: NOT_OBJECT = "NOT_OBJECT".asInstanceOf[NOT_OBJECT]
  
  @js.native
  sealed trait NO_APP_JSON
    extends StObject
       with ConfigErrorCode
  inline def NO_APP_JSON: NO_APP_JSON = "NO_APP_JSON".asInstanceOf[NO_APP_JSON]
  
  @js.native
  sealed trait NO_EXPO
    extends StObject
       with ConfigErrorCode
  inline def NO_EXPO: NO_EXPO = "NO_EXPO".asInstanceOf[NO_EXPO]
  
  @js.native
  sealed trait `React Native packager is running` extends StObject
  inline def `React Native packager is running`: `React Native packager is running` = ("React Native packager is running").asInstanceOf[`React Native packager is running`]
  
  @js.native
  sealed trait `Username-Password-Authentication`
    extends StObject
       with ConnectionType
  inline def `Username-Password-Authentication`: `Username-Password-Authentication` = "Username-Password-Authentication".asInstanceOf[`Username-Password-Authentication`]
  
  @js.native
  sealed trait android
    extends StObject
       with Platform
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait automatic extends StObject
  inline def automatic: automatic = "automatic".asInstanceOf[automatic]
  
  @js.native
  sealed trait bare
    extends StObject
       with ProjectTarget
  inline def bare: bare = "bare".asInstanceOf[bare]
  
  @js.native
  sealed trait bigint extends StObject
  inline def bigint: bigint = "bigint".asInstanceOf[bigint]
  
  @js.native
  sealed trait boolean extends StObject
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait dark extends StObject
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait facebook
    extends StObject
       with ConnectionType
  inline def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @js.native
  sealed trait fail extends StObject
  inline def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait function extends StObject
  inline def function: function = "function".asInstanceOf[function]
  
  @js.native
  sealed trait github
    extends StObject
       with ConnectionType
  inline def github: github = "github".asInstanceOf[github]
  
  @js.native
  sealed trait `google-oauth2`
    extends StObject
       with ConnectionType
  inline def `google-oauth2`: `google-oauth2` = "google-oauth2".asInstanceOf[`google-oauth2`]
  
  @js.native
  sealed trait hermes extends StObject
  inline def hermes: hermes = "hermes".asInstanceOf[hermes]
  
  @js.native
  sealed trait hidden extends StObject
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait ios
    extends StObject
       with Platform
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait jsc extends StObject
  inline def jsc: jsc = "jsc".asInstanceOf[jsc]
  
  @js.native
  sealed trait landscape extends StObject
  inline def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait light extends StObject
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait managed
    extends StObject
       with ProjectTarget
  inline def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait number extends StObject
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object` extends StObject
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait portrait extends StObject
  inline def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait postExport
    extends StObject
       with HookType
  inline def postExport: postExport = "postExport".asInstanceOf[postExport]
  
  @js.native
  sealed trait postPublish
    extends StObject
       with HookType
  inline def postPublish: postPublish = "postPublish".asInstanceOf[postPublish]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait string extends StObject
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait symbol extends StObject
  inline def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait undefined extends StObject
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait unlisted extends StObject
  inline def unlisted: unlisted = "unlisted".asInstanceOf[unlisted]
  
  @js.native
  sealed trait warn extends StObject
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait web
    extends StObject
       with Platform
  inline def web: web = "web".asInstanceOf[web]
}
