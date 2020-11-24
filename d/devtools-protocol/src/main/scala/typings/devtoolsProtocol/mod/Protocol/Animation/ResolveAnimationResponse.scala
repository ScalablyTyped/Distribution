package typings.devtoolsProtocol.mod.Protocol.Animation

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveAnimationResponse extends js.Object {
  
  /**
    * Corresponding remote object.
    */
  var remoteObject: RemoteObject = js.native
}
object ResolveAnimationResponse {
  
  @scala.inline
  def apply(remoteObject: RemoteObject): ResolveAnimationResponse = {
    val __obj = js.Dynamic.literal(remoteObject = remoteObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveAnimationResponse]
  }
  
  @scala.inline
  implicit class ResolveAnimationResponseOps[Self <: ResolveAnimationResponse] (val x: Self) extends AnyVal {
    
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
    def setRemoteObject(value: RemoteObject): Self = this.set("remoteObject", value.asInstanceOf[js.Any])
  }
}
