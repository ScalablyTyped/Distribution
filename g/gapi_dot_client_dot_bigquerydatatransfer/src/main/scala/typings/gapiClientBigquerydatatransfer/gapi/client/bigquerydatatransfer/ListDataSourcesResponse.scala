package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourcesResponse extends js.Object {
  /** List of supported data sources and their transfer settings. */
  var dataSources: js.UndefOr[js.Array[DataSource]] = js.native
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the
    * `ListDataSourcesRequest.page_token`
    * to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListDataSourcesResponse {
  @scala.inline
  def apply(): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
  @scala.inline
  implicit class ListDataSourcesResponseOps[Self <: ListDataSourcesResponse] (val x: Self) extends AnyVal {
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
    def setDataSourcesVarargs(value: DataSource*): Self = this.set("dataSources", js.Array(value :_*))
    @scala.inline
    def setDataSources(value: js.Array[DataSource]): Self = this.set("dataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSources: Self = this.set("dataSources", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

