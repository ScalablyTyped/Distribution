package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.publicTypesMod.AppCheck
import typings.firebaseAppCheck.typesMod.FirebaseAppCheckInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@firebase/app-check/dist/esm/src/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/app-check/dist/esm/src/factory", "AppCheckService")
  @js.native
  open class AppCheckService protected ()
    extends StObject
       with AppCheck {
    def this(
      app: FirebaseApp,
      heartbeatServiceProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'heartbeat'> */ Any
    ) = this()
    
    def _delete(): js.Promise[Unit] = js.native
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `AppCheck` instance is associated with.
      */
    /* CompleteClass */
    var app: FirebaseApp = js.native
    
    var heartbeatServiceProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'heartbeat'> */ Any = js.native
  }
  
  inline def factory(
    app: FirebaseApp,
    heartbeatServiceProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'heartbeat'> */ Any
  ): AppCheckService = (^.asInstanceOf[js.Dynamic].applyDynamic("factory")(app.asInstanceOf[js.Any], heartbeatServiceProvider.asInstanceOf[js.Any])).asInstanceOf[AppCheckService]
  
  inline def internalFactory(appCheck: AppCheckService): FirebaseAppCheckInternal = ^.asInstanceOf[js.Dynamic].applyDynamic("internalFactory")(appCheck.asInstanceOf[js.Any]).asInstanceOf[FirebaseAppCheckInternal]
}
