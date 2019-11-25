package typings.atFirebaseAppDashTypes.privateMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseService extends js.Object {
  var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.undefined
  var app: FirebaseApp
}

object FirebaseService {
  @scala.inline
  def apply(app: FirebaseApp, INTERNAL: FirebaseServiceInternals = null): FirebaseService = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    if (INTERNAL != null) __obj.updateDynamic("INTERNAL")(INTERNAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseService]
  }
}

