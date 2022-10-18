package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlSetUpgradeModeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlSetUpgradeModeRequest {
  
  inline def apply(): MlSetUpgradeModeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlSetUpgradeModeRequest]
  }
  
  extension [Self <: MlSetUpgradeModeRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
