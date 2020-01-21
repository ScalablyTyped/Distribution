package typings.firefoxWebextBrowser.browser.experiments

import typings.firefoxWebextBrowser.AnonEvents
import typings.firefoxWebextBrowser.AnonPaths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* experiments types */
trait ExperimentAPI extends js.Object {
  var child: js.UndefOr[AnonPaths] = js.undefined
  var parent: js.UndefOr[AnonEvents] = js.undefined
  var schema: ExperimentURL
}

object ExperimentAPI {
  @scala.inline
  def apply(schema: ExperimentURL, child: AnonPaths = null, parent: AnonEvents = null): ExperimentAPI = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentAPI]
  }
}

