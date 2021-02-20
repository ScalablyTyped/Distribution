package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CodeChallengeMethod extends StObject
@JSImport("google-auth-library/build/src/auth/oauth2client", "CodeChallengeMethod")
@js.native
object CodeChallengeMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CodeChallengeMethod with String] = js.native
  
  @js.native
  sealed trait Plain extends CodeChallengeMethod
  /* "plain" */ val Plain: typings.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod.Plain with String = js.native
  
  @js.native
  sealed trait S256 extends CodeChallengeMethod
  /* "S256" */ val S256: typings.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod.S256 with String = js.native
}
