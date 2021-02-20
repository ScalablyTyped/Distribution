package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxModel extends StObject {
  
  /**
    * Border box
    */
  var border: Quad = js.native
  
  /**
    * Content box
    */
  var content: Quad = js.native
  
  /**
    * Node height
    */
  var height: integer = js.native
  
  /**
    * Margin box
    */
  var margin: Quad = js.native
  
  /**
    * Padding box
    */
  var padding: Quad = js.native
  
  /**
    * Shape outside coordinates
    */
  var shapeOutside: js.UndefOr[ShapeOutsideInfo] = js.native
  
  /**
    * Node width
    */
  var width: integer = js.native
}
object BoxModel {
  
  @scala.inline
  def apply(border: Quad, content: Quad, height: integer, margin: Quad, padding: Quad, width: integer): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxModel]
  }
  
  @scala.inline
  implicit class BoxModelMutableBuilder[Self <: BoxModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: Quad): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderVarargs(value: Double*): Self = StObject.set(x, "border", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: Quad): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVarargs(value: Double*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Quad): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Quad): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    @scala.inline
    def setShapeOutside(value: ShapeOutsideInfo): Self = StObject.set(x, "shapeOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeOutsideUndefined: Self = StObject.set(x, "shapeOutside", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
