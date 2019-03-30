package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerritoryCondition extends js.Object {
  var territories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TerritoryCondition {
  @scala.inline
  def apply(territories: js.Array[java.lang.String] = null, `type`: java.lang.String = null): TerritoryCondition = {
    val __obj = js.Dynamic.literal()
    if (territories != null) __obj.updateDynamic("territories")(territories)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TerritoryCondition]
  }
}

