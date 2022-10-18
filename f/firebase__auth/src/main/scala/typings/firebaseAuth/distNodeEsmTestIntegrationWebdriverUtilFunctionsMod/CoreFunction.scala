package typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreFunction extends StObject
@JSImport("@firebase/auth/dist/node-esm/test/integration/webdriver/util/functions", "CoreFunction")
@js.native
object CoreFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CoreFunction & String] = js.native
  
  @js.native
  sealed trait AUTH_SNAPSHOT
    extends StObject
       with CoreFunction
  /* "core.authSnap" */ val AUTH_SNAPSHOT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.CoreFunction.AUTH_SNAPSHOT & String = js.native
  
  @js.native
  sealed trait AWAIT_AUTH_INIT
    extends StObject
       with CoreFunction
  /* "core.authInit" */ val AWAIT_AUTH_INIT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.CoreFunction.AWAIT_AUTH_INIT & String = js.native
  
  @js.native
  sealed trait AWAIT_LEGACY_AUTH_INIT
    extends StObject
       with CoreFunction
  /* "core.legacyAuthInit" */ val AWAIT_LEGACY_AUTH_INIT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.CoreFunction.AWAIT_LEGACY_AUTH_INIT & String = js.native
  
  @js.native
  sealed trait LEGACY_USER_SNAPSHOT
    extends StObject
       with CoreFunction
  /* "core.legacyUserSnap" */ val LEGACY_USER_SNAPSHOT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.CoreFunction.LEGACY_USER_SNAPSHOT & String = js.native
  
  @js.native
  sealed trait RESET
    extends StObject
       with CoreFunction
  /* "core.reset" */ val RESET: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.CoreFunction.RESET & String = js.native
  
  @js.native
  sealed trait SIGN_OUT
    extends StObject
       with CoreFunction
  /* "core.signOut" */ val SIGN_OUT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.CoreFunction.SIGN_OUT & String = js.native
  
  @js.native
  sealed trait USER_SNAPSHOT
    extends StObject
       with CoreFunction
  /* "core.userSnap" */ val USER_SNAPSHOT: typings.firebaseAuth.distNodeEsmTestIntegrationWebdriverUtilFunctionsMod.CoreFunction.USER_SNAPSHOT & String = js.native
}
