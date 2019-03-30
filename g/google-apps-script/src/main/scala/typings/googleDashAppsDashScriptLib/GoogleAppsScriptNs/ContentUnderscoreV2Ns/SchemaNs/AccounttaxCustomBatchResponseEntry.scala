package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchResponseEntry extends js.Object {
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AccounttaxCustomBatchResponseEntry {
  @scala.inline
  def apply(
    accountTax: AccountTax = null,
    batchId: scala.Int | scala.Double = null,
    errors: Errors = null,
    kind: java.lang.String = null
  ): AccounttaxCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (accountTax != null) __obj.updateDynamic("accountTax")(accountTax)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccounttaxCustomBatchResponseEntry]
  }
}

