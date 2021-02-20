package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the InterconnectsGetDiagnosticsRequest.
  */
@js.native
trait SchemaInterconnectsGetDiagnosticsResponse extends StObject {
  
  var result: js.UndefOr[SchemaInterconnectDiagnostics] = js.native
}
object SchemaInterconnectsGetDiagnosticsResponse {
  
  @scala.inline
  def apply(): SchemaInterconnectsGetDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectsGetDiagnosticsResponse]
  }
  
  @scala.inline
  implicit class SchemaInterconnectsGetDiagnosticsResponseMutableBuilder[Self <: SchemaInterconnectsGetDiagnosticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: SchemaInterconnectDiagnostics): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
