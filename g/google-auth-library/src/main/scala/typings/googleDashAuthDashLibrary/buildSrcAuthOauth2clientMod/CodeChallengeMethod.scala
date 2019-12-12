package typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.CodeChallengeMethod.Plain
import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.CodeChallengeMethod.S256
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CodeChallengeMethod with String] = js.native
  /* "plain" */ @js.native
  object Plain extends TopLevel[Plain with String]
  
  /* "S256" */ @js.native
  object S256 extends TopLevel[S256 with String]
  
}

