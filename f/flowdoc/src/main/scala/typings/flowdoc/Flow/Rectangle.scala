package typings.flowdoc.Flow

import typings.flowdoc.Shape
import typings.flowdoc.flowdocStrings.RECT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rectangle
  extends StObject
     with Shape {
  
  @JSName("type")
  var type_Rectangle: RECT
}
object Rectangle {
  
  inline def apply(id: String, name: String, position: Point, size: Size): Rectangle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RECT")
    __obj.asInstanceOf[Rectangle]
  }
  
  extension [Self <: Rectangle](x: Self) {
    
    inline def setType(value: RECT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
