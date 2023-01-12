package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdFrameStatus extends StObject {
  
  var adFrameType: AdFrameType
  
  var explanations: js.UndefOr[js.Array[AdFrameExplanation]] = js.undefined
}
object AdFrameStatus {
  
  inline def apply(adFrameType: AdFrameType): AdFrameStatus = {
    val __obj = js.Dynamic.literal(adFrameType = adFrameType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdFrameStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdFrameStatus] (val x: Self) extends AnyVal {
    
    inline def setAdFrameType(value: AdFrameType): Self = StObject.set(x, "adFrameType", value.asInstanceOf[js.Any])
    
    inline def setExplanations(value: js.Array[AdFrameExplanation]): Self = StObject.set(x, "explanations", value.asInstanceOf[js.Any])
    
    inline def setExplanationsUndefined: Self = StObject.set(x, "explanations", js.undefined)
    
    inline def setExplanationsVarargs(value: AdFrameExplanation*): Self = StObject.set(x, "explanations", js.Array(value*))
  }
}
