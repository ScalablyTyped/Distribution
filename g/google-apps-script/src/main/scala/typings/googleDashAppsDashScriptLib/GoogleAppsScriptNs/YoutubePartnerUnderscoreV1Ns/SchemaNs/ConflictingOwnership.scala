package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConflictingOwnership extends js.Object {
  var owner: js.UndefOr[java.lang.String] = js.undefined
  var ratio: js.UndefOr[stdLib.Number] = js.undefined
}

object ConflictingOwnership {
  @scala.inline
  def apply(owner: java.lang.String = null, ratio: stdLib.Number = null): ConflictingOwnership = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio)
    __obj.asInstanceOf[ConflictingOwnership]
  }
}

