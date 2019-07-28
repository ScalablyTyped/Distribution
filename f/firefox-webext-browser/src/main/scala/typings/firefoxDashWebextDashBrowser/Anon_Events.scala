package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.experimentsNs.APIEvents
import typings.firefoxDashWebextDashBrowser.browserNs.experimentsNs.APIParentScope
import typings.firefoxDashWebextDashBrowser.browserNs.experimentsNs.APIPaths
import typings.firefoxDashWebextDashBrowser.browserNs.experimentsNs.ExperimentURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: js.UndefOr[APIEvents] = js.undefined
  var paths: js.UndefOr[APIPaths] = js.undefined
  var scopes: js.UndefOr[js.Array[APIParentScope]] = js.undefined
  var script: ExperimentURL
}

object Anon_Events {
  @scala.inline
  def apply(
    script: ExperimentURL,
    events: APIEvents = null,
    paths: APIPaths = null,
    scopes: js.Array[APIParentScope] = null
  ): Anon_Events = {
    val __obj = js.Dynamic.literal(script = script)
    if (events != null) __obj.updateDynamic("events")(events)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[Anon_Events]
  }
}

