package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod.atFirebaseAppDashTypesMod

import typings.atFirebaseAuthDashTypes.Anon_App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var auth: js.UndefOr[Anon_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(auth: Anon_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

