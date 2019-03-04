package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSettings extends js.Object {
  var appVerificationDisabledForTesting: scala.Boolean
}

object AuthSettings {
  @scala.inline
  def apply(appVerificationDisabledForTesting: scala.Boolean): AuthSettings = {
    val __obj = js.Dynamic.literal(appVerificationDisabledForTesting = appVerificationDisabledForTesting)
  
    __obj.asInstanceOf[AuthSettings]
  }
}

