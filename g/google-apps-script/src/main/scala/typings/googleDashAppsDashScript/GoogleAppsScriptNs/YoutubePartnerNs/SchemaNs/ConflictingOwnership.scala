package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConflictingOwnership extends js.Object {
  var owner: js.UndefOr[String] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
}

object ConflictingOwnership {
  @scala.inline
  def apply(owner: String = null, ratio: Int | Double = null): ConflictingOwnership = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConflictingOwnership]
  }
}

