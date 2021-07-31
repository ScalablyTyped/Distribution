package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a field in the document.
  */
trait Field extends StObject {
  
  /**
    * Gets the text buffer interval occupied by the field code element.
    */
  val codeInterval: Interval
  
  /**
    * Gets or sets the name of a bookmark (or a hyperlink) in the current document which shall be the target of the hyperlink field.
    */
  val hyperlinkAnchor: String
  
  /**
    * Gets or sets the text for the tooltip displayed when the mouse hovers over a hyperlink field.
    */
  val hyperlinkTip: String
  
  /**
    * Gets or sets a URI to navigate to when the hyperlink (represented by the current field) is activated.
    */
  val hyperlinkUri: String
  
  /**
    * Gets the index of the field
    */
  val index: Double
  
  /**
    * Gets the text buffer interval occupied by the current field element.
    */
  val interval: Interval
  
  /**
    * Returns a value specifying whether the field is a hyperlink.
    */
  val isHyperlink: Boolean
  
  /**
    * Gets the field length in a document.
    */
  val length: Double
  
  /**
    * Gets the text buffer interval occupied by the field result element.
    */
  val resultInterval: Interval
  
  /**
    * Gets a value specifying whether a field's code or result is dispalyed.
    */
  val showCode: Boolean
  
  /**
    * Gets the field's start position in a document.
    */
  val start: Double
}
object Field {
  
  @scala.inline
  def apply(
    codeInterval: Interval,
    hyperlinkAnchor: String,
    hyperlinkTip: String,
    hyperlinkUri: String,
    index: Double,
    interval: Interval,
    isHyperlink: Boolean,
    length: Double,
    resultInterval: Interval,
    showCode: Boolean,
    start: Double
  ): Field = {
    val __obj = js.Dynamic.literal(codeInterval = codeInterval.asInstanceOf[js.Any], hyperlinkAnchor = hyperlinkAnchor.asInstanceOf[js.Any], hyperlinkTip = hyperlinkTip.asInstanceOf[js.Any], hyperlinkUri = hyperlinkUri.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], isHyperlink = isHyperlink.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], resultInterval = resultInterval.asInstanceOf[js.Any], showCode = showCode.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeInterval(value: Interval): Self = StObject.set(x, "codeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkAnchor(value: String): Self = StObject.set(x, "hyperlinkAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkTip(value: String): Self = StObject.set(x, "hyperlinkTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkUri(value: String): Self = StObject.set(x, "hyperlinkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHyperlink(value: Boolean): Self = StObject.set(x, "isHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultInterval(value: Interval): Self = StObject.set(x, "resultInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCode(value: Boolean): Self = StObject.set(x, "showCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
