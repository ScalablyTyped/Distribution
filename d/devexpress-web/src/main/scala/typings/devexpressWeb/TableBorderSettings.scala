package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define a table border.
  */
@js.native
trait TableBorderSettings extends js.Object {
  
  /**
    * Gets or sets the border color.
    */
  var color: String = js.native
  
  /**
    * Gets or sets the border line style.
    */
  var style: BorderLineStyle = js.native
  
  /**
    * Gets or sets the border line width in twips.
    */
  var width: Double = js.native
}
object TableBorderSettings {
  
  @scala.inline
  def apply(color: String, style: BorderLineStyle, width: Double): TableBorderSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderSettings]
  }
  
  @scala.inline
  implicit class TableBorderSettingsOps[Self <: TableBorderSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: BorderLineStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
