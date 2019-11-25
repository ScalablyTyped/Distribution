package typings.gapiDotClientDotFitness.gapi.client.fitness

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFitness.Anon_AltDataSourceIdFields
import typings.gapiDotClientDotFitness.Anon_AltDataTypeName
import typings.gapiDotClientDotFitness.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourcesResource extends js.Object {
  var dataPointChanges: DataPointChangesResource
  var datasets: DatasetsResource
  /**
    * Creates a new data source that is unique across all data sources belonging to this user. The data stream ID field can be omitted and will be generated
    * by the server with the correct format. The data stream ID is an ordered combination of some fields from the data source. In addition to the data source
    * fields reflected into the data source ID, the developer project number that is authenticated when creating the data source is included. This developer
    * project number is obfuscated when read by any other developer reading public data types.
    */
  def create(request: Anon_AltFields): Request[DataSource]
  /** Deletes the specified data source. The request will fail if the data source contains any data points. */
  def delete(request: Anon_AltDataSourceIdFields): Request[DataSource]
  /** Returns the specified data source. */
  def get(request: Anon_AltDataSourceIdFields): Request[DataSource]
  /**
    * Lists all data sources that are visible to the developer, using the OAuth scopes provided. The list is not exhaustive; the user may have private data
    * sources that are only visible to other developers, or calls using other scopes.
    */
  def list(request: Anon_AltDataTypeName): Request[ListDataSourcesResponse]
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId. This method supports patch semantics.
    */
  def patch(request: Anon_AltDataSourceIdFields): Request[DataSource]
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId.
    */
  def update(request: Anon_AltDataSourceIdFields): Request[DataSource]
}

object DataSourcesResource {
  @scala.inline
  def apply(
    create: Anon_AltFields => Request[DataSource],
    dataPointChanges: DataPointChangesResource,
    datasets: DatasetsResource,
    delete: Anon_AltDataSourceIdFields => Request[DataSource],
    get: Anon_AltDataSourceIdFields => Request[DataSource],
    list: Anon_AltDataTypeName => Request[ListDataSourcesResponse],
    patch: Anon_AltDataSourceIdFields => Request[DataSource],
    update: Anon_AltDataSourceIdFields => Request[DataSource]
  ): DataSourcesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), dataPointChanges = dataPointChanges.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DataSourcesResource]
  }
}

