package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.experiments.APIEvents
import typings.firefoxWebextBrowser.browser.experiments.APIParentScope
import typings.firefoxWebextBrowser.browser.experiments.APIPaths
import typings.firefoxWebextBrowser.browser.experiments.ExperimentURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvents extends js.Object {
  var events: js.UndefOr[APIEvents] = js.undefined
  var paths: js.UndefOr[APIPaths] = js.undefined
  var scopes: js.UndefOr[js.Array[APIParentScope]] = js.undefined
  var script: ExperimentURL
}

object AnonEvents {
  @scala.inline
  def apply(
    script: ExperimentURL,
    events: APIEvents = null,
    paths: APIPaths = null,
    scopes: js.Array[APIParentScope] = null
  ): AnonEvents = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvents]
  }
}

