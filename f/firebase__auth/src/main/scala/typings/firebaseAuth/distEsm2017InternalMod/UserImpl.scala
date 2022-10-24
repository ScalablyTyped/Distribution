package typings.firebaseAuth.distEsm2017InternalMod

import typings.firebaseAuth.distEsm2017SrcCorePersistenceMod.PersistedBlob
import typings.firebaseAuth.distEsm2017SrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distEsm2017SrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distEsm2017SrcModelUserMod.UserInternal
import typings.firebaseAuth.distEsm2017SrcModelUserMod.UserParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/esm2017/internal", "UserImpl")
@js.native
open class UserImpl protected ()
  extends typings.firebaseAuth.distEsm2017SrcCoreUserUserImplMod.UserImpl {
  def this(param0: UserParameters) = this()
}
/* static members */
object UserImpl {
  
  @JSImport("@firebase/auth/dist/esm2017/internal", "UserImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize a User from an idToken server response
    * @param auth
    * @param idTokenResponse
    */
  inline def _fromIdTokenResponse(auth: AuthInternal, idTokenResponse: IdTokenResponse): js.Promise[UserInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(auth.asInstanceOf[js.Any], idTokenResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserInternal]]
  inline def _fromIdTokenResponse(auth: AuthInternal, idTokenResponse: IdTokenResponse, isAnonymous: Boolean): js.Promise[UserInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(auth.asInstanceOf[js.Any], idTokenResponse.asInstanceOf[js.Any], isAnonymous.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserInternal]]
  
  inline def _fromJSON(auth: AuthInternal, `object`: PersistedBlob): UserInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromJSON")(auth.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[UserInternal]
}
