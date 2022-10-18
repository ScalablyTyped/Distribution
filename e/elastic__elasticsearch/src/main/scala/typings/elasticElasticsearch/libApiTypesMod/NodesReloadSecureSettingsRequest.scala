package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesReloadSecureSettingsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var node_id: js.UndefOr[NodeIds] = js.undefined
  
  var secure_settings_password: js.UndefOr[Password] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object NodesReloadSecureSettingsRequest {
  
  inline def apply(): NodesReloadSecureSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesReloadSecureSettingsRequest]
  }
  
  extension [Self <: NodesReloadSecureSettingsRequest](x: Self) {
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
    
    inline def setSecure_settings_password(value: Password): Self = StObject.set(x, "secure_settings_password", value.asInstanceOf[js.Any])
    
    inline def setSecure_settings_passwordUndefined: Self = StObject.set(x, "secure_settings_password", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
