package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfidentialInstanceConfig extends StObject {
  
  /**
    * Defines the type of technology used by the confidential instance.
    */
  var confidentialInstanceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines whether the instance should have confidential compute enabled.
    */
  var enableConfidentialCompute: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfidentialInstanceConfig {
  
  inline def apply(): SchemaConfidentialInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfidentialInstanceConfig]
  }
  
  extension [Self <: SchemaConfidentialInstanceConfig](x: Self) {
    
    inline def setConfidentialInstanceType(value: String): Self = StObject.set(x, "confidentialInstanceType", value.asInstanceOf[js.Any])
    
    inline def setConfidentialInstanceTypeNull: Self = StObject.set(x, "confidentialInstanceType", null)
    
    inline def setConfidentialInstanceTypeUndefined: Self = StObject.set(x, "confidentialInstanceType", js.undefined)
    
    inline def setEnableConfidentialCompute(value: Boolean): Self = StObject.set(x, "enableConfidentialCompute", value.asInstanceOf[js.Any])
    
    inline def setEnableConfidentialComputeNull: Self = StObject.set(x, "enableConfidentialCompute", null)
    
    inline def setEnableConfidentialComputeUndefined: Self = StObject.set(x, "enableConfidentialCompute", js.undefined)
  }
}
