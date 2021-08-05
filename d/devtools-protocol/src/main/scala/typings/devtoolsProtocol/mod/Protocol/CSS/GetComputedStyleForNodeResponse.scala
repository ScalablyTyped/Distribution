package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComputedStyleForNodeResponse extends StObject {
  
  /**
    * Computed style for the specified DOM node.
    */
  var computedStyle: js.Array[CSSComputedStyleProperty]
}
object GetComputedStyleForNodeResponse {
  
  inline def apply(computedStyle: js.Array[CSSComputedStyleProperty]): GetComputedStyleForNodeResponse = {
    val __obj = js.Dynamic.literal(computedStyle = computedStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComputedStyleForNodeResponse]
  }
  
  extension [Self <: GetComputedStyleForNodeResponse](x: Self) {
    
    inline def setComputedStyle(value: js.Array[CSSComputedStyleProperty]): Self = StObject.set(x, "computedStyle", value.asInstanceOf[js.Any])
    
    inline def setComputedStyleVarargs(value: CSSComputedStyleProperty*): Self = StObject.set(x, "computedStyle", js.Array(value :_*))
  }
}
