package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Text")
@js.native
class Text protected () extends ITextOptions {
  /**
  	 * Constructor
  	 * @param text Text string
  	 * @param [options] Options object
  	 */
  def this(text: java.lang.String) = this()
  /**
  	 * Constructor
  	 * @param text Text string
  	 * @param [options] Options object
  	 */
  def this(text: java.lang.String, options: ITextOptions) = this()
  /**
  	 * Returns complexity of an instance
  	 */
  def complexity(): scala.Double = js.native
  /**
       * Retrieves object's charSpacing
       */
  def getCharSpacing(): scala.Double = js.native
  /**
  	 * Retrieves object's fontFamily
  	 */
  def getFontFamily(): java.lang.String = js.native
  /**
  	 * Retrieves object's fontSize
  	 */
  def getFontSize(): scala.Double = js.native
  /**
  	 * Retrieves object's fontStyle
  	 */
  def getFontStyle(): java.lang.String = js.native
  /**
  	 * Retrieves object's fontWeight
  	 */
  def getFontWeight(): scala.Double | java.lang.String = js.native
  /**
  	 * Retrieves object's lineHeight
  	 */
  def getLineHeight(): scala.Double = js.native
  /**
       * Retrieves object's linethrough
       */
  def getLinethrough(): scala.Boolean = js.native
  /**
       * Retrieves object's overline
       */
  def getOverline(): scala.Boolean = js.native
  /**
  	 * Retrieves object's text
  	 */
  def getText(): java.lang.String = js.native
  /**
  	 * Retrieves object's textAlign
  	 */
  def getTextAlign(): java.lang.String = js.native
  /**
  	 * Retrieves object's textBackgroundColor
  	 */
  def getTextBackgroundColor(): java.lang.String = js.native
  /**
  	 * Retrieves object's textDecoration
  	 */
  def getTextDecoration(): java.lang.String = js.native
  /**
       * Retrieves object's underline
       */
  def getUnderline(): scala.Boolean = js.native
  /**
  	 * Renders text instance on a specified context
  	 * @param ctx Context to render on
  	 */
  def render(ctx: stdLib.CanvasRenderingContext2D, noTransform: scala.Boolean): scala.Unit = js.native
  /**
       * Sets object's charSpacing
       * @param charSpacing Character spacing
       */
  def setCharSpacing(charSpacing: scala.Double): Text = js.native
  /**
  	 * Sets object's fontFamily
  	 * @param fontFamily Font family
  	 */
  def setFontFamily(fontFamily: java.lang.String): Text = js.native
  /**
  	 * Sets object's fontSize
  	 * @param fontSize Font size (in pixels)
  	 */
  def setFontSize(fontSize: scala.Double): Text = js.native
  /**
  	 * Sets object's fontStyle
  	 * @param fontStyle Font style
  	 */
  def setFontStyle(fontStyle: java.lang.String): Text = js.native
  /**
  	 * Sets object's fontWeight
  	 * @param fontWeight Font weight
  	 */
  def setFontWeight(fontWeight: java.lang.String): Text = js.native
  /**
  	 * Sets object's fontWeight
  	 * @param fontWeight Font weight
  	 */
  def setFontWeight(fontWeight: scala.Double): Text = js.native
  /**
  	 * Sets object's lineHeight
  	 * @param lineHeight Line height
  	 */
  def setLineHeight(lineHeight: scala.Double): Text = js.native
  /**
       * Sets object's linethrough
       * @param linethrough Text linethrough
       */
  def setLinethrough(linethrough: scala.Boolean): Text = js.native
  /**
       * Sets object's overline
       * @param overline Text overline
       */
  def setOverline(overline: scala.Boolean): Text = js.native
  /**
  	 * Sets object's text
  	 * @param text Text
  	 */
  def setText(text: java.lang.String): Text = js.native
  /**
  	 * Sets object's textAlign
  	 * @param textAlign Text alignment
  	 */
  def setTextAlign(textAlign: java.lang.String): Text = js.native
  /**
  	 * Sets object's textBackgroundColor
  	 * @param textBackgroundColor Text background color
  	 */
  def setTextBackgroundColor(textBackgroundColor: java.lang.String): Text = js.native
  /**
  	 * Sets object's textDecoration
  	 * @param textDecoration Text decoration
  	 */
  def setTextDecoration(textDecoration: java.lang.String): Text = js.native
  /**
       * Sets object's underline
       * @param underline Text underline
       */
  def setUnderline(underline: scala.Boolean): Text = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 */
  def toSVG(): java.lang.String = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 */
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Text")
@js.native
object Text extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Text.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Default SVG font size
  	 */
  var DEFAULT_SVG_FONT_SIZE: scala.Double = js.native
  /**
  	 * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Text = js.native
  /**
  	 * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.ITextOptions): fabricLib.fabricDashImplMod.Text = js.native
  /**
  	 * Returns fabric.Text instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Text = js.native
}

