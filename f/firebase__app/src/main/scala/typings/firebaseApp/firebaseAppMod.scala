package typings.firebaseApp

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.mod.FirebaseAppConfig
import typings.firebaseAppTypes.mod.FirebaseOptions
import typings.firebaseAppTypes.privateMod.FirebaseNamespace
import typings.firebaseAppTypes.privateMod.FirebaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAppMod {
  
  @JSImport("@firebase/app/dist/packages/app/src/firebaseApp", "FirebaseAppImpl")
  @js.native
  class FirebaseAppImpl protected () extends FirebaseApp {
    def this(options: FirebaseOptions, config: FirebaseAppConfig, firebase_ : FirebaseNamespace) = this()
    
    /**
      * @param component the component being added to this app's container
      */
    def _addComponent(
      component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ js.Any
    ): Unit = js.native
    
    def _addOrOverwriteComponent(
      component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ js.Any
    ): Unit = js.native
    
    /**
      * Return a service instance associated with this app (creating it
      * on demand), identified by the passed instanceIdentifier.
      *
      * NOTE: Currently storage and functions are the only ones that are leveraging this
      * functionality. They invoke it by calling:
      *
      * ```javascript
      * firebase.app().storage('STORAGE BUCKET ID')
      * ```
      *
      * The service name is passed to this already
      * @internal
      */
    def _getService(name: String): FirebaseService = js.native
    def _getService(name: String, instanceIdentifier: String): FirebaseService = js.native
    
    /**
      * Remove a service instance from the cache, so we will create a new instance for this service
      * when people try to get this service again.
      *
      * NOTE: currently only firestore is using this functionality to support firestore shutdown.
      *
      * @param name The service name
      * @param instanceIdentifier instance identifier in case multiple instances are allowed
      * @internal
      */
    def _removeServiceInstance(name: String): Unit = js.native
    def _removeServiceInstance(name: String, instanceIdentifier: String): Unit = js.native
    
    /* private */ var automaticDataCollectionEnabled_ : js.Any = js.native
    
    @JSName("automaticDataCollectionEnabled")
    def automaticDataCollectionEnabled_MFirebaseAppImpl: Boolean = js.native
    
    /**
      * This function will throw an Error if the App has already been deleted -
      * use before performing API actions on the App.
      */
    /* private */ var checkDestroyed_ : js.Any = js.native
    
    /* private */ var container: js.Any = js.native
    
    /* private */ val firebase_ : js.Any = js.native
    
    /* private */ var isDeleted_ : js.Any = js.native
    
    /* private */ val name_ : js.Any = js.native
    
    @JSName("name")
    def name_MFirebaseAppImpl: String = js.native
    
    /* private */ val options_ : js.Any = js.native
    
    @JSName("options")
    def options_MFirebaseAppImpl: FirebaseOptions = js.native
  }
}
