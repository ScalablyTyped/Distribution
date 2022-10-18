package typings.firebaseAppCompat

import typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseOptions
import typings.firebaseAppCompat.distEsmSrcTypesMod.FirebaseNamespace
import typings.firebaseAppCompat.distEsmSrcTypesMod.FirebaseService
import typings.firebaseComponent.distSrcTypesMod.Name
import typings.firebaseComponent.mod.Component
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcFirebaseAppMod {
  
  @JSImport("@firebase/app-compat/dist/esm/src/firebaseApp", "FirebaseAppImpl")
  @js.native
  open class FirebaseAppImpl protected ()
    extends StObject
       with Compat[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseAppExp */ Any
        ]
       with FirebaseApp {
    def this(
      _delegate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseAppExp */ Any,
      firebase: FirebaseNamespace
    ) = this()
    
    /**
      * @param component the component being added to this app's container
      * @internal
      */
    def _addComponent(component: Component[Name]): Unit = js.native
    
    def _addOrOverwriteComponent(component: Component[Name]): Unit = js.native
    
    /* CompleteClass */
    var _delegate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseAppExp */ Any = js.native
    
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
      * when people try to get it again.
      *
      * NOTE: currently only firestore uses this functionality to support firestore shutdown.
      *
      * @param name The service name
      * @param instanceIdentifier instance identifier in case multiple instances are allowed
      * @internal
      */
    def _removeServiceInstance(name: String): Unit = js.native
    def _removeServiceInstance(name: String, instanceIdentifier: String): Unit = js.native
    
    /**
      * The settable config flag for GDPR opt-in/opt-out
      */
    /* CompleteClass */
    var automaticDataCollectionEnabled: Boolean = js.native
    @JSName("automaticDataCollectionEnabled")
    def automaticDataCollectionEnabled_MFirebaseAppImpl: Boolean = js.native
    
    /* private */ var container: Any = js.native
    
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
    def name_MFirebaseAppImpl: String = js.native
    
    /**
      * The (read-only) configuration options from the app initialization.
      */
    /* CompleteClass */
    var options: FirebaseOptions = js.native
    @JSName("options")
    def options_MFirebaseAppImpl: FirebaseOptions = js.native
    
    def toJSON(): js.Object = js.native
  }
  
  trait FirebaseApp extends StObject {
    
    /**
      * The settable config flag for GDPR opt-in/opt-out
      */
    var automaticDataCollectionEnabled: Boolean
    
    /**
      * Make the given App unusable and free resources.
      */
    def delete(): js.Promise[Unit]
    
    /**
      * The (read-only) name (identifier) for this App. '[DEFAULT]' is the default
      * App.
      */
    var name: String
    
    /**
      * The (read-only) configuration options from the app initialization.
      */
    var options: FirebaseOptions
  }
  object FirebaseApp {
    
    inline def apply(
      automaticDataCollectionEnabled: Boolean,
      delete: () => js.Promise[Unit],
      name: String,
      options: FirebaseOptions
    ): FirebaseApp = {
      val __obj = js.Dynamic.literal(automaticDataCollectionEnabled = automaticDataCollectionEnabled.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setAutomaticDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: FirebaseOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
