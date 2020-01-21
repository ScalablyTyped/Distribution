package typings.firebaseAuthTypes

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseAuthTypes.mod.AuthCredential
import typings.firebaseAuthTypes.mod.TwitterAuthProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassTwitterAuthProvider extends Instantiable0[TwitterAuthProvider] {
  var PROVIDER_ID: String = js.native
  var TWITTER_SIGN_IN_METHOD: String = js.native
  def credential(token: String, secret: String): AuthCredential = js.native
}

