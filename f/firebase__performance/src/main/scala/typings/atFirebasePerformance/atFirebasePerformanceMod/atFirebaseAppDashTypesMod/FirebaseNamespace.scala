package typings.atFirebasePerformance.atFirebasePerformanceMod.atFirebaseAppDashTypesMod

import typings.atFirebasePerformanceDashTypes.atFirebasePerformanceDashTypesMod.FirebasePerformance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var performance: js.UndefOr[js.Function1[/* app */ js.UndefOr[FirebaseApp], FirebasePerformance]] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(performance: /* app */ js.UndefOr[FirebaseApp] => FirebasePerformance = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (performance != null) __obj.updateDynamic("performance")(js.Any.fromFunction1(performance))
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

