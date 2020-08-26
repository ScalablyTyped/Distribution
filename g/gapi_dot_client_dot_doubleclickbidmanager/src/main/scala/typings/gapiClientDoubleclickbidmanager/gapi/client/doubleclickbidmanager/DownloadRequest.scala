package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadRequest extends js.Object {
  /** File types that will be returned. */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The IDs of the specified filter type. This is used to filter entities to fetch. At least one ID must be specified. Only one ID is allowed for the
    * ADVERTISER_ID filter type. For INSERTION_ORDER_ID or LINE_ITEM_ID filter types, all IDs must be from the same Advertiser.
    */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  /** Filter type used to filter line items to fetch. */
  var filterType: js.UndefOr[String] = js.native
  /** SDF Version (column names, types, order) in which the entities will be returned. Default to 3. */
  var version: js.UndefOr[String] = js.native
}

object DownloadRequest {
  @scala.inline
  def apply(): DownloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadRequest]
  }
  @scala.inline
  implicit class DownloadRequestOps[Self <: DownloadRequest] (val x: Self) extends AnyVal {
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
    def setFileTypesVarargs(value: String*): Self = this.set("fileTypes", js.Array(value :_*))
    @scala.inline
    def setFileTypes(value: js.Array[String]): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileTypes: Self = this.set("fileTypes", js.undefined)
    @scala.inline
    def setFilterIdsVarargs(value: String*): Self = this.set("filterIds", js.Array(value :_*))
    @scala.inline
    def setFilterIds(value: js.Array[String]): Self = this.set("filterIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterIds: Self = this.set("filterIds", js.undefined)
    @scala.inline
    def setFilterType(value: String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

