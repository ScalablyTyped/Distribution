package typings.firebaseApp

import typings.firebaseApp.srcPublicTypesMod.FirebaseApp
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInternalMod {
  
  @JSImport("@firebase/app/dist/esm/app/src/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app/dist/esm/app/src/internal", "_DEFAULT_ENTRY_NAME")
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
  
  @JSImport("@firebase/app/dist/esm/app/src/internal", "_apps")
  @js.native
  val apps: Map[String, FirebaseApp] = js.native
  
  inline def clearComponents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_clearComponents")().asInstanceOf[Unit]
  
  @JSImport("@firebase/app/dist/esm/app/src/internal", "_components")
  @js.native
  val components: Map[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<any> */ Any
  ] = js.native
  
  inline def getProvider[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](app: FirebaseApp, name: T): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_getProvider")(app.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def registerComponent[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<T> */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_registerComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeServiceInstance[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](app: FirebaseApp, name: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_removeServiceInstance")(app.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeServiceInstance[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Name */ Any */](app: FirebaseApp, name: T, instanceIdentifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_removeServiceInstance")(app.asInstanceOf[js.Any], name.asInstanceOf[js.Any], instanceIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
