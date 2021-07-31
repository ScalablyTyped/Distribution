package typings.expoPermissions

import org.scalablytyped.runtime.Shortcut
import typings.unimodulesReactNativeAdapter.nativeModulesProxyTypesMod.ProxyNativeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoPermissionsMod extends Shortcut {
  
  @JSImport("expo-permissions/build/ExpoPermissions", JSImport.Default)
  @js.native
  val default: ProxyNativeModule = js.native
  
  type _To = ProxyNativeModule
  
  /* This means you don't have to write `default`, but can instead just say `expoPermissionsMod.foo` */
  override def _to: ProxyNativeModule = default
}
