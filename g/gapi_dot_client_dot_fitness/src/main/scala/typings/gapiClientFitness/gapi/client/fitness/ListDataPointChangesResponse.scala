package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataPointChangesResponse extends js.Object {
  /** The data stream ID of the data source with data point changes. */
  var dataSourceId: js.UndefOr[String] = js.native
  /** Deleted data points for the user. Note, for modifications this should be parsed before handling insertions. */
  var deletedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.native
  /** Inserted data points for the user. */
  var insertedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.native
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListDataPointChangesResponse {
  @scala.inline
  def apply(): ListDataPointChangesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataPointChangesResponse]
  }
  @scala.inline
  implicit class ListDataPointChangesResponseOps[Self <: ListDataPointChangesResponse] (val x: Self) extends AnyVal {
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
    def setDataSourceId(value: String): Self = this.set("dataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceId: Self = this.set("dataSourceId", js.undefined)
    @scala.inline
    def setDeletedDataPointVarargs(value: DataPoint*): Self = this.set("deletedDataPoint", js.Array(value :_*))
    @scala.inline
    def setDeletedDataPoint(value: js.Array[DataPoint]): Self = this.set("deletedDataPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedDataPoint: Self = this.set("deletedDataPoint", js.undefined)
    @scala.inline
    def setInsertedDataPointVarargs(value: DataPoint*): Self = this.set("insertedDataPoint", js.Array(value :_*))
    @scala.inline
    def setInsertedDataPoint(value: js.Array[DataPoint]): Self = this.set("insertedDataPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertedDataPoint: Self = this.set("insertedDataPoint", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

