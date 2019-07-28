package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchResponseEntry extends js.Object {
  /** The retrieved, created, or updated account. Not defined if the method was delete or claimwebsite. */
  var account: js.UndefOr[Account] = js.undefined
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsCustomBatchResponseEntry". */
  var kind: js.UndefOr[String] = js.undefined
}

object AccountsCustomBatchResponseEntry {
  @scala.inline
  def apply(account: Account = null, batchId: Int | Double = null, errors: Errors = null, kind: String = null): AccountsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountsCustomBatchResponseEntry]
  }
}

