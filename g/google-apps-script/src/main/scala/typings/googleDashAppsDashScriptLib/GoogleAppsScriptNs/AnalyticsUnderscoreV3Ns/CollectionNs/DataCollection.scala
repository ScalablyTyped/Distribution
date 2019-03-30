package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCollection extends js.Object {
  var Ga: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.DataNs.GaCollection
  ] = js.undefined
  var Mcf: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.DataNs.McfCollection
  ] = js.undefined
  var Realtime: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.DataNs.RealtimeCollection
  ] = js.undefined
}

object DataCollection {
  @scala.inline
  def apply(
    Ga: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.DataNs.GaCollection = null,
    Mcf: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.DataNs.McfCollection = null,
    Realtime: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.DataNs.RealtimeCollection = null
  ): DataCollection = {
    val __obj = js.Dynamic.literal()
    if (Ga != null) __obj.updateDynamic("Ga")(Ga)
    if (Mcf != null) __obj.updateDynamic("Mcf")(Mcf)
    if (Realtime != null) __obj.updateDynamic("Realtime")(Realtime)
    __obj.asInstanceOf[DataCollection]
  }
}

