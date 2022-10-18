package typings.expoModulesCore

import typings.expoModulesCore.buildPlatformMod._PlatformSelectOSType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoModulesCoreStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with _PlatformSelectOSType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait android extends StObject
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait electron
    extends StObject
       with _PlatformSelectOSType
  inline def electron: electron = "electron".asInstanceOf[electron]
  
  @js.native
  sealed trait ios extends StObject
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait macos extends StObject
  inline def macos: macos = "macos".asInstanceOf[macos]
  
  @js.native
  sealed trait native
    extends StObject
       with _PlatformSelectOSType
  inline def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait never extends StObject
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait web extends StObject
  inline def web: web = "web".asInstanceOf[web]
  
  @js.native
  sealed trait windows extends StObject
  inline def windows: windows = "windows".asInstanceOf[windows]
}
