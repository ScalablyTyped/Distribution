package typings
package atFirebasePerformanceLib.atFirebasePerformanceMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var performance: js.UndefOr[atFirebasePerformanceLib.Anon_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(performance: atFirebasePerformanceLib.Anon_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (performance != null) __obj.updateDynamic("performance")(performance)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

