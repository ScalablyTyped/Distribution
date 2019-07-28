package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs.GaCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs.McfCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs.RealtimeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCollection extends js.Object {
  var Ga: js.UndefOr[GaCollection] = js.undefined
  var Mcf: js.UndefOr[McfCollection] = js.undefined
  var Realtime: js.UndefOr[RealtimeCollection] = js.undefined
}

object DataCollection {
  @scala.inline
  def apply(Ga: GaCollection = null, Mcf: McfCollection = null, Realtime: RealtimeCollection = null): DataCollection = {
    val __obj = js.Dynamic.literal()
    if (Ga != null) __obj.updateDynamic("Ga")(Ga)
    if (Mcf != null) __obj.updateDynamic("Mcf")(Mcf)
    if (Realtime != null) __obj.updateDynamic("Realtime")(Realtime)
    __obj.asInstanceOf[DataCollection]
  }
}

