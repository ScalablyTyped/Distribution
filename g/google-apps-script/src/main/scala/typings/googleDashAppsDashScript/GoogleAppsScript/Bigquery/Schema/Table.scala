package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var clustering: js.UndefOr[Clustering] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var expirationTime: js.UndefOr[String] = js.undefined
  var externalDataConfiguration: js.UndefOr[ExternalDataConfiguration] = js.undefined
  var friendlyName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[js.Object] = js.undefined
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var materializedView: js.UndefOr[MaterializedViewDefinition] = js.undefined
  var model: js.UndefOr[ModelDefinition] = js.undefined
  var numBytes: js.UndefOr[String] = js.undefined
  var numLongTermBytes: js.UndefOr[String] = js.undefined
  var numPhysicalBytes: js.UndefOr[String] = js.undefined
  var numRows: js.UndefOr[String] = js.undefined
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.undefined
  var requirePartitionFilter: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[TableSchema] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var streamingBuffer: js.UndefOr[Streamingbuffer] = js.undefined
  var tableReference: js.UndefOr[TableReference] = js.undefined
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[ViewDefinition] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    clustering: Clustering = null,
    creationTime: String = null,
    description: String = null,
    encryptionConfiguration: EncryptionConfiguration = null,
    etag: String = null,
    expirationTime: String = null,
    externalDataConfiguration: ExternalDataConfiguration = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: js.Object = null,
    lastModifiedTime: String = null,
    location: String = null,
    materializedView: MaterializedViewDefinition = null,
    model: ModelDefinition = null,
    numBytes: String = null,
    numLongTermBytes: String = null,
    numPhysicalBytes: String = null,
    numRows: String = null,
    rangePartitioning: RangePartitioning = null,
    requirePartitionFilter: js.UndefOr[Boolean] = js.undefined,
    schema: TableSchema = null,
    selfLink: String = null,
    streamingBuffer: Streamingbuffer = null,
    tableReference: TableReference = null,
    timePartitioning: TimePartitioning = null,
    `type`: String = null,
    view: ViewDefinition = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (clustering != null) __obj.updateDynamic("clustering")(clustering.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (externalDataConfiguration != null) __obj.updateDynamic("externalDataConfiguration")(externalDataConfiguration.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (materializedView != null) __obj.updateDynamic("materializedView")(materializedView.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (numBytes != null) __obj.updateDynamic("numBytes")(numBytes.asInstanceOf[js.Any])
    if (numLongTermBytes != null) __obj.updateDynamic("numLongTermBytes")(numLongTermBytes.asInstanceOf[js.Any])
    if (numPhysicalBytes != null) __obj.updateDynamic("numPhysicalBytes")(numPhysicalBytes.asInstanceOf[js.Any])
    if (numRows != null) __obj.updateDynamic("numRows")(numRows.asInstanceOf[js.Any])
    if (rangePartitioning != null) __obj.updateDynamic("rangePartitioning")(rangePartitioning.asInstanceOf[js.Any])
    if (!js.isUndefined(requirePartitionFilter)) __obj.updateDynamic("requirePartitionFilter")(requirePartitionFilter.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (streamingBuffer != null) __obj.updateDynamic("streamingBuffer")(streamingBuffer.asInstanceOf[js.Any])
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference.asInstanceOf[js.Any])
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

