package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchResponseEntry extends js.Object {
  /** The retrieved or updated account tax settings. */
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accounttaxCustomBatchResponseEntry". */
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

