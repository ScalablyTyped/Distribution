package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a read feed or query operation. */
@js.native
trait IFeedOptions extends js.Object {
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[String] = js.native
  /** Allow order by with low precision (only for queryDocuments(), sortBy() and sortByDescending()) */
  var enableLowPrecisionOrderBy: js.UndefOr[Boolean] = js.native
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths (only for queryDocuments() and queryAttachments()) */
  var enableScan: js.UndefOr[Boolean] = js.native
  /**
    * Max number of items to be returned in the enumeration operation.
    * Value is 100 by default
    */
  var pageSize: js.UndefOr[Double] = js.native
}

object IFeedOptions {
  @scala.inline
  def apply(): IFeedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFeedOptions]
  }
  @scala.inline
  implicit class IFeedOptionsOps[Self <: IFeedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContinuation(value: String): Self = this.set("continuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuation: Self = this.set("continuation", js.undefined)
    @scala.inline
    def setEnableLowPrecisionOrderBy(value: Boolean): Self = this.set("enableLowPrecisionOrderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLowPrecisionOrderBy: Self = this.set("enableLowPrecisionOrderBy", js.undefined)
    @scala.inline
    def setEnableScan(value: Boolean): Self = this.set("enableScan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableScan: Self = this.set("enableScan", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
  }
  
}

