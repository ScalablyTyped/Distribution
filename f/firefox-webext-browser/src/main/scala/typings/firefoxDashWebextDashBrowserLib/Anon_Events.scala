package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIEvents] = js.undefined
  var paths: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIPaths] = js.undefined
  var scopes: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIParentScope]] = js.undefined
  var script: firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.ExperimentURL
}

object Anon_Events {
  @scala.inline
  def apply(
    script: firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.ExperimentURL,
    events: firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIEvents = null,
    paths: firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIPaths = null,
    scopes: js.Array[firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.APIParentScope] = null
  ): Anon_Events = {
    val __obj = js.Dynamic.literal(script = script)
    if (events != null) __obj.updateDynamic("events")(events)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[Anon_Events]
  }
}

