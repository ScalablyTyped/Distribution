package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratedIds extends js.Object {
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var space: js.UndefOr[java.lang.String] = js.undefined
}

object GeneratedIds {
  @scala.inline
  def apply(
    ids: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    space: java.lang.String = null
  ): GeneratedIds = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (space != null) __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[GeneratedIds]
  }
}

