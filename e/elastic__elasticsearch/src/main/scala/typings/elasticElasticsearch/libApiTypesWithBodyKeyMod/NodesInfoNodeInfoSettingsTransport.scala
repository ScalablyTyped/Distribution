package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettingsTransport extends StObject {
  
  var features: js.UndefOr[NodesInfoNodeInfoSettingsTransportFeatures] = js.undefined
  
  var `type`: NodesInfoNodeInfoSettingsTransportType | String
  
  @JSName("type.default")
  var typeDotdefault: js.UndefOr[String] = js.undefined
}
object NodesInfoNodeInfoSettingsTransport {
  
  inline def apply(`type`: NodesInfoNodeInfoSettingsTransportType | String): NodesInfoNodeInfoSettingsTransport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettingsTransport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoSettingsTransport] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: NodesInfoNodeInfoSettingsTransportFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setType(value: NodesInfoNodeInfoSettingsTransportType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeDotdefault(value: String): Self = StObject.set(x, "type.default", value.asInstanceOf[js.Any])
    
    inline def setTypeDotdefaultUndefined: Self = StObject.set(x, "type.default", js.undefined)
  }
}
