package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AppsactivityNs.CollectionNs.ActivitiesCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appsactivity extends js.Object {
  var Activities: js.UndefOr[ActivitiesCollection] = js.undefined
}

object Appsactivity {
  @scala.inline
  def apply(Activities: ActivitiesCollection = null): Appsactivity = {
    val __obj = js.Dynamic.literal()
    if (Activities != null) __obj.updateDynamic("Activities")(Activities)
    __obj.asInstanceOf[Appsactivity]
  }
}

