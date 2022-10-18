package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettingsNode extends StObject {
  
  var attr: Record[String, Any]
  
  var max_local_storage_nodes: js.UndefOr[String] = js.undefined
  
  var name: Name
}
object NodesInfoNodeInfoSettingsNode {
  
  inline def apply(attr: Record[String, Any], name: Name): NodesInfoNodeInfoSettingsNode = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettingsNode]
  }
  
  extension [Self <: NodesInfoNodeInfoSettingsNode](x: Self) {
    
    inline def setAttr(value: Record[String, Any]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setMax_local_storage_nodes(value: String): Self = StObject.set(x, "max_local_storage_nodes", value.asInstanceOf[js.Any])
    
    inline def setMax_local_storage_nodesUndefined: Self = StObject.set(x, "max_local_storage_nodes", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
