package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoScript extends StObject {
  
  var allowed_types: String
  
  var disable_max_compilations_rate: String
}
object NodesInfoNodeInfoScript {
  
  inline def apply(allowed_types: String, disable_max_compilations_rate: String): NodesInfoNodeInfoScript = {
    val __obj = js.Dynamic.literal(allowed_types = allowed_types.asInstanceOf[js.Any], disable_max_compilations_rate = disable_max_compilations_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoScript] (val x: Self) extends AnyVal {
    
    inline def setAllowed_types(value: String): Self = StObject.set(x, "allowed_types", value.asInstanceOf[js.Any])
    
    inline def setDisable_max_compilations_rate(value: String): Self = StObject.set(x, "disable_max_compilations_rate", value.asInstanceOf[js.Any])
  }
}
