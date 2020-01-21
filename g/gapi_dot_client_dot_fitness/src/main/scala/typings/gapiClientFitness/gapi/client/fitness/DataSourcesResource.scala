package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFitness.AnonAltDataSourceIdFields
import typings.gapiClientFitness.AnonAltDataTypeName
import typings.gapiClientFitness.AnonAltFields
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
  def create(request: AnonAltFields): Request_[DataSource]
  /** Deletes the specified data source. The request will fail if the data source contains any data points. */
  def delete(request: AnonAltDataSourceIdFields): Request_[DataSource]
  /** Returns the specified data source. */
  def get(request: AnonAltDataSourceIdFields): Request_[DataSource]
  /**
    * Lists all data sources that are visible to the developer, using the OAuth scopes provided. The list is not exhaustive; the user may have private data
    * sources that are only visible to other developers, or calls using other scopes.
    */
  def list(request: AnonAltDataTypeName): Request_[ListDataSourcesResponse]
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId. This method supports patch semantics.
    */
  def patch(request: AnonAltDataSourceIdFields): Request_[DataSource]
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId.
    */
  def update(request: AnonAltDataSourceIdFields): Request_[DataSource]
}

object DataSourcesResource {
  @scala.inline
  def apply(
    create: AnonAltFields => Request_[DataSource],
    dataPointChanges: DataPointChangesResource,
    datasets: DatasetsResource,
    delete: AnonAltDataSourceIdFields => Request_[DataSource],
    get: AnonAltDataSourceIdFields => Request_[DataSource],
    list: AnonAltDataTypeName => Request_[ListDataSourcesResponse],
    patch: AnonAltDataSourceIdFields => Request_[DataSource],
    update: AnonAltDataSourceIdFields => Request_[DataSource]
  ): DataSourcesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), dataPointChanges = dataPointChanges.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DataSourcesResource]
  }
}

