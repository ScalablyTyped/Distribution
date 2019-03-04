package typings
package atFirebaseAppDashTypesLib.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseService extends js.Object {
  var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.undefined
  var app: atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseApp
}

object FirebaseService {
  @scala.inline
  def apply(
    app: atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseApp,
    INTERNAL: FirebaseServiceInternals = null
  ): FirebaseService = {
    val __obj = js.Dynamic.literal(app = app)
    if (INTERNAL != null) __obj.updateDynamic("INTERNAL")(INTERNAL)
    __obj.asInstanceOf[FirebaseService]
  }
}

