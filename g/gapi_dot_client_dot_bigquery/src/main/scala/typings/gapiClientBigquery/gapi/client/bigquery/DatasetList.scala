package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetList extends js.Object {
  /**
    * An array of the dataset resources in the project. Each resource contains basic information. For full information about a particular dataset resource,
    * use the Datasets: get method. This property is omitted when there are no datasets in the project.
    */
  var datasets: js.UndefOr[js.Array[typings.gapiClientBigquery.anon.DatasetReference]] = js.native
  /** A hash value of the results page. You can use this property to determine if the page has changed since the last request. */
  var etag: js.UndefOr[String] = js.native
  /** The list type. This property always returns the value "bigquery#datasetList". */
  var kind: js.UndefOr[String] = js.native
  /** A token that can be used to request the next results page. This property is omitted on the final results page. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object DatasetList {
  @scala.inline
  def apply(): DatasetList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetList]
  }
  @scala.inline
  implicit class DatasetListOps[Self <: DatasetList] (val x: Self) extends AnyVal {
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
    def setDatasetsVarargs(value: typings.gapiClientBigquery.anon.DatasetReference*): Self = this.set("datasets", js.Array(value :_*))
    @scala.inline
    def setDatasets(value: js.Array[typings.gapiClientBigquery.anon.DatasetReference]): Self = this.set("datasets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasets: Self = this.set("datasets", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

