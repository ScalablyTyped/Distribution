package typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CodeChallengeMethod extends js.Object

@JSImport("google-auth-library/build/src/auth/oauth2client", "CodeChallengeMethod")
@js.native
object CodeChallengeMethod extends js.Object {
  @js.native
  sealed trait Plain extends CodeChallengeMethod
  
  @js.native
  sealed trait S256 extends CodeChallengeMethod
  
  /* "plain" */ val Plain: typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.CodeChallengeMethod.Plain with String = js.native
  /* "S256" */ val S256: typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.CodeChallengeMethod.S256 with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CodeChallengeMethod with String] = js.native
}

