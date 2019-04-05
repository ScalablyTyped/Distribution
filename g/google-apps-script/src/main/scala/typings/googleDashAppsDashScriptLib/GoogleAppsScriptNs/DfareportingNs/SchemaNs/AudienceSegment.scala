package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudienceSegment extends js.Object {
  var allocation: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object AudienceSegment {
  @scala.inline
  def apply(
    allocation: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    name: java.lang.String = null
  ): AudienceSegment = {
    val __obj = js.Dynamic.literal()
    if (allocation != null) __obj.updateDynamic("allocation")(allocation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AudienceSegment]
  }
}

