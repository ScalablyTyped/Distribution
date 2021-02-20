package typings.flowdoc

import typings.flowdoc.Flow.FileAsset
import typings.flowdoc.Flow.Point
import typings.flowdoc.Flow.Size
import typings.flowdoc.Flow.URLAsset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graphic extends Node {
  
  var position: Point = js.native
  
  var size: Size = js.native
  
  var source: FileAsset | URLAsset = js.native
}
object Graphic {
  
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset,
    `type`: NodeType
  ): Graphic = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graphic]
  }
  
  @scala.inline
  implicit class GraphicMutableBuilder[Self <: Graphic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: FileAsset | URLAsset): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
