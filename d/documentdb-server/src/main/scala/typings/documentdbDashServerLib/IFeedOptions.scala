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

