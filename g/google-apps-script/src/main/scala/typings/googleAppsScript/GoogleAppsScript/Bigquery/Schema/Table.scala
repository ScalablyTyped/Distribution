package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  var clustering: js.UndefOr[Clustering] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  var etag: js.UndefOr[String] = js.native
  var expirationTime: js.UndefOr[String] = js.native
  var externalDataConfiguration: js.UndefOr[ExternalDataConfiguration] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[js.Object] = js.native
  var lastModifiedTime: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var materializedView: js.UndefOr[MaterializedViewDefinition] = js.native
  var model: js.UndefOr[ModelDefinition] = js.native
  var numBytes: js.UndefOr[String] = js.native
  var numLongTermBytes: js.UndefOr[String] = js.native
  var numPhysicalBytes: js.UndefOr[String] = js.native
  var numRows: js.UndefOr[String] = js.native
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.native
  var requirePartitionFilter: js.UndefOr[Boolean] = js.native
  var schema: js.UndefOr[TableSchema] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var streamingBuffer: js.UndefOr[Streamingbuffer] = js.native
  var tableReference: js.UndefOr[TableReference] = js.native
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  var `type`: js.UndefOr[String] = js.native
  var view: js.UndefOr[ViewDefinition] = js.native
}

object Table {
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClustering(value: Clustering): Self = this.set("clustering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClustering: Self = this.set("clustering", js.undefined)
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("encryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("encryptionConfiguration", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    @scala.inline
    def setExternalDataConfiguration(value: ExternalDataConfiguration): Self = this.set("externalDataConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalDataConfiguration: Self = this.set("externalDataConfiguration", js.undefined)
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabels(value: js.Object): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMaterializedView(value: MaterializedViewDefinition): Self = this.set("materializedView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterializedView: Self = this.set("materializedView", js.undefined)
    @scala.inline
    def setModel(value: ModelDefinition): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setNumBytes(value: String): Self = this.set("numBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumBytes: Self = this.set("numBytes", js.undefined)
    @scala.inline
    def setNumLongTermBytes(value: String): Self = this.set("numLongTermBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumLongTermBytes: Self = this.set("numLongTermBytes", js.undefined)
    @scala.inline
    def setNumPhysicalBytes(value: String): Self = this.set("numPhysicalBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumPhysicalBytes: Self = this.set("numPhysicalBytes", js.undefined)
    @scala.inline
    def setNumRows(value: String): Self = this.set("numRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumRows: Self = this.set("numRows", js.undefined)
    @scala.inline
    def setRangePartitioning(value: RangePartitioning): Self = this.set("rangePartitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangePartitioning: Self = this.set("rangePartitioning", js.undefined)
    @scala.inline
    def setRequirePartitionFilter(value: Boolean): Self = this.set("requirePartitionFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequirePartitionFilter: Self = this.set("requirePartitionFilter", js.undefined)
    @scala.inline
    def setSchema(value: TableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStreamingBuffer(value: Streamingbuffer): Self = this.set("streamingBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingBuffer: Self = this.set("streamingBuffer", js.undefined)
    @scala.inline
    def setTableReference(value: TableReference): Self = this.set("tableReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableReference: Self = this.set("tableReference", js.undefined)
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = this.set("timePartitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePartitioning: Self = this.set("timePartitioning", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setView(value: ViewDefinition): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

