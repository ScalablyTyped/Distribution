package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePartitioning extends js.Object {
  var expirationMs: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var requirePartitionFilter: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TimePartitioning {
  @scala.inline
  def apply(
    expirationMs: java.lang.String = null,
    field: java.lang.String = null,
    requirePartitionFilter: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): TimePartitioning = {
    val __obj = js.Dynamic.literal()
    if (expirationMs != null) __obj.updateDynamic("expirationMs")(expirationMs)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(requirePartitionFilter)) __obj.updateDynamic("requirePartitionFilter")(requirePartitionFilter)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimePartitioning]
  }
}

