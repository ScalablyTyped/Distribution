package typings.firebaseAuth.distRnSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependencies extends StObject {
  
  /**
    * Which {@link AuthErrorMap} to use.
    */
  var errorMap: js.UndefOr[AuthErrorMap] = js.undefined
  
  /**
    * Which {@link Persistence} to use. If this is an array, the first
    * `Persistence` that the device supports is used. The SDK searches for an
    * existing account in order and, if one is found in a secondary
    * `Persistence`, the account is moved to the primary `Persistence`.
    *
    * If no persistence is provided, the SDK falls back on
    * {@link inMemoryPersistence}.
    */
  var persistence: js.UndefOr[Persistence | js.Array[Persistence]] = js.undefined
  
  /**
    * The {@link PopupRedirectResolver} to use. This value depends on the
    * platform. Options are {@link browserPopupRedirectResolver} and
    * {@link cordovaPopupRedirectResolver}. This field is optional if neither
    * {@link signInWithPopup} or {@link signInWithRedirect} are being used.
    */
  var popupRedirectResolver: js.UndefOr[PopupRedirectResolver] = js.undefined
}
object Dependencies {
  
  inline def apply(): Dependencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dependencies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dependencies] (val x: Self) extends AnyVal {
    
    inline def setErrorMap(value: AuthErrorMap): Self = StObject.set(x, "errorMap", value.asInstanceOf[js.Any])
    
    inline def setErrorMapUndefined: Self = StObject.set(x, "errorMap", js.undefined)
    
    inline def setPersistence(value: Persistence | js.Array[Persistence]): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
    
    inline def setPersistenceVarargs(value: Persistence*): Self = StObject.set(x, "persistence", js.Array(value*))
    
    inline def setPopupRedirectResolver(value: PopupRedirectResolver): Self = StObject.set(x, "popupRedirectResolver", value.asInstanceOf[js.Any])
    
    inline def setPopupRedirectResolverUndefined: Self = StObject.set(x, "popupRedirectResolver", js.undefined)
  }
}
