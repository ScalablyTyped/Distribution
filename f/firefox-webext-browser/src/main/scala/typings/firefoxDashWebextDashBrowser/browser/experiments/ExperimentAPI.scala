package typings.firefoxDashWebextDashBrowser.browser.experiments

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
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentAPI]
  }
}

