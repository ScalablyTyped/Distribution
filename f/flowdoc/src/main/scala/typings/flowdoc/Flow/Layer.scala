package typings.flowdoc.Flow

import typings.flowdoc.Node
import typings.flowdoc.flowdocStrings.HOTSPOT
import typings.flowdoc.flowdocStrings.LAYER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer
  extends StObject
     with Node {
  
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  
  var position: Point
  
  var size: Size
  
  @JSName("type")
  var type_Layer: LAYER | HOTSPOT
}
object Layer {
  
  @scala.inline
  def apply(id: String, name: String, position: Point, size: Size, `type`: LAYER | HOTSPOT): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LAYER | HOTSPOT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
