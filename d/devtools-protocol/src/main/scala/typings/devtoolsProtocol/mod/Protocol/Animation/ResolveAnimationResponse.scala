package typings.devtoolsProtocol.mod.Protocol.Animation

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveAnimationResponse extends StObject {
  
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
  implicit class ResolveAnimationResponseMutableBuilder[Self <: ResolveAnimationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoteObject(value: RemoteObject): Self = StObject.set(x, "remoteObject", value.asInstanceOf[js.Any])
  }
}
