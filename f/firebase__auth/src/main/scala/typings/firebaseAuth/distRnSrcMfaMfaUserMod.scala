package typings.firebaseAuth

import typings.firebaseAuth.distRnSrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.distRnSrcModelPublicTypesMod.User
import typings.firebaseAuth.distRnSrcModelUserMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcMfaMfaUserMod {
  
  @JSImport("@firebase/auth/dist/rn/src/mfa/mfa_user", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/rn/src/mfa/mfa_user", "MultiFactorUserImpl")
  @js.native
  /* private */ open class MultiFactorUserImpl ()
    extends StObject
       with MultiFactorUser {
    
    val user: UserInternal = js.native
  }
  /* static members */
  object MultiFactorUserImpl {
    
    @JSImport("@firebase/auth/dist/rn/src/mfa/mfa_user", "MultiFactorUserImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _fromUser(user: UserInternal): MultiFactorUserImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromUser")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUserImpl]
  }
  
  inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
}
