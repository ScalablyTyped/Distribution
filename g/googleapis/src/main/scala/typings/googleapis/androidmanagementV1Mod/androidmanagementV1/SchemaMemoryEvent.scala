package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event related to memory and storage measurements.
  */
@js.native
trait SchemaMemoryEvent extends js.Object {
  
  /**
    * The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED,
    * the total capacity in bytes of the storage medium.
    */
  var byteCount: js.UndefOr[String] = js.native
  
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Event type.
    */
  var eventType: js.UndefOr[String] = js.native
}
object SchemaMemoryEvent {
  
  @scala.inline
  def apply(): SchemaMemoryEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemoryEvent]
  }
  
  @scala.inline
  implicit class SchemaMemoryEventOps[Self <: SchemaMemoryEvent] (val x: Self) extends AnyVal {
    
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
    def setByteCount(value: String): Self = this.set("byteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteCount: Self = this.set("byteCount", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
  }
}
