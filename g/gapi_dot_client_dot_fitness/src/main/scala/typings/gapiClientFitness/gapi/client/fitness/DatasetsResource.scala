package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFitness.AnonCurrentTimeMillis
import typings.gapiClientFitness.AnonDataSourceId
import typings.gapiClientFitness.AnonDatasetId
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
  def delete(request: AnonCurrentTimeMillis): Request_[Unit]
  /**
    * Returns a dataset containing all data points whose start and end times overlap with the specified range of the dataset minimum start time and maximum
    * end time. Specifically, any data point whose start time is less than or equal to the dataset end time and whose end time is greater than or equal to
    * the dataset start time.
    */
  def get(request: AnonDataSourceId): Request_[Dataset]
  /**
    * Adds data points to a dataset. The dataset need not be previously created. All points within the given dataset will be returned with subsquent calls to
    * retrieve this dataset. Data points can belong to more than one dataset. This method does not use patch semantics.
    */
  def patch(request: AnonDatasetId): Request_[Dataset]
}

object DatasetsResource {
  @scala.inline
  def apply(
    delete: AnonCurrentTimeMillis => Request_[Unit],
    get: AnonDataSourceId => Request_[Dataset],
    patch: AnonDatasetId => Request_[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[DatasetsResource]
  }
}

