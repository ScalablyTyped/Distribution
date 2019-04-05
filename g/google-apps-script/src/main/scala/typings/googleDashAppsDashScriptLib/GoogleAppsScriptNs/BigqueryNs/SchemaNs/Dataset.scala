package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  var access: js.UndefOr[js.Array[DatasetAccess]] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var datasetReference: js.UndefOr[DatasetReference] = js.undefined
  var defaultPartitionExpirationMs: js.UndefOr[java.lang.String] = js.undefined
  var defaultTableExpirationMs: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[js.Object] = js.undefined
  var lastModifiedTime: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object Dataset {
  @scala.inline
  def apply(
    access: js.Array[DatasetAccess] = null,
    creationTime: java.lang.String = null,
    datasetReference: DatasetReference = null,
    defaultPartitionExpirationMs: java.lang.String = null,
    defaultTableExpirationMs: java.lang.String = null,
    description: java.lang.String = null,
    etag: java.lang.String = null,
    friendlyName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    labels: js.Object = null,
    lastModifiedTime: java.lang.String = null,
    location: java.lang.String = null,
    selfLink: java.lang.String = null
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (datasetReference != null) __obj.updateDynamic("datasetReference")(datasetReference)
    if (defaultPartitionExpirationMs != null) __obj.updateDynamic("defaultPartitionExpirationMs")(defaultPartitionExpirationMs)
    if (defaultTableExpirationMs != null) __obj.updateDynamic("defaultTableExpirationMs")(defaultTableExpirationMs)
    if (description != null) __obj.updateDynamic("description")(description)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime)
    if (location != null) __obj.updateDynamic("location")(location)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Dataset]
  }
}

