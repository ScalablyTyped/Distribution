package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowContainerQueryOverlaysRequest extends StObject {
  
  /**
    * An array of node identifiers and descriptors for the highlight appearance.
    */
  var containerQueryHighlightConfigs: js.Array[ContainerQueryHighlightConfig]
}
object SetShowContainerQueryOverlaysRequest {
  
  inline def apply(containerQueryHighlightConfigs: js.Array[ContainerQueryHighlightConfig]): SetShowContainerQueryOverlaysRequest = {
    val __obj = js.Dynamic.literal(containerQueryHighlightConfigs = containerQueryHighlightConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowContainerQueryOverlaysRequest]
  }
  
  extension [Self <: SetShowContainerQueryOverlaysRequest](x: Self) {
    
    inline def setContainerQueryHighlightConfigs(value: js.Array[ContainerQueryHighlightConfig]): Self = StObject.set(x, "containerQueryHighlightConfigs", value.asInstanceOf[js.Any])
    
    inline def setContainerQueryHighlightConfigsVarargs(value: ContainerQueryHighlightConfig*): Self = StObject.set(x, "containerQueryHighlightConfigs", js.Array(value*))
  }
}
