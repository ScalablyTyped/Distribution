package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowScrollSnapOverlaysRequest extends StObject {
  
  /**
    * An array of node identifiers and descriptors for the highlight appearance.
    */
  var scrollSnapHighlightConfigs: js.Array[ScrollSnapHighlightConfig]
}
object SetShowScrollSnapOverlaysRequest {
  
  inline def apply(scrollSnapHighlightConfigs: js.Array[ScrollSnapHighlightConfig]): SetShowScrollSnapOverlaysRequest = {
    val __obj = js.Dynamic.literal(scrollSnapHighlightConfigs = scrollSnapHighlightConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowScrollSnapOverlaysRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetShowScrollSnapOverlaysRequest] (val x: Self) extends AnyVal {
    
    inline def setScrollSnapHighlightConfigs(value: js.Array[ScrollSnapHighlightConfig]): Self = StObject.set(x, "scrollSnapHighlightConfigs", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapHighlightConfigsVarargs(value: ScrollSnapHighlightConfig*): Self = StObject.set(x, "scrollSnapHighlightConfigs", js.Array(value*))
  }
}
