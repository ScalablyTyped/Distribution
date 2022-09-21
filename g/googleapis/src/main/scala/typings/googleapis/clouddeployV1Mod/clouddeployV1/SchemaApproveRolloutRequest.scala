package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApproveRolloutRequest extends StObject {
  
  /**
    * Required. True = approve; false = reject
    */
  var approved: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaApproveRolloutRequest {
  
  inline def apply(): SchemaApproveRolloutRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproveRolloutRequest]
  }
  
  extension [Self <: SchemaApproveRolloutRequest](x: Self) {
    
    inline def setApproved(value: Boolean): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    inline def setApprovedNull: Self = StObject.set(x, "approved", null)
    
    inline def setApprovedUndefined: Self = StObject.set(x, "approved", js.undefined)
  }
}
