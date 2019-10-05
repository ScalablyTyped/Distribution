package typings.gapiDotClientDotBigquery

import typings.gapiDotClientDotBigquery.gapi.client.bigquery.DatasetReference
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatasetReference extends js.Object {
  /** The dataset reference. Use this property to access specific parts of the dataset's ID, such as project ID or dataset ID. */
  var datasetReference: js.UndefOr[DatasetReference] = js.undefined
  /** A descriptive name for the dataset, if one exists. */
  var friendlyName: js.UndefOr[String] = js.undefined
  /** The fully-qualified, unique, opaque ID of the dataset. */
  var id: js.UndefOr[String] = js.undefined
  /** The resource type. This property always returns the value "bigquery#dataset". */
  var kind: js.UndefOr[String] = js.undefined
  /** The labels associated with this dataset. You can use these to organize and group your datasets. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
}

object Anon_DatasetReference {
  @scala.inline
  def apply(
    datasetReference: DatasetReference = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: Record[String, String] = null
  ): Anon_DatasetReference = {
    val __obj = js.Dynamic.literal()
    if (datasetReference != null) __obj.updateDynamic("datasetReference")(datasetReference)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[Anon_DatasetReference]
  }
}

