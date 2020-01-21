package typings.firebaseFirestore.credentialsMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/credentials", "FirstPartyToken")
@js.native
class FirstPartyToken protected () extends Token {
  def this(gapi: Gapi, sessionIndex: String) = this()
  /** Extra header values to be passed along with a request */
  /* CompleteClass */
  override var authHeaders: StringDictionary[String] = js.native
  var gapi: js.Any = js.native
  var sessionIndex: js.Any = js.native
  /** Type of token. */
  /* CompleteClass */
  override var `type`: TokenType = js.native
  /**
    * The user with which the token is associated (used for persisting user
    * state on disk, etc.).
    */
  /* CompleteClass */
  override var user: User = js.native
  @JSName("authHeaders")
  def authHeaders_MFirstPartyToken(): StringDictionary[String] = js.native
}

