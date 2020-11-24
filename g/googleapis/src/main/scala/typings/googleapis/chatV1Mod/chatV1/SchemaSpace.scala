package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A room or DM in Hangouts Chat.
  */
@js.native
trait SchemaSpace extends js.Object {
  
  /**
    * Output only. The display name (only if the space is a room).
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Resource name of the space, in the form &quot;spaces/ *&quot;.  Example:
    * spaces/AAAAMpdlehYs
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The type of a space.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaSpace {
  
  @scala.inline
  def apply(): SchemaSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpace]
  }
  
  @scala.inline
  implicit class SchemaSpaceOps[Self <: SchemaSpace] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
