package typings.firebaseAppCompat

import typings.firebaseAppCompat.anon.RemoveApp
import typings.firebaseComponent.distSrcTypesMod.Name
import typings.firebaseComponent.mod.Component
import typings.firebaseComponent.mod.ComponentContainer
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcTypesMod {
  
  @js.native
  trait FirebaseApp
    extends StObject
       with typings.firebaseAppCompat.distEsmSrcFirebaseAppMod.FirebaseApp {
    
    def _addComponent[T /* <: Name */](component: Component[T]): Unit = js.native
    
    def _addOrOverwriteComponent[T /* <: Name */](component: Component[T]): Unit = js.native
    
    def _removeServiceInstance(name: String): Unit = js.native
    def _removeServiceInstance(name: String, instanceIdentifier: String): Unit = js.native
    
    var container: ComponentContainer = js.native
  }
  
  @js.native
  trait FirebaseNamespace
    extends StObject
       with typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseNamespace {
    
    var INTERNAL: RemoveApp = js.native
  }
  
  trait FirebaseService
    extends StObject
       with Compat[Any] {
    
    var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.undefined
    
    var app: typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp
  }
  object FirebaseService {
    
    inline def apply(_delegate: Any, app: typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp): FirebaseService = {
      val __obj = js.Dynamic.literal(_delegate = _delegate.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseService]
    }
    
    extension [Self <: FirebaseService](x: Self) {
      
      inline def setApp(value: typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
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
  
  type FirebaseServiceNamespace[T /* <: FirebaseService */] = js.Function1[
    /* app */ js.UndefOr[typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp], 
    T
  ]
}
