package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appsactivity extends js.Object {
  var Activities: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityNs.CollectionNs.ActivitiesCollection
  ] = js.undefined
}

object Appsactivity {
  @scala.inline
  def apply(
    Activities: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityNs.CollectionNs.ActivitiesCollection = null
  ): Appsactivity = {
    val __obj = js.Dynamic.literal()
    if (Activities != null) __obj.updateDynamic("Activities")(Activities)
    __obj.asInstanceOf[Appsactivity]
  }
}

