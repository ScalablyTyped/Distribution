package typings
package gapiDotClientDotBigqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatasetReference extends js.Object {
  /** The dataset reference. Use this property to access specific parts of the dataset's ID, such as project ID or dataset ID. */
  var datasetReference: js.UndefOr[gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.DatasetReference] = js.undefined
  /** A descriptive name for the dataset, if one exists. */
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  /** The fully-qualified, unique, opaque ID of the dataset. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The resource type. This property always returns the value "bigquery#dataset". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The labels associated with this dataset. You can use these to organize and group your datasets. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object Anon_DatasetReference {
  @scala.inline
  def apply(
    datasetReference: gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.DatasetReference = null,
    friendlyName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null
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

