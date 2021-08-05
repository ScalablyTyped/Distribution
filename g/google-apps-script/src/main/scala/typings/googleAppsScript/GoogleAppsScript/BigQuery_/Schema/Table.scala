package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table extends StObject {
  
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
  
  inline def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  extension [Self <: Table](x: Self) {
    
    inline def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    inline def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setExternalDataConfiguration(value: ExternalDataConfiguration): Self = StObject.set(x, "externalDataConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExternalDataConfigurationUndefined: Self = StObject.set(x, "externalDataConfiguration", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaterializedView(value: MaterializedViewDefinition): Self = StObject.set(x, "materializedView", value.asInstanceOf[js.Any])
    
    inline def setMaterializedViewUndefined: Self = StObject.set(x, "materializedView", js.undefined)
    
    inline def setModel(value: ModelDefinition): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNumBytes(value: String): Self = StObject.set(x, "numBytes", value.asInstanceOf[js.Any])
    
    inline def setNumBytesUndefined: Self = StObject.set(x, "numBytes", js.undefined)
    
    inline def setNumLongTermBytes(value: String): Self = StObject.set(x, "numLongTermBytes", value.asInstanceOf[js.Any])
    
    inline def setNumLongTermBytesUndefined: Self = StObject.set(x, "numLongTermBytes", js.undefined)
    
    inline def setNumPhysicalBytes(value: String): Self = StObject.set(x, "numPhysicalBytes", value.asInstanceOf[js.Any])
    
    inline def setNumPhysicalBytesUndefined: Self = StObject.set(x, "numPhysicalBytes", js.undefined)
    
    inline def setNumRows(value: String): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
    
    inline def setNumRowsUndefined: Self = StObject.set(x, "numRows", js.undefined)
    
    inline def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    inline def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    inline def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
    
    inline def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
    
    inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStreamingBuffer(value: Streamingbuffer): Self = StObject.set(x, "streamingBuffer", value.asInstanceOf[js.Any])
    
    inline def setStreamingBufferUndefined: Self = StObject.set(x, "streamingBuffer", js.undefined)
    
    inline def setTableReference(value: TableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    inline def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
    
    inline def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    inline def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setView(value: ViewDefinition): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
