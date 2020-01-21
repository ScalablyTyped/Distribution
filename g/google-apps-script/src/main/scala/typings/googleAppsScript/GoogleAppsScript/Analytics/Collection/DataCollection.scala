package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Data.GaCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Data.McfCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Data.RealtimeCollection
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
    if (Ga != null) __obj.updateDynamic("Ga")(Ga.asInstanceOf[js.Any])
    if (Mcf != null) __obj.updateDynamic("Mcf")(Mcf.asInstanceOf[js.Any])
    if (Realtime != null) __obj.updateDynamic("Realtime")(Realtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCollection]
  }
}

