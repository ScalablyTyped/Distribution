package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of Shielded VM options.
  */
trait SchemaShieldedVmConfig extends StObject {
  
  /**
    * Defines whether the instance has integrity monitoring enabled.
    */
  var enableIntegrityMonitoring: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the instance has Secure Boot enabled.
    */
  var enableSecureBoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the instance has the vTPM enabled.
    */
  var enableVtpm: js.UndefOr[Boolean] = js.undefined
}
object SchemaShieldedVmConfig {
  
  inline def apply(): SchemaShieldedVmConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmConfig]
  }
  
  extension [Self <: SchemaShieldedVmConfig](x: Self) {
    
    inline def setEnableIntegrityMonitoring(value: Boolean): Self = StObject.set(x, "enableIntegrityMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnableIntegrityMonitoringUndefined: Self = StObject.set(x, "enableIntegrityMonitoring", js.undefined)
    
    inline def setEnableSecureBoot(value: Boolean): Self = StObject.set(x, "enableSecureBoot", value.asInstanceOf[js.Any])
    
    inline def setEnableSecureBootUndefined: Self = StObject.set(x, "enableSecureBoot", js.undefined)
    
    inline def setEnableVtpm(value: Boolean): Self = StObject.set(x, "enableVtpm", value.asInstanceOf[js.Any])
    
    inline def setEnableVtpmUndefined: Self = StObject.set(x, "enableVtpm", js.undefined)
  }
}
