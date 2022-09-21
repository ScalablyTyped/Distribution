package typings.firebaseAppCompat

import typings.firebaseAppCompat.anon.RemoveApp
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait FirebaseApp
    extends StObject
       with typings.firebaseAppCompat.firebaseAppMod.FirebaseApp {
    
    def _addComponent[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](
      component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<T> */ Any
    ): Unit = js.native
    
    def _addOrOverwriteComponent[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](
      component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<T> */ Any
    ): Unit = js.native
    
    def _removeServiceInstance(name: String): Unit = js.native
    def _removeServiceInstance(name: String, instanceIdentifier: String): Unit = js.native
    
    var container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ Any = js.native
  }
  
  @js.native
  trait FirebaseNamespace
    extends StObject
       with typings.firebaseAppCompat.publicTypesMod.FirebaseNamespace {
    
    var INTERNAL: RemoveApp = js.native
  }
  
  trait FirebaseService
    extends StObject
       with Compat[Any] {
    
    var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.undefined
    
    var app: typings.firebaseAppCompat.publicTypesMod.FirebaseApp
  }
  object FirebaseService {
    
    inline def apply(_delegate: Any, app: typings.firebaseAppCompat.publicTypesMod.FirebaseApp): FirebaseService = {
      val __obj = js.Dynamic.literal(_delegate = _delegate.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseService]
    }
    
    extension [Self <: FirebaseService](x: Self) {
      
      inline def setApp(value: typings.firebaseAppCompat.publicTypesMod.FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setINTERNAL(value: FirebaseServiceInternals): Self = StObject.set(x, "INTERNAL", value.asInstanceOf[js.Any])
      
      inline def setINTERNALUndefined: Self = StObject.set(x, "INTERNAL", js.undefined)
    }
  }
  
  trait FirebaseServiceInternals extends StObject {
    
    /**
      * Delete the service and free it's resources - called from
      * app.delete().
      */
    def delete(): js.Promise[Unit]
  }
  object FirebaseServiceInternals {
    
    inline def apply(delete: () => js.Promise[Unit]): FirebaseServiceInternals = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[FirebaseServiceInternals]
    }
    
    extension [Self <: FirebaseServiceInternals](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  type FirebaseServiceNamespace[T /* <: FirebaseService */] = js.Function1[/* app */ js.UndefOr[typings.firebaseAppCompat.publicTypesMod.FirebaseApp], T]
}
