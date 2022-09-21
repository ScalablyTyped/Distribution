package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMachineImage extends StObject {
  
  /**
    * [Output Only] The creation timestamp for this machine image in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process.
    */
  var guestFlush: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] A unique identifier for this machine image. The server defines this identifier.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Properties of source instance
    */
  var instanceProperties: js.UndefOr[SchemaInstanceProperties] = js.undefined
  
  /**
    * [Output Only] The resource type, which is always compute#machineImage for machine image.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
    */
  var machineImageEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Reserved for future use.
    */
  var satisfiesPzs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An array of Machine Image specific properties for disks attached to the source instance
    */
  var savedDisks: js.UndefOr[js.Array[SchemaSavedDisk]] = js.undefined
  
  /**
    * [Output Only] The URL for this machine image. The server defines this URL.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
    */
  var sourceDiskEncryptionKeys: js.UndefOr[js.Array[SchemaSourceDiskEncryptionKey]] = js.undefined
  
  /**
    * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
    */
  var sourceInstance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] DEPRECATED: Please use instance_properties instead for source instance related properties. New properties will not be added to this field.
    */
  var sourceInstanceProperties: js.UndefOr[SchemaSourceInstanceProperties] = js.undefined
  
  /**
    * [Output Only] The status of the machine image. One of the following values: INVALID, CREATING, READY, DELETING, and UPLOADING.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
    */
  var storageLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [Output Only] Total size of the storage used by the machine image.
    */
  var totalStorageBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaMachineImage {
  
  inline def apply(): SchemaMachineImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMachineImage]
  }
  
  extension [Self <: SchemaMachineImage](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGuestFlush(value: Boolean): Self = StObject.set(x, "guestFlush", value.asInstanceOf[js.Any])
    
    inline def setGuestFlushNull: Self = StObject.set(x, "guestFlush", null)
    
    inline def setGuestFlushUndefined: Self = StObject.set(x, "guestFlush", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstanceProperties(value: SchemaInstanceProperties): Self = StObject.set(x, "instanceProperties", value.asInstanceOf[js.Any])
    
    inline def setInstancePropertiesUndefined: Self = StObject.set(x, "instanceProperties", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMachineImageEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "machineImageEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setMachineImageEncryptionKeyUndefined: Self = StObject.set(x, "machineImageEncryptionKey", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsNull: Self = StObject.set(x, "satisfiesPzs", null)
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setSavedDisks(value: js.Array[SchemaSavedDisk]): Self = StObject.set(x, "savedDisks", value.asInstanceOf[js.Any])
    
    inline def setSavedDisksUndefined: Self = StObject.set(x, "savedDisks", js.undefined)
    
    inline def setSavedDisksVarargs(value: SchemaSavedDisk*): Self = StObject.set(x, "savedDisks", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdNull: Self = StObject.set(x, "selfLinkWithId", null)
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setSourceDiskEncryptionKeys(value: js.Array[SchemaSourceDiskEncryptionKey]): Self = StObject.set(x, "sourceDiskEncryptionKeys", value.asInstanceOf[js.Any])
    
    inline def setSourceDiskEncryptionKeysUndefined: Self = StObject.set(x, "sourceDiskEncryptionKeys", js.undefined)
    
    inline def setSourceDiskEncryptionKeysVarargs(value: SchemaSourceDiskEncryptionKey*): Self = StObject.set(x, "sourceDiskEncryptionKeys", js.Array(value*))
    
    inline def setSourceInstance(value: String): Self = StObject.set(x, "sourceInstance", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceNull: Self = StObject.set(x, "sourceInstance", null)
    
    inline def setSourceInstanceProperties(value: SchemaSourceInstanceProperties): Self = StObject.set(x, "sourceInstanceProperties", value.asInstanceOf[js.Any])
    
    inline def setSourceInstancePropertiesUndefined: Self = StObject.set(x, "sourceInstanceProperties", js.undefined)
    
    inline def setSourceInstanceUndefined: Self = StObject.set(x, "sourceInstance", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStorageLocations(value: js.Array[String]): Self = StObject.set(x, "storageLocations", value.asInstanceOf[js.Any])
    
    inline def setStorageLocationsNull: Self = StObject.set(x, "storageLocations", null)
    
    inline def setStorageLocationsUndefined: Self = StObject.set(x, "storageLocations", js.undefined)
    
    inline def setStorageLocationsVarargs(value: String*): Self = StObject.set(x, "storageLocations", js.Array(value*))
    
    inline def setTotalStorageBytes(value: String): Self = StObject.set(x, "totalStorageBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalStorageBytesNull: Self = StObject.set(x, "totalStorageBytes", null)
    
    inline def setTotalStorageBytesUndefined: Self = StObject.set(x, "totalStorageBytes", js.undefined)
  }
}
