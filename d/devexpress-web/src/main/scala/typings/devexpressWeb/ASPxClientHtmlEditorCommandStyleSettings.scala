package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains style settings related to media elements in ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorCommandStyleSettings extends StObject {
  
  /**
    * Gets or sets a media element's background color.
    */
  var backgroundColor: String
  
  /**
    * Gets or sets a media element's border color.
    */
  var borderColor: String
  
  /**
    * Gets or sets a media element's border style.
    */
  var borderStyle: String
  
  /**
    * Gets or sets a media element's border width.
    */
  var borderWidth: String
  
  /**
    * Gets or sets a media element's CSS class name.
    */
  var className: String
  
  /**
    * Gets or sets an element's height.
    */
  var height: String
  
  /**
    * Gets or sets an element's bottom margin.
    */
  var marginBottom: String
  
  /**
    * Gets or sets an element's left margin.
    */
  var marginLeft: String
  
  /**
    * Gets or sets an element's right margin.
    */
  var marginRight: String
  
  /**
    * Gets or sets an element's top margin.
    */
  var marginTop: String
  
  /**
    * Gets or sets the element's text alignment.
    */
  var textAlign: String
  
  /**
    * Gets or sets the element's vertical alignment.
    */
  var verticalAlign: String
  
  /**
    * Gets or sets an element's width.
    */
  var width: String
}
object ASPxClientHtmlEditorCommandStyleSettings {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ASPxClientHtmlEditorCommandStyleSettings] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
