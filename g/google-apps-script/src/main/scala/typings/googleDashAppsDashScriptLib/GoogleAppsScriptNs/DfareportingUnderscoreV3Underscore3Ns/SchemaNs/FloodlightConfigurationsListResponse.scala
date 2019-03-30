package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfigurationsListResponse extends js.Object {
  var floodlightConfigurations: js.UndefOr[js.Array[FloodlightConfiguration]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object FloodlightConfigurationsListResponse {
  @scala.inline
  def apply(floodlightConfigurations: js.Array[FloodlightConfiguration] = null, kind: java.lang.String = null): FloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightConfigurations != null) __obj.updateDynamic("floodlightConfigurations")(floodlightConfigurations)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[FloodlightConfigurationsListResponse]
  }
}

