package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerritoryOwners extends js.Object {
  var owner: js.UndefOr[String] = js.undefined
  var publisher: js.UndefOr[String] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var territories: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object TerritoryOwners {
  @scala.inline
  def apply(
    owner: String = null,
    publisher: String = null,
    ratio: Int | Double = null,
    territories: js.Array[String] = null,
    `type`: String = null
  ): TerritoryOwners = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (territories != null) __obj.updateDynamic("territories")(territories)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TerritoryOwners]
  }
}

