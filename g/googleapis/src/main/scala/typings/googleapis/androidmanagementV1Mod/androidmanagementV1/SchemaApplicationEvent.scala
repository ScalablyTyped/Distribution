package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An app-related event.
  */
@js.native
trait SchemaApplicationEvent extends js.Object {
  
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * App event type.
    */
  var eventType: js.UndefOr[String] = js.native
}
object SchemaApplicationEvent {
  
  @scala.inline
  def apply(): SchemaApplicationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationEvent]
  }
  
  @scala.inline
  implicit class SchemaApplicationEventOps[Self <: SchemaApplicationEvent] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
  }
}
