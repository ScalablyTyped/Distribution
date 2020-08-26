package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFitness.anon.DataTypeName
import typings.gapiClientFitness.anon.Fields
import typings.gapiClientFitness.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourcesResource extends js.Object {
  var dataPointChanges: DataPointChangesResource = js.native
  var datasets: DatasetsResource = js.native
  /**
    * Creates a new data source that is unique across all data sources belonging to this user. The data stream ID field can be omitted and will be generated
    * by the server with the correct format. The data stream ID is an ordered combination of some fields from the data source. In addition to the data source
    * fields reflected into the data source ID, the developer project number that is authenticated when creating the data source is included. This developer
    * project number is obfuscated when read by any other developer reading public data types.
    */
  def create(request: Fields): Request[DataSource] = js.native
  /** Deletes the specified data source. The request will fail if the data source contains any data points. */
  def delete(request: Key): Request[DataSource] = js.native
  /** Returns the specified data source. */
  def get(request: Key): Request[DataSource] = js.native
  /**
    * Lists all data sources that are visible to the developer, using the OAuth scopes provided. The list is not exhaustive; the user may have private data
    * sources that are only visible to other developers, or calls using other scopes.
    */
  def list(request: DataTypeName): Request[ListDataSourcesResponse] = js.native
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId. This method supports patch semantics.
    */
  def patch(request: Key): Request[DataSource] = js.native
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId.
    */
  def update(request: Key): Request[DataSource] = js.native
}

object DataSourcesResource {
  @scala.inline
  def apply(
    create: Fields => Request[DataSource],
    dataPointChanges: DataPointChangesResource,
    datasets: DatasetsResource,
    delete: Key => Request[DataSource],
    get: Key => Request[DataSource],
    list: DataTypeName => Request[ListDataSourcesResponse],
    patch: Key => Request[DataSource],
    update: Key => Request[DataSource]
  ): DataSourcesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), dataPointChanges = dataPointChanges.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DataSourcesResource]
  }
  @scala.inline
  implicit class DataSourcesResourceOps[Self <: DataSourcesResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Fields => Request[DataSource]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDataPointChanges(value: DataPointChangesResource): Self = this.set("dataPointChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatasets(value: DatasetsResource): Self = this.set("datasets", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: Key => Request[DataSource]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[DataSource]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: DataTypeName => Request[ListDataSourcesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Key => Request[DataSource]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[DataSource]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

