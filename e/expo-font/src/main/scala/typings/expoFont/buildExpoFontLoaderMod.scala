package typings.expoFont

import org.scalablytyped.runtime.Shortcut
import typings.expoModulesCore.buildNativeModulesProxyDottypesMod.ProxyNativeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExpoFontLoaderMod extends Shortcut {
  
  @JSImport("expo-font/build/ExpoFontLoader", JSImport.Default)
  @js.native
  val default: ProxyNativeModule = js.native
  
  type _To = ProxyNativeModule
  
  /* This means you don't have to write `default`, but can instead just say `buildExpoFontLoaderMod.foo` */
  override def _to: ProxyNativeModule = default
}
