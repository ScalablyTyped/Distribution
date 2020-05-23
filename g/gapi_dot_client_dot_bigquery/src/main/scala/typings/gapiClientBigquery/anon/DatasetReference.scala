package typings.gapiClientBigquery.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetReference extends js.Object {
  /** The dataset reference. Use this property to access specific parts of the dataset's ID, such as project ID or dataset ID. */
  var datasetReference: js.UndefOr[typings.gapiClientBigquery.gapi.client.bigquery.DatasetReference] = js.undefined
  /** A descriptive name for the dataset, if one exists. */
  var friendlyName: js.UndefOr[String] = js.undefined
  /** The fully-qualified, unique, opaque ID of the dataset. */
  var id: js.UndefOr[String] = js.undefined
  /** The resource type. This property always returns the value "bigquery#dataset". */
  var kind: js.UndefOr[String] = js.undefined
  /** The labels associated with this dataset. You can use these to organize and group your datasets. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
}

object DatasetReference {
  @scala.inline
  def apply(
    datasetReference: typings.gapiClientBigquery.gapi.client.bigquery.DatasetReference = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: Record[String, String] = null
  ): DatasetReference = {
    val __obj = js.Dynamic.literal()
    if (datasetReference != null) __obj.updateDynamic("datasetReference")(datasetReference.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetReference]
  }
}

