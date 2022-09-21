package typings.firebaseAuth.utilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreFunction extends StObject
@JSImport("@firebase/auth/dist/esm2017/test/integration/webdriver/util/functions", "CoreFunction")
@js.native
object CoreFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CoreFunction & String] = js.native
  
  @js.native
  sealed trait AUTH_SNAPSHOT
    extends StObject
       with CoreFunction
  /* "core.authSnap" */ val AUTH_SNAPSHOT: typings.firebaseAuth.utilFunctionsMod.CoreFunction.AUTH_SNAPSHOT & String = js.native
  
  @js.native
  sealed trait AWAIT_AUTH_INIT
    extends StObject
       with CoreFunction
  /* "core.authInit" */ val AWAIT_AUTH_INIT: typings.firebaseAuth.utilFunctionsMod.CoreFunction.AWAIT_AUTH_INIT & String = js.native
  
  @js.native
  sealed trait AWAIT_LEGACY_AUTH_INIT
    extends StObject
       with CoreFunction
  /* "core.legacyAuthInit" */ val AWAIT_LEGACY_AUTH_INIT: typings.firebaseAuth.utilFunctionsMod.CoreFunction.AWAIT_LEGACY_AUTH_INIT & String = js.native
  
  @js.native
  sealed trait LEGACY_USER_SNAPSHOT
    extends StObject
       with CoreFunction
  /* "core.legacyUserSnap" */ val LEGACY_USER_SNAPSHOT: typings.firebaseAuth.utilFunctionsMod.CoreFunction.LEGACY_USER_SNAPSHOT & String = js.native
  
  @js.native
  sealed trait RESET
    extends StObject
       with CoreFunction
  /* "core.reset" */ val RESET: typings.firebaseAuth.utilFunctionsMod.CoreFunction.RESET & String = js.native
  
  @js.native
  sealed trait SIGN_OUT
    extends StObject
       with CoreFunction
  /* "core.signOut" */ val SIGN_OUT: typings.firebaseAuth.utilFunctionsMod.CoreFunction.SIGN_OUT & String = js.native
  
  @js.native
  sealed trait USER_SNAPSHOT
    extends StObject
       with CoreFunction
  /* "core.userSnap" */ val USER_SNAPSHOT: typings.firebaseAuth.utilFunctionsMod.CoreFunction.USER_SNAPSHOT & String = js.native
}
