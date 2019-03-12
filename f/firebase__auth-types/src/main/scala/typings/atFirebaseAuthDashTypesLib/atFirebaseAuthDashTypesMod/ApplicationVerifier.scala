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
  def apply(`type`: java.lang.String, verify: () => js.Promise[java.lang.String]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ApplicationVerifier]
  }
}

