package typings.firebaseApp

import typings.firebaseApp.distAppSrcPublicTypesMod.FirebaseApp
import typings.firebaseApp.distAppSrcPublicTypesMod.FirebaseAppSettings
import typings.firebaseApp.distAppSrcPublicTypesMod.FirebaseOptions
import typings.firebaseApp.distAppSrcTypesMod.HeartbeatService
import typings.firebaseApp.distAppSrcTypesMod.PlatformLoggerService
import typings.firebaseApp.distAppSrcTypesMod.VersionService
import typings.firebaseLogger.distSrcLoggerMod.LogCallback
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.firebaseLogger.distSrcLoggerMod.LogOptions
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppSrcMod {
  
  @JSImport("@firebase/app/dist/app/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app/dist/app/src", "FirebaseError")
  @js.native
  open class FirebaseError protected ()
    extends typings.firebaseApp.distAppSrcApiMod.FirebaseError {
    def this(/** The error code for this error. */
    code: String, message: String) = this()
    def this(
      /** The error code for this error. */
    code: String,
      message: String,
      /** Custom data for this error. */
    customData: Record[String, Any]
    ) = this()
  }
  
  @JSImport("@firebase/app/dist/app/src", "SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
  
  @JSImport("@firebase/app/dist/app/src", "_DEFAULT_ENTRY_NAME")
  @js.native
  val _DEFAULT_ENTRY_NAME: /* "[DEFAULT]" */ String = js.native
  
  inline def addComponent[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](
    app: FirebaseApp,
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<T> */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addComponent")(app.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addOrOverwriteComponent(
    app: FirebaseApp,
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addOrOverwriteComponent")(app.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@firebase/app/dist/app/src", "_apps")
  @js.native
  val apps: Map[String, FirebaseApp] = js.native
  
  inline def clearComponents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_clearComponents")().asInstanceOf[Unit]
  
  @JSImport("@firebase/app/dist/app/src", "_components")
  @js.native
  val components: Map[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<any> */ Any
  ] = js.native
  
  inline def deleteApp(app: FirebaseApp): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteApp")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")().asInstanceOf[FirebaseApp]
  inline def getApp(name: String): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")(name.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  inline def getApps(): js.Array[FirebaseApp] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApps")().asInstanceOf[js.Array[FirebaseApp]]
  
  inline def getProvider[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](app: FirebaseApp, name: T): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_getProvider")(app.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def initializeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")().asInstanceOf[FirebaseApp]
  inline def initializeApp(options: FirebaseOptions): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  inline def initializeApp(options: FirebaseOptions, config: FirebaseAppSettings): FirebaseApp = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[FirebaseApp]
  inline def initializeApp(options: FirebaseOptions, name: String): FirebaseApp = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[FirebaseApp]
  
  inline def onLog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLog")().asInstanceOf[Unit]
  inline def onLog(logCallback: Null, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onLog(logCallback: LogCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onLog(logCallback: LogCallback, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerComponent[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<T> */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_registerComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerVersion(libraryKeyOrName: String, version: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(libraryKeyOrName.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerVersion(libraryKeyOrName: String, version: String, variant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(libraryKeyOrName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeServiceInstance[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](app: FirebaseApp, name: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_removeServiceInstance")(app.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeServiceInstance[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](app: FirebaseApp, name: T, instanceIdentifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_removeServiceInstance")(app.asInstanceOf[js.Any], name.asInstanceOf[js.Any], instanceIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var app: FirebaseApp
      
      var `app-version`: VersionService
      
      var heartbeat: HeartbeatService
      
      var `platform-logger`: PlatformLoggerService
    }
    object NameServiceMapping {
      
      inline def apply(
        app: FirebaseApp,
        `app-version`: VersionService,
        heartbeat: HeartbeatService,
        `platform-logger`: PlatformLoggerService
      ): NameServiceMapping = {
        val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any])
        __obj.updateDynamic("app-version")(`app-version`.asInstanceOf[js.Any])
        __obj.updateDynamic("platform-logger")(`platform-logger`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
        
        inline def `setApp-version`(value: VersionService): Self = StObject.set(x, "app-version", value.asInstanceOf[js.Any])
        
        inline def setHeartbeat(value: HeartbeatService): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
        
        inline def `setPlatform-logger`(value: PlatformLoggerService): Self = StObject.set(x, "platform-logger", value.asInstanceOf[js.Any])
      }
    }
  }
}
