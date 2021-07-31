package typings.fabric.fabricImplMod

import typings.fabric.anon.Baseline
import typings.fabric.fabricStrings._empty
import typings.fabric.fabricStrings.italic
import typings.fabric.fabricStrings.normal
import typings.fabric.fabricStrings.oblique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextOptions
  extends StObject
     with IObjectOptions {
  
  /**
    * additional space between characters
    * expressed in thousands of em unit
    * @type Number
    */
  var charSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Baseline shift, stlyes only, keep at 0 for the main text object
    * @type {Number}
    */
  var deltaY: js.UndefOr[Double] = js.undefined
  
  /**
    * Font family
    * @type String
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Font size (in pixels)
    * @type Number
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Font style . Possible values: "", "normal", "italic" or "oblique".
    * @type String
    */
  var fontStyle: js.UndefOr[_empty | normal | italic | oblique] = js.undefined
  
  /**
    * Font weight (e.g. bold, normal, 400, 600, 800)
    * @type {(Number|String)}
    */
  var fontWeight: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Line height
    * @type Number
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Text decoration linethrough.
    * @type Boolean
    */
  var linethrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Text decoration overline.
    * @type Boolean
    */
  var overline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Object containing character styles - top-level properties -> line numbers,
    * 2nd-level properties - charater numbers
    * @type Object
    */
  var styles: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Subscript schema object (minimum overlap)
    * @type {Object}
    */
  var subscript: js.UndefOr[Baseline] = js.undefined
  
  /**
    * Superscript schema object (minimum overlap)
    * @type {Object}
    */
  var superscript: js.UndefOr[Baseline] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Text alignment. Possible values: "left", "center", "right", "justify",
    * "justify-left", "justify-center" or "justify-right".
    * @type String
    */
  var textAlign: js.UndefOr[String] = js.undefined
  
  /**
    * Background color of text lines
    * @type String
    */
  var textBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Text decoration underline.
    * @type Boolean
    */
  var underline: js.UndefOr[Boolean] = js.undefined
}
object TextOptions {
  
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  @scala.inline
  implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharSpacing(value: Double): Self = StObject.set(x, "charSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharSpacingUndefined: Self = StObject.set(x, "charSpacing", js.undefined)
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: _empty | normal | italic | oblique): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setLinethrough(value: Boolean): Self = StObject.set(x, "linethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinethroughUndefined: Self = StObject.set(x, "linethrough", js.undefined)
    
    @scala.inline
    def setOverline(value: Boolean): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlineUndefined: Self = StObject.set(x, "overline", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setSubscript(value: Baseline): Self = StObject.set(x, "subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptUndefined: Self = StObject.set(x, "subscript", js.undefined)
    
    @scala.inline
    def setSuperscript(value: Baseline): Self = StObject.set(x, "superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscriptUndefined: Self = StObject.set(x, "superscript", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextBackgroundColor(value: String): Self = StObject.set(x, "textBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBackgroundColorUndefined: Self = StObject.set(x, "textBackgroundColor", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
