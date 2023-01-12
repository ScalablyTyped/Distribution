package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetsResponse extends StObject {
  
  /**
    * The list of targets.
    */
  var targetInfos: js.Array[TargetInfo]
}
object GetTargetsResponse {
  
  inline def apply(targetInfos: js.Array[TargetInfo]): GetTargetsResponse = {
    val __obj = js.Dynamic.literal(targetInfos = targetInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTargetsResponse] (val x: Self) extends AnyVal {
    
    inline def setTargetInfos(value: js.Array[TargetInfo]): Self = StObject.set(x, "targetInfos", value.asInstanceOf[js.Any])
    
    inline def setTargetInfosVarargs(value: TargetInfo*): Self = StObject.set(x, "targetInfos", js.Array(value*))
  }
}
