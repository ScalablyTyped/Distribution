package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
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
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setExternalDataConfiguration(value: ExternalDataConfiguration): Self = StObject.set(x, "externalDataConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDataConfigurationUndefined: Self = StObject.set(x, "externalDataConfiguration", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaterializedView(value: MaterializedViewDefinition): Self = StObject.set(x, "materializedView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedViewUndefined: Self = StObject.set(x, "materializedView", js.undefined)
    
    @scala.inline
    def setModel(value: ModelDefinition): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNumBytes(value: String): Self = StObject.set(x, "numBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumBytesUndefined: Self = StObject.set(x, "numBytes", js.undefined)
    
    @scala.inline
    def setNumLongTermBytes(value: String): Self = StObject.set(x, "numLongTermBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumLongTermBytesUndefined: Self = StObject.set(x, "numLongTermBytes", js.undefined)
    
    @scala.inline
    def setNumPhysicalBytes(value: String): Self = StObject.set(x, "numPhysicalBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPhysicalBytesUndefined: Self = StObject.set(x, "numPhysicalBytes", js.undefined)
    
    @scala.inline
    def setNumRows(value: String): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRowsUndefined: Self = StObject.set(x, "numRows", js.undefined)
    
    @scala.inline
    def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    @scala.inline
    def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
    
    @scala.inline
    def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStreamingBuffer(value: Streamingbuffer): Self = StObject.set(x, "streamingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingBufferUndefined: Self = StObject.set(x, "streamingBuffer", js.undefined)
    
    @scala.inline
    def setTableReference(value: TableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
    
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setView(value: ViewDefinition): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
