package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoterInfoSegmentResult extends StObject {
  
  var generatedMillis: js.UndefOr[String] = js.undefined
  
  var postalAddress: js.UndefOr[SchemaPostalAddress] = js.undefined
  
  var request: js.UndefOr[SchemaVoterInfoRequest] = js.undefined
  
  var response: js.UndefOr[SchemaVoterInfoResponse] = js.undefined
}
object SchemaVoterInfoSegmentResult {
  
  @scala.inline
  def apply(): SchemaVoterInfoSegmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoterInfoSegmentResult]
  }
  
  @scala.inline
  implicit class SchemaVoterInfoSegmentResultMutableBuilder[Self <: SchemaVoterInfoSegmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneratedMillis(value: String): Self = StObject.set(x, "generatedMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratedMillisUndefined: Self = StObject.set(x, "generatedMillis", js.undefined)
    
    @scala.inline
    def setPostalAddress(value: SchemaPostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
    
    @scala.inline
    def setRequest(value: SchemaVoterInfoRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: SchemaVoterInfoResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
