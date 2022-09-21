package typings.firebaseAppCompat

import typings.firebaseAppCompat.srcFirebaseAppMod.FirebaseApp
import typings.firebaseAppCompat.srcPublicTypesMod.FirebaseOptions
import typings.firebaseAppCompat.srcTypesMod.FirebaseNamespace
import typings.firebaseAppCompat.srcTypesMod.FirebaseService
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liteFirebaseAppLiteMod {
  
  @JSImport("@firebase/app-compat/dist/src/lite/firebaseAppLite", "FirebaseAppLiteImpl")
  @js.native
  open class FirebaseAppLiteImpl protected ()
    extends StObject
       with FirebaseApp
       with Compat[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAppExp */ Any
        ] {
    def this(
      _delegate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAppExp */ Any,
      firebase: FirebaseNamespace
    ) = this()
    
    /* CompleteClass */
    var _delegate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAppExp */ Any = js.native
    
    /**
      * Return a service instance associated with this app (creating it
      * on demand), identified by the passed instanceIdentifier.
      *
      * NOTE: Currently storage is the only one that is leveraging this
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
      * The settable config flag for GDPR opt-in/opt-out
      */
    /* CompleteClass */
    var automaticDataCollectionEnabled: Boolean = js.native
    @JSName("automaticDataCollectionEnabled")
    def automaticDataCollectionEnabled_MFirebaseAppLiteImpl: Boolean = js.native
    
    /**
      * Make the given App unusable and free resources.
      */
    /* CompleteClass */
    override def delete(): js.Promise[Unit] = js.native
    
    /* private */ val firebase: Any = js.native
    
    /**
      * The (read-only) name (identifier) for this App. '[DEFAULT]' is the default
      * App.
      */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    def name_MFirebaseAppLiteImpl: String = js.native
    
    /**
      * The (read-only) configuration options from the app initialization.
      */
    /* CompleteClass */
    var options: FirebaseOptions = js.native
    @JSName("options")
    def options_MFirebaseAppLiteImpl: FirebaseOptions = js.native
  }
}
