package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Machine image resource.
  */
@js.native
trait SchemaMachineImage extends StObject {
  
  /**
    * [Output Only] The creation timestamp for this machine image in RFC3339
    * text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] A unique identifier for this machine image. The server
    * defines this identifier.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The resource type, which is always compute#machineImage for
    * machine image.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Encryption key to protect the machine image.
    */
  var machineImageEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.native
  
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The URL for this machine image. The server defines this
    * URL.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  
  /**
    * The source instance used to create the machine image. You can provide
    * this as a partial or full URL to the resource. For example, the following
    * are valid values:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
    * - projects/project/zones/zone/instances/instance
    */
  var sourceInstance: js.UndefOr[String] = js.native
  
  /**
    * Properties of source instance.
    */
  var sourceInstanceProperties: js.UndefOr[SchemaSourceInstanceProperties] = js.native
  
  /**
    * [Output Only] The status of disk creation.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * GCS bucket storage location of the snapshot (regional or multi-regional).
    */
  var storageLocations: js.UndefOr[js.Array[String]] = js.native
}
object SchemaMachineImage {
  
  @scala.inline
  def apply(): SchemaMachineImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMachineImage]
  }
  
  @scala.inline
  implicit class SchemaMachineImageMutableBuilder[Self <: SchemaMachineImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMachineImageEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "machineImageEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineImageEncryptionKeyUndefined: Self = StObject.set(x, "machineImageEncryptionKey", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setSourceInstance(value: String): Self = StObject.set(x, "sourceInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceInstanceProperties(value: SchemaSourceInstanceProperties): Self = StObject.set(x, "sourceInstanceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceInstancePropertiesUndefined: Self = StObject.set(x, "sourceInstanceProperties", js.undefined)
    
    @scala.inline
    def setSourceInstanceUndefined: Self = StObject.set(x, "sourceInstance", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStorageLocations(value: js.Array[String]): Self = StObject.set(x, "storageLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLocationsUndefined: Self = StObject.set(x, "storageLocations", js.undefined)
    
    @scala.inline
    def setStorageLocationsVarargs(value: String*): Self = StObject.set(x, "storageLocations", js.Array(value :_*))
  }
}
