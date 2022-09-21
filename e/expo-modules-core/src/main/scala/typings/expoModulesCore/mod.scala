package typings.expoModulesCore

import typings.expoModulesCore.anon.CurrentVersion
import typings.expoModulesCore.eventEmitterMod.NativeModule
import typings.expoModulesCore.expoModulesCoreStrings.android
import typings.expoModulesCore.expoModulesCoreStrings.ios
import typings.expoModulesCore.expoModulesCoreStrings.macos
import typings.expoModulesCore.expoModulesCoreStrings.web
import typings.expoModulesCore.expoModulesCoreStrings.windows
import typings.expoModulesCore.permissionsHookMod.GetPermissionMethod
import typings.expoModulesCore.permissionsHookMod.PermissionHookMethods
import typings.expoModulesCore.permissionsHookMod.PermissionHookOptions
import typings.expoModulesCore.permissionsHookMod.RequestPermissionMethod
import typings.expoModulesCore.permissionsInterfaceMod.PermissionResponse
import typings.expoModulesCore.platformMod.PlatformSelect
import typings.react.mod.ComponentType
import typings.reactNative.mod.DeviceEventEmitterStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-modules-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-modules-core", "CodedError")
  @js.native
  open class CodedError protected ()
    extends typings.expoModulesCore.codedErrorMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("expo-modules-core", "DeviceEventEmitter")
  @js.native
  open class DeviceEventEmitter ()
    extends typings.reactNative.mod.DeviceEventEmitter
  @JSImport("expo-modules-core", "DeviceEventEmitter")
  @js.native
  val DeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("expo-modules-core", "EventEmitter")
  @js.native
  open class EventEmitter protected ()
    extends typings.expoModulesCore.eventEmitterMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @JSImport("expo-modules-core", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoModulesCore.permissionsInterfaceMod.PermissionStatus & String] = js.native
    
    /* "denied" */ val DENIED: typings.expoModulesCore.permissionsInterfaceMod.PermissionStatus.DENIED & String = js.native
    
    /* "granted" */ val GRANTED: typings.expoModulesCore.permissionsInterfaceMod.PermissionStatus.GRANTED & String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typings.expoModulesCore.permissionsInterfaceMod.PermissionStatus.UNDETERMINED & String = js.native
  }
  
  object Platform {
    
    @JSImport("expo-modules-core", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    @JSImport("expo-modules-core", "Platform.OS")
    @js.native
    def OS: ios | android | windows | macos | web = js.native
    inline def OS_=(x: ios | android | windows | macos | web): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the current environment can attach event listeners
      * to the window. This will return false in native React
      * runtimes and Node.js.
      */
    @JSImport("expo-modules-core", "Platform.canUseEventListeners")
    @js.native
    def canUseEventListeners: Boolean = js.native
    inline def canUseEventListeners_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseEventListeners")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the current environment can inspect properties of the
      * screen on which the current window is being rendered. This will
      * return false in native React runtimes and Node.js.
      */
    @JSImport("expo-modules-core", "Platform.canUseViewport")
    @js.native
    def canUseViewport: Boolean = js.native
    inline def canUseViewport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseViewport")(x.asInstanceOf[js.Any])
    
    /**
      * If the JavaScript is being executed in a remote JavaScript environment.
      * When `true`, synchronous native invocations cannot be executed.
      */
    @JSImport("expo-modules-core", "Platform.isAsyncDebugging")
    @js.native
    def isAsyncDebugging: Boolean = js.native
    inline def isAsyncDebugging_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAsyncDebugging")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    @JSImport("expo-modules-core", "Platform.isDOMAvailable")
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
    @JSImport("expo-modules-core", "Platform.select")
    @js.native
    def select: PlatformSelect = js.native
    inline def select_=(x: PlatformSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("expo-modules-core", "RCTDeviceEventEmitter")
  @js.native
  open class RCTDeviceEventEmitter ()
    extends StObject
       with DeviceEventEmitterStatic
  @JSImport("expo-modules-core", "RCTDeviceEventEmitter")
  @js.native
  val RCTDeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("expo-modules-core", "UnavailabilityError")
  @js.native
  open class UnavailabilityError protected ()
    extends typings.expoModulesCore.unavailabilityErrorMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  inline def createPermissionHook[Permission /* <: PermissionResponse */, Options /* <: js.Object */](methods: PermissionHookMethods[Permission, Options]): js.Function1[
    /* options */ js.UndefOr[PermissionHookOptions[Options]], 
    js.Tuple3[
      Permission | Null, 
      RequestPermissionMethod[Permission], 
      GetPermissionMethod[Permission]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPermissionHook")(methods.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* options */ js.UndefOr[PermissionHookOptions[Options]], 
    js.Tuple3[
      Permission | Null, 
      RequestPermissionMethod[Permission], 
      GetPermissionMethod[Permission]
    ]
  ]]
  
  inline def deprecate(library: String, deprecatedAPI: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(library.asInstanceOf[js.Any], deprecatedAPI.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deprecate(library: String, deprecatedAPI: String, options: CurrentVersion): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(library.asInstanceOf[js.Any], deprecatedAPI.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def requireNativeModule[ModuleType](moduleName: String): ModuleType = ^.asInstanceOf[js.Dynamic].applyDynamic("requireNativeModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[ModuleType]
  
  inline def requireNativeViewManager[P](viewName: String): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireNativeViewManager")(viewName.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
}
