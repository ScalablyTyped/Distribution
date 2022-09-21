package typings.fabric.fabricImplMod

import typings.fabric.anon.Baseline
import typings.fabric.fabricStrings._empty
import typings.fabric.fabricStrings.italic
import typings.fabric.fabricStrings.ltr
import typings.fabric.fabricStrings.normal
import typings.fabric.fabricStrings.oblique
import typings.fabric.fabricStrings.rtl
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
    * Text input direction. supporting RTL languages.
    */
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  
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
  var styles: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  extension [Self <: TextOptions](x: Self) {
    
    inline def setCharSpacing(value: Double): Self = StObject.set(x, "charSpacing", value.asInstanceOf[js.Any])
    
    inline def setCharSpacingUndefined: Self = StObject.set(x, "charSpacing", js.undefined)
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: _empty | normal | italic | oblique): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setLinethrough(value: Boolean): Self = StObject.set(x, "linethrough", value.asInstanceOf[js.Any])
    
    inline def setLinethroughUndefined: Self = StObject.set(x, "linethrough", js.undefined)
    
    inline def setOverline(value: Boolean): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
    
    inline def setOverlineUndefined: Self = StObject.set(x, "overline", js.undefined)
    
    inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setSubscript(value: Baseline): Self = StObject.set(x, "subscript", value.asInstanceOf[js.Any])
    
    inline def setSubscriptUndefined: Self = StObject.set(x, "subscript", js.undefined)
    
    inline def setSuperscript(value: Baseline): Self = StObject.set(x, "superscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscriptUndefined: Self = StObject.set(x, "superscript", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextBackgroundColor(value: String): Self = StObject.set(x, "textBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTextBackgroundColorUndefined: Self = StObject.set(x, "textBackgroundColor", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
