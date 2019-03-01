package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a read feed or query operation. */
trait IFeedOptions extends js.Object {
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[java.lang.String] = js.undefined
  /** Allow order by with low precision (only for queryDocuments(), sortBy() and sortByDescending()) */
  var enableLowPrecisionOrderBy: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths (only for queryDocuments() and queryAttachments()) */
  var enableScan: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Max number of items to be returned in the enumeration operation.
  	 * Value is 100 by default
  	 */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
}

object IFeedOptions {
  @scala.inline
  def apply(
    continuation: java.lang.String = null,
    enableLowPrecisionOrderBy: js.UndefOr[scala.Boolean] = js.undefined,
    enableScan: js.UndefOr[scala.Boolean] = js.undefined,
    pageSize: scala.Int | scala.Double = null
  ): IFeedOptions = {
    val __obj = js.Dynamic.literal()
    if (continuation != null) __obj.updateDynamic("continuation")(continuation)
    if (!js.isUndefined(enableLowPrecisionOrderBy)) __obj.updateDynamic("enableLowPrecisionOrderBy")(enableLowPrecisionOrderBy)
    if (!js.isUndefined(enableScan)) __obj.updateDynamic("enableScan")(enableScan)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFeedOptions]
  }
}

