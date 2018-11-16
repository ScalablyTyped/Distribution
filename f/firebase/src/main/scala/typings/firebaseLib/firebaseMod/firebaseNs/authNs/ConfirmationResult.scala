package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfirmationResult extends js.Object {
  var verificationId: java.lang.String
  def confirm(verificationCode: java.lang.String): stdLib.Promise[UserCredential]
}

