package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod.atFirebaseAppDashTypesMod

import typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod.FirebaseAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var auth: js.UndefOr[js.Function0[FirebaseAuth]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(auth: () => FirebaseAuth = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(js.Any.fromFunction0(auth))
    __obj.asInstanceOf[FirebaseApp]
  }
}

