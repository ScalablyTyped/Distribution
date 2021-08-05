package typings.flowdoc.Flow

import typings.flowdoc.Shape
import typings.flowdoc.flowdocStrings.ELLIPSE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ellipse
  extends StObject
     with Shape {
  
  @JSName("type")
  var type_Ellipse: ELLIPSE
}
object Ellipse {
  
  inline def apply(id: String, name: String, position: Point, size: Size): Ellipse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ELLIPSE")
    __obj.asInstanceOf[Ellipse]
  }
  
  extension [Self <: Ellipse](x: Self) {
    
    inline def setType(value: ELLIPSE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
