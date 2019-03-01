package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var auth: js.UndefOr[atFirebaseAuthDashTypesLib.Anon_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(auth: atFirebaseAuthDashTypesLib.Anon_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

