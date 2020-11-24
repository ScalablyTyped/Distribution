package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Node Type resource.
  */
@js.native
trait SchemaNodeType extends js.Object {
  
  /**
    * [Output Only] The CPU platform used by this node type.
    */
  var cpuPlatform: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The deprecation status associated with this node type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.native
  
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The number of virtual CPUs that are available to the node
    * type.
    */
  var guestCpus: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The type of the resource. Always compute#nodeType for node
    * types.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Local SSD available to the node type, defined in GB.
    */
  var localSsdGb: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The amount of physical memory available to the node type,
    * defined in MB.
    */
  var memoryMb: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The name of the zone where the node type resides, such as
    * us-central1-a.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaNodeType {
  
  @scala.inline
  def apply(): SchemaNodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeType]
  }
  
  @scala.inline
  implicit class SchemaNodeTypeOps[Self <: SchemaNodeType] (val x: Self) extends AnyVal {
    
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
    def setCpuPlatform(value: String): Self = this.set("cpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuPlatform: Self = this.set("cpuPlatform", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeprecated(value: SchemaDeprecationStatus): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGuestCpus(value: Double): Self = this.set("guestCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestCpus: Self = this.set("guestCpus", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocalSsdGb(value: Double): Self = this.set("localSsdGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSsdGb: Self = this.set("localSsdGb", js.undefined)
    
    @scala.inline
    def setMemoryMb(value: Double): Self = this.set("memoryMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryMb: Self = this.set("memoryMb", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
