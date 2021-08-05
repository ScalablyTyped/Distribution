package typings.flowdoc.Flow

import typings.flowdoc.Graphic
import typings.flowdoc.flowdocStrings.SCREEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screen
  extends StObject
     with Graphic {
  
  var children: js.Array[Layer]
  
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  
  @JSName("type")
  var type_Screen: SCREEN
}
object Screen {
  
  inline def apply(
    children: js.Array[Layer],
    id: String,
    name: String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset
  ): Screen = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SCREEN")
    __obj.asInstanceOf[Screen]
  }
  
  extension [Self <: Screen](x: Self) {
    
    inline def setChildren(value: js.Array[Layer]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Layer*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    inline def setType(value: SCREEN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
