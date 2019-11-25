package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchResponseEntry extends js.Object {
  /** The retrieved or updated account tax settings. */
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accounttaxCustomBatchResponseEntry". */
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
    if (accountTax != null) __obj.updateDynamic("accountTax")(accountTax.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccounttaxCustomBatchResponseEntry]
  }
}

