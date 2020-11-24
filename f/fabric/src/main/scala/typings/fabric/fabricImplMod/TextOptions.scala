package typings.fabric.fabricImplMod

import typings.fabric.anon.Baseline
import typings.fabric.fabricStrings._empty
import typings.fabric.fabricStrings.italic
import typings.fabric.fabricStrings.normal
import typings.fabric.fabricStrings.oblique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextOptions extends IObjectOptions {
  
  /**
    * additional space between characters
    * expressed in thousands of em unit
    * @type Number
    */
  var charSpacing: js.UndefOr[Double] = js.native
  
  /**
    * Baseline shift, stlyes only, keep at 0 for the main text object
    * @type {Number}
    */
  var deltaY: js.UndefOr[Double] = js.native
  
  /**
    * Font family
    * @type String
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * Font size (in pixels)
    * @type Number
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * Font style . Possible values: "", "normal", "italic" or "oblique".
    * @type String
    */
  var fontStyle: js.UndefOr[_empty | normal | italic | oblique] = js.native
  
  /**
    * Font weight (e.g. bold, normal, 400, 600, 800)
    * @type {(Number|String)}
    */
  var fontWeight: js.UndefOr[String | Double] = js.native
  
  /**
    * Line height
    * @type Number
    */
  var lineHeight: js.UndefOr[Double] = js.native
  
  /**
    * Text decoration linethrough.
    * @type Boolean
    */
  var linethrough: js.UndefOr[Boolean] = js.native
  
  /**
    * Text decoration overline.
    * @type Boolean
    */
  var overline: js.UndefOr[Boolean] = js.native
  
  /**
    * Object containing character styles - top-level properties -> line numbers,
    * 2nd-level properties - charater numbers
    * @type Object
    */
  var styles: js.UndefOr[js.Any] = js.native
  
  /**
    * Subscript schema object (minimum overlap)
    * @type {Object}
    */
  var subscript: js.UndefOr[Baseline] = js.native
  
  /**
    * Superscript schema object (minimum overlap)
    * @type {Object}
    */
  var superscript: js.UndefOr[Baseline] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  /**
    * Text alignment. Possible values: "left", "center", "right", "justify",
    * "justify-left", "justify-center" or "justify-right".
    * @type String
    */
  var textAlign: js.UndefOr[String] = js.native
  
  /**
    * Background color of text lines
    * @type String
    */
  var textBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Text decoration underline.
    * @type Boolean
    */
  var underline: js.UndefOr[Boolean] = js.native
}
object TextOptions {
  
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
    
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
    def setCharSpacing(value: Double): Self = this.set("charSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharSpacing: Self = this.set("charSpacing", js.undefined)
    
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaY: Self = this.set("deltaY", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: _empty | normal | italic | oblique): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String | Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setLinethrough(value: Boolean): Self = this.set("linethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinethrough: Self = this.set("linethrough", js.undefined)
    
    @scala.inline
    def setOverline(value: Boolean): Self = this.set("overline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverline: Self = this.set("overline", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSubscript(value: Baseline): Self = this.set("subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscript: Self = this.set("subscript", js.undefined)
    
    @scala.inline
    def setSuperscript(value: Baseline): Self = this.set("superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperscript: Self = this.set("superscript", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextBackgroundColor(value: String): Self = this.set("textBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBackgroundColor: Self = this.set("textBackgroundColor", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
}
