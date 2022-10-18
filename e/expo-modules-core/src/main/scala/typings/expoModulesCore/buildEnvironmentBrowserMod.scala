package typings.expoModulesCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEnvironmentBrowserMod {
  
  @JSImport("expo-modules-core/build/environment/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-modules-core/build/environment/browser", "canUseEventListeners")
  @js.native
  val canUseEventListeners: /* false */ Boolean = js.native
  
  @JSImport("expo-modules-core/build/environment/browser", "canUseViewport")
  @js.native
  val canUseViewport: /* false */ Boolean = js.native
  
  @JSImport("expo-modules-core/build/environment/browser", "isAsyncDebugging")
  @js.native
  def isAsyncDebugging: Boolean = js.native
  inline def isAsyncDebugging_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAsyncDebugging")(x.asInstanceOf[js.Any])
  
  @JSImport("expo-modules-core/build/environment/browser", "isDOMAvailable")
  @js.native
  val isDOMAvailable: /* false */ Boolean = js.native
}
