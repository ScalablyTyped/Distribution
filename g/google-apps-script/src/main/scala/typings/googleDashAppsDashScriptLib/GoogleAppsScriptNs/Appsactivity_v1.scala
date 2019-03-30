package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appsactivity_v1 extends js.Object {
  var Activities: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityUnderscoreV1Ns.CollectionNs.ActivitiesCollection
  ] = js.undefined
}

object Appsactivity_v1 {
  @scala.inline
  def apply(
    Activities: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityUnderscoreV1Ns.CollectionNs.ActivitiesCollection = null
  ): Appsactivity_v1 = {
    val __obj = js.Dynamic.literal()
    if (Activities != null) __obj.updateDynamic("Activities")(Activities)
    __obj.asInstanceOf[Appsactivity_v1]
  }
}

