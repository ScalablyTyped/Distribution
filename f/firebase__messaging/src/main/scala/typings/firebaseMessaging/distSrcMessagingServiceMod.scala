package typings.firebaseMessaging

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseComponent.mod.Provider
import typings.firebaseMessaging.distSrcInterfacesInternalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.distSrcInterfacesLoggingTypesMod.LogEvent
import typings.firebaseMessaging.distSrcInterfacesPublicTypesMod.MessagePayload
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessagingServiceMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/messaging/dist/src/messaging-service", "MessagingService")
  @js.native
  open class MessagingService protected () extends StObject {
    def this(
      app: FirebaseApp,
      installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any,
      analyticsProvider: Provider[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ Any
          ]
    ) = this()
    
    def _delete(): js.Promise[Unit] = js.native
    
    val app: FirebaseApp = js.native
    
    var deliveryMetricsExportedToBigQueryEnabled: Boolean = js.native
    
    val firebaseDependencies: FirebaseInternalDependencies = js.native
    
    var isLogServiceStarted: Boolean = js.native
    
    var logEvents: js.Array[LogEvent] = js.native
    
    var onBackgroundMessageHandler: NextFn[MessagePayload] | Observer[MessagePayload] | Null = js.native
    
    var onMessageHandler: NextFn[MessagePayload] | Observer[MessagePayload] | Null = js.native
    
    var swRegistration: js.UndefOr[ServiceWorkerRegistration] = js.native
    
    var vapidKey: js.UndefOr[String] = js.native
  }
}
