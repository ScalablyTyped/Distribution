package typings.atFirebaseApp

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseAppConfig
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseOptions
import typings.atFirebaseAppDashTypes.privateMod.FirebaseService
import typings.atFirebaseAppDashTypes.privateMod._FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/app/dist/packages/app/src/firebaseApp", JSImport.Namespace)
@js.native
object distPackagesAppSrcFirebaseAppMod extends js.Object {
  @js.native
  class FirebaseAppImpl protected () extends FirebaseApp {
    def this(options: FirebaseOptions, config: FirebaseAppConfig, firebase_ : _FirebaseNamespace) = this()
    var automaticDataCollectionEnabled_ : js.Any = js.native
    /**
      * This function will throw an Error if the App has already been deleted -
      * use before performing API actions on the App.
      */
    var checkDestroyed_ : js.Any = js.native
    var container: js.Any = js.native
    val firebase_ : js.Any = js.native
    var isDeleted_ : js.Any = js.native
    val name_ : js.Any = js.native
    val options_ : js.Any = js.native
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
    @JSName("automaticDataCollectionEnabled")
    def automaticDataCollectionEnabled_MFirebaseAppImpl(): Boolean = js.native
    @JSName("automaticDataCollectionEnabled")
    def automaticDataCollectionEnabled_MFirebaseAppImpl(`val`: Boolean): js.Any = js.native
    @JSName("name")
    def name_MFirebaseAppImpl(): String = js.native
    @JSName("options")
    def options_MFirebaseAppImpl(): FirebaseOptions = js.native
  }
  
}

