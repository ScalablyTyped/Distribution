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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTargetResponse] (val x: Self) extends AnyVal {
    
    inline def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
