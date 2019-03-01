package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var auth: js.UndefOr[js.Function0[atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.FirebaseAuth]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(auth: js.Function0[atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.FirebaseAuth] = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    __obj.asInstanceOf[FirebaseApp]
  }
}

