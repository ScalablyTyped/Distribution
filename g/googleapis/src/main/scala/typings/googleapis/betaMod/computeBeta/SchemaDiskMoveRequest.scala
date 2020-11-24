package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDiskMoveRequest extends js.Object {
  
  /**
    * The URL of the destination zone to move the disk. This can be a full or
    * partial URL. For example, the following are all valid URLs to a zone:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone  -
    * projects/project/zones/zone  - zones/zone
    */
  var destinationZone: js.UndefOr[String] = js.native
  
  /**
    * The URL of the target disk to move. This can be a full or partial URL.
    * For example, the following are all valid URLs to a disk:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
    * - projects/project/zones/zone/disks/disk  - zones/zone/disks/disk
    */
  var targetDisk: js.UndefOr[String] = js.native
}
object SchemaDiskMoveRequest {
  
  @scala.inline
  def apply(): SchemaDiskMoveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskMoveRequest]
  }
  
  @scala.inline
  implicit class SchemaDiskMoveRequestOps[Self <: SchemaDiskMoveRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationZone(value: String): Self = this.set("destinationZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationZone: Self = this.set("destinationZone", js.undefined)
    
    @scala.inline
    def setTargetDisk(value: String): Self = this.set("targetDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDisk: Self = this.set("targetDisk", js.undefined)
  }
}
