package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CodeChallengeMethod extends js.Object

@JSImport("google-auth-library/build/src/auth/oauth2client", "CodeChallengeMethod")
@js.native
object CodeChallengeMethod extends js.Object {
  @js.native
  sealed trait Plain
    extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.CodeChallengeMethod
  
  @js.native
  sealed trait S256
    extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.CodeChallengeMethod
  
  /* "plain" */ val Plain: Plain with java.lang.String = js.native
  /* "S256" */ val S256: S256 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.CodeChallengeMethod with java.lang.String
  ] = js.native
}

