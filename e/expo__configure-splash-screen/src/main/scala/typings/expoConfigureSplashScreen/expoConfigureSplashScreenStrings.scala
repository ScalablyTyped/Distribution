package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.constantsMod.PlatformType
import typings.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import typings.expoConfigureSplashScreen.constantsMod.SplashScreenStatusBarStyleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoConfigureSplashScreenStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with SplashScreenStatusBarStyleType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait DeepRequired extends StObject
  inline def DeepRequired: DeepRequired = "DeepRequired".asInstanceOf[DeepRequired]
  
  @js.native
  sealed trait JsonShape extends StObject
  inline def JsonShape: JsonShape = "JsonShape".asInstanceOf[JsonShape]
  
  @js.native
  sealed trait StateManager extends StObject
  inline def StateManager: StateManager = "StateManager".asInstanceOf[StateManager]
  
  @js.native
  sealed trait all
    extends StObject
       with PlatformType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait android
    extends StObject
       with PlatformType
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait contain
    extends StObject
       with SplashScreenImageResizeModeType
  inline def contain: contain = "contain".asInstanceOf[contain]
  
  @js.native
  sealed trait cover
    extends StObject
       with SplashScreenImageResizeModeType
  inline def cover: cover = "cover".asInstanceOf[cover]
  
  @js.native
  sealed trait `dark-content`
    extends StObject
       with SplashScreenStatusBarStyleType
  inline def `dark-content`: `dark-content` = "dark-content".asInstanceOf[`dark-content`]
  
  @js.native
  sealed trait ios
    extends StObject
       with PlatformType
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait `light-content`
    extends StObject
       with SplashScreenStatusBarStyleType
  inline def `light-content`: `light-content` = "light-content".asInstanceOf[`light-content`]
  
  @js.native
  sealed trait native
    extends StObject
       with SplashScreenImageResizeModeType
  inline def native: native = "native".asInstanceOf[native]
}
