package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositingReasonsResponse extends StObject {
  
  /**
    * A list of strings specifying reason IDs for the given layer to become composited.
    */
  var compositingReasonIds: js.Array[String]
  
  /**
    * A list of strings specifying reasons for the given layer to become composited.
    */
  var compositingReasons: js.Array[String]
}
object CompositingReasonsResponse {
  
  inline def apply(compositingReasonIds: js.Array[String], compositingReasons: js.Array[String]): CompositingReasonsResponse = {
    val __obj = js.Dynamic.literal(compositingReasonIds = compositingReasonIds.asInstanceOf[js.Any], compositingReasons = compositingReasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositingReasonsResponse]
  }
  
  extension [Self <: CompositingReasonsResponse](x: Self) {
    
    inline def setCompositingReasonIds(value: js.Array[String]): Self = StObject.set(x, "compositingReasonIds", value.asInstanceOf[js.Any])
    
    inline def setCompositingReasonIdsVarargs(value: String*): Self = StObject.set(x, "compositingReasonIds", js.Array(value*))
    
    inline def setCompositingReasons(value: js.Array[String]): Self = StObject.set(x, "compositingReasons", value.asInstanceOf[js.Any])
    
    inline def setCompositingReasonsVarargs(value: String*): Self = StObject.set(x, "compositingReasons", js.Array(value*))
  }
}
