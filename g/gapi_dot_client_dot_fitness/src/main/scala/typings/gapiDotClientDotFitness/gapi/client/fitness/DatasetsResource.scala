package typings.gapiDotClientDotFitness.gapi.client.fitness

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFitness.Anon_AltCurrentTimeMillis
import typings.gapiDotClientDotFitness.Anon_AltCurrentTimeMillisDataSourceId
import typings.gapiDotClientDotFitness.Anon_AltDataSourceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsResource extends js.Object {
  /**
    * Performs an inclusive delete of all data points whose start and end times have any overlap with the time range specified by the dataset ID. For most
    * data types, the entire data point will be deleted. For data types where the time span represents a consistent value (such as
    * com.google.activity.segment), and a data point straddles either end point of the dataset, only the overlapping portion of the data point will be
    * deleted.
    */
  def delete(request: Anon_AltCurrentTimeMillis): Request[Unit]
  /**
    * Returns a dataset containing all data points whose start and end times overlap with the specified range of the dataset minimum start time and maximum
    * end time. Specifically, any data point whose start time is less than or equal to the dataset end time and whose end time is greater than or equal to
    * the dataset start time.
    */
  def get(request: Anon_AltDataSourceId): Request[Dataset]
  /**
    * Adds data points to a dataset. The dataset need not be previously created. All points within the given dataset will be returned with subsquent calls to
    * retrieve this dataset. Data points can belong to more than one dataset. This method does not use patch semantics.
    */
  def patch(request: Anon_AltCurrentTimeMillisDataSourceId): Request[Dataset]
}

object DatasetsResource {
  @scala.inline
  def apply(
    delete: Anon_AltCurrentTimeMillis => Request[Unit],
    get: Anon_AltDataSourceId => Request[Dataset],
    patch: Anon_AltCurrentTimeMillisDataSourceId => Request[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[DatasetsResource]
  }
}

