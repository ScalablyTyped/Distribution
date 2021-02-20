package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define table borders.
  */
@js.native
trait TableBordersSettings extends StObject {
  
  /**
    * Gets or sets the background color of table borders.
    */
  var backgroundColor: String = js.native
  
  /**
    * Gets or sets the bottom border's settings.
    */
  var bottom: TableBorderSettings = js.native
  
  /**
    * Gets or sets the inside horizontal border's settings.
    */
  var insideHorizontal: TableBorderSettings = js.native
  
  /**
    * Gets or sets the inside vertical border's settings.
    */
  var insideVertical: TableBorderSettings = js.native
  
  /**
    * Gets or sets the left border's settings.
    */
  var left: TableBorderSettings = js.native
  
  /**
    * Gets or sets the right border's settings.
    */
  var right: TableBorderSettings = js.native
  
  /**
    * Gets or sets the top border's settings.
    */
  var top: TableBorderSettings = js.native
}
object TableBordersSettings {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    bottom: TableBorderSettings,
    insideHorizontal: TableBorderSettings,
    insideVertical: TableBorderSettings,
    left: TableBorderSettings,
    right: TableBorderSettings,
    top: TableBorderSettings
  ): TableBordersSettings = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], insideHorizontal = insideHorizontal.asInstanceOf[js.Any], insideVertical = insideVertical.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBordersSettings]
  }
  
  @scala.inline
  implicit class TableBordersSettingsMutableBuilder[Self <: TableBordersSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: TableBorderSettings): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideHorizontal(value: TableBorderSettings): Self = StObject.set(x, "insideHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideVertical(value: TableBorderSettings): Self = StObject.set(x, "insideVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: TableBorderSettings): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: TableBorderSettings): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: TableBorderSettings): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
