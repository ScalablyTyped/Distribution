package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettingsHttp extends StObject {
  
  var compression: js.UndefOr[Boolean | String] = js.undefined
  
  var port: js.UndefOr[integer | String] = js.undefined
  
  var `type`: NodesInfoNodeInfoSettingsHttpType | String
  
  @JSName("type.default")
  var typeDotdefault: js.UndefOr[String] = js.undefined
}
object NodesInfoNodeInfoSettingsHttp {
  
  inline def apply(`type`: NodesInfoNodeInfoSettingsHttpType | String): NodesInfoNodeInfoSettingsHttp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettingsHttp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoSettingsHttp] (val x: Self) extends AnyVal {
    
    inline def setCompression(value: Boolean | String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setPort(value: integer | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setType(value: NodesInfoNodeInfoSettingsHttpType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeDotdefault(value: String): Self = StObject.set(x, "type.default", value.asInstanceOf[js.Any])
    
    inline def setTypeDotdefaultUndefined: Self = StObject.set(x, "type.default", js.undefined)
  }
}
