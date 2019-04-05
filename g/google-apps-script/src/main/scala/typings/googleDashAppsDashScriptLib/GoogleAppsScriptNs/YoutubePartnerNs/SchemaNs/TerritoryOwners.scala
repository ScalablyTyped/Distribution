package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerritoryOwners extends js.Object {
  var owner: js.UndefOr[java.lang.String] = js.undefined
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  var ratio: js.UndefOr[stdLib.Number] = js.undefined
  var territories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TerritoryOwners {
  @scala.inline
  def apply(
    owner: java.lang.String = null,
    publisher: java.lang.String = null,
    ratio: stdLib.Number = null,
    territories: js.Array[java.lang.String] = null,
    `type`: java.lang.String = null
  ): TerritoryOwners = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio)
    if (territories != null) __obj.updateDynamic("territories")(territories)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TerritoryOwners]
  }
}

