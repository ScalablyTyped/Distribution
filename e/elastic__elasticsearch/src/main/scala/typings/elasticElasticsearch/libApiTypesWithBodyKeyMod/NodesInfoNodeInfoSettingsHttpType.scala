package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettingsHttpType extends StObject {
  
  var default: String
}
object NodesInfoNodeInfoSettingsHttpType {
  
  inline def apply(default: String): NodesInfoNodeInfoSettingsHttpType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettingsHttpType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoSettingsHttpType] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
