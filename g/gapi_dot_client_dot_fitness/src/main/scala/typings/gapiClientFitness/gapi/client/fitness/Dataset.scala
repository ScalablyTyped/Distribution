package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  /** The data stream ID of the data source that created the points in this dataset. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  /**
    * The largest end time of all data points in this possibly partial representation of the dataset. Time is in nanoseconds from epoch. This should also
    * match the first part of the dataset identifier.
    */
  var maxEndTimeNs: js.UndefOr[String] = js.undefined
  /**
    * The smallest start time of all data points in this possibly partial representation of the dataset. Time is in nanoseconds from epoch. This should also
    * match the first part of the dataset identifier.
    */
  var minStartTimeNs: js.UndefOr[String] = js.undefined
  /**
    * This token will be set when a dataset is received in response to a GET request and the dataset is too large to be included in a single response.
    * Provide this value in a subsequent GET request to return the next page of data points within this dataset.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * A partial list of data points contained in the dataset, ordered by largest endTimeNanos first. This list is considered complete when retrieving a small
    * dataset and partial when patching a dataset or retrieving a dataset that is too large to include in a single response.
    */
  var point: js.UndefOr[js.Array[DataPoint]] = js.undefined
}

object Dataset {
  @scala.inline
  def apply(
    dataSourceId: String = null,
    maxEndTimeNs: String = null,
    minStartTimeNs: String = null,
    nextPageToken: String = null,
    point: js.Array[DataPoint] = null
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId.asInstanceOf[js.Any])
    if (maxEndTimeNs != null) __obj.updateDynamic("maxEndTimeNs")(maxEndTimeNs.asInstanceOf[js.Any])
    if (minStartTimeNs != null) __obj.updateDynamic("minStartTimeNs")(minStartTimeNs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
}

