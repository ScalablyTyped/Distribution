package typings.flowdoc.Flow

import typings.flowdoc.Shape
import typings.flowdoc.flowdocStrings.DIAMOND
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diamond extends Shape {
  
  @JSName("type")
  var type_Diamond: DIAMOND = js.native
}
object Diamond {
  
  @scala.inline
  def apply(id: String, name: String, position: Point, size: Size, `type`: DIAMOND): Diamond = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diamond]
  }
  
  @scala.inline
  implicit class DiamondMutableBuilder[Self <: Diamond] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DIAMOND): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
