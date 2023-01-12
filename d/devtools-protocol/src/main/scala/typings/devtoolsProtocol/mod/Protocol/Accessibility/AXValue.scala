package typings.devtoolsProtocol.mod.Protocol.Accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AXValue extends StObject {
  
  /**
    * One or more related nodes, if applicable.
    */
  var relatedNodes: js.UndefOr[js.Array[AXRelatedNode]] = js.undefined
  
  /**
    * The sources which contributed to the computation of this property.
    */
  var sources: js.UndefOr[js.Array[AXValueSource]] = js.undefined
  
  /**
    * The type of this value.
    */
  var `type`: AXValueType
  
  /**
    * The computed value of this property.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object AXValue {
  
  inline def apply(`type`: AXValueType): AXValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AXValue] (val x: Self) extends AnyVal {
    
    inline def setRelatedNodes(value: js.Array[AXRelatedNode]): Self = StObject.set(x, "relatedNodes", value.asInstanceOf[js.Any])
    
    inline def setRelatedNodesUndefined: Self = StObject.set(x, "relatedNodes", js.undefined)
    
    inline def setRelatedNodesVarargs(value: AXRelatedNode*): Self = StObject.set(x, "relatedNodes", js.Array(value*))
    
    inline def setSources(value: js.Array[AXValueSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: AXValueSource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setType(value: AXValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
