package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Machine image resource.
  */
@js.native
trait SchemaMachineImage extends js.Object {
  
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
  implicit class SchemaMachineImageOps[Self <: SchemaMachineImage] (val x: Self) extends AnyVal {
    
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMachineImageEncryptionKey(value: SchemaCustomerEncryptionKey): Self = this.set("machineImageEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineImageEncryptionKey: Self = this.set("machineImageEncryptionKey", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = this.set("selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLinkWithId: Self = this.set("selfLinkWithId", js.undefined)
    
    @scala.inline
    def setSourceInstance(value: String): Self = this.set("sourceInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInstance: Self = this.set("sourceInstance", js.undefined)
    
    @scala.inline
    def setSourceInstanceProperties(value: SchemaSourceInstanceProperties): Self = this.set("sourceInstanceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInstanceProperties: Self = this.set("sourceInstanceProperties", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStorageLocationsVarargs(value: String*): Self = this.set("storageLocations", js.Array(value :_*))
    
    @scala.inline
    def setStorageLocations(value: js.Array[String]): Self = this.set("storageLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLocations: Self = this.set("storageLocations", js.undefined)
  }
}
