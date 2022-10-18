package typings.firebaseApp

import typings.firebaseApp.anon.RequiredFirebaseAppSettin
import typings.firebaseApp.distAppSrcPublicTypesMod.FirebaseApp
import typings.firebaseApp.distAppSrcPublicTypesMod.FirebaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppSrcFirebaseAppMod {
  
  @JSImport("@firebase/app/dist/app/src/firebaseApp", "FirebaseAppImpl")
  @js.native
  open class FirebaseAppImpl protected ()
    extends StObject
       with FirebaseApp {
    def this(
      options: FirebaseOptions,
      config: RequiredFirebaseAppSettin,
      container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ Any
    ) = this()
    
    /* private */ var _automaticDataCollectionEnabled: Any = js.native
    
    /**
      * Original config values passed in as a constructor parameter.
      * It is only used to compare with another config object to support idempotent initializeApp().
      *
      * Updating automaticDataCollectionEnabled on the App instance will not change its value in _config.
      */
    /* private */ val _config: Any = js.native
    
    /* private */ val _container: Any = js.native
    
    /* private */ var _isDeleted: Any = js.native
    
    /* private */ val _name: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /**
      * The settable config flag for GDPR opt-in/opt-out
      */
    /* CompleteClass */
    var automaticDataCollectionEnabled: Boolean = js.native
    @JSName("automaticDataCollectionEnabled")
    def automaticDataCollectionEnabled_MFirebaseAppImpl: Boolean = js.native
    
    /**
      * This function will throw an Error if the App has already been deleted -
      * use before performing API actions on the App.
      */
    /* private */ var checkDestroyed: Any = js.native
    
    def config: RequiredFirebaseAppSettin = js.native
    
    def container: Any = js.native
    
    def isDeleted: Boolean = js.native
    def isDeleted_=(`val`: Boolean): Unit = js.native
    
    /**
      * The (read-only) name for this app.
      *
      * The default app's name is `"[DEFAULT]"`.
      *
      * @example
      * ```javascript
      * // The default app's name is "[DEFAULT]"
      * const app = initializeApp(defaultAppConfig);
      * console.log(app.name);  // "[DEFAULT]"
      * ```
      *
      * @example
      * ```javascript
      * // A named app's name is what you provide to initializeApp()
      * const otherApp = initializeApp(otherAppConfig, "other");
      * console.log(otherApp.name);  // "other"
      * ```
      */
    /* CompleteClass */
    override val name: String = js.native
    @JSName("name")
    def name_MFirebaseAppImpl: String = js.native
    
    /**
      * The (read-only) configuration options for this app. These are the original
      * parameters given in {@link (initializeApp:1) | initializeApp()}.
      *
      * @example
      * ```javascript
      * const app = initializeApp(config);
      * console.log(app.options.databaseURL === config.databaseURL);  // true
      * ```
      */
    /* CompleteClass */
    override val options: FirebaseOptions = js.native
    @JSName("options")
    def options_MFirebaseAppImpl: FirebaseOptions = js.native
  }
}
