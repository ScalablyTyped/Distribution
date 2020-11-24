package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains style settings related to media elements in ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorCommandStyleSettings extends js.Object {
  
  /**
    * Gets or sets a media element's background color.
    */
  var backgroundColor: String = js.native
  
  /**
    * Gets or sets a media element's border color.
    */
  var borderColor: String = js.native
  
  /**
    * Gets or sets a media element's border style.
    */
  var borderStyle: String = js.native
  
  /**
    * Gets or sets a media element's border width.
    */
  var borderWidth: String = js.native
  
  /**
    * Gets or sets a media element's CSS class name.
    */
  var className: String = js.native
  
  /**
    * Gets or sets an element's height.
    */
  var height: String = js.native
  
  /**
    * Gets or sets an element's bottom margin.
    */
  var marginBottom: String = js.native
  
  /**
    * Gets or sets an element's left margin.
    */
  var marginLeft: String = js.native
  
  /**
    * Gets or sets an element's right margin.
    */
  var marginRight: String = js.native
  
  /**
    * Gets or sets an element's top margin.
    */
  var marginTop: String = js.native
  
  /**
    * Gets or sets the element's text alignment.
    */
  var textAlign: String = js.native
  
  /**
    * Gets or sets the element's vertical alignment.
    */
  var verticalAlign: String = js.native
  
  /**
    * Gets or sets an element's width.
    */
  var width: String = js.native
}
object ASPxClientHtmlEditorCommandStyleSettings {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    borderStyle: String,
    borderWidth: String,
    className: String,
    height: String,
    marginBottom: String,
    marginLeft: String,
    marginRight: String,
    marginTop: String,
    textAlign: String,
    verticalAlign: String,
    width: String
  ): ASPxClientHtmlEditorCommandStyleSettings = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandStyleSettings]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorCommandStyleSettingsOps[Self <: ASPxClientHtmlEditorCommandStyleSettings] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: String): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: String): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeft(value: String): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRight(value: String): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: String): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
