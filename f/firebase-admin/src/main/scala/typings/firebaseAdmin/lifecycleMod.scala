package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import typings.firebaseAdmin.coreMod.AppOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecycleMod {
  
  @JSImport("firebase-admin/lib/app/lifecycle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/app/lifecycle", "AppStore")
  @js.native
  open class AppStore () extends StObject {
    
    /* private */ val appStore: Any = js.native
    
    def clearAllApps(): js.Promise[Unit] = js.native
    
    def deleteApp(app: App): js.Promise[Unit] = js.native
    
    def getApp(): App = js.native
    def getApp(appName: String): App = js.native
    
    def getApps(): js.Array[App] = js.native
    
    def initializeApp(): App = js.native
    def initializeApp(options: Unit, appName: String): App = js.native
    def initializeApp(options: AppOptions): App = js.native
    def initializeApp(options: AppOptions, appName: String): App = js.native
    
    /**
      * Removes the specified App instance from the store. This is currently called by the
      * {@link FirebaseApp.delete} method. Can be removed once the app deletion is handled
      * entirely by the {@link deleteApp} top-level function.
      */
    def removeApp(appName: String): Unit = js.native
  }
  
  @JSImport("firebase-admin/lib/app/lifecycle", "FIREBASE_CONFIG_VAR")
  @js.native
  val FIREBASE_CONFIG_VAR: /* "FIREBASE_CONFIG" */ String = js.native
  
  @JSImport("firebase-admin/lib/app/lifecycle", "defaultAppStore")
  @js.native
  val defaultAppStore: AppStore = js.native
  
  inline def deleteApp(app: App): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteApp")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getApp(): App = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")().asInstanceOf[App]
  inline def getApp(appName: String): App = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")(appName.asInstanceOf[js.Any]).asInstanceOf[App]
  
  inline def getApps(): js.Array[App] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApps")().asInstanceOf[js.Array[App]]
  
  inline def initializeApp(): App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")().asInstanceOf[App]
  inline def initializeApp(options: Unit, appName: String): App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[App]
  inline def initializeApp(options: AppOptions): App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[App]
  inline def initializeApp(options: AppOptions, appName: String): App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[App]
}
