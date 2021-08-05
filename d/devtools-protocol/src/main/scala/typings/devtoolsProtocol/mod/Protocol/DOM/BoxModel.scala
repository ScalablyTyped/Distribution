package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxModel extends StObject {
  
  /**
    * Border box
    */
  var border: Quad
  
  /**
    * Content box
    */
  var content: Quad
  
  /**
    * Node height
    */
  var height: integer
  
  /**
    * Margin box
    */
  var margin: Quad
  
  /**
    * Padding box
    */
  var padding: Quad
  
  /**
    * Shape outside coordinates
    */
  var shapeOutside: js.UndefOr[ShapeOutsideInfo] = js.undefined
  
  /**
    * Node width
    */
  var width: integer
}
object BoxModel {
  
  inline def apply(border: Quad, content: Quad, height: integer, margin: Quad, padding: Quad, width: integer): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxModel]
  }
  
  extension [Self <: BoxModel](x: Self) {
    
    inline def setBorder(value: Quad): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderVarargs(value: Double*): Self = StObject.set(x, "border", js.Array(value :_*))
    
    inline def setContent(value: Quad): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: Double*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Quad): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    inline def setPadding(value: Quad): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    inline def setShapeOutside(value: ShapeOutsideInfo): Self = StObject.set(x, "shapeOutside", value.asInstanceOf[js.Any])
    
    inline def setShapeOutsideUndefined: Self = StObject.set(x, "shapeOutside", js.undefined)
    
    inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
