package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIsolatedWorldRequest extends js.Object {
  
  /**
    * Id of the frame in which the isolated world should be created.
    */
  var frameId: FrameId = js.native
  
  /**
    * Whether or not universal access should be granted to the isolated world. This is a powerful
    * option, use with caution.
    */
  var grantUniveralAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional name which is reported in the Execution Context.
    */
  var worldName: js.UndefOr[String] = js.native
}
object CreateIsolatedWorldRequest {
  
  @scala.inline
  def apply(frameId: FrameId): CreateIsolatedWorldRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIsolatedWorldRequest]
  }
  
  @scala.inline
  implicit class CreateIsolatedWorldRequestOps[Self <: CreateIsolatedWorldRequest] (val x: Self) extends AnyVal {
    
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
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantUniveralAccess(value: Boolean): Self = this.set("grantUniveralAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantUniveralAccess: Self = this.set("grantUniveralAccess", js.undefined)
    
    @scala.inline
    def setWorldName(value: String): Self = this.set("worldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldName: Self = this.set("worldName", js.undefined)
  }
}
