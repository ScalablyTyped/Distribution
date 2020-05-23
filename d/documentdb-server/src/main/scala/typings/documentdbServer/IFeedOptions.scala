package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a read feed or query operation. */
trait IFeedOptions extends js.Object {
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[String] = js.undefined
  /** Allow order by with low precision (only for queryDocuments(), sortBy() and sortByDescending()) */
  var enableLowPrecisionOrderBy: js.UndefOr[Boolean] = js.undefined
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths (only for queryDocuments() and queryAttachments()) */
  var enableScan: js.UndefOr[Boolean] = js.undefined
  /**
    * Max number of items to be returned in the enumeration operation.
    * Value is 100 by default
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}

object IFeedOptions {
  @scala.inline
  def apply(
    continuation: String = null,
    enableLowPrecisionOrderBy: js.UndefOr[Boolean] = js.undefined,
    enableScan: js.UndefOr[Boolean] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined
  ): IFeedOptions = {
    val __obj = js.Dynamic.literal()
    if (continuation != null) __obj.updateDynamic("continuation")(continuation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLowPrecisionOrderBy)) __obj.updateDynamic("enableLowPrecisionOrderBy")(enableLowPrecisionOrderBy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScan)) __obj.updateDynamic("enableScan")(enableScan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFeedOptions]
  }
}

