package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reason extends js.Object {
  
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: String = js.native
  
  /**
    * The resourceId object contains information that identifies the recommended resource.
    */
  var resourceId: ChannelIdKind = js.native
  
  /**
    * The seedResourceId object contains information about the resource that caused the recommendation.
    */
  var seedResourceId: KindPlaylistId = js.native
}
object Reason {
  
  @scala.inline
  def apply(reason: String, resourceId: ChannelIdKind, seedResourceId: KindPlaylistId): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], seedResourceId = seedResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  @scala.inline
  implicit class ReasonOps[Self <: Reason] (val x: Self) extends AnyVal {
    
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ChannelIdKind): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedResourceId(value: KindPlaylistId): Self = this.set("seedResourceId", value.asInstanceOf[js.Any])
  }
}
