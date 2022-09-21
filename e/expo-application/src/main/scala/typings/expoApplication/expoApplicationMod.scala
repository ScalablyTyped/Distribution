package typings.expoApplication

import org.scalablytyped.runtime.Shortcut
import typings.expoModulesCore.nativeModulesProxyTypesMod.ProxyNativeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoApplicationMod extends Shortcut {
  
  @JSImport("expo-application/build/ExpoApplication", JSImport.Default)
  @js.native
  val default: ProxyNativeModule = js.native
  
  type _To = ProxyNativeModule
  
  /* This means you don't have to write `default`, but can instead just say `expoApplicationMod.foo` */
  override def _to: ProxyNativeModule = default
}
