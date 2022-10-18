package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Securesettingspassword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesReloadSecureSettingsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Securesettingspassword] = js.undefined
  
  var node_id: js.UndefOr[NodeIds] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object NodesReloadSecureSettingsRequest {
  
  inline def apply(): NodesReloadSecureSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesReloadSecureSettingsRequest]
  }
  
  extension [Self <: NodesReloadSecureSettingsRequest](x: Self) {
    
    inline def setBody(value: Securesettingspassword): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
