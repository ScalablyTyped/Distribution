package typings.googleapis.chatV1Mod.chatV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSpacesMessagesCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. Space resource name, in the form "spaces/x". Example:
    * spaces/AAAAMpdlehY
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMessage] = js.native
  
  /**
    * Opaque thread identifier string that can be specified to group messages
    * into a single thread. If this is the first message with a given thread
    * identifier, a new thread is created. Subsequent messages with the same
    * thread identifier will be posted into the same thread. This relieves bots
    * and webhooks from having to store the Hangouts Chat thread ID of a thread
    * (created earlier by them) to post further updates to it.  Has no effect
    * if thread field, corresponding to an existing thread, is set in message.
    */
  var threadKey: js.UndefOr[String] = js.native
}
object ParamsResourceSpacesMessagesCreate {
  
  @scala.inline
  def apply(): ParamsResourceSpacesMessagesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpacesMessagesCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceSpacesMessagesCreateOps[Self <: ParamsResourceSpacesMessagesCreate] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaMessage): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setThreadKey(value: String): Self = this.set("threadKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadKey: Self = this.set("threadKey", js.undefined)
  }
}
