package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoAction extends StObject {
  
  var destructive_requires_name: String
}
object NodesInfoNodeInfoAction {
  
  inline def apply(destructive_requires_name: String): NodesInfoNodeInfoAction = {
    val __obj = js.Dynamic.literal(destructive_requires_name = destructive_requires_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoAction] (val x: Self) extends AnyVal {
    
    inline def setDestructive_requires_name(value: String): Self = StObject.set(x, "destructive_requires_name", value.asInstanceOf[js.Any])
  }
}
