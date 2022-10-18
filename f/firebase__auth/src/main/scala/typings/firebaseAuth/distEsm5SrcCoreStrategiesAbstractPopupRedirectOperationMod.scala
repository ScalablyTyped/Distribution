package typings.firebaseAuth

import typings.firebaseAuth.distEsm5SrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distEsm5SrcModelPopupRedirectMod.AuthEvent
import typings.firebaseAuth.distEsm5SrcModelPopupRedirectMod.AuthEventConsumer
import typings.firebaseAuth.distEsm5SrcModelPopupRedirectMod.AuthEventType
import typings.firebaseAuth.distEsm5SrcModelPopupRedirectMod.PopupRedirectResolverInternal
import typings.firebaseAuth.distEsm5SrcModelUserMod.UserCredentialInternal
import typings.firebaseAuth.distEsm5SrcModelUserMod.UserInternal
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreStrategiesAbstractPopupRedirectOperationMod {
  
  /* note: abstract class */ @JSImport("@firebase/auth/dist/esm5/src/core/strategies/abstract_popup_redirect_operation", "AbstractPopupRedirectOperation")
  @js.native
  open class AbstractPopupRedirectOperation protected ()
    extends StObject
       with AuthEventConsumer {
    def this(auth: AuthInternal, filter: js.Array[AuthEventType], resolver: PopupRedirectResolverInternal) = this()
    def this(auth: AuthInternal, filter: AuthEventType, resolver: PopupRedirectResolverInternal) = this()
    def this(
      auth: AuthInternal,
      filter: js.Array[AuthEventType],
      resolver: PopupRedirectResolverInternal,
      user: UserInternal
    ) = this()
    def this(
      auth: AuthInternal,
      filter: AuthEventType,
      resolver: PopupRedirectResolverInternal,
      user: UserInternal
    ) = this()
    def this(
      auth: AuthInternal,
      filter: js.Array[AuthEventType],
      resolver: PopupRedirectResolverInternal,
      user: Unit,
      bypassAuthState: Boolean
    ) = this()
    def this(
      auth: AuthInternal,
      filter: js.Array[AuthEventType],
      resolver: PopupRedirectResolverInternal,
      user: UserInternal,
      bypassAuthState: Boolean
    ) = this()
    def this(
      auth: AuthInternal,
      filter: AuthEventType,
      resolver: PopupRedirectResolverInternal,
      user: Unit,
      bypassAuthState: Boolean
    ) = this()
    def this(
      auth: AuthInternal,
      filter: AuthEventType,
      resolver: PopupRedirectResolverInternal,
      user: UserInternal,
      bypassAuthState: Boolean
    ) = this()
    
    /* protected */ val auth: AuthInternal = js.native
    
    /* protected */ val bypassAuthState: Boolean = js.native
    
    def cleanUp(): Unit = js.native
    
    /* CompleteClass */
    var eventId: String | Null = js.native
    
    /* private */ var eventManager: Any = js.native
    
    def execute(): js.Promise[UserCredentialInternal | Null] = js.native
    
    /* CompleteClass */
    override val filter: js.Array[AuthEventType] = js.native
    
    /* private */ var getIdpTask: Any = js.native
    
    /* CompleteClass */
    override def onAuthEvent(event: AuthEvent): Any = js.native
    
    /* CompleteClass */
    override def onError(error: FirebaseError): Any = js.native
    
    def onExecution(): js.Promise[Unit] = js.native
    
    /* private */ var pendingPromise: Any = js.native
    
    /* protected */ def reject(error: js.Error): Unit = js.native
    
    /* protected */ def resolve(): Unit = js.native
    /* protected */ def resolve(cred: UserCredentialInternal): Unit = js.native
    
    /* protected */ val resolver: PopupRedirectResolverInternal = js.native
    
    /* private */ var unregisterAndCleanUp: Any = js.native
    
    /* protected */ var user: js.UndefOr[UserInternal] = js.native
  }
}
