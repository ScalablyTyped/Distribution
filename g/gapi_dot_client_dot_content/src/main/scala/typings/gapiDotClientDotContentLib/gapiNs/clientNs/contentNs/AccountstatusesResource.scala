package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesResource extends js.Object {
  def custombatch(request: gapiDotClientDotContentLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AccountstatusesCustomBatchResponse]
  /**
    * Retrieves the status of a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: gapiDotClientDotContentLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[AccountStatus]
  /** Lists the statuses of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AccountstatusesListResponse]
}

object AccountstatusesResource {
  @scala.inline
  def apply(
    custombatch: js.Function1[
      gapiDotClientDotContentLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountstatusesCustomBatchResponse]
    ],
    get: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountStatus]
    ],
    list: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountstatusesListResponse]
    ]
  ): AccountstatusesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custombatch")(custombatch)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[AccountstatusesResource]
  }
}

