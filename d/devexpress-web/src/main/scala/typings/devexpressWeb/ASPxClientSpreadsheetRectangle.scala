package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings specifying size and position of a spreadsheet cell's in-place editor.
  */
trait ASPxClientSpreadsheetRectangle extends StObject {
  
  /**
    * Gets the y-coordinate of the specified cell's bottom side.
    */
  var bottom: Double
  
  /**
    * Gets the height value of the cell's in-place editor.
    */
  var height: Double
  
  /**
    * Gets the x-coordinate of the specified cell's editor.
    */
  var left: Double
  
  /**
    * Gets the x-coordinate of the specified cell's right side.
    */
  var right: Double
  
  /**
    * Gets the y-coordinate of the specified cell's editor.
    */
  var top: Double
  
  /**
    * Gets the width value of the cell's in-place editor.
    */
  var width: Double
  
  /**
    * Gets the x-coordinate of the specified cell's left side.
    */
  var x: Double
  
  /**
    * Gets the y-coordinate of the specified cell's top side.
    */
  var y: Double
}
object ASPxClientSpreadsheetRectangle {
  
  inline def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): ASPxClientSpreadsheetRectangle = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetRectangle]
  }
  
  extension [Self <: ASPxClientSpreadsheetRectangle](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
