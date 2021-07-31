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
  
  @scala.inline
  def apply(id: String, name: String, position: Point, size: Size, source: FileAsset | URLAsset): Image = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IMAGE")
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    @scala.inline
    def setType(value: IMAGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
