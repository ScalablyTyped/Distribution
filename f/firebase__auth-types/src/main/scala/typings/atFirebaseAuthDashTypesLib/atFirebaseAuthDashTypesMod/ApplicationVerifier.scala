package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVerifier extends js.Object {
  var `type`: java.lang.String
  def verify(): js.Promise[java.lang.String]
}

object ApplicationVerifier {
  @scala.inline
  def apply(`type`: java.lang.String, verify: js.Function0[js.Promise[java.lang.String]]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[ApplicationVerifier]
  }
}

