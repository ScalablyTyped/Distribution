package typings.expoWebBrowser

import org.scalablytyped.runtime.Shortcut
import typings.unimodulesReactNativeAdapter.nativeModulesProxyTypesMod.ProxyNativeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoWebBrowserMod extends Shortcut {
  
  @JSImport("expo-web-browser/build/ExpoWebBrowser", JSImport.Default)
  @js.native
  val default: ProxyNativeModule = js.native
  
  type _To = ProxyNativeModule
  
  /* This means you don't have to write `default`, but can instead just say `expoWebBrowserMod.foo` */
  override def _to: ProxyNativeModule = default
}
