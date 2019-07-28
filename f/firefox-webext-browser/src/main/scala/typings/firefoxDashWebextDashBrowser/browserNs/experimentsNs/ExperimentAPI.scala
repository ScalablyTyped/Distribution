package typings.firefoxDashWebextDashBrowser.browserNs.experimentsNs

import typings.firefoxDashWebextDashBrowser.Anon_Events
import typings.firefoxDashWebextDashBrowser.Anon_Paths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* experiments types */
trait ExperimentAPI extends js.Object {
  var child: js.UndefOr[Anon_Paths] = js.undefined
  var parent: js.UndefOr[Anon_Events] = js.undefined
  var schema: ExperimentURL
}

object ExperimentAPI {
  @scala.inline
  def apply(schema: ExperimentURL, child: Anon_Paths = null, parent: Anon_Events = null): ExperimentAPI = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (child != null) __obj.updateDynamic("child")(child)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ExperimentAPI]
  }
}

