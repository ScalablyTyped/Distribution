package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceIdKindPlaylistId extends js.Object {
  
  /**
    * The resourceId object contains information that identifies the resource associated with a bulletin post.
    */
  var resourceId: KindPlaylistId = js.native
}
object ResourceIdKindPlaylistId {
  
  @scala.inline
  def apply(resourceId: KindPlaylistId): ResourceIdKindPlaylistId = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdKindPlaylistId]
  }
  
  @scala.inline
  implicit class ResourceIdKindPlaylistIdOps[Self <: ResourceIdKindPlaylistId] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: KindPlaylistId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
  }
}
