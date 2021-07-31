package typings.expoLocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geolocationPolyfillMod {
  
  @JSImport("expo-location/build/GeolocationPolyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def installWebGeolocationPolyfill(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installWebGeolocationPolyfill")().asInstanceOf[Unit]
}
