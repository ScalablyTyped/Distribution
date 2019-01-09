package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.ITextOptions because var conflicts: aCoords, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, centeredRotation, centeredScaling, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, evented, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockUniScaling, minScaleLimit, name, objectCaching, opacity, originX, originY, padding, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, shadow, skewX, skewY, stroke, strokeDashArray, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined fontSize, fontWeight, fontFamily, textDecoration, underline, overline, linethrough, textAlign, fontStyle, lineHeight, charSpacing, textBackgroundColor, path, useNative, text */ @JSImport("fabric/fabric-impl", "Text")
@js.native
class Text protected () extends Object {
  /**
  	 * Constructor
  	 * @param text Text string
  	 * @param [options] Options object
  	 */
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, options: ITextOptions) = this()
  /**
    * Character spacing
    */
  var charSpacing: js.UndefOr[scala.Double] = js.native
  /**
  	 * Font family
  	 */
  var fontFamily: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Font size (in pixels)
  	 */
  var fontSize: js.UndefOr[scala.Double] = js.native
  /**
  	 * Font style . Possible values?: "", "normal", "italic" or "oblique".
  	 */
  var fontStyle: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Font weight (e.g. bold, normal, 400, 600, 800)
  	 */
  var fontWeight: js.UndefOr[scala.Double | java.lang.String] = js.native
  /**
  	 * Line height
  	 */
  var lineHeight: js.UndefOr[scala.Double] = js.native
  /**
    * Text decoration linethrough.
    * @type Boolean
    * @default
    */
  var linethrough: js.UndefOr[scala.Boolean] = js.native
  /**
    * Text decoration overline.
    * @type Boolean
    * @default
    */
  var overline: js.UndefOr[scala.Boolean] = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  var text: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Text alignment. Possible values?: "left", "center", or "right".
  	 */
  var textAlign: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Background color of text lines
  	 */
  var textBackgroundColor: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Text decoration Possible values?: "", "underline", "overline" or "line-through".
    * Feels like this has been deprecated in favor of underline, overline, linethrough props
  	 */
  var textDecoration: js.UndefOr[java.lang.String] = js.native
  /**
    * Text decoration underline.
    * @type Boolean
    * @default
    */
  var underline: js.UndefOr[scala.Boolean] = js.native
  var useNative: js.UndefOr[scala.Boolean] = js.native
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
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 */
  def toSVG(): java.lang.String = js.native
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

@JSImport("fabric/fabric-impl", "Text")
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
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.ITextOptions): fabricLib.fabricDashImplMod.Text = js.native
  /**
  	 * Returns fabric.Text instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Text = js.native
}

