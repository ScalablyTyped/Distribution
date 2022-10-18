package typings.expoModulesCore

import org.scalablytyped.runtime.Shortcut
import typings.expoModulesCore.buildNativeModulesProxyDottypesMod.ProxyNativeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSweetNativeErrorManagerMod extends Shortcut {
  
  @JSImport("expo-modules-core/build/sweet/NativeErrorManager", JSImport.Default)
  @js.native
  val default: ProxyNativeModule = js.native
  
  type _To = ProxyNativeModule
  
  /* This means you don't have to write `default`, but can instead just say `buildSweetNativeErrorManagerMod.foo` */
  override def _to: ProxyNativeModule = default
}
