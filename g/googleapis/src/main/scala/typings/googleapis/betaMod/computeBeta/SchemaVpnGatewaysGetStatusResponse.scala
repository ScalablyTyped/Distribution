package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnGatewaysGetStatusResponse extends StObject {
  
  var result: js.UndefOr[SchemaVpnGatewayStatus] = js.undefined
}
object SchemaVpnGatewaysGetStatusResponse {
  
  @scala.inline
  def apply(): SchemaVpnGatewaysGetStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewaysGetStatusResponse]
  }
  
  @scala.inline
  implicit class SchemaVpnGatewaysGetStatusResponseMutableBuilder[Self <: SchemaVpnGatewaysGetStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: SchemaVpnGatewayStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
