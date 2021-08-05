package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTargetResponse extends StObject {
  
  /**
    * The id of the page opened.
    */
  var targetId: TargetID
}
object CreateTargetResponse {
  
  inline def apply(targetId: TargetID): CreateTargetResponse = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTargetResponse]
  }
  
  extension [Self <: CreateTargetResponse](x: Self) {
    
    inline def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
