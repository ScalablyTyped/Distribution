package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCollection extends js.Object {
  var Ga: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs.GaCollection
  ] = js.undefined
  var Mcf: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs.McfCollection
  ] = js.undefined
  var Realtime: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs.RealtimeCollection
  ] = js.undefined
}

object DataCollection {
  @scala.inline
  def apply(
    Ga: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs.GaCollection = null,
    Mcf: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs.McfCollection = null,
    Realtime: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs.RealtimeCollection = null
  ): DataCollection = {
    val __obj = js.Dynamic.literal()
    if (Ga != null) __obj.updateDynamic("Ga")(Ga)
    if (Mcf != null) __obj.updateDynamic("Mcf")(Mcf)
    if (Realtime != null) __obj.updateDynamic("Realtime")(Realtime)
    __obj.asInstanceOf[DataCollection]
  }
}

