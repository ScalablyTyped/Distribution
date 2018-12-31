package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchRequestEntry extends js.Object {
  /** The account to create or update. Only defined if the method is insert or update. */
  var account: js.UndefOr[Account] = js.undefined
  /** The ID of the targeted account. Only defined if the method is get, delete or claimwebsite. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** Whether the account should be deleted if the account has offers. Only applicable if the method is delete. */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Only applicable if the method is claimwebsite. Indicates whether or not to take the claim from another account in case there is a conflict. */
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

