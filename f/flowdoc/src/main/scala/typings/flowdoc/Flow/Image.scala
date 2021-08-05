package typings.flowdoc.Flow

import typings.flowdoc.Graphic
import typings.flowdoc.flowdocStrings.IMAGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image
  extends StObject
     with Graphic {
  
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  
  @JSName("type")
  var type_Image: IMAGE
}
object Image {
  
  inline def apply(id: String, name: String, position: Point, size: Size, source: FileAsset | URLAsset): Image = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IMAGE")
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    inline def setType(value: IMAGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
