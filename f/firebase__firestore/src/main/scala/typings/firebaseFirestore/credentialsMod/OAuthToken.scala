package typings.firebaseFirestore.credentialsMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/credentials", "OAuthToken")
@js.native
class OAuthToken protected () extends Token {
  def this(value: String, user: User) = this()
  /** Extra header values to be passed along with a request */
  /* CompleteClass */
  override var authHeaders: StringDictionary[String] = js.native
  /** Type of token. */
  /* CompleteClass */
  override var `type`: TokenType = js.native
  /**
    * The user with which the token is associated (used for persisting user
    * state on disk, etc.).
    */
  /* CompleteClass */
  override var user: User = js.native
}

