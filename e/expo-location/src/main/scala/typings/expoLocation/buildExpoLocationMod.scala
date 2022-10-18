package typings.expoLocation

import org.scalablytyped.runtime.Shortcut
import typings.expoModulesCore.buildNativeModulesProxyDottypesMod.ProxyNativeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExpoLocationMod extends Shortcut {
  
  @JSImport("expo-location/build/ExpoLocation", JSImport.Default)
  @js.native
  val default: ProxyNativeModule = js.native
  
  type _To = ProxyNativeModule
  
  /* This means you don't have to write `default`, but can instead just say `buildExpoLocationMod.foo` */
  override def _to: ProxyNativeModule = default
}
