package typings.firebaseAuthCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupRedirectMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.PopupRedirectResolverInternal * / any */ @JSImport("@firebase/auth-compat/dist/auth-compat/src/popup_redirect", "CompatPopupRedirectResolver")
  @js.native
  open class CompatPopupRedirectResolver () extends StObject {
    
    def _completeRedirectFn(
      auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Auth */ Any,
      resolver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.PopupRedirectResolver */ Any,
      bypassAuthState: Boolean
    ): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.UserCredential */ Any) | Null
      ] = js.native
    
    def _initialize(
      auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthImpl */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.EventManager */ Any
      ] = js.native
    
    def _isIframeWebStorageSupported(
      auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthImpl */ Any,
      cb: js.Function1[/* support */ Boolean, Any]
    ): Unit = js.native
    
    def _openPopup(
      auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthImpl */ Any,
      provider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthProvider */ Any,
      authType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthEventType */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthPopup */ Any
      ] = js.native
    def _openPopup(
      auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthImpl */ Any,
      provider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthProvider */ Any,
      authType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthEventType */ Any,
      eventId: String
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthPopup */ Any
      ] = js.native
    
    def _openRedirect(
      auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthImpl */ Any,
      provider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthProvider */ Any,
      authType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthEventType */ Any
    ): js.Promise[Unit] = js.native
    def _openRedirect(
      auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthImpl */ Any,
      provider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthProvider */ Any,
      authType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthEventType */ Any,
      eventId: String
    ): js.Promise[Unit] = js.native
    
    def _originValidation(
      auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Auth */ Any
    ): js.Promise[Unit] = js.native
    
    var _overrideRedirectResult: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof exp._overrideRedirectResult */ Any = js.native
    
    var _redirectPersistence: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Persistence */ Any = js.native
    
    def _shouldInitProactively: Boolean = js.native
    
    /* private */ def assertedUnderlyingResolver: Any = js.native
    
    /* private */ val browserResolver: Any = js.native
    
    /* private */ val cordovaResolver: Any = js.native
    
    /* private */ var selectUnderlyingResolver: Any = js.native
    
    /* private */ var underlyingResolver: Any = js.native
  }
}
