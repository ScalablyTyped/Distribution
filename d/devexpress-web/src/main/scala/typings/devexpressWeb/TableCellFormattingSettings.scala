package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the settings to define the table cell formatting.
  */
trait TableCellFormattingSettings extends StObject {
  
  /**
    * Gets or sets a table cell's bottom margin in twips.
    */
  var marginBottom: Double
  
  /**
    * Gets or sets a table cell's left margin in twips.
    */
  var marginLeft: Double
  
  /**
    * Gets or sets a table cell's right margin in twips.
    */
  var marginRight: Double
  
  /**
    * Gets or sets a table cell's top margin in twips.
    */
  var marginTop: Double
  
  /**
    * Specifies whether a table cell's margins are inherited from the table level settings.
    */
  var marginsSameAsTable: Boolean
  
  /**
    * Sspecifies whether text is wrapped in a table cell.
    */
  var noWrap: Boolean
  
  /**
    * Gets or sets a table cell's preferred width.
    */
  var preferredWidth: TableWidthUnit
  
  /**
    * Gets or sets the vertical alignment of a table cell's content.
    */
  var verticalAlignment: TableCellVerticalAlignment
}
object TableCellFormattingSettings {
  
  inline def apply(
    marginBottom: Double,
    marginLeft: Double,
    marginRight: Double,
    marginTop: Double,
    marginsSameAsTable: Boolean,
    noWrap: Boolean,
    preferredWidth: TableWidthUnit,
    verticalAlignment: TableCellVerticalAlignment
  ): TableCellFormattingSettings = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], marginsSameAsTable = marginsSameAsTable.asInstanceOf[js.Any], noWrap = noWrap.asInstanceOf[js.Any], preferredWidth = preferredWidth.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellFormattingSettings]
  }
  
  extension [Self <: TableCellFormattingSettings](x: Self) {
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginsSameAsTable(value: Boolean): Self = StObject.set(x, "marginsSameAsTable", value.asInstanceOf[js.Any])
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setPreferredWidth(value: TableWidthUnit): Self = StObject.set(x, "preferredWidth", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignment(value: TableCellVerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
  }
}
