package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellFormat extends StObject {
  
  /**
    * @description
    * background color of the cell
    */
  var backgroundColor: Color
  
  /**
    * @description
    * border settings of the cell
    */
  var borders: Borders
  
  /**
    * @description
    * horizontal alignment of the cell's value
    */
  var horizontalAlignment: HorizontalAlign
  
  /**
    * @description
    * how a hyperlink (if any) should be displayed
    */
  var hyperlinkDisplayType: HyperlinkDisplayType
  
  /**
    * @description
    * format describing how number values should be represented to the user
    */
  var numberFormat: NumberFormat
  
  /**
    * @description
    * padding in the cell
    * - spacing between inner text and cell boundaries
    */
  var padding: Padding
  
  /**
    * @description
    * display direction of cell value text
    */
  var textDirection: TextDirection
  
  /**
    * @description
    * format of the text in the cell
    * - font, size etc.
    */
  var textFormat: TextFormat
  
  /**
    * @description
    * rotation applied to text in a cell
    */
  var textRotation: TextRotation
  
  /**
    * @description
    * vertical alignment of the cell's value
    */
  var verticalAlignment: VerticalAlign
  
  /**
    * @description
    * text-wrapping strategy of the cell's value
    */
  var wrapStrategy: WrapStrategy
}
object CellFormat {
  
  inline def apply(
    backgroundColor: Color,
    borders: Borders,
    horizontalAlignment: HorizontalAlign,
    hyperlinkDisplayType: HyperlinkDisplayType,
    numberFormat: NumberFormat,
    padding: Padding,
    textDirection: TextDirection,
    textFormat: TextFormat,
    textRotation: TextRotation,
    verticalAlignment: VerticalAlign,
    wrapStrategy: WrapStrategy
  ): CellFormat = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borders = borders.asInstanceOf[js.Any], horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], hyperlinkDisplayType = hyperlinkDisplayType.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any], textFormat = textFormat.asInstanceOf[js.Any], textRotation = textRotation.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any], wrapStrategy = wrapStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellFormat] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignment(value: HorizontalAlign): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkDisplayType(value: HyperlinkDisplayType): Self = StObject.set(x, "hyperlinkDisplayType", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: NumberFormat): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setTextDirection(value: TextDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextRotation(value: TextRotation): Self = StObject.set(x, "textRotation", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignment(value: VerticalAlign): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setWrapStrategy(value: WrapStrategy): Self = StObject.set(x, "wrapStrategy", value.asInstanceOf[js.Any])
  }
}
