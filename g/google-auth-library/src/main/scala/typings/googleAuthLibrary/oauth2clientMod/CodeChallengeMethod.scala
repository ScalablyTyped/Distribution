package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CodeChallengeMethod extends js.Object
@JSImport("google-auth-library/build/src/auth/oauth2client", "CodeChallengeMethod")
@js.native
object CodeChallengeMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CodeChallengeMethod with String] = js.native
  
  @js.native
  sealed trait Plain extends CodeChallengeMethod
  /* "plain" */ @js.native
  object Plain extends TopLevel[Plain with String]
  
  @js.native
  sealed trait S256 extends CodeChallengeMethod
  /* "S256" */ @js.native
  object S256 extends TopLevel[S256 with String]
}
