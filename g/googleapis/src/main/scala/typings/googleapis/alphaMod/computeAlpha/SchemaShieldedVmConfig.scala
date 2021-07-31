package typings.googleapis.alphaMod.computeAlpha

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
  
  @scala.inline
  def apply(): SchemaShieldedVmConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmConfig]
  }
  
  @scala.inline
  implicit class SchemaShieldedVmConfigMutableBuilder[Self <: SchemaShieldedVmConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableIntegrityMonitoring(value: Boolean): Self = StObject.set(x, "enableIntegrityMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIntegrityMonitoringUndefined: Self = StObject.set(x, "enableIntegrityMonitoring", js.undefined)
    
    @scala.inline
    def setEnableSecureBoot(value: Boolean): Self = StObject.set(x, "enableSecureBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSecureBootUndefined: Self = StObject.set(x, "enableSecureBoot", js.undefined)
    
    @scala.inline
    def setEnableVtpm(value: Boolean): Self = StObject.set(x, "enableVtpm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVtpmUndefined: Self = StObject.set(x, "enableVtpm", js.undefined)
  }
}
