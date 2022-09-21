package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectsGetDiagnosticsResponse extends StObject {
  
  var result: js.UndefOr[SchemaInterconnectDiagnostics] = js.undefined
}
object SchemaInterconnectsGetDiagnosticsResponse {
  
  inline def apply(): SchemaInterconnectsGetDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectsGetDiagnosticsResponse]
  }
  
  extension [Self <: SchemaInterconnectsGetDiagnosticsResponse](x: Self) {
    
    inline def setResult(value: SchemaInterconnectDiagnostics): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
