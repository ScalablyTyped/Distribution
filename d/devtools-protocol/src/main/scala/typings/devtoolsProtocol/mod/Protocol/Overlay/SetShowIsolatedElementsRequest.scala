package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowIsolatedElementsRequest extends StObject {
  
  /**
    * An array of node identifiers and descriptors for the highlight appearance.
    */
  var isolatedElementHighlightConfigs: js.Array[IsolatedElementHighlightConfig]
}
object SetShowIsolatedElementsRequest {
  
  inline def apply(isolatedElementHighlightConfigs: js.Array[IsolatedElementHighlightConfig]): SetShowIsolatedElementsRequest = {
    val __obj = js.Dynamic.literal(isolatedElementHighlightConfigs = isolatedElementHighlightConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowIsolatedElementsRequest]
  }
  
  extension [Self <: SetShowIsolatedElementsRequest](x: Self) {
    
    inline def setIsolatedElementHighlightConfigs(value: js.Array[IsolatedElementHighlightConfig]): Self = StObject.set(x, "isolatedElementHighlightConfigs", value.asInstanceOf[js.Any])
    
    inline def setIsolatedElementHighlightConfigsVarargs(value: IsolatedElementHighlightConfig*): Self = StObject.set(x, "isolatedElementHighlightConfigs", js.Array(value*))
  }
}
