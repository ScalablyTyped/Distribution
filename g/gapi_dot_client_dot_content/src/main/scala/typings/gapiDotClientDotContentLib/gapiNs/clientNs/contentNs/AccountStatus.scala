package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatus extends js.Object {
  /** The ID of the account for which the status is reported. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** A list of account level issues. */
  var accountLevelIssues: js.UndefOr[js.Array[AccountStatusAccountLevelIssue]] = js.undefined
  /** A list of data quality issues. */
  var dataQualityIssues: js.UndefOr[js.Array[AccountStatusDataQualityIssue]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountStatus". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the account's website is claimed or not. */
  var websiteClaimed: js.UndefOr[scala.Boolean] = js.undefined
}

object AccountStatus {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    accountLevelIssues: js.Array[AccountStatusAccountLevelIssue] = null,
    dataQualityIssues: js.Array[AccountStatusDataQualityIssue] = null,
    kind: java.lang.String = null,
    websiteClaimed: js.UndefOr[scala.Boolean] = js.undefined
  ): AccountStatus = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (accountLevelIssues != null) __obj.updateDynamic("accountLevelIssues")(accountLevelIssues)
    if (dataQualityIssues != null) __obj.updateDynamic("dataQualityIssues")(dataQualityIssues)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(websiteClaimed)) __obj.updateDynamic("websiteClaimed")(websiteClaimed)
    __obj.asInstanceOf[AccountStatus]
  }
}

