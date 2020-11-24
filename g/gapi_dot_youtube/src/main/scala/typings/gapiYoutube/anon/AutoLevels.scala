package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoLevels extends js.Object {
  
  /**
    * HTTP Request Body
    */
  var RequestBody: js.UndefOr[String] = js.native
  
  /**
    * The autoLevels parameter specifies whether the video should be auto-leveled by YouTube.
    */
  var autoLevels: js.UndefOr[Boolean] = js.native
  
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  
  /**
    * This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners. The onBehalfOfContentOwnerChannel parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the channel specified in the parameter value. This parameter must be used in conjunction with the onBehalfOfContentOwner parameter, and the user must be authenticated using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. In addition, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    */
  var onBehalfOfContentOwnerChannel: js.UndefOr[String] = js.native
  
  /**
    * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. The part names that you can include in the parameter value are snippet, contentDetails, player, statistics, status, and topicDetails. However, not all of those parts contain properties that can be set when setting or updating a video's metadata. For example, the statistics object encapsulates statistics that YouTube calculates for a video and does not contain values that you can set or modify. If the parameter value specifies a part that does not contain mutable values, that part will still be included in the API response.
    */
  var part: String = js.native
  
  /**
    * The stabilize parameter specifies whether the video should be stabilized by YouTube.
    */
  var stabilize: js.UndefOr[Boolean] = js.native
}
object AutoLevels {
  
  @scala.inline
  def apply(part: String): AutoLevels = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLevels]
  }
  
  @scala.inline
  implicit class AutoLevelsOps[Self <: AutoLevels] (val x: Self) extends AnyVal {
    
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
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBody(value: String): Self = this.set("RequestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("RequestBody", js.undefined)
    
    @scala.inline
    def setAutoLevels(value: Boolean): Self = this.set("autoLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLevels: Self = this.set("autoLevels", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwnerChannel(value: String): Self = this.set("onBehalfOfContentOwnerChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOfContentOwnerChannel: Self = this.set("onBehalfOfContentOwnerChannel", js.undefined)
    
    @scala.inline
    def setStabilize(value: Boolean): Self = this.set("stabilize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStabilize: Self = this.set("stabilize", js.undefined)
  }
}
