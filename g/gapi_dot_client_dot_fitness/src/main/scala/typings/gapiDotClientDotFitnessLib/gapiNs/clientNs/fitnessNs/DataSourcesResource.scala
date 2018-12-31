package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

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
  def create(request: gapiDotClientDotFitnessLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[DataSource]
  /** Deletes the specified data source. The request will fail if the data source contains any data points. */
  def delete(request: gapiDotClientDotFitnessLib.Anon_PrettyPrintDataSourceIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[DataSource]
  /** Returns the specified data source. */
  def get(request: gapiDotClientDotFitnessLib.Anon_PrettyPrintDataSourceIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[DataSource]
  /**
    * Lists all data sources that are visible to the developer, using the OAuth scopes provided. The list is not exhaustive; the user may have private data
    * sources that are only visible to other developers, or calls using other scopes.
    */
  def list(request: gapiDotClientDotFitnessLib.Anon_PrettyPrintQuotaUserDataTypeName): gapiDotClientLib.gapiNs.clientNs.Request[ListDataSourcesResponse]
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId. This method supports patch semantics.
    */
  def patch(request: gapiDotClientDotFitnessLib.Anon_PrettyPrintDataSourceIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[DataSource]
  /**
    * Updates the specified data source. The dataStreamId, dataType, type, dataStreamName, and device properties with the exception of version, cannot be
    * modified.
    *
    * Data sources are identified by their dataStreamId.
    */
  def update(request: gapiDotClientDotFitnessLib.Anon_PrettyPrintDataSourceIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[DataSource]
}

