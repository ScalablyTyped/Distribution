package typings.atFirebasePerformance.atFirebasePerformanceMod.atFirebaseAppDashTypesMod

import typings.atFirebasePerformanceDashTypes.atFirebasePerformanceDashTypesMod.FirebasePerformance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var performance: js.UndefOr[js.Function0[FirebasePerformance]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(performance: () => FirebasePerformance = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (performance != null) __obj.updateDynamic("performance")(js.Any.fromFunction0(performance))
    __obj.asInstanceOf[FirebaseApp]
  }
}

