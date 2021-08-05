package typings.devtoolsProtocol.mod.Protocol.Animation

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveAnimationResponse extends StObject {
  
  /**
    * Corresponding remote object.
    */
  var remoteObject: RemoteObject
}
object ResolveAnimationResponse {
  
  inline def apply(remoteObject: RemoteObject): ResolveAnimationResponse = {
    val __obj = js.Dynamic.literal(remoteObject = remoteObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveAnimationResponse]
  }
  
  extension [Self <: ResolveAnimationResponse](x: Self) {
    
    inline def setRemoteObject(value: RemoteObject): Self = StObject.set(x, "remoteObject", value.asInstanceOf[js.Any])
  }
}
