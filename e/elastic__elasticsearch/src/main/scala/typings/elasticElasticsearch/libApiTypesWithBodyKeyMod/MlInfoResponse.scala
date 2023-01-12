package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInfoResponse extends StObject {
  
  var defaults: MlInfoDefaults
  
  var limits: MlInfoLimits
  
  var native_code: MlInfoNativeCode
  
  var upgrade_mode: Boolean
}
object MlInfoResponse {
  
  inline def apply(
    defaults: MlInfoDefaults,
    limits: MlInfoLimits,
    native_code: MlInfoNativeCode,
    upgrade_mode: Boolean
  ): MlInfoResponse = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], limits = limits.asInstanceOf[js.Any], native_code = native_code.asInstanceOf[js.Any], upgrade_mode = upgrade_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlInfoResponse] (val x: Self) extends AnyVal {
    
    inline def setDefaults(value: MlInfoDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setLimits(value: MlInfoLimits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setNative_code(value: MlInfoNativeCode): Self = StObject.set(x, "native_code", value.asInstanceOf[js.Any])
    
    inline def setUpgrade_mode(value: Boolean): Self = StObject.set(x, "upgrade_mode", value.asInstanceOf[js.Any])
  }
}
