package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowGridOverlaysRequest extends StObject {
  
  /**
    * An array of node identifiers and descriptors for the highlight appearance.
    */
  var gridNodeHighlightConfigs: js.Array[GridNodeHighlightConfig]
}
object SetShowGridOverlaysRequest {
  
  inline def apply(gridNodeHighlightConfigs: js.Array[GridNodeHighlightConfig]): SetShowGridOverlaysRequest = {
    val __obj = js.Dynamic.literal(gridNodeHighlightConfigs = gridNodeHighlightConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowGridOverlaysRequest]
  }
  
  extension [Self <: SetShowGridOverlaysRequest](x: Self) {
    
    inline def setGridNodeHighlightConfigs(value: js.Array[GridNodeHighlightConfig]): Self = StObject.set(x, "gridNodeHighlightConfigs", value.asInstanceOf[js.Any])
    
    inline def setGridNodeHighlightConfigsVarargs(value: GridNodeHighlightConfig*): Self = StObject.set(x, "gridNodeHighlightConfigs", js.Array(value*))
  }
}
