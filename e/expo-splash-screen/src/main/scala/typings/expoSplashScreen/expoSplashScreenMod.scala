package typings.expoSplashScreen

import org.scalablytyped.runtime.Shortcut
import typings.unimodulesReactNativeAdapter.nativeModulesProxyTypesMod.ProxyNativeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoSplashScreenMod extends Shortcut {
  
  @JSImport("expo-splash-screen/build/ExpoSplashScreen", JSImport.Default)
  @js.native
  val default: ProxyNativeModule = js.native
  
  type _To = ProxyNativeModule
  
  /* This means you don't have to write `default`, but can instead just say `expoSplashScreenMod.foo` */
  override def _to: ProxyNativeModule = default
}
