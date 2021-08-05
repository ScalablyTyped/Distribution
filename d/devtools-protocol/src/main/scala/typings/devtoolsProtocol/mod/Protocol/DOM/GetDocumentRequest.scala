package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentRequest extends StObject {
  
  /**
    * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
    * entire subtree or provide an integer larger than 0.
    */
  var depth: js.UndefOr[integer] = js.undefined
  
  /**
    * Whether or not iframes and shadow roots should be traversed when returning the subtree
    * (default is false).
    */
  var pierce: js.UndefOr[Boolean] = js.undefined
}
object GetDocumentRequest {
  
  inline def apply(): GetDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentRequest]
  }
  
  extension [Self <: GetDocumentRequest](x: Self) {
    
    inline def setDepth(value: integer): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setPierce(value: Boolean): Self = StObject.set(x, "pierce", value.asInstanceOf[js.Any])
    
    inline def setPierceUndefined: Self = StObject.set(x, "pierce", js.undefined)
  }
}
