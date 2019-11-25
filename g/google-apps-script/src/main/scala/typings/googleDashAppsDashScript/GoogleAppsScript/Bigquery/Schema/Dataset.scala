package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  var access: js.UndefOr[js.Array[DatasetAccess]] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var datasetReference: js.UndefOr[DatasetReference] = js.undefined
  var defaultPartitionExpirationMs: js.UndefOr[String] = js.undefined
  var defaultTableExpirationMs: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var friendlyName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[js.Object] = js.undefined
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object Dataset {
  @scala.inline
  def apply(
    access: js.Array[DatasetAccess] = null,
    creationTime: String = null,
    datasetReference: DatasetReference = null,
    defaultPartitionExpirationMs: String = null,
    defaultTableExpirationMs: String = null,
    description: String = null,
    etag: String = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: js.Object = null,
    lastModifiedTime: String = null,
    location: String = null,
    selfLink: String = null
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (datasetReference != null) __obj.updateDynamic("datasetReference")(datasetReference.asInstanceOf[js.Any])
    if (defaultPartitionExpirationMs != null) __obj.updateDynamic("defaultPartitionExpirationMs")(defaultPartitionExpirationMs.asInstanceOf[js.Any])
    if (defaultTableExpirationMs != null) __obj.updateDynamic("defaultTableExpirationMs")(defaultTableExpirationMs.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
}

