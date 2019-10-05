package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchResponseEntry extends js.Object {
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  var batchId: js.UndefOr[Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AccounttaxCustomBatchResponseEntry {
  @scala.inline
  def apply(
    accountTax: AccountTax = null,
    batchId: Int | Double = null,
    errors: Errors = null,
    kind: String = null
  ): AccounttaxCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (accountTax != null) __obj.updateDynamic("accountTax")(accountTax)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccounttaxCustomBatchResponseEntry]
  }
}

