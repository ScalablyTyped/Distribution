package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for information about a voter.
  */
trait SchemaVoterInfoRequest extends StObject {
  
  var contextParams: js.UndefOr[SchemaContextParams] = js.undefined
  
  var voterInfoSegmentResult: js.UndefOr[SchemaVoterInfoSegmentResult] = js.undefined
}
object SchemaVoterInfoRequest {
  
  @scala.inline
  def apply(): SchemaVoterInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoterInfoRequest]
  }
  
  @scala.inline
  implicit class SchemaVoterInfoRequestMutableBuilder[Self <: SchemaVoterInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextParams(value: SchemaContextParams): Self = StObject.set(x, "contextParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextParamsUndefined: Self = StObject.set(x, "contextParams", js.undefined)
    
    @scala.inline
    def setVoterInfoSegmentResult(value: SchemaVoterInfoSegmentResult): Self = StObject.set(x, "voterInfoSegmentResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoterInfoSegmentResultUndefined: Self = StObject.set(x, "voterInfoSegmentResult", js.undefined)
  }
}
