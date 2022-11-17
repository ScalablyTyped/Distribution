package typings.expoModulesCore

import typings.reactNative.mod.PlatformOSType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlatformMod {
  
  object default {
    
    @JSImport("expo-modules-core/build/Platform", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    @JSImport("expo-modules-core/build/Platform", "default.OS")
    @js.native
    def OS: "ios" | "android" | "windows" | "macos" | "web" = js.native
    inline def OS_=(x: "ios" | "android" | "windows" | "macos" | "web"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the current environment can attach event listeners
      * to the window. This will return false in native React
      * runtimes and Node.js.
      */
    @JSImport("expo-modules-core/build/Platform", "default.canUseEventListeners")
    @js.native
    def canUseEventListeners: Boolean = js.native
    inline def canUseEventListeners_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseEventListeners")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the current environment can inspect properties of the
      * screen on which the current window is being rendered. This will
      * return false in native React runtimes and Node.js.
      */
    @JSImport("expo-modules-core/build/Platform", "default.canUseViewport")
    @js.native
    def canUseViewport: Boolean = js.native
    inline def canUseViewport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseViewport")(x.asInstanceOf[js.Any])
    
    /**
      * If the JavaScript is being executed in a remote JavaScript environment.
      * When `true`, synchronous native invocations cannot be executed.
      */
    @JSImport("expo-modules-core/build/Platform", "default.isAsyncDebugging")
    @js.native
    def isAsyncDebugging: Boolean = js.native
    inline def isAsyncDebugging_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAsyncDebugging")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    @JSImport("expo-modules-core/build/Platform", "default.isDOMAvailable")
    @js.native
    def isDOMAvailable: Boolean = js.native
    inline def isDOMAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDOMAvailable")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the value with the matching platform.
      * Object keys can be any of ios, android, native, web, default.
      *
      * @ios ios, native, default
      * @android android, native, default
      * @web web, default
      */
    @JSImport("expo-modules-core/build/Platform", "default.select")
    @js.native
    def select: PlatformSelect = js.native
    inline def select_=(x: PlatformSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
  }
  
  type PlatformSelect = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ platform in expo-modules-core.expo-modules-core/build/Platform.PlatformSelectOSType ]:? any} */ /* specifics */ js.Any, 
    Any
  ]
  
  type PlatformSelectOSType = PlatformOSType | "native" | "electron" | "default"
}
