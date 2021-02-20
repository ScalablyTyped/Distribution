package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRouterStatusResponse extends StObject {
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  var result: js.UndefOr[SchemaRouterStatus] = js.native
}
object SchemaRouterStatusResponse {
  
  @scala.inline
  def apply(): SchemaRouterStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusResponse]
  }
  
  @scala.inline
  implicit class SchemaRouterStatusResponseMutableBuilder[Self <: SchemaRouterStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResult(value: SchemaRouterStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
