package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupNode extends StObject {
  
  /**
    * Instances scheduled on this node.
    */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the node.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of this node.
    */
  var nodeType: js.UndefOr[String] = js.undefined
  
  /**
    * Binding properties for the physical server.
    */
  var serverBinding: js.UndefOr[SchemaServerBinding] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object SchemaNodeGroupNode {
  
  inline def apply(): SchemaNodeGroupNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupNode]
  }
  
  extension [Self <: SchemaNodeGroupNode](x: Self) {
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    inline def setServerBinding(value: SchemaServerBinding): Self = StObject.set(x, "serverBinding", value.asInstanceOf[js.Any])
    
    inline def setServerBindingUndefined: Self = StObject.set(x, "serverBinding", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
