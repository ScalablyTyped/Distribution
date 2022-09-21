package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowFlexOverlaysRequest extends StObject {
  
  /**
    * An array of node identifiers and descriptors for the highlight appearance.
    */
  var flexNodeHighlightConfigs: js.Array[FlexNodeHighlightConfig]
}
object SetShowFlexOverlaysRequest {
  
  inline def apply(flexNodeHighlightConfigs: js.Array[FlexNodeHighlightConfig]): SetShowFlexOverlaysRequest = {
    val __obj = js.Dynamic.literal(flexNodeHighlightConfigs = flexNodeHighlightConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowFlexOverlaysRequest]
  }
  
  extension [Self <: SetShowFlexOverlaysRequest](x: Self) {
    
    inline def setFlexNodeHighlightConfigs(value: js.Array[FlexNodeHighlightConfig]): Self = StObject.set(x, "flexNodeHighlightConfigs", value.asInstanceOf[js.Any])
    
    inline def setFlexNodeHighlightConfigsVarargs(value: FlexNodeHighlightConfig*): Self = StObject.set(x, "flexNodeHighlightConfigs", js.Array(value*))
  }
}
