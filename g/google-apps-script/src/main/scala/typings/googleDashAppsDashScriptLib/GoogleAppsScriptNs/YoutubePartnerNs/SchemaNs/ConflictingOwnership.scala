package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConflictingOwnership extends js.Object {
  var owner: js.UndefOr[java.lang.String] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
}

object ConflictingOwnership {
  @scala.inline
  def apply(owner: java.lang.String = null, ratio: scala.Int | scala.Double = null): ConflictingOwnership = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConflictingOwnership]
  }
}

