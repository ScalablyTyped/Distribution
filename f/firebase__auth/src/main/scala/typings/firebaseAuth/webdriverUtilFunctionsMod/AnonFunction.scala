package typings.firebaseAuth.webdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnonFunction extends StObject
@JSImport("@firebase/auth/dist/esm5/test/integration/webdriver/util/functions", "AnonFunction")
@js.native
object AnonFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnonFunction & String] = js.native
  
  @js.native
  sealed trait SIGN_IN_ANONYMOUSLY
    extends StObject
       with AnonFunction
  /* "anonymous.anonymousSignIn" */ val SIGN_IN_ANONYMOUSLY: typings.firebaseAuth.webdriverUtilFunctionsMod.AnonFunction.SIGN_IN_ANONYMOUSLY & String = js.native
}
