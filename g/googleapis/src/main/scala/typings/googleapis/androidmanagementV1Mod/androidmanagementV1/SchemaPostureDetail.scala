package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPostureDetail extends StObject {
  
  /**
    * Corresponding admin-facing advice to mitigate this security risk and improve the security posture of the device.
    */
  var advice: js.UndefOr[js.Array[SchemaUserFacingMessage]] = js.undefined
  
  /**
    * A specific security risk that negatively affects the security posture of the device.
    */
  var securityRisk: js.UndefOr[String | Null] = js.undefined
}
object SchemaPostureDetail {
  
  inline def apply(): SchemaPostureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostureDetail]
  }
  
  extension [Self <: SchemaPostureDetail](x: Self) {
    
    inline def setAdvice(value: js.Array[SchemaUserFacingMessage]): Self = StObject.set(x, "advice", value.asInstanceOf[js.Any])
    
    inline def setAdviceUndefined: Self = StObject.set(x, "advice", js.undefined)
    
    inline def setAdviceVarargs(value: SchemaUserFacingMessage*): Self = StObject.set(x, "advice", js.Array(value*))
    
    inline def setSecurityRisk(value: String): Self = StObject.set(x, "securityRisk", value.asInstanceOf[js.Any])
    
    inline def setSecurityRiskNull: Self = StObject.set(x, "securityRisk", null)
    
    inline def setSecurityRiskUndefined: Self = StObject.set(x, "securityRisk", js.undefined)
  }
}
