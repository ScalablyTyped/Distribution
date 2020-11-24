package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the InterconnectsGetDiagnosticsRequest.
  */
@js.native
trait SchemaInterconnectsGetDiagnosticsResponse extends js.Object {
  
  var result: js.UndefOr[SchemaInterconnectDiagnostics] = js.native
}
object SchemaInterconnectsGetDiagnosticsResponse {
  
  @scala.inline
  def apply(): SchemaInterconnectsGetDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectsGetDiagnosticsResponse]
  }
  
  @scala.inline
  implicit class SchemaInterconnectsGetDiagnosticsResponseOps[Self <: SchemaInterconnectsGetDiagnosticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResult(value: SchemaInterconnectDiagnostics): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
}
