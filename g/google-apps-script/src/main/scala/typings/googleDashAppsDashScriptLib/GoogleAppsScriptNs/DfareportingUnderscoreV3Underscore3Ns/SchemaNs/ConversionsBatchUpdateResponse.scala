package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsBatchUpdateResponse extends js.Object {
  var hasFailures: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[js.Array[ConversionStatus]] = js.undefined
}

object ConversionsBatchUpdateResponse {
  @scala.inline
  def apply(
    hasFailures: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    status: js.Array[ConversionStatus] = null
  ): ConversionsBatchUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasFailures)) __obj.updateDynamic("hasFailures")(hasFailures)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ConversionsBatchUpdateResponse]
  }
}

