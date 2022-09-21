package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaItem extends StObject {
  
  /**
    * Access control list for this item.
    */
  var acl: js.UndefOr[SchemaItemAcl] = js.undefined
  
  /**
    * Item content to be indexed and made text searchable.
    */
  var content: js.UndefOr[SchemaItemContent] = js.undefined
  
  /**
    * The type for this item.
    */
  var itemType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The metadata information.
    */
  var metadata: js.UndefOr[SchemaItemMetadata] = js.undefined
  
  /**
    * The name of the Item. Format: datasources/{source_id\}/items/{item_id\} This is a required field. The maximum length is 1536 characters.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional state connector can store for this item. The maximum length is 10000 bytes.
    */
  var payload: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Queue this item belongs to. The maximum length is 100 characters.
    */
  var queue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the item. Output only field.
    */
  var status: js.UndefOr[SchemaItemStatus] = js.undefined
  
  /**
    * The structured data for the item that should conform to a registered object definition in the schema for the data source.
    */
  var structuredData: js.UndefOr[SchemaItemStructuredData] = js.undefined
  
  /**
    * Required. The indexing system stores the version from the datasource as a byte string and compares the Item version in the index to the version of the queued Item using lexical ordering. Cloud Search Indexing won't index or delete any queued item with a version value that is less than or equal to the version of the currently indexed item. The maximum length for this field is 1024 bytes. For information on how item version affects the deletion process, refer to [Handle revisions after manual deletes](https://developers.google.com/cloud-search/docs/guides/operations).
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaItem {
  
  inline def apply(): SchemaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItem]
  }
  
  extension [Self <: SchemaItem](x: Self) {
    
    inline def setAcl(value: SchemaItemAcl): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setContent(value: SchemaItemContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeNull: Self = StObject.set(x, "itemType", null)
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setMetadata(value: SchemaItemMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueNull: Self = StObject.set(x, "queue", null)
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setStatus(value: SchemaItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStructuredData(value: SchemaItemStructuredData): Self = StObject.set(x, "structuredData", value.asInstanceOf[js.Any])
    
    inline def setStructuredDataUndefined: Self = StObject.set(x, "structuredData", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
