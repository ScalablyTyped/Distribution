package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFlattenedDocumentRequest extends StObject {
  
  /**
    * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
    * entire subtree or provide an integer larger than 0.
    */
  var depth: js.UndefOr[integer] = js.native
  
  /**
    * Whether or not iframes and shadow roots should be traversed when returning the subtree
    * (default is false).
    */
  var pierce: js.UndefOr[Boolean] = js.native
}
object GetFlattenedDocumentRequest {
  
  @scala.inline
  def apply(): GetFlattenedDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFlattenedDocumentRequest]
  }
  
  @scala.inline
  implicit class GetFlattenedDocumentRequestMutableBuilder[Self <: GetFlattenedDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: integer): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setPierce(value: Boolean): Self = StObject.set(x, "pierce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPierceUndefined: Self = StObject.set(x, "pierce", js.undefined)
  }
}
