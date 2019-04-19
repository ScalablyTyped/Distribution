package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "AuthCredential")
@js.native
abstract class AuthCredential () extends js.Object {
  var providerId: java.lang.String = js.native
  var signInMethod: java.lang.String = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("@firebase/auth-types", "AuthCredential")
@js.native
object AuthCredential extends js.Object {
  def fromJSON(json: java.lang.String): atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.AuthCredential | scala.Null = js.native
  def fromJSON(json: js.Object): atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.AuthCredential | scala.Null = js.native
}

