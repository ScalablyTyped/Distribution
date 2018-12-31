package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upload extends js.Object {
  /** Account Id to which this upload belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Custom data source Id to which this data import belongs. */
  var customDataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /** Data import errors collection. */
  var errors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A unique ID for this upload. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics upload. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Upload status. Possible values: PENDING, COMPLETED, FAILED, DELETING, DELETED. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Time this file is uploaded. */
  var uploadTime: js.UndefOr[java.lang.String] = js.undefined
}

