package typings.atFirebasePerformance.atFirebasePerformanceMod.atFirebaseAppDashTypesMod

import typings.atFirebasePerformance.Fn_App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var performance: js.UndefOr[Fn_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(performance: Fn_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (performance != null) __obj.updateDynamic("performance")(performance)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

