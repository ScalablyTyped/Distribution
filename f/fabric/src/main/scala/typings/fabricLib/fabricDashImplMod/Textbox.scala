package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.ITextboxOptions because var conflicts: __charBounds, aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, caching, canvas, centeredRotation, centeredScaling, charSpacing, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, ctrlKeysMapDown, ctrlKeysMapUp, cursorColor, cursorDelay, cursorDuration, cursorWidth, data, deltaY, dirty, editable, editingBorderColor, evented, excludeFromExport, fill, fillRule, flipX, flipY, fontFamily, fontSize, fontStyle, fontWeight, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hiddenTextarea, hoverCursor, inCompositionMode, includeDefaultValues, inverted, isEditing, keysMap, left, lineHeight, linethrough, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, overline, ownMatrixCache, padding, paintFirst, path, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selected, selectionBackgroundColor, selectionColor, selectionEnd, selectionStart, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, styles, subscript, superscript, text, textAlign, textBackgroundColor, top, transformMatrix, transparentCorners, `type`, underline, useNative, visible, width. Inlined minWidth, dynamicMinWidth, splitByGrapheme, isWrapping */ @JSImport("fabric/fabric-impl", "Textbox")
@js.native
class Textbox protected () extends IText {
  /**
  	 * Constructor
  	 * @param text Text string
  	 * @param [options] Options object
  	 */
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, options: ITextboxOptions) = this()
  /**
    * Style objects for each line
    * Generate an object that translates the style object so that it is
    * broken up by visual lines (new lines and automatic wrapping).
    * The original text styles object is broken up by actual lines (new lines only),
    * which is only sufficient for Text / IText
    * @private
    * @type {Array} Line style { line: number, offset: number }
    */
  var _styleMap: js.UndefOr[js.Array[fabricLib.Anon_Line]] = js.native
  /**
    * Use this regular expression to split strings in breakable lines
    * @private
    * @type RegExp
    */
  var _wordJoiners: stdLib.RegExp = js.native
  /**
  	 * Minimum calculated width of a textbox, in pixels.
  	 * fixed to 2 so that an empty textbox cannot go to 0
  	 * and is still selectable without text.
  	 * @type Number
  	 */
  var dynamicMinWidth: js.UndefOr[scala.Double] = js.native
  /**
    * Is the text wrapping
    * @type Boolean
    */
  var isWrapping: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Minimum width of textbox, in pixels.
  	 * @type Number
  	 */
  var minWidth: js.UndefOr[scala.Double] = js.native
  /**
  	 * Use this boolean property in order to split strings that have no white space concept.
  	 * this is a cheap way to help with chinese/japaense
  	 * @type Boolean
  	 * @since 2.6.0
  	 */
  var splitByGrapheme: js.UndefOr[scala.Boolean] = js.native
  /**
    * Helper function to measure a string of text, given its lineIndex and charIndex offset
    * it gets called when charBounds are not available yet.
    * @private
    * @param {Array} text characters
    * @param {number} lineIndex
    * @param {number} charOffset
    * @returns {number}
    */
  def _measureWord(word: js.Array[java.lang.String], lineIndex: scala.Double, charOffset: scala.Double): scala.Double = js.native
  /**
    * Wraps text using the 'width' property of Textbox. First this function
    * splits text on newlines, so we preserve newlines entered by the user.
    * Then it wraps each line using the width of the Textbox by calling
    * _wrapLine().
    * @param {Array} lines The string array of text that is split into lines
    * @param {Number} desiredWidth width you want to wrap to
    * @returns {Array} Array of lines
    */
  def _wrapText(lines: js.Array[java.lang.String], desiredWidth: scala.Double): js.Array[java.lang.String] = js.native
  /**
    * Returns larger of min width and dynamic min width
    * @return {Number}
    */
  def getMinWidth(): scala.Double = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Textbox")
@js.native
object Textbox extends js.Object {
  /**
  	 * Returns fabric.Textbox instance from an object representation
  	 * @static
  	 * @memberOf fabric.Textbox
  	 * @param {Object} object Object to create an instance from
  	 * @param {Function} [callback] Callback to invoke when an fabric.Textbox instance is created
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Textbox = js.native
  def fromObject(`object`: js.Any, callback: js.Function): fabricLib.fabricDashImplMod.Textbox = js.native
}

