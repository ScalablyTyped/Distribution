package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTreeAccess extends StObject {
  
  var children: Any
  
  var dbIdToIndex: Any
  
  var nameSuffixes: Any
  
  var names: Any
  
  var nodeBoxes: Any
  
  var nodes: Any
  
  var numNodes: Double
  
  var rootId: Double
  
  var strings: js.Array[String]
  
  var visibleIds: Double
}
object InstanceTreeAccess {
  
  inline def apply(
    children: Any,
    dbIdToIndex: Any,
    nameSuffixes: Any,
    names: Any,
    nodeBoxes: Any,
    nodes: Any,
    numNodes: Double,
    rootId: Double,
    strings: js.Array[String],
    visibleIds: Double
  ): InstanceTreeAccess = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dbIdToIndex = dbIdToIndex.asInstanceOf[js.Any], nameSuffixes = nameSuffixes.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], nodeBoxes = nodeBoxes.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], numNodes = numNodes.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any], visibleIds = visibleIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTreeAccess]
  }
  
  extension [Self <: InstanceTreeAccess](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDbIdToIndex(value: Any): Self = StObject.set(x, "dbIdToIndex", value.asInstanceOf[js.Any])
    
    inline def setNameSuffixes(value: Any): Self = StObject.set(x, "nameSuffixes", value.asInstanceOf[js.Any])
    
    inline def setNames(value: Any): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNodeBoxes(value: Any): Self = StObject.set(x, "nodeBoxes", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNumNodes(value: Double): Self = StObject.set(x, "numNodes", value.asInstanceOf[js.Any])
    
    inline def setRootId(value: Double): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
    
    inline def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value*))
    
    inline def setVisibleIds(value: Double): Self = StObject.set(x, "visibleIds", value.asInstanceOf[js.Any])
  }
}
